package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object atnLl1analyzerMod {
  
  @JSImport("antlr4/atn/LL1Analyzer", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with LL1Analyzer {
    def this(atn: typings.antlr4.stateAtnstateMod.default) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antlr4/atn/LL1Analyzer", "default.HIT_PRED")
    @js.native
    val HIT_PRED: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Token.INVALID_TYPE */ Any = js.native
  }
  
  @js.native
  trait LL1Analyzer extends StObject {
    
    /**
      * Compute set of tokens that can follow `s` in the ATN in the
      * specified `ctx`.
      *
      * If `ctx` is `null` and the end of the rule containing `s` is
      * reached, {@link Token.EPSILON} is added to the result set.
      * If `ctx` is not `null` and the end of the outermost rule is
      * reached, {@link Token.EOF} is added to the result set.
      *
      * @param s the ATN state
      * @param stopState the ATN state to stop at. This can be
      * a {@link BlockEndState} to detect epsilon paths through a closure.
      * @param ctx the complete parser context, or {@code null} if the context
      * should be ignored
      *
      * @return The set of tokens that can follow `s` in the ATN in the specified `ctx`.
      */
    def LOOK(
      s: typings.antlr4.stateAtnstateMod.default,
      stopState: typings.antlr4.stateAtnstateMod.default,
      ctx: typings.antlr4.contextRuleContextMod.default
    ): typings.antlr4.miscIntervalSetMod.default = js.native
    def LOOK(
      s: typings.antlr4.stateAtnstateMod.default,
      stopState: typings.antlr4.stateBlockEndStateMod.default,
      ctx: typings.antlr4.contextRuleContextMod.default
    ): typings.antlr4.miscIntervalSetMod.default = js.native
    
    /**
      * Calculates the SLL(1) expected lookahead set for each outgoing transition
      * of an {@link ATNState}. The returned array has one element for each
      * outgoing transition in `s`. If the closure from transition
      * _i_ leads to a semantic predicate before matching a symbol, the
      * element at index _i_ of the result will be `null`.
      *
      * @param s the ATN state
      * @return the expected symbols for each outgoing transition of `s`.
      */
    def getDecisionLookahead(s: typings.antlr4.stateAtnstateMod.default): (js.Array[typings.antlr4.miscIntervalSetMod.default | Null]) | Null = js.native
  }
}
