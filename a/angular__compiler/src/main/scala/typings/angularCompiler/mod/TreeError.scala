package typings.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "TreeError")
@js.native
class TreeError protected ()
  extends typings.angularCompiler.compilerMod.TreeError {
  def this(elementName: String, span: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan, msg: String) = this()
  def this(elementName: Null, span: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan, msg: String) = this()
}

/* static members */
@JSImport("@angular/compiler", "TreeError")
@js.native
object TreeError extends js.Object {
  def create(elementName: String, span: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan, msg: String): typings.angularCompiler.mlParserParserMod.TreeError = js.native
  def create(elementName: Null, span: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan, msg: String): typings.angularCompiler.mlParserParserMod.TreeError = js.native
}

