package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfRecorder
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscCyclesMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/cycles", "Cycle")
  @js.native
  open class Cycle protected ()
    extends typings.angularCompilerCli.srcNgtscCyclesSrcAnalyzerMod.Cycle {
    def this(
      importGraph: typings.angularCompilerCli.srcNgtscCyclesSrcImportsMod.ImportGraph,
      from: SourceFile,
      to: SourceFile
    ) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/cycles", "CycleAnalyzer")
  @js.native
  open class CycleAnalyzer protected ()
    extends typings.angularCompilerCli.srcNgtscCyclesSrcAnalyzerMod.CycleAnalyzer {
    def this(importGraph: typings.angularCompilerCli.srcNgtscCyclesSrcImportsMod.ImportGraph) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/cycles", "ImportGraph")
  @js.native
  open class ImportGraph protected ()
    extends typings.angularCompilerCli.srcNgtscCyclesSrcImportsMod.ImportGraph {
    def this(checker: TypeChecker, perf: PerfRecorder) = this()
  }
}
