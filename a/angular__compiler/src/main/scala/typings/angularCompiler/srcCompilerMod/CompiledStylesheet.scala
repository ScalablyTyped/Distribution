package typings.angularCompiler.srcCompilerMod

import typings.angularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "CompiledStylesheet")
@js.native
class CompiledStylesheet protected ()
  extends typings.angularCompiler.styleCompilerMod.CompiledStylesheet {
  def this(
    outputCtx: OutputContext,
    stylesVar: String,
    dependencies: js.Array[typings.angularCompiler.styleCompilerMod.StylesCompileDependency],
    isShimmed: Boolean,
    meta: typings.angularCompiler.compileMetadataMod.CompileStylesheetMetadata
  ) = this()
}

