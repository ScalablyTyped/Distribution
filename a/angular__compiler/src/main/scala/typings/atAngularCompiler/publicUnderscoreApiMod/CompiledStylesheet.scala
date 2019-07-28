package typings.atAngularCompiler.publicUnderscoreApiMod

import typings.atAngularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "CompiledStylesheet")
@js.native
class CompiledStylesheet protected ()
  extends typings.atAngularCompiler.srcCompilerMod.CompiledStylesheet {
  def this(
    outputCtx: OutputContext,
    stylesVar: String,
    dependencies: js.Array[typings.atAngularCompiler.srcStyleUnderscoreCompilerMod.StylesCompileDependency],
    isShimmed: Boolean,
    meta: typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileStylesheetMetadata
  ) = this()
}

