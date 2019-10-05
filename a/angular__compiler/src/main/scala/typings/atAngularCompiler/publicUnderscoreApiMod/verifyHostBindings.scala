package typings.atAngularCompiler.publicUnderscoreApiMod

import typings.atAngularCompiler.srcRender3ViewCompilerMod.ParsedHostBindings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "verifyHostBindings")
@js.native
object verifyHostBindings extends js.Object {
  def apply(
    bindings: ParsedHostBindings,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): js.Array[typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError] = js.native
}

