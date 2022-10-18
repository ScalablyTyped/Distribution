package typings.antlr4

import typings.antlr4.recognizerMod.Recognizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorErrorStrategyMod {
  
  @JSImport("antlr4/error/ErrorStrategy", "BailErrorStrategy")
  @js.native
  open class BailErrorStrategy () extends ErrorStrategy
  
  @JSImport("antlr4/error/ErrorStrategy", "DefaultErrorStrategy")
  @js.native
  open class DefaultErrorStrategy () extends ErrorStrategy
  
  @JSImport("antlr4/error/ErrorStrategy", "ErrorStrategy")
  @js.native
  open class ErrorStrategy () extends StObject {
    
    def inErrorRecoveryMode(recognizer: Recognizer): Unit = js.native
    
    def recover(recognizer: Recognizer, e: js.Error): Unit = js.native
    
    def recoverInline(recognizer: Recognizer): Unit = js.native
    
    def reportError(recognizer: Recognizer): Unit = js.native
    
    def reset(recognizer: Recognizer): Unit = js.native
    
    def sync(recognizer: Recognizer): Unit = js.native
  }
}
