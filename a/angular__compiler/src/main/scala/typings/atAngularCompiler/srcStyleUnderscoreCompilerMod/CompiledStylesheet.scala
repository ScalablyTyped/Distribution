package typings.atAngularCompiler.srcStyleUnderscoreCompilerMod

import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileStylesheetMetadata
import typings.atAngularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/style_compiler", "CompiledStylesheet")
@js.native
class CompiledStylesheet protected () extends js.Object {
  def this(
    outputCtx: OutputContext,
    stylesVar: String,
    dependencies: js.Array[StylesCompileDependency],
    isShimmed: Boolean,
    meta: CompileStylesheetMetadata
  ) = this()
  var dependencies: js.Array[StylesCompileDependency] = js.native
  var isShimmed: Boolean = js.native
  var meta: CompileStylesheetMetadata = js.native
  var outputCtx: OutputContext = js.native
  var stylesVar: String = js.native
}

