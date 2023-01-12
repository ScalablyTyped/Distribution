package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dfaDfastateMod {
  
  @JSImport("antlr4/dfa/DFAState", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with DFAState {
    def this(stateNumber: Double, configs: typings.antlr4.atnAtnconfigsetMod.default) = this()
    
    /* CompleteClass */
    var configs: typings.antlr4.atnAtnconfigsetMod.default = js.native
    
    /**
      * `edges[symbol]` points to target of symbol. Shift up by 1 so (-1)
      * {@link Token.EOF} maps to `edges[0]`.
      */
    /* CompleteClass */
    var edges: js.Array[DFAState] = js.native
    
    /**
      * Two {@link DFAState} instances are equal if their ATN configuration sets
      * are the same. This method is used to see if a state already exists.
      *
      * Because the number of alternatives and number of ATN configurations are
      * finite, there is a finite number of DFA states that can be processed.
      * This is necessary to show that the algorithm terminates.
      *
      * Cannot test the DFA state numbers here because in {@link ParserATNSimulator.addDFAState}
      * we need to know if any other state exists that has this exact set of ATN configurations.
      * The {@link stateNumber} is irrelevant.
      */
    /* CompleteClass */
    override def equals(other: DFAState): Boolean = js.native
    
    /**
      * Get the set of all alts mentioned by all ATN configurations in this
      * DFA state.
      */
    /* CompleteClass */
    override def getAltSet(): typings.antlr4.miscHashSetMod.default | Null = js.native
    
    /* CompleteClass */
    var isAcceptState: Boolean = js.native
    
    /* CompleteClass */
    var lexerActionExecutor: typings.antlr4.atnLexerActionExecutorMod.default = js.native
    
    /**
      * During SLL parsing, this is a list of predicates associated with the
      * ATN configurations of the DFA state. When we have predicates,
      * {@link requiresFullContext} is `false` since full context
      * prediction evaluates predicates on-the-fly. If this is not
      * null, then {@link prediction} is {@link ATN.INVALID_ALT_NUMBER}.
      *
      * We only use these for non-{@link requiresFullContext} but
      * conflicting states. That means we know from the context
      * (it's $ or we don't dip into outer context) that it's an
      * ambiguity not a conflict.
      *
      * This list is computed by {@link ParserATNSimulator.predicateDFAState}.
      */
    /* CompleteClass */
    var predicates: typings.antlr4.dfaPredPredictionMod.default = js.native
    
    /**
      * if accept state, what ttype do we match or alt do we predict?
      * This is set to {@link ATN.INVALID_ALT_NUMBER} when {@link predicates}
      * `!=null` or {@link requiresFullContext}.
      */
    /* CompleteClass */
    var prediction: Double = js.native
    
    /**
      * Indicates that this state was created during SLL prediction that
      * discovered a conflict between the configurations in the state. Future
      * {@link ParserATNSimulator.execATN} invocations immediately jumped doing
      * full context prediction if this field is true.
      */
    /* CompleteClass */
    var requiresFullContext: Boolean = js.native
    
    /* CompleteClass */
    var stateNumber: Double = js.native
  }
  
  trait DFAState extends StObject {
    
    var configs: typings.antlr4.atnAtnconfigsetMod.default
    
    /**
      * `edges[symbol]` points to target of symbol. Shift up by 1 so (-1)
      * {@link Token.EOF} maps to `edges[0]`.
      */
    var edges: js.Array[DFAState]
    
    /**
      * Two {@link DFAState} instances are equal if their ATN configuration sets
      * are the same. This method is used to see if a state already exists.
      *
      * Because the number of alternatives and number of ATN configurations are
      * finite, there is a finite number of DFA states that can be processed.
      * This is necessary to show that the algorithm terminates.
      *
      * Cannot test the DFA state numbers here because in {@link ParserATNSimulator.addDFAState}
      * we need to know if any other state exists that has this exact set of ATN configurations.
      * The {@link stateNumber} is irrelevant.
      */
    def equals(other: DFAState): Boolean
    
    /**
      * Get the set of all alts mentioned by all ATN configurations in this
      * DFA state.
      */
    def getAltSet(): typings.antlr4.miscHashSetMod.default | Null
    
    var isAcceptState: Boolean
    
    var lexerActionExecutor: typings.antlr4.atnLexerActionExecutorMod.default
    
    /**
      * During SLL parsing, this is a list of predicates associated with the
      * ATN configurations of the DFA state. When we have predicates,
      * {@link requiresFullContext} is `false` since full context
      * prediction evaluates predicates on-the-fly. If this is not
      * null, then {@link prediction} is {@link ATN.INVALID_ALT_NUMBER}.
      *
      * We only use these for non-{@link requiresFullContext} but
      * conflicting states. That means we know from the context
      * (it's $ or we don't dip into outer context) that it's an
      * ambiguity not a conflict.
      *
      * This list is computed by {@link ParserATNSimulator.predicateDFAState}.
      */
    var predicates: typings.antlr4.dfaPredPredictionMod.default
    
    /**
      * if accept state, what ttype do we match or alt do we predict?
      * This is set to {@link ATN.INVALID_ALT_NUMBER} when {@link predicates}
      * `!=null` or {@link requiresFullContext}.
      */
    var prediction: Double
    
    /**
      * Indicates that this state was created during SLL prediction that
      * discovered a conflict between the configurations in the state. Future
      * {@link ParserATNSimulator.execATN} invocations immediately jumped doing
      * full context prediction if this field is true.
      */
    var requiresFullContext: Boolean
    
    var stateNumber: Double
  }
  object DFAState {
    
    inline def apply(
      configs: typings.antlr4.atnAtnconfigsetMod.default,
      edges: js.Array[DFAState],
      equals_ : DFAState => Boolean,
      getAltSet: () => typings.antlr4.miscHashSetMod.default | Null,
      isAcceptState: Boolean,
      lexerActionExecutor: typings.antlr4.atnLexerActionExecutorMod.default,
      predicates: typings.antlr4.dfaPredPredictionMod.default,
      prediction: Double,
      requiresFullContext: Boolean,
      stateNumber: Double
    ): DFAState = {
      val __obj = js.Dynamic.literal(configs = configs.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], getAltSet = js.Any.fromFunction0(getAltSet), isAcceptState = isAcceptState.asInstanceOf[js.Any], lexerActionExecutor = lexerActionExecutor.asInstanceOf[js.Any], predicates = predicates.asInstanceOf[js.Any], prediction = prediction.asInstanceOf[js.Any], requiresFullContext = requiresFullContext.asInstanceOf[js.Any], stateNumber = stateNumber.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[DFAState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DFAState] (val x: Self) extends AnyVal {
      
      inline def setConfigs(value: typings.antlr4.atnAtnconfigsetMod.default): Self = StObject.set(x, "configs", value.asInstanceOf[js.Any])
      
      inline def setEdges(value: js.Array[DFAState]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
      
      inline def setEdgesVarargs(value: DFAState*): Self = StObject.set(x, "edges", js.Array(value*))
      
      inline def setEquals_(value: DFAState => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setGetAltSet(value: () => typings.antlr4.miscHashSetMod.default | Null): Self = StObject.set(x, "getAltSet", js.Any.fromFunction0(value))
      
      inline def setIsAcceptState(value: Boolean): Self = StObject.set(x, "isAcceptState", value.asInstanceOf[js.Any])
      
      inline def setLexerActionExecutor(value: typings.antlr4.atnLexerActionExecutorMod.default): Self = StObject.set(x, "lexerActionExecutor", value.asInstanceOf[js.Any])
      
      inline def setPredicates(value: typings.antlr4.dfaPredPredictionMod.default): Self = StObject.set(x, "predicates", value.asInstanceOf[js.Any])
      
      inline def setPrediction(value: Double): Self = StObject.set(x, "prediction", value.asInstanceOf[js.Any])
      
      inline def setRequiresFullContext(value: Boolean): Self = StObject.set(x, "requiresFullContext", value.asInstanceOf[js.Any])
      
      inline def setStateNumber(value: Double): Self = StObject.set(x, "stateNumber", value.asInstanceOf[js.Any])
    }
  }
}
