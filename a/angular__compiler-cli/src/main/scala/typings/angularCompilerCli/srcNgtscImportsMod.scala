package typings.angularCompilerCli

import typings.angularCompilerCli.anon.ModuleResolutionHostPickC
import typings.angularCompilerCli.srcNgtscCoreApiSrcInterfacesMod.UnifiedModulesHost
import typings.angularCompilerCli.srcNgtscFileSystemMod.LogicalFileSystem
import typings.angularCompilerCli.srcNgtscImportsSrcEmitterMod.ReferenceEmitResult
import typings.angularCompilerCli.srcNgtscImportsSrcEmitterMod.ReferenceEmitStrategy
import typings.angularCompilerCli.srcNgtscImportsSrcReferencesMod.OwningModule
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.ModuleResolutionCache
import typings.typescript.mod.Node
import typings.typescript.mod.Program
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscImportsMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports", "AbsoluteModuleStrategy")
  @js.native
  open class AbsoluteModuleStrategy protected ()
    extends typings.angularCompilerCli.srcNgtscImportsSrcEmitterMod.AbsoluteModuleStrategy {
    def this(
      program: Program,
      checker: TypeChecker,
      moduleResolver: typings.angularCompilerCli.srcNgtscImportsSrcResolverMod.ModuleResolver,
      reflectionHost: ReflectionHost
    ) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports", "AliasStrategy")
  @js.native
  open class AliasStrategy ()
    extends typings.angularCompilerCli.srcNgtscImportsSrcAliasMod.AliasStrategy
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports", "DefaultImportTracker")
  @js.native
  open class DefaultImportTracker ()
    extends typings.angularCompilerCli.srcNgtscImportsSrcDefaultMod.DefaultImportTracker
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports", "ImportFlags")
  @js.native
  object ImportFlags extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompilerCli.srcNgtscImportsSrcEmitterMod.ImportFlags & Double] = js.native
    
    /* 8 */ val AllowRelativeDtsImports: typings.angularCompilerCli.srcNgtscImportsSrcEmitterMod.ImportFlags.AllowRelativeDtsImports & Double = js.native
    
    /* 4 */ val AllowTypeImports: typings.angularCompilerCli.srcNgtscImportsSrcEmitterMod.ImportFlags.AllowTypeImports & Double = js.native
    
    /* 1 */ val ForceNewImport: typings.angularCompilerCli.srcNgtscImportsSrcEmitterMod.ImportFlags.ForceNewImport & Double = js.native
    
    /* 2 */ val NoAliasing: typings.angularCompilerCli.srcNgtscImportsSrcEmitterMod.ImportFlags.NoAliasing & Double = js.native
    
    /* 0 */ val None: typings.angularCompilerCli.srcNgtscImportsSrcEmitterMod.ImportFlags.None & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports", "LocalIdentifierStrategy")
  @js.native
  open class LocalIdentifierStrategy ()
    extends typings.angularCompilerCli.srcNgtscImportsSrcEmitterMod.LocalIdentifierStrategy
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports", "LogicalProjectStrategy")
  @js.native
  open class LogicalProjectStrategy protected ()
    extends typings.angularCompilerCli.srcNgtscImportsSrcEmitterMod.LogicalProjectStrategy {
    def this(reflector: ReflectionHost, logicalFs: LogicalFileSystem) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports", "ModuleResolver")
  @js.native
  open class ModuleResolver protected ()
    extends typings.angularCompilerCli.srcNgtscImportsSrcResolverMod.ModuleResolver {
    def this(program: Program, compilerOptions: CompilerOptions, host: ModuleResolutionHostPickC) = this()
    def this(
      program: Program,
      compilerOptions: CompilerOptions,
      host: ModuleResolutionHostPickC,
      moduleResolutionCache: ModuleResolutionCache
    ) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports", "NoopImportRewriter")
  @js.native
  open class NoopImportRewriter ()
    extends typings.angularCompilerCli.srcNgtscImportsSrcCoreMod.NoopImportRewriter
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports", "PrivateExportAliasingHost")
  @js.native
  open class PrivateExportAliasingHost protected ()
    extends typings.angularCompilerCli.srcNgtscImportsSrcAliasMod.PrivateExportAliasingHost {
    def this(host: ReflectionHost) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports", "R3SymbolsImportRewriter")
  @js.native
  open class R3SymbolsImportRewriter protected ()
    extends typings.angularCompilerCli.srcNgtscImportsSrcCoreMod.R3SymbolsImportRewriter {
    def this(r3SymbolsPath: String) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports", "Reference")
  @js.native
  open class Reference[T /* <: Node */] protected ()
    extends typings.angularCompilerCli.srcNgtscImportsSrcReferencesMod.Reference[T] {
    def this(node: T) = this()
    def this(node: T, bestGuessOwningModule: OwningModule) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports", "ReferenceEmitter")
  @js.native
  open class ReferenceEmitter protected ()
    extends typings.angularCompilerCli.srcNgtscImportsSrcEmitterMod.ReferenceEmitter {
    def this(strategies: js.Array[ReferenceEmitStrategy]) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports", "RelativePathStrategy")
  @js.native
  open class RelativePathStrategy protected ()
    extends typings.angularCompilerCli.srcNgtscImportsSrcEmitterMod.RelativePathStrategy {
    def this(reflector: ReflectionHost) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports", "UnifiedModulesAliasingHost")
  @js.native
  open class UnifiedModulesAliasingHost protected ()
    extends typings.angularCompilerCli.srcNgtscImportsSrcAliasMod.UnifiedModulesAliasingHost {
    def this(unifiedModulesHost: UnifiedModulesHost) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports", "UnifiedModulesStrategy")
  @js.native
  open class UnifiedModulesStrategy protected ()
    extends typings.angularCompilerCli.srcNgtscImportsSrcEmitterMod.UnifiedModulesStrategy {
    def this(reflector: ReflectionHost, unifiedModulesHost: UnifiedModulesHost) = this()
  }
  
  inline def assertSuccessfulReferenceEmit(result: ReferenceEmitResult, origin: Node, typeKind: String): /* asserts result is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(angular,compiler-cli), TsIdentModule(Some(angular),List(compiler-cli, src, ngtsc, imports, src, emitter)), TsIdentSimple(EmittedReference))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assertSuccessfulReferenceEmit")(result.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], typeKind.asInstanceOf[js.Any])).asInstanceOf[/* asserts result is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(angular,compiler-cli), TsIdentModule(Some(angular),List(compiler-cli, src, ngtsc, imports, src, emitter)), TsIdentSimple(EmittedReference))),IArray())*/ Boolean]
  
  inline def validateAndRewriteCoreSymbol(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("validateAndRewriteCoreSymbol")(name.asInstanceOf[js.Any]).asInstanceOf[String]
}
