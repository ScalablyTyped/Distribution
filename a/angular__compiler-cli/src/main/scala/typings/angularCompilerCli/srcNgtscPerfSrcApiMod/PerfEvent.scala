package typings.angularCompilerCli.srcNgtscPerfSrcApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PerfEvent extends StObject
@JSImport("@angular/compiler-cli/src/ngtsc/perf/src/api", "PerfEvent")
@js.native
object PerfEvent extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PerfEvent & Double] = js.native
  
  /**
    * An `@Component` class was analyzed.
    */
  @js.native
  sealed trait AnalyzeComponent
    extends StObject
       with PerfEvent
  /* 2 */ val AnalyzeComponent: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.AnalyzeComponent & Double = js.native
  
  /**
    * An `@Directive` class was analyzed.
    */
  @js.native
  sealed trait AnalyzeDirective
    extends StObject
       with PerfEvent
  /* 3 */ val AnalyzeDirective: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.AnalyzeDirective & Double = js.native
  
  /**
    * An `@Injectable` class was analyzed.
    */
  @js.native
  sealed trait AnalyzeInjectable
    extends StObject
       with PerfEvent
  /* 4 */ val AnalyzeInjectable: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.AnalyzeInjectable & Double = js.native
  
  /**
    * An `@NgModule` class was analyzed.
    */
  @js.native
  sealed trait AnalyzeNgModule
    extends StObject
       with PerfEvent
  /* 5 */ val AnalyzeNgModule: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.AnalyzeNgModule & Double = js.native
  
  /**
    * An `@Pipe` class was analyzed.
    */
  @js.native
  sealed trait AnalyzePipe
    extends StObject
       with PerfEvent
  /* 6 */ val AnalyzePipe: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.AnalyzePipe & Double = js.native
  
  /**
    * The compiler was able to prove that a `ts.SourceFile` did not need to be re-emitted.
    */
  @js.native
  sealed trait EmitSkipSourceFile
    extends StObject
       with PerfEvent
  /* 16 */ val EmitSkipSourceFile: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.EmitSkipSourceFile & Double = js.native
  
  /**
    * A `ts.SourceFile` was emitted.
    */
  @js.native
  sealed trait EmitSourceFile
    extends StObject
       with PerfEvent
  /* 17 */ val EmitSourceFile: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.EmitSourceFile & Double = js.native
  
  /**
    * A Type Check Block (TCB) was generated.
    */
  @js.native
  sealed trait GenerateTcb
    extends StObject
       with PerfEvent
  /* 12 */ val GenerateTcb: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.GenerateTcb & Double = js.native
  
  /**
    * Counts the number of `.d.ts` files in the program.
    */
  @js.native
  sealed trait InputDtsFile
    extends StObject
       with PerfEvent
  /* 0 */ val InputDtsFile: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.InputDtsFile & Double = js.native
  
  /**
    * Counts the number of non-`.d.ts` files in the program.
    */
  @js.native
  sealed trait InputTsFile
    extends StObject
       with PerfEvent
  /* 1 */ val InputTsFile: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.InputTsFile & Double = js.native
  
  /**
    * Tracks the number of `PrefEvent`s, and must appear at the end of the list.
    */
  @js.native
  sealed trait LAST
    extends StObject
       with PerfEvent
  /* 18 */ val LAST: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.LAST & Double = js.native
  
  /**
    * A `.ngtypecheck.ts` file could be reused from the previous program and did not need to be
    * regenerated.
    */
  @js.native
  sealed trait ReuseTypeCheckFile
    extends StObject
       with PerfEvent
  /* 14 */ val ReuseTypeCheckFile: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.ReuseTypeCheckFile & Double = js.native
  
  /**
    * A Type Check Block (TCB) could not be generated because inlining was disabled, and the block
    * would've required inlining.
    */
  @js.native
  sealed trait SkipGenerateTcbNoInline
    extends StObject
       with PerfEvent
  /* 13 */ val SkipGenerateTcbNoInline: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.SkipGenerateTcbNoInline & Double = js.native
  
  /**
    * A `ts.SourceFile` did not physically changed, but according to the file dependency graph, has
    * logically changed between the prior program and a new incremental compilation.
    */
  @js.native
  sealed trait SourceFileLogicalChange
    extends StObject
       with PerfEvent
  /* 10 */ val SourceFileLogicalChange: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.SourceFileLogicalChange & Double = js.native
  
  /**
    * A `ts.SourceFile` directly changed between the prior program and a new incremental compilation.
    */
  @js.native
  sealed trait SourceFilePhysicalChange
    extends StObject
       with PerfEvent
  /* 9 */ val SourceFilePhysicalChange: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.SourceFilePhysicalChange & Double = js.native
  
  /**
    * A `ts.SourceFile` has not logically changed and all of its analysis results were thus available
    * for reuse.
    */
  @js.native
  sealed trait SourceFileReuseAnalysis
    extends StObject
       with PerfEvent
  /* 11 */ val SourceFileReuseAnalysis: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.SourceFileReuseAnalysis & Double = js.native
  
  /**
    * A trait was analyzed.
    *
    * In theory, this should be the sum of the `Analyze` counters for each decorator type.
    */
  @js.native
  sealed trait TraitAnalyze
    extends StObject
       with PerfEvent
  /* 7 */ val TraitAnalyze: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.TraitAnalyze & Double = js.native
  
  /**
    * A trait had a prior analysis available from an incremental program, and did not need to be
    * re-analyzed.
    */
  @js.native
  sealed trait TraitReuseAnalysis
    extends StObject
       with PerfEvent
  /* 8 */ val TraitReuseAnalysis: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.TraitReuseAnalysis & Double = js.native
  
  /**
    * The template type-checking program required changes and had to be updated in an incremental
    * step.
    */
  @js.native
  sealed trait UpdateTypeCheckProgram
    extends StObject
       with PerfEvent
  /* 15 */ val UpdateTypeCheckProgram: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.UpdateTypeCheckProgram & Double = js.native
}
