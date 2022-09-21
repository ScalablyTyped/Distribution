package typings.angularCompilerCli.perfSrcApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PerfPhase extends StObject
@JSImport("@angular/compiler-cli/src/ngtsc/perf/src/api", "PerfPhase")
@js.native
object PerfPhase extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PerfPhase & Double] = js.native
  
  /**
    * Time spent in Angular analysis of individual classes in the program.
    */
  @js.native
  sealed trait Analysis
    extends StObject
       with PerfPhase
  /* 6 */ val Analysis: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.Analysis & Double = js.native
  
  /**
    * Time spent by Angular performing code transformations of ASTs as they're about to be emitted.
    *
    * This includes the actual code generation step for templates, and occurs during the emit phase
    * (but is tracked separately from `TypeScriptEmit` time).
    */
  @js.native
  sealed trait Compile
    extends StObject
       with PerfPhase
  /* 12 */ val Compile: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.Compile & Double = js.native
  
  /**
    * Time spent building the import graph of the program in order to perform cycle detection.
    */
  @js.native
  sealed trait CycleDetection
    extends StObject
       with PerfPhase
  /* 8 */ val CycleDetection: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.CycleDetection & Double = js.native
  
  /**
    * Tracks the number of `PerfPhase`s, and must appear at the end of the list.
    */
  @js.native
  sealed trait LAST
    extends StObject
       with PerfPhase
  /* 24 */ val LAST: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.LAST & Double = js.native
  
  /**
    * Time spent by the Angular Language Service calculating code fixes.
    */
  @js.native
  sealed trait LsCodeFixes
    extends StObject
       with PerfPhase
  /* 25 */ val LsCodeFixes: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.LsCodeFixes & Double = js.native
  
  /**
    * Time spent by the Angular Language Service to fix all detected same type errors.
    */
  @js.native
  sealed trait LsCodeFixesAll
    extends StObject
       with PerfPhase
  /* 26 */ val LsCodeFixesAll: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.LsCodeFixesAll & Double = js.native
  
  /**
    * Time spent by the Angular Language Service calculating a "get completions" (AKA autocomplete)
    * operation.
    */
  @js.native
  sealed trait LsCompletions
    extends StObject
       with PerfPhase
  /* 19 */ val LsCompletions: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.LsCompletions & Double = js.native
  
  /**
    * Time spent by the Angular Language Service calculating a "get component locations for template"
    * operation.
    */
  @js.native
  sealed trait LsComponentLocations
    extends StObject
       with PerfPhase
  /* 22 */ val LsComponentLocations: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.LsComponentLocations & Double = js.native
  
  /**
    * Time spent by the Angular Language Service calculating a "get type definition" or "get
    * definition" operation.
    */
  @js.native
  sealed trait LsDefinition
    extends StObject
       with PerfPhase
  /* 18 */ val LsDefinition: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.LsDefinition & Double = js.native
  
  /**
    * Time spent by the Angular Language Service calculating diagnostics.
    */
  @js.native
  sealed trait LsDiagnostics
    extends StObject
       with PerfPhase
  /* 21 */ val LsDiagnostics: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.LsDiagnostics & Double = js.native
  
  /**
    * Time spent by the Angular Language Service calculating a "quick info" operation.
    */
  @js.native
  sealed trait LsQuickInfo
    extends StObject
       with PerfPhase
  /* 17 */ val LsQuickInfo: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.LsQuickInfo & Double = js.native
  
  /**
    * Time spent by the Angular Language Service calculating a "get references" or a renaming
    * operation.
    */
  @js.native
  sealed trait LsReferencesAndRenames
    extends StObject
       with PerfPhase
  /* 16 */ val LsReferencesAndRenames: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.LsReferencesAndRenames & Double = js.native
  
  /**
    * Time spent by the Angular Language Service calculating signature help.
    */
  @js.native
  sealed trait LsSignatureHelp
    extends StObject
       with PerfPhase
  /* 23 */ val LsSignatureHelp: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.LsSignatureHelp & Double = js.native
  
  /**
    * Time spent by the Angular Language Service calculating a "view template typecheck block"
    * operation.
    */
  @js.native
  sealed trait LsTcb
    extends StObject
       with PerfPhase
  /* 20 */ val LsTcb: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.LsTcb & Double = js.native
  
  /**
    * Time spent reconciling the contents of an old `ts.Program` with the new incremental one.
    *
    * Only present in incremental compilations.
    */
  @js.native
  sealed trait Reconciliation
    extends StObject
       with PerfPhase
  /* 3 */ val Reconciliation: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.Reconciliation & Double = js.native
  
  /**
    * Time spent in Angular global analysis (synthesis of analysis information into a complete
    * understanding of the program).
    */
  @js.native
  sealed trait Resolve
    extends StObject
       with PerfPhase
  /* 7 */ val Resolve: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.Resolve & Double = js.native
  
  /**
    * Time spent updating an `NgCompiler` instance with a resource-only change.
    *
    * Only present in incremental compilations where the change was resource-only.
    */
  @js.native
  sealed trait ResourceUpdate
    extends StObject
       with PerfPhase
  /* 4 */ val ResourceUpdate: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.ResourceUpdate & Double = js.native
  
  /**
    * Time spent setting up the compiler, before a TypeScript program is created.
    *
    * This includes operations like configuring the `ts.CompilerHost` and any wrappers.
    */
  @js.native
  sealed trait Setup
    extends StObject
       with PerfPhase
  /* 1 */ val Setup: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.Setup & Double = js.native
  
  /**
    * Time spent generating the text of Type Check Blocks in order to perform template type checking.
    */
  @js.native
  sealed trait TcbGeneration
    extends StObject
       with PerfPhase
  /* 9 */ val TcbGeneration: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.TcbGeneration & Double = js.native
  
  /**
    * Time spent updating the `ts.Program` with new Type Check Block code.
    */
  @js.native
  sealed trait TcbUpdateProgram
    extends StObject
       with PerfPhase
  /* 10 */ val TcbUpdateProgram: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.TcbUpdateProgram & Double = js.native
  
  /**
    * Time spent performing a `TemplateTypeChecker` autocompletion operation.
    */
  @js.native
  sealed trait TtcAutocompletion
    extends StObject
       with PerfPhase
  /* 13 */ val TtcAutocompletion: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.TtcAutocompletion & Double = js.native
  
  /**
    * Time spent computing template type-checking diagnostics.
    */
  @js.native
  sealed trait TtcDiagnostics
    extends StObject
       with PerfPhase
  /* 14 */ val TtcDiagnostics: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.TtcDiagnostics & Double = js.native
  
  /**
    * Time spent getting a `Symbol` from the `TemplateTypeChecker`.
    */
  @js.native
  sealed trait TtcSymbol
    extends StObject
       with PerfPhase
  /* 15 */ val TtcSymbol: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.TtcSymbol & Double = js.native
  
  /**
    * Time spent calculating the plain TypeScript diagnostics (structural and semantic).
    */
  @js.native
  sealed trait TypeScriptDiagnostics
    extends StObject
       with PerfPhase
  /* 5 */ val TypeScriptDiagnostics: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.TypeScriptDiagnostics & Double = js.native
  
  /**
    * Time spent by TypeScript performing its emit operations, including downleveling and writing
    * output files.
    */
  @js.native
  sealed trait TypeScriptEmit
    extends StObject
       with PerfPhase
  /* 11 */ val TypeScriptEmit: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.TypeScriptEmit & Double = js.native
  
  /**
    * Time spent in `ts.createProgram`, including reading and parsing `ts.SourceFile`s in the
    * `ts.CompilerHost`.
    *
    * This might be an incremental program creation operation.
    */
  @js.native
  sealed trait TypeScriptProgramCreate
    extends StObject
       with PerfPhase
  /* 2 */ val TypeScriptProgramCreate: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.TypeScriptProgramCreate & Double = js.native
  
  /**
    * The "default" phase which tracks time not spent in any other phase.
    */
  @js.native
  sealed trait Unaccounted
    extends StObject
       with PerfPhase
  /* 0 */ val Unaccounted: typings.angularCompilerCli.perfSrcApiMod.PerfPhase.Unaccounted & Double = js.native
}
