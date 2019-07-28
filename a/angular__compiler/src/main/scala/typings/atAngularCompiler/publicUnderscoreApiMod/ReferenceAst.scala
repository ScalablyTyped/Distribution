package typings.atAngularCompiler.publicUnderscoreApiMod

import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileTokenMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "ReferenceAst")
@js.native
class ReferenceAst protected ()
  extends typings.atAngularCompiler.srcCompilerMod.ReferenceAst {
  def this(
    name: String,
    value: CompileTokenMetadata,
    originalValue: String,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
}

