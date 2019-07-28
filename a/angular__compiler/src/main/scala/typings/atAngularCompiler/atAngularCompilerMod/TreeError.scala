package typings.atAngularCompiler.atAngularCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "TreeError")
@js.native
class TreeError protected ()
  extends typings.atAngularCompiler.publicUnderscoreApiMod.TreeError {
  def this(
    elementName: String,
    span: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    msg: String
  ) = this()
  def this(
    elementName: Null,
    span: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    msg: String
  ) = this()
}

/* static members */
@JSImport("@angular/compiler", "TreeError")
@js.native
object TreeError extends js.Object {
  def create(
    elementName: String,
    span: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    msg: String
  ): typings.atAngularCompiler.srcMlUnderscoreParserParserMod.TreeError = js.native
  def create(
    elementName: Null,
    span: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    msg: String
  ): typings.atAngularCompiler.srcMlUnderscoreParserParserMod.TreeError = js.native
}

