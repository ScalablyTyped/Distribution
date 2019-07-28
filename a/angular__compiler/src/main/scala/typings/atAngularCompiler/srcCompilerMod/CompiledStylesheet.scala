package typings.atAngularCompiler.srcCompilerMod

import typings.atAngularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "CompiledStylesheet")
@js.native
class CompiledStylesheet protected ()
  extends typings.atAngularCompiler.srcStyleUnderscoreCompilerMod.CompiledStylesheet {
  def this(
    outputCtx: OutputContext,
    stylesVar: String,
    dependencies: js.Array[typings.atAngularCompiler.srcStyleUnderscoreCompilerMod.StylesCompileDependency],
    isShimmed: Boolean,
    meta: typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileStylesheetMetadata
  ) = this()
}

