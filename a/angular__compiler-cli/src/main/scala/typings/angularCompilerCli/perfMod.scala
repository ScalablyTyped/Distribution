package typings.angularCompilerCli

import typings.angularCompilerCli.perfSrcApiMod.PerfRecorder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object perfMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/perf", "ActivePerfRecorder")
  @js.native
  /* private */ open class ActivePerfRecorder ()
    extends typings.angularCompilerCli.recorderMod.ActivePerfRecorder
  /* static members */
  object ActivePerfRecorder {
    
    @JSImport("@angular/compiler-cli/src/ngtsc/perf", "ActivePerfRecorder")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an `ActivePerfRecorder` with its zero point set to the current time.
      */
    inline def zeroedToNow(): typings.angularCompilerCli.recorderMod.ActivePerfRecorder = ^.asInstanceOf[js.Dynamic].applyDynamic("zeroedToNow")().asInstanceOf[typings.angularCompilerCli.recorderMod.ActivePerfRecorder]
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/perf", "DelegatingPerfRecorder")
  @js.native
  open class DelegatingPerfRecorder protected ()
    extends typings.angularCompilerCli.recorderMod.DelegatingPerfRecorder {
    def this(target: PerfRecorder) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/perf", "NOOP_PERF_RECORDER")
  @js.native
  val NOOP_PERF_RECORDER: PerfRecorder = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/perf", "PerfCheckpoint")
  @js.native
  object PerfCheckpoint extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompilerCli.perfSrcApiMod.PerfCheckpoint & Double] = js.native
    
    /* 3 */ val Analysis: typings.angularCompilerCli.perfSrcApiMod.PerfCheckpoint.Analysis & Double = js.native
    
    /* 8 */ val Emit: typings.angularCompilerCli.perfSrcApiMod.PerfCheckpoint.Emit & Double = js.native
    
    /* 0 */ val Initial: typings.angularCompilerCli.perfSrcApiMod.PerfCheckpoint.Initial & Double = js.native
    
    /* 9 */ val LAST: typings.angularCompilerCli.perfSrcApiMod.PerfCheckpoint.LAST & Double = js.native
    
    /* 2 */ val PreAnalysis: typings.angularCompilerCli.perfSrcApiMod.PerfCheckpoint.PreAnalysis & Double = js.native
    
    /* 7 */ val PreEmit: typings.angularCompilerCli.perfSrcApiMod.PerfCheckpoint.PreEmit & Double = js.native
    
    /* 4 */ val Resolve: typings.angularCompilerCli.perfSrcApiMod.PerfCheckpoint.Resolve & Double = js.native
    
    /* 5 */ val TtcGeneration: typings.angularCompilerCli.perfSrcApiMod.PerfCheckpoint.TtcGeneration & Double = js.native
    
    /* 6 */ val TtcUpdateProgram: typings.angularCompilerCli.perfSrcApiMod.PerfCheckpoint.TtcUpdateProgram & Double = js.native
    
    /* 1 */ val TypeScriptProgramCreate: typings.angularCompilerCli.perfSrcApiMod.PerfCheckpoint.TypeScriptProgramCreate & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/perf", "PerfEvent")
  @js.native
  object PerfEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompilerCli.perfSrcApiMod.PerfEvent & Double] = js.native
    
    /* 2 */ val AnalyzeComponent: typings.angularCompilerCli.perfSrcApiMod.PerfEvent.AnalyzeComponent & Double = js.native
    
    /* 3 */ val AnalyzeDirective: typings.angularCompilerCli.perfSrcApiMod.PerfEvent.AnalyzeDirective & Double = js.native
    
    /* 4 */ val AnalyzeInjectable: typings.angularCompilerCli.perfSrcApiMod.PerfEvent.AnalyzeInjectable & Double = js.native
    
    /* 5 */ val AnalyzeNgModule: typings.angularCompilerCli.perfSrcApiMod.PerfEvent.AnalyzeNgModule & Double = js.native
    
    /* 6 */ val AnalyzePipe: typings.angularCompilerCli.perfSrcApiMod.PerfEvent.AnalyzePipe & Double = js.native
    
    /* 16 */ val EmitSkipSourceFile: typings.angularCompilerCli.perfSrcApiMod.PerfEvent.EmitSkipSourceFile & Double = js.native
    
    /* 17 */ val EmitSourceFile: typings.angularCompilerCli.perfSrcApiMod.PerfEvent.EmitSourceFile & Double = js.native
    
    /* 12 */ val GenerateTcb: typings.angularCompilerCli.perfSrcApiMod.PerfEvent.GenerateTcb & Double = js.native
    
    /* 0 */ val InputDtsFile: typings.angularCompilerCli.perfSrcApiMod.PerfEvent.InputDtsFile & Double = js.native
    
    /* 1 */ val InputTsFile: typings.angularCompilerCli.perfSrcApiMod.PerfEvent.InputTsFile & Double = js.native
    
    /* 18 */ val LAST: typings.angularCompilerCli.perfSrcApiMod.PerfEvent.LAST & Double = js.native
    
    /* 14 */ val ReuseTypeCheckFile: typings.angularCompilerCli.perfSrcApiMod.PerfEvent.ReuseTypeCheckFile & Double = js.native
    
    /* 13 */ val SkipGenerateTcbNoInline: typings.angularCompilerCli.perfSrcApiMod.PerfEvent.SkipGenerateTcbNoInline & Double = js.native
    
    /* 10 */ val SourceFileLogicalChange: typings.angularCompilerCli.perfSrcApiMod.PerfEvent.SourceFileLogicalChange & Double = js.native
    
    /* 9 */ val SourceFilePhysicalChange: typings.angularCompilerCli.perfSrcApiMod.PerfEvent.SourceFilePhysicalChange & Double = js.native
    
    /* 11 */ val SourceFileReuseAnalysis: typings.angularCompilerCli.perfSrcApiMod.PerfEvent.SourceFileReuseAnalysis & Double = js.native
    
    /* 7 */ val TraitAnalyze: typings.angularCompilerCli.perfSrcApiMod.PerfEvent.TraitAnalyze & Double = js.native
    
    /* 8 */ val TraitReuseAnalysis: typings.angularCompilerCli.perfSrcApiMod.PerfEvent.TraitReuseAnalysis & Double = js.native
    
    /* 15 */ val UpdateTypeCheckProgram: typings.angularCompilerCli.perfSrcApiMod.PerfEvent.UpdateTypeCheckProgram & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/perf", "PerfPhase")
  @js.native
  object PerfPhase extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompilerCli.perfSrcApiMod.PerfPhase & Double] = js.native
    
    /* 6 */ val Analysis: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.Analysis & Double = js.native
    
    /* 12 */ val Compile: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.Compile & Double = js.native
    
    /* 8 */ val CycleDetection: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.CycleDetection & Double = js.native
    
    /* 24 */ val LAST: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.LAST & Double = js.native
    
    /* 25 */ val LsCodeFixes: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.LsCodeFixes & Double = js.native
    
    /* 26 */ val LsCodeFixesAll: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.LsCodeFixesAll & Double = js.native
    
    /* 19 */ val LsCompletions: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.LsCompletions & Double = js.native
    
    /* 22 */ val LsComponentLocations: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.LsComponentLocations & Double = js.native
    
    /* 18 */ val LsDefinition: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.LsDefinition & Double = js.native
    
    /* 21 */ val LsDiagnostics: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.LsDiagnostics & Double = js.native
    
    /* 17 */ val LsQuickInfo: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.LsQuickInfo & Double = js.native
    
    /* 16 */ val LsReferencesAndRenames: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.LsReferencesAndRenames & Double = js.native
    
    /* 23 */ val LsSignatureHelp: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.LsSignatureHelp & Double = js.native
    
    /* 20 */ val LsTcb: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.LsTcb & Double = js.native
    
    /* 3 */ val Reconciliation: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.Reconciliation & Double = js.native
    
    /* 7 */ val Resolve: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.Resolve & Double = js.native
    
    /* 4 */ val ResourceUpdate: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.ResourceUpdate & Double = js.native
    
    /* 1 */ val Setup: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.Setup & Double = js.native
    
    /* 9 */ val TcbGeneration: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.TcbGeneration & Double = js.native
    
    /* 10 */ val TcbUpdateProgram: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.TcbUpdateProgram & Double = js.native
    
    /* 13 */ val TtcAutocompletion: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.TtcAutocompletion & Double = js.native
    
    /* 14 */ val TtcDiagnostics: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.TtcDiagnostics & Double = js.native
    
    /* 15 */ val TtcSymbol: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.TtcSymbol & Double = js.native
    
    /* 5 */ val TypeScriptDiagnostics: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.TypeScriptDiagnostics & Double = js.native
    
    /* 11 */ val TypeScriptEmit: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.TypeScriptEmit & Double = js.native
    
    /* 2 */ val TypeScriptProgramCreate: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.TypeScriptProgramCreate & Double = js.native
    
    /* 0 */ val Unaccounted: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.Unaccounted & Double = js.native
  }
}
