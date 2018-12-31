package typings
package atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/template_parser/template_ast", "ProviderAst")
@js.native
class ProviderAst protected () extends TemplateAst {
  def this(token: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileTokenMetadata, multiProvider: scala.Boolean, eager: scala.Boolean, providers: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileProviderMetadata], providerType: ProviderAstType, lifecycleHooks: js.Array[atAngularCompilerLib.srcLifecycleUnderscoreReflectorMod.LifecycleHooks], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, isModule: scala.Boolean) = this()
  var eager: scala.Boolean = js.native
  val isModule: scala.Boolean = js.native
  var lifecycleHooks: js.Array[atAngularCompilerLib.srcLifecycleUnderscoreReflectorMod.LifecycleHooks] = js.native
  var multiProvider: scala.Boolean = js.native
  var providerType: ProviderAstType = js.native
  var providers: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileProviderMetadata] = js.native
  /**
    * The source span from which this node was parsed.
    */
  /* CompleteClass */
  override var sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan = js.native
  var token: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileTokenMetadata = js.native
  /**
    * Visit this node and possibly transform it.
    */
  /* CompleteClass */
  override def visit(visitor: TemplateAstVisitor, context: js.Any): js.Any = js.native
}

