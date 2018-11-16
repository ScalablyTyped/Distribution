package typings
package atAngularCompilerLib.publicUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "TreeError")
@js.native
class TreeError protected ()
  extends atAngularCompilerLib.srcCompilerMod.TreeError {
  def this(elementName: java.lang.String, span: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, msg: java.lang.String) = this()
  def this(elementName: scala.Null, span: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, msg: java.lang.String) = this()
}

@JSImport("@angular/compiler/public_api", "TreeError")
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

