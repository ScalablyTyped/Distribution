package typings.angularCompiler.templateAstMod

import typings.angularCompiler.compileMetadataMod.CompileProviderMetadata
import typings.angularCompiler.compileMetadataMod.CompileTokenMetadata
import typings.angularCompiler.lifecycleReflectorMod.LifecycleHooks
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/template_parser/template_ast", "ProviderAst")
@js.native
class ProviderAst protected () extends TemplateAst {
  def this(
    token: CompileTokenMetadata,
    multiProvider: Boolean,
    eager: Boolean,
    providers: js.Array[CompileProviderMetadata],
    providerType: ProviderAstType,
    lifecycleHooks: js.Array[LifecycleHooks],
    sourceSpan: ParseSourceSpan,
    isModule: Boolean
  ) = this()
  var eager: Boolean = js.native
  val isModule: Boolean = js.native
  var lifecycleHooks: js.Array[LifecycleHooks] = js.native
  var multiProvider: Boolean = js.native
  var providerType: ProviderAstType = js.native
  var providers: js.Array[CompileProviderMetadata] = js.native
  var token: CompileTokenMetadata = js.native
}

