package typings.angularCompiler.srcCompilerMod

import typings.angularCompiler.mlParserAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.angularCompiler.mlParserParserMod.ParseTreeResult because Already inherited
- typings.angularCompiler.xmlParserMod.ParseTreeResult because Inheritance from two classes. Inlined  */ @JSImport("@angular/compiler/src/compiler", "ParseTreeResult")
@js.native
class ParseTreeResult protected ()
  extends typings.angularCompiler.htmlParserMod.ParseTreeResult {
  def this(rootNodes: js.Array[Node], errors: js.Array[typings.angularCompiler.srcParseUtilMod.ParseError]) = this()
}
