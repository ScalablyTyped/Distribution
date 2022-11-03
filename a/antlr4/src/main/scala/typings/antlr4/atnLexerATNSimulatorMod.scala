package typings.antlr4

import typings.antlr4.antlr4Booleans.`false`
import typings.antlr4.antlr4Ints.`0`
import typings.antlr4.antlr4Ints.`127`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object atnLexerATNSimulatorMod {
  
  @JSImport("antlr4/atn/LexerATNSimulator", JSImport.Default)
  @js.native
  open class default protected () extends LexerATNSimulator {
    /**
      * When we hit an accept state in either the DFA or the ATN, we
      * have to notify the character stream to start buffering characters
      * via {@link IntStream.mark} and record the current state. The current sim state
      * includes the current index into the input, the current line,
      * and current character position in that line. Note that the Lexer is
      * tracking the starting line and characterization of the token. These
      * variables track the "state" of the simulator when it hits an accept state.
      *
      * We track these variables separately for the DFA and ATN simulation
      * because the DFA simulation often has to fail over to the ATN
      * simulation. If the ATN simulation fails, we need the DFA to fall
      * back to its previously accepted state, if any. If the ATN succeeds,
      * then the ATN does the accept and the DFA simulator that invoked it
      * can simply return the predicted token type.
      */
    def this(
      recog: typings.antlr4.lexerMod.default,
      atn: typings.antlr4.atnAtnMod.default,
      decisionToDFA: js.Array[typings.antlr4.dfaDfaMod.default],
      sharedContextCache: typings.antlr4.atnPredictionContextCacheMod.default
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antlr4/atn/LexerATNSimulator", "default.MAX_DFA_EDGE")
    @js.native
    val MAX_DFA_EDGE: `127` = js.native
    
    @JSImport("antlr4/atn/LexerATNSimulator", "default.MIN_DFA_EDGE")
    @js.native
    val MIN_DFA_EDGE: `0` = js.native
    
    @JSImport("antlr4/atn/LexerATNSimulator", "default.debug")
    @js.native
    val debug: `false` = js.native
    
    @JSImport("antlr4/atn/LexerATNSimulator", "default.dfa_debug")
    @js.native
    val dfa_debug: `false` = js.native
  }
  
  @JSImport("antlr4/atn/LexerATNSimulator", "SimState")
  @js.native
  open class SimState () extends StObject {
    
    def reset(): Unit = js.native
  }
  
  @js.native
  trait LexerATNSimulator
    extends typings.antlr4.atnAtnsimulatorMod.default {
    
    def accept(
      input: typings.antlr4.inputStreamMod.default,
      lexerActionExecutor: Null,
      startIndex: Double,
      index: Double,
      line: Double,
      charPos: Double
    ): Unit = js.native
    def accept(
      input: typings.antlr4.inputStreamMod.default,
      lexerActionExecutor: typings.antlr4.atnLexerActionExecutorMod.default,
      startIndex: Double,
      index: Double,
      line: Double,
      charPos: Double
    ): Unit = js.native
    
    def addDFAEdge(from_ : typings.antlr4.dfaDfastateMod.default, tk: Double): typings.antlr4.dfaDfastateMod.default = js.native
    def addDFAEdge(
      from_ : typings.antlr4.dfaDfastateMod.default,
      tk: Double,
      to: Unit,
      cfgs: typings.antlr4.atnAtnconfigsetMod.default
    ): typings.antlr4.dfaDfastateMod.default = js.native
    def addDFAEdge(
      from_ : typings.antlr4.dfaDfastateMod.default,
      tk: Double,
      to: typings.antlr4.dfaDfastateMod.default
    ): typings.antlr4.dfaDfastateMod.default = js.native
    def addDFAEdge(
      from_ : typings.antlr4.dfaDfastateMod.default,
      tk: Double,
      to: typings.antlr4.dfaDfastateMod.default,
      cfgs: typings.antlr4.atnAtnconfigsetMod.default
    ): typings.antlr4.dfaDfastateMod.default = js.native
    
    /**
      * Add a new DFA state if there isn't one with this set of
      * configurations already. This method also detects the first
      * configuration containing an ATN rule stop state. Later, when
      * traversing the DFA, we will know which rule to accept.
      */
    def addDFAState(configs: typings.antlr4.atnAtnconfigsetMod.default): typings.antlr4.dfaDfastateMod.default = js.native
    
    def captureSimState(
      settings: SimState,
      input: typings.antlr4.inputStreamMod.default,
      dfaState: typings.antlr4.dfaDfastateMod.default
    ): Unit = js.native
    
    /**
      * Since the alternatives within any lexer decision are ordered by
      * preference, this method stops pursuing the closure as soon as an accept
      * state is reached. After the first accept state is reached by depth-first
      * search from `config`, all other (potentially reachable) states for
      * this rule would have a lower priority.
      *
      * @return `true` if an accept state is reached, otherwise `false`
      */
    def closure(
      input: typings.antlr4.inputStreamMod.default,
      config: typings.antlr4.atnAtnconfigMod.default,
      configs: typings.antlr4.atnAtnconfigsetMod.default,
      currentAltReachedAcceptState: Boolean,
      speculative: Boolean,
      treatEofAsEpsilon: Boolean
    ): Boolean = js.native
    
    /**
      * The index of the character relative to the beginning of the line
      * 0..n-1
      */
    var column: Double = js.native
    
    def computeStartState(input: typings.antlr4.inputStreamMod.default, p: typings.antlr4.stateDecisionStateMod.default): typings.antlr4.atnOrderedATNConfigSetMod.default = js.native
    
    /**
      * Compute a target state for an edge in the DFA, and attempt to add the
      * computed state and corresponding edge to the DFA.
      *
      * @param input The input stream
      * @param s The current DFA state
      * @param t The next input symbol
      *
      * @return The computed target DFA state for the given input symbol
      * `t`. If `t` does not lead to a valid DFA state, this method
      * returns {@link ERROR}.
      */
    def computeTargetState(input: typings.antlr4.inputStreamMod.default, s: typings.antlr4.dfaDfastateMod.default, t: Double): typings.antlr4.dfaDfastateMod.default = js.native
    
    def consume(input: typings.antlr4.inputStreamMod.default): Unit = js.native
    
    def copyState(simulator: LexerATNSimulator): Unit = js.native
    
    var decisionToDFA: js.Array[typings.antlr4.dfaDfaMod.default] = js.native
    
    /**
      * Evaluate a predicate specified in the lexer.
      *
      * If `speculative` is `true`, this method was called before
      * {@link consume} for the matched character. This method should call
      * {@link consume} before evaluating the predicate to ensure position
      * sensitive values, including {@link Lexer.getText}, {@link Lexer.getLine},
      * and {@link Lexer.getcolumn}, properly reflect the current lexer state.
      * This method should restore `input` and the simulator to the original
      * state before returning (i.e. undo the actions made by the call
      * to {@link consume}.
      *
      * @param input The input stream.
      * @param ruleIndex The rule containing the predicate.
      * @param predIndex The index of the predicate within the rule.
      * @param speculative `true` if the current index in `input` is
      * one character before the predicate's location.
      *
      * @return `true` if the specified predicate evaluates to `true`.
      */
    def evaluatePredicate(
      input: typings.antlr4.inputStreamMod.default,
      ruleIndex: Double,
      predIndex: Double,
      speculative: Boolean
    ): Boolean = js.native
    
    def execATN(input: typings.antlr4.inputStreamMod.default, ds0: typings.antlr4.dfaDfastateMod.default): Double = js.native
    
    def failOrAccept(
      prevAccept: SimState,
      input: typings.antlr4.inputStreamMod.default,
      reach: typings.antlr4.atnAtnconfigsetMod.default,
      t: Double
    ): Double = js.native
    
    def getDFA(mode: Double): js.UndefOr[typings.antlr4.dfaDfaMod.default] = js.native
    
    def getEpsilonTarget(
      input: typings.antlr4.inputStreamMod.default,
      config: typings.antlr4.atnAtnconfigMod.default,
      trans: typings.antlr4.transitionTransitionMod.default,
      configs: typings.antlr4.atnAtnconfigsetMod.default,
      speculative: Boolean,
      treatEofAsEpsilon: Boolean
    ): typings.antlr4.atnLexerATNConfigMod.default | Null = js.native
    
    /**
      * Get an existing target state for an edge in the DFA. If the target state
      * for the edge has not yet been computed or is otherwise not available,
      * this method returns `null`.
      *
      * @param s The current DFA state
      * @param t The next input symbol
      * @return The existing target DFA state for the given input symbol
      * `t`, or `null` if the target state for this edge is not
      * already cached
      */
    def getExistingTargetState(s: typings.antlr4.dfaDfastateMod.default, t: Double): typings.antlr4.dfaDfastateMod.default | Null = js.native
    
    /**
      * Given a starting configuration set, figure out all ATN configurations
      * we can reach upon input `t`. Parameter `reach` is a return parameter.
      */
    def getReachableConfigSet(
      input: typings.antlr4.inputStreamMod.default,
      closure: typings.antlr4.atnAtnconfigsetMod.default,
      reach: typings.antlr4.atnAtnconfigsetMod.default,
      t: Double
    ): Unit = js.native
    
    def getReachableTarget(trans: typings.antlr4.transitionTransitionMod.default, t: Double): typings.antlr4.stateAtnstateMod.default = js.native
    
    def getText(input: typings.antlr4.inputStreamMod.default): String = js.native
    
    def getTokenName(tt: Double): String = js.native
    
    var line: Double = js.native
    
    def `match`(input: typings.antlr4.inputStreamMod.default, mode: Double): Double = js.native
    
    def matchATN(input: typings.antlr4.inputStreamMod.default): Double = js.native
    
    var mode: Double = js.native
    
    /**
      * Used during DFA/ATN exec to record the most recent accept configuration
      * info
      */
    var prevAccept: SimState = js.native
    
    var recog: typings.antlr4.lexerMod.default = js.native
    
    def reset(): Unit = js.native
    
    /**
      * The current token's starting index into the character stream.
      * Shared across DFA to ATN simulation in case the ATN fails and the
      * DFA did not have a previous accept state. In this case, we use the
      * ATN-generated exception object
      */
    var startIndex: Double = js.native
  }
}
