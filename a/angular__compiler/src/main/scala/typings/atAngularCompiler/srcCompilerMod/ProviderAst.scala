package typings.atAngularCompiler.srcCompilerMod

import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileProviderMetadata
import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileTokenMetadata
import typings.atAngularCompiler.srcLifecycleUnderscoreReflectorMod.LifecycleHooks
import typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.ProviderAstType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "ProviderAst")
@js.native
class ProviderAst protected ()
  extends typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.ProviderAst {
  def this(
    token: CompileTokenMetadata,
    multiProvider: Boolean,
    eager: Boolean,
    providers: js.Array[CompileProviderMetadata],
    providerType: ProviderAstType,
    lifecycleHooks: js.Array[LifecycleHooks],
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    isModule: Boolean
  ) = this()
}

