package typings.atAngularCompiler.srcMlUnderscoreParserHtmlUnderscoreParserMod

import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/html_parser", "TreeError")
@js.native
class TreeError protected ()
  extends typings.atAngularCompiler.srcMlUnderscoreParserParserMod.TreeError {
  def this(elementName: String, span: ParseSourceSpan, msg: String) = this()
  def this(elementName: Null, span: ParseSourceSpan, msg: String) = this()
}

/* static members */
@JSImport("@angular/compiler/src/ml_parser/html_parser", "TreeError")
@js.native
object TreeError extends js.Object {
  def create(elementName: String, span: ParseSourceSpan, msg: String): typings.atAngularCompiler.srcMlUnderscoreParserParserMod.TreeError = js.native
  def create(elementName: Null, span: ParseSourceSpan, msg: String): typings.atAngularCompiler.srcMlUnderscoreParserParserMod.TreeError = js.native
}

