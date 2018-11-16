package typings
package atAngularCompilerLib.srcStyleUnderscoreCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/style_compiler", "StyleCompiler")
@js.native
class StyleCompiler protected () extends js.Object {
  def this(_urlResolver: atAngularCompilerLib.srcUrlUnderscoreResolverMod.UrlResolver) = this()
  var _compileStyles: js.Any = js.native
  var _shadowCss: js.Any = js.native
  var _shimIfNeeded: js.Any = js.native
  var _urlResolver: js.Any = js.native
  def compileComponent(
    outputCtx: atAngularCompilerLib.srcUtilMod.OutputContext,
    comp: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata
  ): CompiledStylesheet = js.native
  def compileStyles(
    outputCtx: atAngularCompilerLib.srcUtilMod.OutputContext,
    comp: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata,
    stylesheet: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileStylesheetMetadata
  ): CompiledStylesheet = js.native
  def compileStyles(
    outputCtx: atAngularCompilerLib.srcUtilMod.OutputContext,
    comp: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata,
    stylesheet: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileStylesheetMetadata,
    shim: scala.Boolean
  ): CompiledStylesheet = js.native
  def needsStyleShim(comp: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata): scala.Boolean = js.native
}

