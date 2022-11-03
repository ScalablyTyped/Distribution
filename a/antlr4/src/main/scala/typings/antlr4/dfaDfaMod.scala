package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dfaDfaMod {
  
  @JSImport("antlr4/dfa/DFA", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with DFA {
    def this(atnStartState: typings.antlr4.atnAtnMod.default, decision: Double) = this()
  }
  
  @js.native
  trait DFA extends StObject {
    
    /**
      * From which ATN state did we create this DFA?
      */
    var atnStartState: typings.antlr4.atnAtnMod.default = js.native
    
    var decision: Double = js.native
    
    /**
      * Get the start state for a specific precedence value.
      *
      * @param precedence The current precedence.
      * @return The start state corresponding to the specified precedence, or
      * `null` if no start state exists for the specified precedence.
      */
    def getPrecedenceStartState(precedence: Double): typings.antlr4.dfaDfastateMod.default | Null = js.native
    
    /**
      * `true` if this DFA is for a precedence decision; otherwise,
      * `false`. This is the backing field for {@link isPrecedenceDfa},
      * {@link setPrecedenceDfa}
      */
    var precedenceDfa: Boolean = js.native
    
    var s0: typings.antlr4.dfaDfastateMod.default | Null = js.native
    
    /**
      * Sets whether this is a precedence DFA. If the specified value differs
      * from the current DFA configuration, the following actions are taken;
      * otherwise no changes are made to the current DFA.
      *
      * - The {@link states} map is cleared
      * - If `precedenceDfa` is `false`, the initial state
      * {@link s0} is set to `null`; otherwise, it is initialized to a new
      * {@link DFAState} with an empty outgoing {@link DFAState.edges} array to
      * store the start states for individual precedence values.
      * - The {@link precedenceDfa} field is updated
      *
      * @param precedenceDfa `true` if this is a precedence DFA; otherwise, `false`.
      */
    def setPrecedenceDfa(precedenceDfa: Boolean): Unit = js.native
    
    /**
      * Set the start state for a specific precedence value.
      *
      * @param precedence The current precedence.
      * @param startState The start state corresponding to the specified
      * precedence.
      */
    def setPrecedenceStartState(precedence: Double, startState: typings.antlr4.dfaDfastateMod.default): Unit = js.native
    
    /**
      * Return a list of all states in this DFA, ordered by state number.
      */
    def sortedStates(): js.Array[typings.antlr4.dfaDfastateMod.default] = js.native
    
    /**
      * A set of all DFA states. Use {@link Map} so we can get old state back
      * ({@link Set} only allows you to see if it's there).
      */
    def states: typings.antlr4.miscHashSetMod.default = js.native
    
    def toLexerString(): String | Null = js.native
    
    def toString(literalNames: js.Array[String]): String | Null = js.native
    def toString(literalNames: js.Array[String], symbolicNames: js.Array[String]): String | Null = js.native
    def toString(literalNames: Unit, symbolicNames: js.Array[String]): String | Null = js.native
  }
}
