package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "TreeError")
@js.native
class TreeError protected ()
  extends typings.angularCompiler.srcCompilerMod.TreeError {
  def this(elementName: String, span: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan, msg: String) = this()
  def this(elementName: Null, span: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan, msg: String) = this()
}

/* static members */
@JSImport("@angular/compiler/public_api", "TreeError")
@js.native
object TreeError extends js.Object {
  def create(elementName: String, span: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan, msg: String): typings.angularCompiler.mlParserParserMod.TreeError = js.native
  def create(elementName: Null, span: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan, msg: String): typings.angularCompiler.mlParserParserMod.TreeError = js.native
}

