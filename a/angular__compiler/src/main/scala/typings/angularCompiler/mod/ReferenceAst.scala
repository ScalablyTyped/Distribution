package typings.angularCompiler.mod

import typings.angularCompiler.compileMetadataMod.CompileTokenMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "ReferenceAst")
@js.native
class ReferenceAst protected ()
  extends typings.angularCompiler.compilerMod.ReferenceAst {
  def this(
    name: String,
    value: CompileTokenMetadata,
    originalValue: String,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

