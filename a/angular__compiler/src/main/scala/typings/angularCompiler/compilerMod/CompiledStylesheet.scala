package typings.angularCompiler.compilerMod

import typings.angularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/compiler", "CompiledStylesheet")
@js.native
class CompiledStylesheet protected ()
  extends typings.angularCompiler.publicApiMod.CompiledStylesheet {
  def this(
    outputCtx: OutputContext,
    stylesVar: String,
    dependencies: js.Array[typings.angularCompiler.styleCompilerMod.StylesCompileDependency],
    isShimmed: Boolean,
    meta: typings.angularCompiler.compileMetadataMod.CompileStylesheetMetadata
  ) = this()
}

