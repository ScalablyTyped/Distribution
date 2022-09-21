package typings.angularCompilerCli

import typings.angularCompilerCli.perfSrcApiMod.PerfRecorder
import typings.std.Set
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object importsMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/cycles/src/imports", "ImportGraph")
  @js.native
  open class ImportGraph protected () extends StObject {
    def this(checker: TypeChecker, perf: PerfRecorder) = this()
    
    /**
      * Add a record of an import from `sf` to `imported`, that's not present in the original
      * `ts.Program` but will be remembered by the `ImportGraph`.
      */
    def addSyntheticImport(sf: SourceFile, imported: SourceFile): Unit = js.native
    
    /* private */ var checker: Any = js.native
    
    /**
      * Find an import path from the `start` SourceFile to the `end` SourceFile.
      *
      * This function implements a breadth first search that results in finding the
      * shortest path between the `start` and `end` points.
      *
      * @param start the starting point of the path.
      * @param end the ending point of the path.
      * @returns an array of source files that connect the `start` and `end` source files, or `null` if
      *     no path could be found.
      */
    def findPath(start: SourceFile, end: SourceFile): js.Array[SourceFile] | Null = js.native
    
    /* private */ var imports: Any = js.native
    
    /**
      * List the direct (not transitive) imports of a given `ts.SourceFile`.
      *
      * This operation is cached.
      */
    def importsOf(sf: SourceFile): Set[SourceFile] = js.native
    
    /* private */ var perf: Any = js.native
    
    /* private */ var scanImports: Any = js.native
  }
}
