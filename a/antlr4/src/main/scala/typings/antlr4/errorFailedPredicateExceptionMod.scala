package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorFailedPredicateExceptionMod {
  
  @JSImport("antlr4/error/FailedPredicateException", JSImport.Default)
  @js.native
  open class default protected () extends FailedPredicateException {
    def this(recognizer: typings.antlr4.parserMod.default, predicate: String, message: String) = this()
  }
  
  @js.native
  trait FailedPredicateException
    extends typings.antlr4.errorRecognitionExceptionMod.default {
    
    val predicate: String = js.native
    
    val predicateIndex: Double = js.native
    
    val ruleIndex: Double = js.native
  }
}
