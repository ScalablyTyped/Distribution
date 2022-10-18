package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfRecorder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscPerfMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/perf", "ActivePerfRecorder")
  @js.native
  /* private */ open class ActivePerfRecorder ()
    extends typings.angularCompilerCli.srcNgtscPerfSrcRecorderMod.ActivePerfRecorder
  /* static members */
  object ActivePerfRecorder {
    
    @JSImport("@angular/compiler-cli/src/ngtsc/perf", "ActivePerfRecorder")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an `ActivePerfRecorder` with its zero point set to the current time.
      */
    inline def zeroedToNow(): typings.angularCompilerCli.srcNgtscPerfSrcRecorderMod.ActivePerfRecorder = ^.asInstanceOf[js.Dynamic].applyDynamic("zeroedToNow")().asInstanceOf[typings.angularCompilerCli.srcNgtscPerfSrcRecorderMod.ActivePerfRecorder]
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/perf", "DelegatingPerfRecorder")
  @js.native
  open class DelegatingPerfRecorder protected ()
    extends typings.angularCompilerCli.srcNgtscPerfSrcRecorderMod.DelegatingPerfRecorder {
    def this(target: PerfRecorder) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/perf", "NOOP_PERF_RECORDER")
  @js.native
  val NOOP_PERF_RECORDER: PerfRecorder = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/perf", "PerfCheckpoint")
  @js.native
  object PerfCheckpoint extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfCheckpoint & Double] = js.native
    
    /* 3 */ val Analysis: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfCheckpoint.Analysis & Double = js.native
    
    /* 8 */ val Emit: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfCheckpoint.Emit & Double = js.native
    
    /* 0 */ val Initial: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfCheckpoint.Initial & Double = js.native
    
    /* 9 */ val LAST: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfCheckpoint.LAST & Double = js.native
    
    /* 2 */ val PreAnalysis: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfCheckpoint.PreAnalysis & Double = js.native
    
    /* 7 */ val PreEmit: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfCheckpoint.PreEmit & Double = js.native
    
    /* 4 */ val Resolve: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfCheckpoint.Resolve & Double = js.native
    
    /* 5 */ val TtcGeneration: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfCheckpoint.TtcGeneration & Double = js.native
    
    /* 6 */ val TtcUpdateProgram: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfCheckpoint.TtcUpdateProgram & Double = js.native
    
    /* 1 */ val TypeScriptProgramCreate: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfCheckpoint.TypeScriptProgramCreate & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/perf", "PerfEvent")
  @js.native
  object PerfEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent & Double] = js.native
    
    /* 2 */ val AnalyzeComponent: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.AnalyzeComponent & Double = js.native
    
    /* 3 */ val AnalyzeDirective: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.AnalyzeDirective & Double = js.native
    
    /* 4 */ val AnalyzeInjectable: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.AnalyzeInjectable & Double = js.native
    
    /* 5 */ val AnalyzeNgModule: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.AnalyzeNgModule & Double = js.native
    
    /* 6 */ val AnalyzePipe: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.AnalyzePipe & Double = js.native
    
    /* 16 */ val EmitSkipSourceFile: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.EmitSkipSourceFile & Double = js.native
    
    /* 17 */ val EmitSourceFile: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.EmitSourceFile & Double = js.native
    
    /* 12 */ val GenerateTcb: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.GenerateTcb & Double = js.native
    
    /* 0 */ val InputDtsFile: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.InputDtsFile & Double = js.native
    
    /* 1 */ val InputTsFile: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.InputTsFile & Double = js.native
    
    /* 18 */ val LAST: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.LAST & Double = js.native
    
    /* 14 */ val ReuseTypeCheckFile: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.ReuseTypeCheckFile & Double = js.native
    
    /* 13 */ val SkipGenerateTcbNoInline: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.SkipGenerateTcbNoInline & Double = js.native
    
    /* 10 */ val SourceFileLogicalChange: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.SourceFileLogicalChange & Double = js.native
    
    /* 9 */ val SourceFilePhysicalChange: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.SourceFilePhysicalChange & Double = js.native
    
    /* 11 */ val SourceFileReuseAnalysis: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.SourceFileReuseAnalysis & Double = js.native
    
    /* 7 */ val TraitAnalyze: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.TraitAnalyze & Double = js.native
    
    /* 8 */ val TraitReuseAnalysis: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.TraitReuseAnalysis & Double = js.native
    
    /* 15 */ val UpdateTypeCheckProgram: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.UpdateTypeCheckProgram & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/perf", "PerfPhase")
  @js.native
  object PerfPhase extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase & Double] = js.native
    
    /* 6 */ val Analysis: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.Analysis & Double = js.native
    
    /* 12 */ val Compile: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.Compile & Double = js.native
    
    /* 8 */ val CycleDetection: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.CycleDetection & Double = js.native
    
    /* 24 */ val LAST: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.LAST & Double = js.native
    
    /* 25 */ val LsCodeFixes: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.LsCodeFixes & Double = js.native
    
    /* 26 */ val LsCodeFixesAll: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.LsCodeFixesAll & Double = js.native
    
    /* 19 */ val LsCompletions: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.LsCompletions & Double = js.native
    
    /* 22 */ val LsComponentLocations: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.LsComponentLocations & Double = js.native
    
    /* 18 */ val LsDefinition: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.LsDefinition & Double = js.native
    
    /* 21 */ val LsDiagnostics: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.LsDiagnostics & Double = js.native
    
    /* 17 */ val LsQuickInfo: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.LsQuickInfo & Double = js.native
    
    /* 16 */ val LsReferencesAndRenames: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.LsReferencesAndRenames & Double = js.native
    
    /* 23 */ val LsSignatureHelp: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.LsSignatureHelp & Double = js.native
    
    /* 20 */ val LsTcb: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.LsTcb & Double = js.native
    
    /* 3 */ val Reconciliation: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.Reconciliation & Double = js.native
    
    /* 7 */ val Resolve: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.Resolve & Double = js.native
    
    /* 4 */ val ResourceUpdate: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.ResourceUpdate & Double = js.native
    
    /* 1 */ val Setup: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.Setup & Double = js.native
    
    /* 9 */ val TcbGeneration: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.TcbGeneration & Double = js.native
    
    /* 10 */ val TcbUpdateProgram: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.TcbUpdateProgram & Double = js.native
    
    /* 13 */ val TtcAutocompletion: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.TtcAutocompletion & Double = js.native
    
    /* 14 */ val TtcDiagnostics: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.TtcDiagnostics & Double = js.native
    
    /* 15 */ val TtcSymbol: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.TtcSymbol & Double = js.native
    
    /* 5 */ val TypeScriptDiagnostics: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.TypeScriptDiagnostics & Double = js.native
    
    /* 11 */ val TypeScriptEmit: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.TypeScriptEmit & Double = js.native
    
    /* 2 */ val TypeScriptProgramCreate: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.TypeScriptProgramCreate & Double = js.native
    
    /* 0 */ val Unaccounted: typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.Unaccounted & Double = js.native
  }
}
