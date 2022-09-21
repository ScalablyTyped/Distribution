package typings.angularCompilerCli

import typings.angularCompilerCli.perfSrcApiMod.PerfRecorder
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cyclesMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/cycles", "Cycle")
  @js.native
  open class Cycle protected ()
    extends typings.angularCompilerCli.analyzerMod.Cycle {
    def this(importGraph: typings.angularCompilerCli.importsMod.ImportGraph, from: SourceFile, to: SourceFile) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/cycles", "CycleAnalyzer")
  @js.native
  open class CycleAnalyzer protected ()
    extends typings.angularCompilerCli.analyzerMod.CycleAnalyzer {
    def this(importGraph: typings.angularCompilerCli.importsMod.ImportGraph) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/cycles", "ImportGraph")
  @js.native
  open class ImportGraph protected ()
    extends typings.angularCompilerCli.importsMod.ImportGraph {
    def this(checker: TypeChecker, perf: PerfRecorder) = this()
  }
}
