package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscIncrementalSemanticGraphMod.SemanticSymbol
import typings.angularCompilerCli.srcNgtscTransformSrcApiMod.DecoratorHandler
import typings.angularCompilerCli.srcNgtscTransformSrcApiMod.DetectResult
import typings.angularCompilerCli.srcNgtscTransformSrcTraitMod.TraitState.Analyzed
import typings.angularCompilerCli.srcNgtscTransformSrcTraitMod.TraitState.Pending
import typings.angularCompilerCli.srcNgtscTransformSrcTraitMod.TraitState.Resolved
import typings.angularCompilerCli.srcNgtscTransformSrcTraitMod.TraitState.Skipped
import typings.typescript.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTransformSrcTraitMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularCompilerCli.srcNgtscTransformSrcTraitMod.PendingTrait[D, A, S, R]
    - typings.angularCompilerCli.srcNgtscTransformSrcTraitMod.SkippedTrait[D, A, S, R]
    - typings.angularCompilerCli.srcNgtscTransformSrcTraitMod.AnalyzedTrait[D, A, S, R]
    - typings.angularCompilerCli.srcNgtscTransformSrcTraitMod.ResolvedTrait[D, A, S, R]
  */
  trait Trait[D, A, S /* <: SemanticSymbol | Null */, R] extends StObject
  object Trait {
    
    @JSImport("@angular/compiler-cli/src/ngtsc/transform/src/trait", "Trait")
    @js.native
    val ^ : js.Any = js.native
    
    inline def pending[D, A, S /* <: SemanticSymbol | Null */, R](handler: DecoratorHandler[D, A, S, R], detected: DetectResult[D]): PendingTrait[D, A, S, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("pending")(handler.asInstanceOf[js.Any], detected.asInstanceOf[js.Any])).asInstanceOf[PendingTrait[D, A, S, R]]
  }
  
  @js.native
  sealed trait TraitState extends StObject
  @JSImport("@angular/compiler-cli/src/ngtsc/transform/src/trait", "TraitState")
  @js.native
  object TraitState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TraitState & Double] = js.native
    
    /**
      * Analyzed traits have successfully been analyzed, but are pending resolution.
      */
    @js.native
    sealed trait Analyzed
      extends StObject
         with TraitState
    /* 1 */ val Analyzed: typings.angularCompilerCli.srcNgtscTransformSrcTraitMod.TraitState.Analyzed & Double = js.native
    
    /**
      * Pending traits are freshly created and have never been analyzed.
      */
    @js.native
    sealed trait Pending
      extends StObject
         with TraitState
    /* 0 */ val Pending: typings.angularCompilerCli.srcNgtscTransformSrcTraitMod.TraitState.Pending & Double = js.native
    
    /**
      * Resolved traits have successfully been analyzed and resolved and are ready for compilation.
      */
    @js.native
    sealed trait Resolved
      extends StObject
         with TraitState
    /* 2 */ val Resolved: typings.angularCompilerCli.srcNgtscTransformSrcTraitMod.TraitState.Resolved & Double = js.native
    
    /**
      * Skipped traits are no longer considered for compilation.
      */
    @js.native
    sealed trait Skipped
      extends StObject
         with TraitState
    /* 3 */ val Skipped: typings.angularCompilerCli.srcNgtscTransformSrcTraitMod.TraitState.Skipped & Double = js.native
  }
  
  @js.native
  trait AnalyzedTrait[D, A, S /* <: SemanticSymbol | Null */, R]
    extends StObject
       with TraitBase[D, A, S, R]
       with Trait[D, A, S, R] {
    
    /**
      * Analysis results of the given trait (if able to be produced), or `null` if analysis failed
      * completely.
      */
    var analysis: A | Null = js.native
    
    /**
      * Any diagnostics that resulted from analysis, or `null` if none.
      */
    var analysisDiagnostics: js.Array[Diagnostic] | Null = js.native
    
    @JSName("state")
    var state_AnalyzedTrait: Analyzed = js.native
    
    var symbol: S = js.native
    
    /**
      * This analyzed trait has been successfully resolved, and should be transitioned to the
      * "resolved" state.
      */
    def toResolved(): ResolvedTrait[D, A, S, R] = js.native
    def toResolved(resolution: R): ResolvedTrait[D, A, S, R] = js.native
    def toResolved(resolution: R, diagnostics: js.Array[Diagnostic]): ResolvedTrait[D, A, S, R] = js.native
    def toResolved(resolution: Null, diagnostics: js.Array[Diagnostic]): ResolvedTrait[D, A, S, R] = js.native
  }
  
  @js.native
  trait PendingTrait[D, A, S /* <: SemanticSymbol | Null */, R]
    extends StObject
       with TraitBase[D, A, S, R]
       with Trait[D, A, S, R] {
    
    @JSName("state")
    var state_PendingTrait: Pending = js.native
    
    /**
      * This pending trait has been successfully analyzed, and should transition to the "analyzed"
      * state.
      */
    def toAnalyzed(analysis: A, diagnostics: js.Array[Diagnostic], symbol: S): AnalyzedTrait[D, A, S, R] = js.native
    def toAnalyzed(analysis: A, diagnostics: Null, symbol: S): AnalyzedTrait[D, A, S, R] = js.native
    def toAnalyzed(analysis: Null, diagnostics: js.Array[Diagnostic], symbol: S): AnalyzedTrait[D, A, S, R] = js.native
    def toAnalyzed(analysis: Null, diagnostics: Null, symbol: S): AnalyzedTrait[D, A, S, R] = js.native
    
    /**
      * During analysis it was determined that this trait is not eligible for compilation after all,
      * and should be transitioned to the "skipped" state.
      */
    def toSkipped(): SkippedTrait[D, A, S, R] = js.native
  }
  
  trait ResolvedTrait[D, A, S /* <: SemanticSymbol | Null */, R]
    extends StObject
       with TraitBase[D, A, S, R]
       with Trait[D, A, S, R] {
    
    /**
      * Resolved traits must have produced valid analysis results.
      */
    var analysis: A
    
    /**
      * Analysis may have still resulted in diagnostics.
      */
    var analysisDiagnostics: js.Array[Diagnostic] | Null
    
    /**
      * The results returned by a successful resolution of the given class/`DecoratorHandler`
      * combination.
      */
    var resolution: R | Null
    
    /**
      * Diagnostics resulting from resolution are tracked separately from
      */
    var resolveDiagnostics: js.Array[Diagnostic] | Null
    
    @JSName("state")
    var state_ResolvedTrait: Resolved
    
    var symbol: S
  }
  object ResolvedTrait {
    
    inline def apply[D, A, S /* <: SemanticSymbol | Null */, R](
      analysis: A,
      detected: DetectResult[D],
      handler: DecoratorHandler[D, A, S, R],
      state: Resolved,
      symbol: S
    ): ResolvedTrait[D, A, S, R] = {
      val __obj = js.Dynamic.literal(analysis = analysis.asInstanceOf[js.Any], detected = detected.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], analysisDiagnostics = null, resolution = null, resolveDiagnostics = null)
      __obj.asInstanceOf[ResolvedTrait[D, A, S, R]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolvedTrait[?, ?, ?, ?], D, A, S /* <: SemanticSymbol | Null */, R] (val x: Self & (ResolvedTrait[D, A, S, R])) extends AnyVal {
      
      inline def setAnalysis(value: A): Self = StObject.set(x, "analysis", value.asInstanceOf[js.Any])
      
      inline def setAnalysisDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "analysisDiagnostics", value.asInstanceOf[js.Any])
      
      inline def setAnalysisDiagnosticsNull: Self = StObject.set(x, "analysisDiagnostics", null)
      
      inline def setAnalysisDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "analysisDiagnostics", js.Array(value*))
      
      inline def setResolution(value: R): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setResolutionNull: Self = StObject.set(x, "resolution", null)
      
      inline def setResolveDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "resolveDiagnostics", value.asInstanceOf[js.Any])
      
      inline def setResolveDiagnosticsNull: Self = StObject.set(x, "resolveDiagnostics", null)
      
      inline def setResolveDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "resolveDiagnostics", js.Array(value*))
      
      inline def setState(value: Resolved): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setSymbol(value: S): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    }
  }
  
  trait SkippedTrait[D, A, S /* <: SemanticSymbol | Null */, R]
    extends StObject
       with TraitBase[D, A, S, R]
       with Trait[D, A, S, R] {
    
    @JSName("state")
    var state_SkippedTrait: Skipped
  }
  object SkippedTrait {
    
    inline def apply[D, A, S /* <: SemanticSymbol | Null */, R](detected: DetectResult[D], handler: DecoratorHandler[D, A, S, R], state: Skipped): SkippedTrait[D, A, S, R] = {
      val __obj = js.Dynamic.literal(detected = detected.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[SkippedTrait[D, A, S, R]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SkippedTrait[?, ?, ?, ?], D, A, S /* <: SemanticSymbol | Null */, R] (val x: Self & (SkippedTrait[D, A, S, R])) extends AnyVal {
      
      inline def setState(value: Skipped): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait TraitBase[D, A, S /* <: SemanticSymbol | Null */, R] extends StObject {
    
    /**
      * The detection result (of `handler.detect`) which indicated that this trait applied to the
      * class.
      *
      * This is mainly used to cache the detection between pre-analysis and analysis.
      */
    var detected: DetectResult[D]
    
    /**
      * The `DecoratorHandler` which matched on the class to create this trait.
      */
    var handler: DecoratorHandler[D, A, S, R]
    
    /**
      * Current state of the trait.
      *
      * This will be narrowed in the interfaces for each specific state.
      */
    var state: TraitState
  }
  object TraitBase {
    
    inline def apply[D, A, S /* <: SemanticSymbol | Null */, R](detected: DetectResult[D], handler: DecoratorHandler[D, A, S, R], state: TraitState): TraitBase[D, A, S, R] = {
      val __obj = js.Dynamic.literal(detected = detected.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[TraitBase[D, A, S, R]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TraitBase[?, ?, ?, ?], D, A, S /* <: SemanticSymbol | Null */, R] (val x: Self & (TraitBase[D, A, S, R])) extends AnyVal {
      
      inline def setDetected(value: DetectResult[D]): Self = StObject.set(x, "detected", value.asInstanceOf[js.Any])
      
      inline def setHandler(value: DecoratorHandler[D, A, S, R]): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setState(value: TraitState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
