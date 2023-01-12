package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorErrorListenerMod {
  
  @JSImport("antlr4/error/ErrorListener", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ErrorListener {
    
    /* CompleteClass */
    override def reportAmbiguity(
      recognizer: typings.antlr4.recognizerMod.default,
      dfa: typings.antlr4.dfaDfaMod.default,
      startIndex: Double,
      stopIndex: Double,
      exact: Boolean,
      ambigAlts: typings.antlr4.miscBitSetMod.default,
      configs: typings.antlr4.atnAtnconfigsetMod.default
    ): Unit = js.native
    
    /* CompleteClass */
    override def reportAttemptingFullContext(
      recognizer: typings.antlr4.recognizerMod.default,
      dfa: typings.antlr4.dfaDfaMod.default,
      startIndex: Double,
      stopIndex: Double,
      conflictingAlts: typings.antlr4.miscBitSetMod.default,
      configs: typings.antlr4.atnAtnconfigsetMod.default
    ): Unit = js.native
    
    /* CompleteClass */
    override def reportContextSensitivity(
      recognizer: typings.antlr4.recognizerMod.default,
      dfa: typings.antlr4.dfaDfaMod.default,
      startIndex: Double,
      stopIndex: Double,
      conflictingAlts: Any,
      configs: typings.antlr4.atnAtnconfigsetMod.default
    ): Unit = js.native
    
    /* CompleteClass */
    override def syntaxError(
      recognizer: typings.antlr4.recognizerMod.default,
      offendingSymbol: typings.antlr4.tokenMod.default,
      line: Double,
      column: Double,
      msg: String,
      e: typings.antlr4.errorRecognitionExceptionMod.default
    ): Unit = js.native
  }
  
  trait ErrorListener extends StObject {
    
    def reportAmbiguity(
      recognizer: typings.antlr4.recognizerMod.default,
      dfa: typings.antlr4.dfaDfaMod.default,
      startIndex: Double,
      stopIndex: Double,
      exact: Boolean,
      ambigAlts: typings.antlr4.miscBitSetMod.default,
      configs: typings.antlr4.atnAtnconfigsetMod.default
    ): Unit
    
    def reportAttemptingFullContext(
      recognizer: typings.antlr4.recognizerMod.default,
      dfa: typings.antlr4.dfaDfaMod.default,
      startIndex: Double,
      stopIndex: Double,
      conflictingAlts: typings.antlr4.miscBitSetMod.default,
      configs: typings.antlr4.atnAtnconfigsetMod.default
    ): Unit
    
    def reportContextSensitivity(
      recognizer: typings.antlr4.recognizerMod.default,
      dfa: typings.antlr4.dfaDfaMod.default,
      startIndex: Double,
      stopIndex: Double,
      conflictingAlts: Any,
      configs: typings.antlr4.atnAtnconfigsetMod.default
    ): Unit
    
    def syntaxError(
      recognizer: typings.antlr4.recognizerMod.default,
      offendingSymbol: typings.antlr4.tokenMod.default,
      line: Double,
      column: Double,
      msg: String,
      e: typings.antlr4.errorRecognitionExceptionMod.default
    ): Unit
  }
  object ErrorListener {
    
    inline def apply(
      reportAmbiguity: (typings.antlr4.recognizerMod.default, typings.antlr4.dfaDfaMod.default, Double, Double, Boolean, typings.antlr4.miscBitSetMod.default, typings.antlr4.atnAtnconfigsetMod.default) => Unit,
      reportAttemptingFullContext: (typings.antlr4.recognizerMod.default, typings.antlr4.dfaDfaMod.default, Double, Double, typings.antlr4.miscBitSetMod.default, typings.antlr4.atnAtnconfigsetMod.default) => Unit,
      reportContextSensitivity: (typings.antlr4.recognizerMod.default, typings.antlr4.dfaDfaMod.default, Double, Double, Any, typings.antlr4.atnAtnconfigsetMod.default) => Unit,
      syntaxError: (typings.antlr4.recognizerMod.default, typings.antlr4.tokenMod.default, Double, Double, String, typings.antlr4.errorRecognitionExceptionMod.default) => Unit
    ): ErrorListener = {
      val __obj = js.Dynamic.literal(reportAmbiguity = js.Any.fromFunction7(reportAmbiguity), reportAttemptingFullContext = js.Any.fromFunction6(reportAttemptingFullContext), reportContextSensitivity = js.Any.fromFunction6(reportContextSensitivity), syntaxError = js.Any.fromFunction6(syntaxError))
      __obj.asInstanceOf[ErrorListener]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorListener] (val x: Self) extends AnyVal {
      
      inline def setReportAmbiguity(
        value: (typings.antlr4.recognizerMod.default, typings.antlr4.dfaDfaMod.default, Double, Double, Boolean, typings.antlr4.miscBitSetMod.default, typings.antlr4.atnAtnconfigsetMod.default) => Unit
      ): Self = StObject.set(x, "reportAmbiguity", js.Any.fromFunction7(value))
      
      inline def setReportAttemptingFullContext(
        value: (typings.antlr4.recognizerMod.default, typings.antlr4.dfaDfaMod.default, Double, Double, typings.antlr4.miscBitSetMod.default, typings.antlr4.atnAtnconfigsetMod.default) => Unit
      ): Self = StObject.set(x, "reportAttemptingFullContext", js.Any.fromFunction6(value))
      
      inline def setReportContextSensitivity(
        value: (typings.antlr4.recognizerMod.default, typings.antlr4.dfaDfaMod.default, Double, Double, Any, typings.antlr4.atnAtnconfigsetMod.default) => Unit
      ): Self = StObject.set(x, "reportContextSensitivity", js.Any.fromFunction6(value))
      
      inline def setSyntaxError(
        value: (typings.antlr4.recognizerMod.default, typings.antlr4.tokenMod.default, Double, Double, String, typings.antlr4.errorRecognitionExceptionMod.default) => Unit
      ): Self = StObject.set(x, "syntaxError", js.Any.fromFunction6(value))
    }
  }
}
