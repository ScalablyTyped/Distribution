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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providerCompilerMod {
  
  @JSImport("@angular/compiler/src/view_compiler/provider_compiler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def componentFactoryResolverProviderDef(
    reflector: CompileReflector,
    ctx: OutputContext,
    flags: NodeFlags,
    entryComponents: js.Array[CompileEntryComponentMetadata]
  ): DepsExpr = (^.asInstanceOf[js.Dynamic].applyDynamic("componentFactoryResolverProviderDef")(reflector.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], entryComponents.asInstanceOf[js.Any])).asInstanceOf[DepsExpr]
  
  @scala.inline
  def depDef(ctx: OutputContext, dep: CompileDiDependencyMetadata): Expression = (^.asInstanceOf[js.Dynamic].applyDynamic("depDef")(ctx.asInstanceOf[js.Any], dep.asInstanceOf[js.Any])).asInstanceOf[Expression]
  
  @scala.inline
  def lifecycleHookToNodeFlag(lifecycleHook: LifecycleHooks): NodeFlags = ^.asInstanceOf[js.Dynamic].applyDynamic("lifecycleHookToNodeFlag")(lifecycleHook.asInstanceOf[js.Any]).asInstanceOf[NodeFlags]
  
  @scala.inline
  def providerDef(ctx: OutputContext, providerAst: ProviderAst): DepsExpr = (^.asInstanceOf[js.Dynamic].applyDynamic("providerDef")(ctx.asInstanceOf[js.Any], providerAst.asInstanceOf[js.Any])).asInstanceOf[DepsExpr]
}
