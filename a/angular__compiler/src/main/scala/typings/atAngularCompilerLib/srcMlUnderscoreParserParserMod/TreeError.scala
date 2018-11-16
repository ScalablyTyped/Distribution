package typings
package atAngularCompilerLib.srcMlUnderscoreParserParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/parser", "TreeError")
@js.native
class TreeError protected ()
  extends atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseError {
  def this(elementName: java.lang.String, span: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, msg: java.lang.String) = this()
  def this(elementName: scala.Null, span: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, msg: java.lang.String) = this()
  var elementName: java.lang.String | scala.Null = js.native
}

@JSImport("@angular/compiler/src/ml_parser/parser", "TreeError")
@js.native
object TreeError extends js.Object {
  def create(
    elementName: java.lang.String,
    span: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan,
    msg: java.lang.String
  ): atAngularCompilerLib.srcMlUnderscoreParserParserMod.TreeError = js.native
  def create(
    elementName: scala.Null,
    span: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan,
    msg: java.lang.String
  ): atAngularCompilerLib.srcMlUnderscoreParserParserMod.TreeError = js.native
}

