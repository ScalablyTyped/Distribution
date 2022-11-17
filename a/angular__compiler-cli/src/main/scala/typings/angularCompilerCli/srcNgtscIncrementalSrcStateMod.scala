package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscIncrementalSemanticGraphMod.SemanticDepGraph
import typings.angularCompilerCli.srcNgtscIncrementalSrcDependencyTrackingMod.FileDependencyGraph
import typings.angularCompilerCli.srcNgtscIncrementalSrcStateMod.IncrementalStateKind.Analyzed
import typings.angularCompilerCli.srcNgtscIncrementalSrcStateMod.IncrementalStateKind.Delta
import typings.angularCompilerCli.srcNgtscIncrementalSrcStateMod.IncrementalStateKind.Fresh
import typings.angularCompilerCli.srcNgtscTransformSrcCompilationMod.ClassRecord
import typings.angularCompilerCli.srcNgtscTypecheckSrcCheckerMod.FileTypeCheckingData
import typings.std.Map
import typings.std.Set
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscIncrementalSrcStateMod {
  
  @js.native
  sealed trait IncrementalStateKind extends StObject
  @JSImport("@angular/compiler-cli/src/ngtsc/incremental/src/state", "IncrementalStateKind")
  @js.native
  object IncrementalStateKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[IncrementalStateKind & Double] = js.native
    
    @js.native
    sealed trait Analyzed
      extends StObject
         with IncrementalStateKind
    /* 2 */ val Analyzed: typings.angularCompilerCli.srcNgtscIncrementalSrcStateMod.IncrementalStateKind.Analyzed & Double = js.native
    
    @js.native
    sealed trait Delta
      extends StObject
         with IncrementalStateKind
    /* 1 */ val Delta: typings.angularCompilerCli.srcNgtscIncrementalSrcStateMod.IncrementalStateKind.Delta & Double = js.native
    
    @js.native
    sealed trait Fresh
      extends StObject
         with IncrementalStateKind
    /* 0 */ val Fresh: typings.angularCompilerCli.srcNgtscIncrementalSrcStateMod.IncrementalStateKind.Fresh & Double = js.native
  }
  
  trait AnalyzedIncrementalState extends StObject {
    
    /**
      * Dependency graph extracted from the build, to be used to determine the logical impact of
      * physical file changes.
      */
    var depGraph: FileDependencyGraph[SourceFile]
    
    /**
      * Cumulative set of source file paths which were definitively emitted by this compilation or
      * carried forward from a prior one.
      */
    var emitted: Set[AbsoluteFsPath]
    
    var kind: Analyzed
    
    /**
      * The analysis data from a prior compilation. This stores the trait information for all source
      * files that was present in a prior compilation.
      */
    var priorAnalysis: Map[SourceFile, js.Array[ClassRecord]]
    
    /**
      * The semantic dependency graph from the build.
      *
      * This is used to perform in-depth comparison of Angular decorated classes, to determine
      * which files have to be re-emitted and/or re-type-checked.
      */
    var semanticDepGraph: SemanticDepGraph
    
    /**
      * All generated template type-checking files produced as part of this compilation, or `null` if
      * type-checking was not (yet) performed.
      */
    var typeCheckResults: (Map[AbsoluteFsPath, FileTypeCheckingData]) | Null
    
    /**
      * Map of source file paths to the version of this file as seen in the compilation.
      */
    var versions: (Map[AbsoluteFsPath, String]) | Null
  }
  object AnalyzedIncrementalState {
    
    inline def apply(
      depGraph: FileDependencyGraph[SourceFile],
      emitted: Set[AbsoluteFsPath],
      kind: Analyzed,
      priorAnalysis: Map[SourceFile, js.Array[ClassRecord]],
      semanticDepGraph: SemanticDepGraph
    ): AnalyzedIncrementalState = {
      val __obj = js.Dynamic.literal(depGraph = depGraph.asInstanceOf[js.Any], emitted = emitted.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], priorAnalysis = priorAnalysis.asInstanceOf[js.Any], semanticDepGraph = semanticDepGraph.asInstanceOf[js.Any], typeCheckResults = null, versions = null)
      __obj.asInstanceOf[AnalyzedIncrementalState]
    }
    
    extension [Self <: AnalyzedIncrementalState](x: Self) {
      
      inline def setDepGraph(value: FileDependencyGraph[SourceFile]): Self = StObject.set(x, "depGraph", value.asInstanceOf[js.Any])
      
      inline def setEmitted(value: Set[AbsoluteFsPath]): Self = StObject.set(x, "emitted", value.asInstanceOf[js.Any])
      
      inline def setKind(value: Analyzed): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setPriorAnalysis(value: Map[SourceFile, js.Array[ClassRecord]]): Self = StObject.set(x, "priorAnalysis", value.asInstanceOf[js.Any])
      
      inline def setSemanticDepGraph(value: SemanticDepGraph): Self = StObject.set(x, "semanticDepGraph", value.asInstanceOf[js.Any])
      
      inline def setTypeCheckResults(value: Map[AbsoluteFsPath, FileTypeCheckingData]): Self = StObject.set(x, "typeCheckResults", value.asInstanceOf[js.Any])
      
      inline def setTypeCheckResultsNull: Self = StObject.set(x, "typeCheckResults", null)
      
      inline def setVersions(value: Map[AbsoluteFsPath, String]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
      
      inline def setVersionsNull: Self = StObject.set(x, "versions", null)
    }
  }
  
  trait DeltaIncrementalState extends StObject {
    
    /**
      * Set of resource file paths which have changed since the `lastAnalyzedState` compilation.
      */
    var changedResourceFiles: Set[AbsoluteFsPath]
    
    var kind: Delta
    
    /**
      * If available, the `AnalyzedIncrementalState` for the most recent ancestor of the current
      * program which was successfully analyzed.
      */
    var lastAnalyzedState: AnalyzedIncrementalState
    
    /**
      * Set of file paths which have changed since the `lastAnalyzedState` compilation.
      */
    var physicallyChangedTsFiles: Set[AbsoluteFsPath]
  }
  object DeltaIncrementalState {
    
    inline def apply(
      changedResourceFiles: Set[AbsoluteFsPath],
      kind: Delta,
      lastAnalyzedState: AnalyzedIncrementalState,
      physicallyChangedTsFiles: Set[AbsoluteFsPath]
    ): DeltaIncrementalState = {
      val __obj = js.Dynamic.literal(changedResourceFiles = changedResourceFiles.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], lastAnalyzedState = lastAnalyzedState.asInstanceOf[js.Any], physicallyChangedTsFiles = physicallyChangedTsFiles.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeltaIncrementalState]
    }
    
    extension [Self <: DeltaIncrementalState](x: Self) {
      
      inline def setChangedResourceFiles(value: Set[AbsoluteFsPath]): Self = StObject.set(x, "changedResourceFiles", value.asInstanceOf[js.Any])
      
      inline def setKind(value: Delta): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setLastAnalyzedState(value: AnalyzedIncrementalState): Self = StObject.set(x, "lastAnalyzedState", value.asInstanceOf[js.Any])
      
      inline def setPhysicallyChangedTsFiles(value: Set[AbsoluteFsPath]): Self = StObject.set(x, "physicallyChangedTsFiles", value.asInstanceOf[js.Any])
    }
  }
  
  trait FreshIncrementalState extends StObject {
    
    var kind: Fresh
  }
  object FreshIncrementalState {
    
    inline def apply(kind: Fresh): FreshIncrementalState = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[FreshIncrementalState]
    }
    
    extension [Self <: FreshIncrementalState](x: Self) {
      
      inline def setKind(value: Fresh): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  type IncrementalState = AnalyzedIncrementalState | DeltaIncrementalState | FreshIncrementalState
}
