package typings.angularCompilerCli

import typings.angularCompilerCli.anon.FileName
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscIncrementalApiMod.DependencyTracker
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscIncrementalSrcDependencyTrackingMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/incremental/src/dependency_tracking", "FileDependencyGraph")
  @js.native
  open class FileDependencyGraph[T /* <: FileName */] ()
    extends StObject
       with DependencyTracker[T] {
    
    /**
      * Record that the file `from` depends on the file `on`.
      */
    /* CompleteClass */
    override def addDependency(from: T, on: T): Unit = js.native
    
    /**
      * Record that the file `from` depends on the resource file `on`.
      */
    /* CompleteClass */
    override def addResourceDependency(from: T, on: AbsoluteFsPath): Unit = js.native
    
    def getResourceDependencies(from: T): js.Array[AbsoluteFsPath] = js.native
    
    /* private */ var nodeFor: Any = js.native
    
    /* private */ var nodes: Any = js.native
    
    /**
      * Record that the given file contains unresolvable dependencies.
      *
      * In practice, this means that the dependency graph cannot provide insight into the effects of
      * future changes on that file.
      */
    /* CompleteClass */
    override def recordDependencyAnalysisFailure(file: T): Unit = js.native
    
    /**
      * Update the current dependency graph from a previous one, incorporating a set of physical
      * changes.
      *
      * This method performs two tasks:
      *
      * 1. For files which have not logically changed, their dependencies from `previous` are added to
      *    `this` graph.
      * 2. For files which have logically changed, they're added to a set of logically changed files
      *    which is eventually returned.
      *
      * In essence, for build `n`, this method performs:
      *
      * G(n) + L(n) = G(n - 1) + P(n)
      *
      * where:
      *
      * G(n) = the dependency graph of build `n`
      * L(n) = the logically changed files from build n - 1 to build n.
      * P(n) = the physically changed files from build n - 1 to build n.
      */
    def updateWithPhysicalChanges(
      previous: FileDependencyGraph[T],
      changedTsPaths: Set[AbsoluteFsPath],
      deletedTsPaths: Set[AbsoluteFsPath],
      changedResources: Set[AbsoluteFsPath]
    ): Set[AbsoluteFsPath] = js.native
  }
}
