package typings.angularCompiler.publicApiMod

import typings.angularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "CompiledStylesheet")
@js.native
class CompiledStylesheet protected ()
  extends typings.angularCompiler.srcCompilerMod.CompiledStylesheet {
  def this(
    outputCtx: OutputContext,
    stylesVar: String,
    dependencies: js.Array[typings.angularCompiler.styleCompilerMod.StylesCompileDependency],
    isShimmed: Boolean,
    meta: typings.angularCompiler.compileMetadataMod.CompileStylesheetMetadata
  ) = this()
}

