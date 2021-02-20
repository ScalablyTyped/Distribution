package typings.angularCompiler

import typings.angularCompiler.anon.DepsExpr
import typings.angularCompiler.compileMetadataMod.CompileDiDependencyMetadata
import typings.angularCompiler.compileMetadataMod.CompileEntryComponentMetadata
import typings.angularCompiler.compileReflectorMod.CompileReflector
import typings.angularCompiler.coreMod.NodeFlags
import typings.angularCompiler.lifecycleReflectorMod.LifecycleHooks
import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.srcUtilMod.OutputContext
import typings.angularCompiler.templateAstMod.ProviderAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providerCompilerMod {
  
  @JSImport("@angular/compiler/src/view_compiler/provider_compiler", "componentFactoryResolverProviderDef")
  @js.native
  def componentFactoryResolverProviderDef(
    reflector: CompileReflector,
    ctx: OutputContext,
    flags: NodeFlags,
    entryComponents: js.Array[CompileEntryComponentMetadata]
  ): DepsExpr = js.native
  
  @JSImport("@angular/compiler/src/view_compiler/provider_compiler", "depDef")
  @js.native
  def depDef(ctx: OutputContext, dep: CompileDiDependencyMetadata): Expression = js.native
  
  @JSImport("@angular/compiler/src/view_compiler/provider_compiler", "lifecycleHookToNodeFlag")
  @js.native
  def lifecycleHookToNodeFlag(lifecycleHook: LifecycleHooks): NodeFlags = js.native
  
  @JSImport("@angular/compiler/src/view_compiler/provider_compiler", "providerDef")
  @js.native
  def providerDef(ctx: OutputContext, providerAst: ProviderAst): DepsExpr = js.native
}
