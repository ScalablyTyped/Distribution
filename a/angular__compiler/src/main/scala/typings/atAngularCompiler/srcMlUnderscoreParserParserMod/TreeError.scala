package typings.atAngularCompiler.srcMlUnderscoreParserParserMod

import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError
import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/parser", "TreeError")
@js.native
class TreeError protected () extends ParseError {
  def this(elementName: String, span: ParseSourceSpan, msg: String) = this()
  def this(elementName: Null, span: ParseSourceSpan, msg: String) = this()
  var elementName: String | Null = js.native
}

/* static members */
@JSImport("@angular/compiler/src/ml_parser/parser", "TreeError")
@js.native
object TreeError extends js.Object {
  def create(elementName: String, span: ParseSourceSpan, msg: String): TreeError = js.native
  def create(elementName: Null, span: ParseSourceSpan, msg: String): TreeError = js.native
}

