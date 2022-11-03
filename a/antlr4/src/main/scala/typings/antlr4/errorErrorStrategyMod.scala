package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorErrorStrategyMod {
  
  @JSImport("antlr4/error/ErrorStrategy", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ErrorStrategy {
    
    /* CompleteClass */
    override def inErrorRecoveryMode(recognizer: typings.antlr4.parserMod.default): Unit = js.native
    
    /* CompleteClass */
    override def recover(
      recognizer: typings.antlr4.parserMod.default,
      e: typings.antlr4.errorRecognitionExceptionMod.default
    ): Unit = js.native
    
    /* CompleteClass */
    override def recoverInline(recognizer: typings.antlr4.parserMod.default): Unit = js.native
    
    /* CompleteClass */
    override def reportError(
      recognizer: typings.antlr4.parserMod.default,
      e: typings.antlr4.errorRecognitionExceptionMod.default
    ): Unit = js.native
    
    /* CompleteClass */
    override def reset(recognizer: typings.antlr4.parserMod.default): Unit = js.native
    
    /* CompleteClass */
    override def sync(recognizer: typings.antlr4.parserMod.default): Unit = js.native
  }
  
  trait ErrorStrategy extends StObject {
    
    def inErrorRecoveryMode(recognizer: typings.antlr4.parserMod.default): Unit
    
    def recover(
      recognizer: typings.antlr4.parserMod.default,
      e: typings.antlr4.errorRecognitionExceptionMod.default
    ): Unit
    
    def recoverInline(recognizer: typings.antlr4.parserMod.default): Unit
    
    def reportError(
      recognizer: typings.antlr4.parserMod.default,
      e: typings.antlr4.errorRecognitionExceptionMod.default
    ): Unit
    
    def reset(recognizer: typings.antlr4.parserMod.default): Unit
    
    def sync(recognizer: typings.antlr4.parserMod.default): Unit
  }
  object ErrorStrategy {
    
    inline def apply(
      inErrorRecoveryMode: typings.antlr4.parserMod.default => Unit,
      recover: (typings.antlr4.parserMod.default, typings.antlr4.errorRecognitionExceptionMod.default) => Unit,
      recoverInline: typings.antlr4.parserMod.default => Unit,
      reportError: (typings.antlr4.parserMod.default, typings.antlr4.errorRecognitionExceptionMod.default) => Unit,
      reset: typings.antlr4.parserMod.default => Unit,
      sync: typings.antlr4.parserMod.default => Unit
    ): ErrorStrategy = {
      val __obj = js.Dynamic.literal(inErrorRecoveryMode = js.Any.fromFunction1(inErrorRecoveryMode), recover = js.Any.fromFunction2(recover), recoverInline = js.Any.fromFunction1(recoverInline), reportError = js.Any.fromFunction2(reportError), reset = js.Any.fromFunction1(reset), sync = js.Any.fromFunction1(sync))
      __obj.asInstanceOf[ErrorStrategy]
    }
    
    extension [Self <: ErrorStrategy](x: Self) {
      
      inline def setInErrorRecoveryMode(value: typings.antlr4.parserMod.default => Unit): Self = StObject.set(x, "inErrorRecoveryMode", js.Any.fromFunction1(value))
      
      inline def setRecover(
        value: (typings.antlr4.parserMod.default, typings.antlr4.errorRecognitionExceptionMod.default) => Unit
      ): Self = StObject.set(x, "recover", js.Any.fromFunction2(value))
      
      inline def setRecoverInline(value: typings.antlr4.parserMod.default => Unit): Self = StObject.set(x, "recoverInline", js.Any.fromFunction1(value))
      
      inline def setReportError(
        value: (typings.antlr4.parserMod.default, typings.antlr4.errorRecognitionExceptionMod.default) => Unit
      ): Self = StObject.set(x, "reportError", js.Any.fromFunction2(value))
      
      inline def setReset(value: typings.antlr4.parserMod.default => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
      
      inline def setSync(value: typings.antlr4.parserMod.default => Unit): Self = StObject.set(x, "sync", js.Any.fromFunction1(value))
    }
  }
}
