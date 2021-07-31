package typings.antlr4

import typings.antlr4.recognizerMod.Recognizer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorStrategyMod {
  
  @JSImport("antlr4/error/ErrorStrategy", "BailErrorStrategy")
  @js.native
  class BailErrorStrategy () extends ErrorStrategy
  
  @JSImport("antlr4/error/ErrorStrategy", "DefaultErrorStrategy")
  @js.native
  class DefaultErrorStrategy () extends ErrorStrategy
  
  @JSImport("antlr4/error/ErrorStrategy", "ErrorStrategy")
  @js.native
  class ErrorStrategy () extends StObject {
    
    def inErrorRecoveryMode(recognizer: Recognizer): Unit = js.native
    
    def recover(recognizer: Recognizer, e: Error): Unit = js.native
    
    def recoverInline(recognizer: Recognizer): Unit = js.native
    
    def reportError(recognizer: Recognizer): Unit = js.native
    
    def reset(recognizer: Recognizer): Unit = js.native
    
    def sync(recognizer: Recognizer): Unit = js.native
  }
}
