package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscIncrementalApiMod.IncrementalBuild
import typings.angularCompilerCli.srcNgtscIncrementalSemanticGraphMod.SemanticDepGraphUpdater
import typings.angularCompilerCli.srcNgtscIncrementalSrcDependencyTrackingMod.FileDependencyGraph
import typings.angularCompilerCli.srcNgtscIncrementalSrcStateMod.IncrementalState
import typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfRecorder
import typings.angularCompilerCli.srcNgtscTransformMod.TraitCompiler
import typings.angularCompilerCli.srcNgtscTransformSrcCompilationMod.ClassRecord
import typings.angularCompilerCli.srcNgtscTypecheckSrcCheckerMod.FileTypeCheckingData
import typings.std.Map
import typings.std.Set
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscIncrementalSrcIncrementalMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/incremental/src/incremental", "IncrementalCompilation")
  @js.native
  /* private */ open class IncrementalCompilation ()
    extends StObject
       with IncrementalBuild[ClassRecord, FileTypeCheckingData] {
    
    /**
      * `IncrementalState` of this compilation if it were to be reused in a subsequent incremental
      * compilation at the current moment.
      *
      * Exposed via the `state` read-only getter.
      */
    /* private */ var _state: Any = js.native
    
    val depGraph: FileDependencyGraph[SourceFile] = js.native
    
    /* private */ var phase: Any = js.native
    
    /**
      * Retrieve the prior analysis work, if any, done for the given source file.
      */
    /* CompleteClass */
    override def priorAnalysisFor(sf: SourceFile): js.Array[ClassRecord] | Null = js.native
    
    /**
      * Retrieve the prior type-checking work, if any, that's been done for the given source file.
      */
    /* CompleteClass */
    override def priorTypeCheckingResultsFor(fileSf: SourceFile): FileTypeCheckingData | Null = js.native
    
    def recordSuccessfulAnalysis(traitCompiler: TraitCompiler): Unit = js.native
    
    def recordSuccessfulEmit(sf: SourceFile): Unit = js.native
    
    /**
      * Reports that template type-checking has completed successfully, with a map of type-checking
      * data for each user file which can be reused in a future incremental iteration.
      */
    /* CompleteClass */
    override def recordSuccessfulTypeCheck(results: Map[AbsoluteFsPath, FileTypeCheckingData]): Unit = js.native
    
    def safeToSkipEmit(sf: SourceFile): Boolean = js.native
    
    def semanticDepGraphUpdater: SemanticDepGraphUpdater = js.native
    
    def state: IncrementalState = js.native
    
    /* private */ var step: Any = js.native
    
    /* private */ var versions: Any = js.native
  }
  /* static members */
  object IncrementalCompilation {
    
    @JSImport("@angular/compiler-cli/src/ngtsc/incremental/src/incremental", "IncrementalCompilation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Begin a fresh `IncrementalCompilation`.
      */
    inline def fresh(program: Program): IncrementalCompilation = ^.asInstanceOf[js.Dynamic].applyDynamic("fresh")(program.asInstanceOf[js.Any]).asInstanceOf[IncrementalCompilation]
    inline def fresh(program: Program, versions: Map[AbsoluteFsPath, String]): IncrementalCompilation = (^.asInstanceOf[js.Dynamic].applyDynamic("fresh")(program.asInstanceOf[js.Any], versions.asInstanceOf[js.Any])).asInstanceOf[IncrementalCompilation]
    
    inline def incremental(
      program: Program,
      newVersions: Null,
      oldProgram: Program,
      oldState: IncrementalState,
      modifiedResourceFiles: Null,
      perf: PerfRecorder
    ): IncrementalCompilation = (^.asInstanceOf[js.Dynamic].applyDynamic("incremental")(program.asInstanceOf[js.Any], newVersions.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any], oldState.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], perf.asInstanceOf[js.Any])).asInstanceOf[IncrementalCompilation]
    inline def incremental(
      program: Program,
      newVersions: Null,
      oldProgram: Program,
      oldState: IncrementalState,
      modifiedResourceFiles: Set[AbsoluteFsPath],
      perf: PerfRecorder
    ): IncrementalCompilation = (^.asInstanceOf[js.Dynamic].applyDynamic("incremental")(program.asInstanceOf[js.Any], newVersions.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any], oldState.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], perf.asInstanceOf[js.Any])).asInstanceOf[IncrementalCompilation]
    inline def incremental(
      program: Program,
      newVersions: Map[AbsoluteFsPath, String],
      oldProgram: Program,
      oldState: IncrementalState,
      modifiedResourceFiles: Null,
      perf: PerfRecorder
    ): IncrementalCompilation = (^.asInstanceOf[js.Dynamic].applyDynamic("incremental")(program.asInstanceOf[js.Any], newVersions.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any], oldState.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], perf.asInstanceOf[js.Any])).asInstanceOf[IncrementalCompilation]
    inline def incremental(
      program: Program,
      newVersions: Map[AbsoluteFsPath, String],
      oldProgram: Program,
      oldState: IncrementalState,
      modifiedResourceFiles: Set[AbsoluteFsPath],
      perf: PerfRecorder
    ): IncrementalCompilation = (^.asInstanceOf[js.Dynamic].applyDynamic("incremental")(program.asInstanceOf[js.Any], newVersions.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any], oldState.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], perf.asInstanceOf[js.Any])).asInstanceOf[IncrementalCompilation]
  }
}
