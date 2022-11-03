package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object atnAtndeserializerMod {
  
  @JSImport("antlr4/atn/ATNDeserializer", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ATNDeserializer {
    def this(options: typings.antlr4.atnAtndeserializationoptionsMod.default) = this()
  }
  
  @js.native
  trait ATNDeserializer extends StObject {
    
    var actionFactories: (js.Array[
        js.Function2[/* dataA */ Any, /* dataB */ Any, typings.antlr4.actionLexerActionMod.default]
      ]) | Null = js.native
    
    def checkCondition(condition: Boolean): Unit = js.native
    def checkCondition(condition: Boolean, message: String): Unit = js.native
    
    def checkVersion(legacy: Boolean): Unit = js.native
    
    var data: js.Array[Double] = js.native
    
    var deserializationOptions: typings.antlr4.atnAtndeserializationoptionsMod.default = js.native
    
    def deserialize(data: js.Array[Double]): typings.antlr4.atnAtnMod.default = js.native
    
    def edgeFactory(
      atn: typings.antlr4.atnAtnMod.default,
      `type`: Double,
      src: Double,
      trg: Double,
      arg1: Double,
      arg2: Double,
      arg3: Double,
      sets: js.Array[typings.antlr4.miscIntervalSetMod.default]
    ): typings.antlr4.transitionTransitionMod.default = js.native
    
    def generateRuleBypassTransition(atn: typings.antlr4.atnAtnMod.default, idx: Double): Unit = js.native
    
    def generateRuleBypassTransitions(atn: typings.antlr4.atnAtnMod.default): Unit = js.native
    
    def lexerActionFactory(`type`: Double, data1: Double, data2: Double): typings.antlr4.actionLexerActionMod.default = js.native
    
    /**
      * Analyze the {@link StarLoopEntryState} states in the specified ATN to set
      * the {@link StarLoopEntryState.isPrecedenceDecision} field to the
      * correct value.
      *
      * @param atn The ATN.
      */
    def markPrecedenceDecisions(atn: typings.antlr4.atnAtnMod.default): Unit = js.native
    
    var pos: js.UndefOr[Double] = js.native
    
    def readATN(): typings.antlr4.atnAtnMod.default = js.native
    
    def readDecisions(atn: typings.antlr4.atnAtnMod.default): Unit = js.native
    
    def readEdges(atn: typings.antlr4.atnAtnMod.default, sets: js.Array[typings.antlr4.miscIntervalSetMod.default]): Unit = js.native
    
    def readInt(): js.UndefOr[Double] = js.native
    
    def readInt32(): Double = js.native
    
    def readLexerActions(atn: typings.antlr4.atnAtnMod.default, legacy: Boolean): Unit = js.native
    
    def readModes(atn: typings.antlr4.atnAtnMod.default): Unit = js.native
    
    def readRules(atn: typings.antlr4.atnAtnMod.default, legacy: Boolean): Unit = js.native
    
    def readSets(
      atn: typings.antlr4.atnAtnMod.default,
      sets: js.Array[typings.antlr4.miscIntervalSetMod.default],
      reader: js.Function0[Double]
    ): Unit = js.native
    
    def readStates(atn: typings.antlr4.atnAtnMod.default, legacy: Boolean): Unit = js.native
    
    def reset(data: String): Boolean = js.native
    def reset(data: js.Array[Double]): Boolean = js.native
    
    def skipUUID(): Unit = js.native
    
    var stateFactories: (js.Array[js.Function0[typings.antlr4.stateBasicStateMod.default] | Null]) | Null = js.native
    
    def stateFactory(`type`: Double, ruleIndex: Double): js.UndefOr[typings.antlr4.stateBasicStateMod.default] = js.native
    
    def stateIsEndStateFor(state: typings.antlr4.stateAtnstateMod.default, idx: Double): typings.antlr4.stateStarLoopEntryStateMod.default | Null = js.native
    
    def verifyATN(atn: typings.antlr4.atnAtnMod.default): Unit = js.native
  }
}
