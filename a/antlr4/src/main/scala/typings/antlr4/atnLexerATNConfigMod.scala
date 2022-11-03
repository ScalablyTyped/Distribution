package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object atnLexerATNConfigMod {
  
  @JSImport("antlr4/atn/LexerATNConfig", JSImport.Default)
  @js.native
  open class default protected () extends LexerATNConfig {
    def this(params: typings.antlr4.stateAtnstateMod.default, config: typings.antlr4.atnAtnconfigMod.default) = this()
  }
  
  @js.native
  trait LexerATNConfig
    extends typings.antlr4.atnAtnconfigMod.default {
    
    def checkNonGreedyDecision(source: typings.antlr4.atnAtnconfigMod.default, target: typings.antlr4.stateAtnstateMod.default): Boolean = js.native
    
    val lexerActionExecutor: typings.antlr4.atnLexerActionExecutorMod.default | Null = js.native
    
    val passedThroughNonGreedyDecision: Boolean = js.native
  }
}
