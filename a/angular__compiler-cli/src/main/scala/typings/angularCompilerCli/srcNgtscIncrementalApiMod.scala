package typings.angularCompilerCli

import typings.angularCompilerCli.anon.FileName
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.std.Map
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscIncrementalApiMod {
  
  trait DependencyTracker[T /* <: FileName */] extends StObject {
    
    /**
      * Record that the file `from` depends on the file `on`.
      */
    def addDependency(from: T, on: T): Unit
    
    /**
      * Record that the file `from` depends on the resource file `on`.
      */
    def addResourceDependency(from: T, on: AbsoluteFsPath): Unit
    
    /**
      * Record that the given file contains unresolvable dependencies.
      *
      * In practice, this means that the dependency graph cannot provide insight into the effects of
      * future changes on that file.
      */
    def recordDependencyAnalysisFailure(file: T): Unit
  }
  object DependencyTracker {
    
    inline def apply[T /* <: FileName */](
      addDependency: (T, T) => Unit,
      addResourceDependency: (T, AbsoluteFsPath) => Unit,
      recordDependencyAnalysisFailure: T => Unit
    ): DependencyTracker[T] = {
      val __obj = js.Dynamic.literal(addDependency = js.Any.fromFunction2(addDependency), addResourceDependency = js.Any.fromFunction2(addResourceDependency), recordDependencyAnalysisFailure = js.Any.fromFunction1(recordDependencyAnalysisFailure))
      __obj.asInstanceOf[DependencyTracker[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DependencyTracker[?], T /* <: FileName */] (val x: Self & DependencyTracker[T]) extends AnyVal {
      
      inline def setAddDependency(value: (T, T) => Unit): Self = StObject.set(x, "addDependency", js.Any.fromFunction2(value))
      
      inline def setAddResourceDependency(value: (T, AbsoluteFsPath) => Unit): Self = StObject.set(x, "addResourceDependency", js.Any.fromFunction2(value))
      
      inline def setRecordDependencyAnalysisFailure(value: T => Unit): Self = StObject.set(x, "recordDependencyAnalysisFailure", js.Any.fromFunction1(value))
    }
  }
  
  trait IncrementalBuild[AnalysisT, FileTypeCheckDataT] extends StObject {
    
    /**
      * Retrieve the prior analysis work, if any, done for the given source file.
      */
    def priorAnalysisFor(sf: SourceFile): js.Array[AnalysisT] | Null
    
    /**
      * Retrieve the prior type-checking work, if any, that's been done for the given source file.
      */
    def priorTypeCheckingResultsFor(fileSf: SourceFile): FileTypeCheckDataT | Null
    
    /**
      * Reports that template type-checking has completed successfully, with a map of type-checking
      * data for each user file which can be reused in a future incremental iteration.
      */
    def recordSuccessfulTypeCheck(results: Map[AbsoluteFsPath, FileTypeCheckDataT]): Unit
  }
  object IncrementalBuild {
    
    inline def apply[AnalysisT, FileTypeCheckDataT](
      priorAnalysisFor: SourceFile => js.Array[AnalysisT] | Null,
      priorTypeCheckingResultsFor: SourceFile => FileTypeCheckDataT | Null,
      recordSuccessfulTypeCheck: Map[AbsoluteFsPath, FileTypeCheckDataT] => Unit
    ): IncrementalBuild[AnalysisT, FileTypeCheckDataT] = {
      val __obj = js.Dynamic.literal(priorAnalysisFor = js.Any.fromFunction1(priorAnalysisFor), priorTypeCheckingResultsFor = js.Any.fromFunction1(priorTypeCheckingResultsFor), recordSuccessfulTypeCheck = js.Any.fromFunction1(recordSuccessfulTypeCheck))
      __obj.asInstanceOf[IncrementalBuild[AnalysisT, FileTypeCheckDataT]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IncrementalBuild[?, ?], AnalysisT, FileTypeCheckDataT] (val x: Self & (IncrementalBuild[AnalysisT, FileTypeCheckDataT])) extends AnyVal {
      
      inline def setPriorAnalysisFor(value: SourceFile => js.Array[AnalysisT] | Null): Self = StObject.set(x, "priorAnalysisFor", js.Any.fromFunction1(value))
      
      inline def setPriorTypeCheckingResultsFor(value: SourceFile => FileTypeCheckDataT | Null): Self = StObject.set(x, "priorTypeCheckingResultsFor", js.Any.fromFunction1(value))
      
      inline def setRecordSuccessfulTypeCheck(value: Map[AbsoluteFsPath, FileTypeCheckDataT] => Unit): Self = StObject.set(x, "recordSuccessfulTypeCheck", js.Any.fromFunction1(value))
    }
  }
}
