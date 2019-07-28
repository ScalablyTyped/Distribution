package typings.atAngularCompiler.srcStyleUnderscoreCompilerMod

import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata
import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileStylesheetMetadata
import typings.atAngularCompiler.srcUrlUnderscoreResolverMod.UrlResolver
import typings.atAngularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/style_compiler", "StyleCompiler")
@js.native
class StyleCompiler protected () extends js.Object {
  def this(_urlResolver: UrlResolver) = this()
  var _compileStyles: js.Any = js.native
  var _shadowCss: js.Any = js.native
  var _shimIfNeeded: js.Any = js.native
  var _urlResolver: js.Any = js.native
  def compileComponent(outputCtx: OutputContext, comp: CompileDirectiveMetadata): CompiledStylesheet = js.native
  def compileStyles(outputCtx: OutputContext, comp: CompileDirectiveMetadata, stylesheet: CompileStylesheetMetadata): CompiledStylesheet = js.native
  def compileStyles(
    outputCtx: OutputContext,
    comp: CompileDirectiveMetadata,
    stylesheet: CompileStylesheetMetadata,
    shim: Boolean
  ): CompiledStylesheet = js.native
  def needsStyleShim(comp: CompileDirectiveMetadata): Boolean = js.native
}

