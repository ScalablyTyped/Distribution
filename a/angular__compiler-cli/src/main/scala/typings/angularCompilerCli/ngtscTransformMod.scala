package typings.angularCompilerCli

import typings.angularCompilerCli.adapterMod.SourceFileTypeIdentifier
import typings.angularCompilerCli.compilationMod.ClassRecord
import typings.angularCompilerCli.incrementalApiMod.IncrementalBuild
import typings.angularCompilerCli.ngtscImportsMod.DefaultImportTracker
import typings.angularCompilerCli.perfSrcApiMod.PerfRecorder
import typings.angularCompilerCli.semanticGraphMod.SemanticDepGraphUpdater
import typings.angularCompilerCli.semanticGraphMod.SemanticSymbol
import typings.angularCompilerCli.srcCoreMod.ImportRewriter
import typings.angularCompilerCli.srcHostMod.ReflectionHost
import typings.angularCompilerCli.traitMod.PendingTrait
import typings.angularCompilerCli.transformSrcApiMod.CompilationMode
import typings.angularCompilerCli.transformSrcApiMod.DecoratorHandler
import typings.angularCompilerCli.transformSrcApiMod.DetectResult
import typings.std.Map
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TransformerFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngtscTransformMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/transform", "CompilationMode")
  @js.native
  object CompilationMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompilerCli.transformSrcApiMod.CompilationMode & Double] = js.native
    
    /* 0 */ val FULL: typings.angularCompilerCli.transformSrcApiMod.CompilationMode.FULL & Double = js.native
    
    /* 1 */ val PARTIAL: typings.angularCompilerCli.transformSrcApiMod.CompilationMode.PARTIAL & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/transform", "DtsTransformRegistry")
  @js.native
  open class DtsTransformRegistry ()
    extends typings.angularCompilerCli.declarationMod.DtsTransformRegistry
  
  @JSImport("@angular/compiler-cli/src/ngtsc/transform", "HandlerFlags")
  @js.native
  object HandlerFlags extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompilerCli.transformSrcApiMod.HandlerFlags & Double] = js.native
    
    /* 1 */ val FULL_INHERITANCE: typings.angularCompilerCli.transformSrcApiMod.HandlerFlags.FULL_INHERITANCE & Double = js.native
    
    /* 0 */ val NONE: typings.angularCompilerCli.transformSrcApiMod.HandlerFlags.NONE & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/transform", "HandlerPrecedence")
  @js.native
  object HandlerPrecedence extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompilerCli.transformSrcApiMod.HandlerPrecedence & Double] = js.native
    
    /* 0 */ val PRIMARY: typings.angularCompilerCli.transformSrcApiMod.HandlerPrecedence.PRIMARY & Double = js.native
    
    /* 1 */ val SHARED: typings.angularCompilerCli.transformSrcApiMod.HandlerPrecedence.SHARED & Double = js.native
    
    /* 2 */ val WEAK: typings.angularCompilerCli.transformSrcApiMod.HandlerPrecedence.WEAK & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/transform", "IvyDeclarationDtsTransform")
  @js.native
  open class IvyDeclarationDtsTransform ()
    extends typings.angularCompilerCli.declarationMod.IvyDeclarationDtsTransform
  
  object Trait {
    
    @JSImport("@angular/compiler-cli/src/ngtsc/transform", "Trait")
    @js.native
    val ^ : js.Any = js.native
    
    inline def pending[D, A, S /* <: SemanticSymbol | Null */, R](handler: DecoratorHandler[D, A, S, R], detected: DetectResult[D]): PendingTrait[D, A, S, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("pending")(handler.asInstanceOf[js.Any], detected.asInstanceOf[js.Any])).asInstanceOf[PendingTrait[D, A, S, R]]
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/transform", "TraitCompiler")
  @js.native
  open class TraitCompiler protected ()
    extends typings.angularCompilerCli.compilationMod.TraitCompiler {
    def this(
      handlers: js.Array[DecoratorHandler[Any, Any, SemanticSymbol | Null, Any]],
      reflector: ReflectionHost,
      perf: PerfRecorder,
      incrementalBuild: IncrementalBuild[ClassRecord, Any],
      compileNonExportedClasses: Boolean,
      compilationMode: CompilationMode,
      dtsTransforms: typings.angularCompilerCli.declarationMod.DtsTransformRegistry,
      semanticDepGraphUpdater: Null,
      sourceFileTypeIdentifier: SourceFileTypeIdentifier
    ) = this()
    def this(
      handlers: js.Array[DecoratorHandler[Any, Any, SemanticSymbol | Null, Any]],
      reflector: ReflectionHost,
      perf: PerfRecorder,
      incrementalBuild: IncrementalBuild[ClassRecord, Any],
      compileNonExportedClasses: Boolean,
      compilationMode: CompilationMode,
      dtsTransforms: typings.angularCompilerCli.declarationMod.DtsTransformRegistry,
      semanticDepGraphUpdater: SemanticDepGraphUpdater,
      sourceFileTypeIdentifier: SourceFileTypeIdentifier
    ) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/transform", "TraitState")
  @js.native
  object TraitState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompilerCli.traitMod.TraitState & Double] = js.native
    
    /* 1 */ val Analyzed: typings.angularCompilerCli.traitMod.TraitState.Analyzed & Double = js.native
    
    /* 0 */ val Pending: typings.angularCompilerCli.traitMod.TraitState.Pending & Double = js.native
    
    /* 2 */ val Resolved: typings.angularCompilerCli.traitMod.TraitState.Resolved & Double = js.native
    
    /* 3 */ val Skipped: typings.angularCompilerCli.traitMod.TraitState.Skipped & Double = js.native
  }
  
  inline def aliasTransformFactory(exportStatements: Map[String, Map[String, js.Tuple2[String, String]]]): TransformerFactory[SourceFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("aliasTransformFactory")(exportStatements.asInstanceOf[js.Any]).asInstanceOf[TransformerFactory[SourceFile]]
  
  inline def declarationTransformFactory(
    transformRegistry: typings.angularCompilerCli.declarationMod.DtsTransformRegistry,
    importRewriter: ImportRewriter
  ): TransformerFactory[SourceFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("declarationTransformFactory")(transformRegistry.asInstanceOf[js.Any], importRewriter.asInstanceOf[js.Any])).asInstanceOf[TransformerFactory[SourceFile]]
  inline def declarationTransformFactory(
    transformRegistry: typings.angularCompilerCli.declarationMod.DtsTransformRegistry,
    importRewriter: ImportRewriter,
    importPrefix: String
  ): TransformerFactory[SourceFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("declarationTransformFactory")(transformRegistry.asInstanceOf[js.Any], importRewriter.asInstanceOf[js.Any], importPrefix.asInstanceOf[js.Any])).asInstanceOf[TransformerFactory[SourceFile]]
  
  inline def ivyTransformFactory(
    compilation: typings.angularCompilerCli.compilationMod.TraitCompiler,
    reflector: ReflectionHost,
    importRewriter: ImportRewriter,
    defaultImportTracker: DefaultImportTracker,
    perf: PerfRecorder,
    isCore: Boolean,
    isClosureCompilerEnabled: Boolean
  ): TransformerFactory[SourceFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("ivyTransformFactory")(compilation.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], importRewriter.asInstanceOf[js.Any], defaultImportTracker.asInstanceOf[js.Any], perf.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any], isClosureCompilerEnabled.asInstanceOf[js.Any])).asInstanceOf[TransformerFactory[SourceFile]]
}
