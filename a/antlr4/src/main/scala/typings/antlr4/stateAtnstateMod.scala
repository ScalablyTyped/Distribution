package typings.antlr4

import typings.antlr4.antlr4Ints.`-1`
import typings.antlr4.antlr4Ints.`0`
import typings.antlr4.antlr4Ints.`10`
import typings.antlr4.antlr4Ints.`11`
import typings.antlr4.antlr4Ints.`12`
import typings.antlr4.antlr4Ints.`1`
import typings.antlr4.antlr4Ints.`2`
import typings.antlr4.antlr4Ints.`3`
import typings.antlr4.antlr4Ints.`4`
import typings.antlr4.antlr4Ints.`5`
import typings.antlr4.antlr4Ints.`6`
import typings.antlr4.antlr4Ints.`7`
import typings.antlr4.antlr4Ints.`8`
import typings.antlr4.antlr4Ints.`9`
import typings.antlr4.antlr4Strings.INVALID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateAtnstateMod {
  
  @JSImport("antlr4/state/ATNState", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ATNState
  /* static members */
  object default {
    
    @JSImport("antlr4/state/ATNState", "default.BASIC")
    @js.native
    val BASIC: `1` = js.native
    
    @JSImport("antlr4/state/ATNState", "default.BLOCK_END")
    @js.native
    val BLOCK_END: `8` = js.native
    
    @JSImport("antlr4/state/ATNState", "default.BLOCK_START")
    @js.native
    val BLOCK_START: `3` = js.native
    
    @JSImport("antlr4/state/ATNState", "default.INVALID_STATE_NUMBER")
    @js.native
    val INVALID_STATE_NUMBER: `-1` = js.native
    
    @JSImport("antlr4/state/ATNState", "default.INVALID_TYPE")
    @js.native
    val INVALID_TYPE: `0` = js.native
    
    @JSImport("antlr4/state/ATNState", "default.LOOP_END")
    @js.native
    val LOOP_END: `12` = js.native
    
    @JSImport("antlr4/state/ATNState", "default.PLUS_BLOCK_START")
    @js.native
    val PLUS_BLOCK_START: `4` = js.native
    
    @JSImport("antlr4/state/ATNState", "default.PLUS_LOOP_BACK")
    @js.native
    val PLUS_LOOP_BACK: `11` = js.native
    
    @JSImport("antlr4/state/ATNState", "default.RULE_START")
    @js.native
    val RULE_START: `2` = js.native
    
    @JSImport("antlr4/state/ATNState", "default.RULE_STOP")
    @js.native
    val RULE_STOP: `7` = js.native
    
    @JSImport("antlr4/state/ATNState", "default.STAR_BLOCK_START")
    @js.native
    val STAR_BLOCK_START: `5` = js.native
    
    @JSImport("antlr4/state/ATNState", "default.STAR_LOOP_BACK")
    @js.native
    val STAR_LOOP_BACK: `9` = js.native
    
    @JSImport("antlr4/state/ATNState", "default.STAR_LOOP_ENTRY")
    @js.native
    val STAR_LOOP_ENTRY: `10` = js.native
    
    @JSImport("antlr4/state/ATNState", "default.TOKEN_START")
    @js.native
    val TOKEN_START: `6` = js.native
    
    @JSImport("antlr4/state/ATNState", "default.serializationNames")
    @js.native
    val serializationNames: js.Tuple13[
        INVALID, 
        typings.antlr4.antlr4Strings.BASIC, 
        typings.antlr4.antlr4Strings.RULE_START, 
        typings.antlr4.antlr4Strings.BLOCK_START, 
        typings.antlr4.antlr4Strings.PLUS_BLOCK_START, 
        typings.antlr4.antlr4Strings.STAR_BLOCK_START, 
        typings.antlr4.antlr4Strings.TOKEN_START, 
        typings.antlr4.antlr4Strings.RULE_STOP, 
        typings.antlr4.antlr4Strings.BLOCK_END, 
        typings.antlr4.antlr4Strings.STAR_LOOP_BACK, 
        typings.antlr4.antlr4Strings.STAR_LOOP_ENTRY, 
        typings.antlr4.antlr4Strings.PLUS_LOOP_BACK, 
        typings.antlr4.antlr4Strings.LOOP_END
      ] = js.native
  }
  
  @js.native
  trait ATNState extends StObject {
    
    def addTransition(trans: typings.antlr4.transitionTransitionMod.default): Unit = js.native
    def addTransition(trans: typings.antlr4.transitionTransitionMod.default, index: Double): Unit = js.native
    
    var atn: typings.antlr4.atnAtnMod.default | Null = js.native
    
    var epsilonOnlyTransitions: Boolean = js.native
    
    def equals(other: ATNState): Boolean = js.native
    
    def isNonGreedyExitState(): Boolean = js.native
    
    var nextTokenWithinRule: typings.antlr4.miscIntervalSetMod.default | Null = js.native
    
    var ruleIndex: Double = js.native
    
    var stateNumber: Double = js.native
    
    var stateType: Double | Null = js.native
    
    var transitions: js.Array[typings.antlr4.transitionTransitionMod.default] = js.native
  }
}
