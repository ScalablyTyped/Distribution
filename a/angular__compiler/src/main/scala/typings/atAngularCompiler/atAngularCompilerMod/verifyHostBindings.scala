package typings.atAngularCompiler.atAngularCompilerMod

import typings.atAngularCompiler.srcRender3ViewCompilerMod.ParsedHostBindings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "verifyHostBindings")
@js.native
object verifyHostBindings extends js.Object {
  def apply(
    bindings: ParsedHostBindings,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): js.Array[typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError] = js.native
}

