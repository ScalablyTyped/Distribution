package typings.angularCompiler.srcCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.angularCompiler.srcParseUtilMod.ParseError because Already inherited
- typings.angularCompiler.mlParserParserMod.TreeError because Already inherited
- typings.angularCompiler.xmlParserMod.TreeError because Inheritance from two classes. Inlined  */ @JSImport("@angular/compiler/src/compiler", "TreeError")
@js.native
class TreeError protected ()
  extends typings.angularCompiler.htmlParserMod.TreeError {
  def this(elementName: String, span: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan, msg: String) = this()
  def this(elementName: Null, span: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan, msg: String) = this()
}
/* static members */
object TreeError {
  
  @JSImport("@angular/compiler/src/compiler", "TreeError")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(elementName: String, span: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan, msg: String): typings.angularCompiler.mlParserParserMod.TreeError = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(elementName.asInstanceOf[js.Any], span.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.mlParserParserMod.TreeError]
  @scala.inline
  def create(elementName: Null, span: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan, msg: String): typings.angularCompiler.mlParserParserMod.TreeError = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(elementName.asInstanceOf[js.Any], span.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.mlParserParserMod.TreeError]
}
