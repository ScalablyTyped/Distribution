package typings.antlr4

import typings.antlr4.antlr4Strings.LessthansignINVALID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recognizerMod {
  
  @JSImport("antlr4/Recognizer", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Recognizer
  
  @js.native
  trait Recognizer extends StObject {
    
    def addErrorListener(listener: typings.antlr4.errorErrorListenerMod.default): Unit = js.native
    
    def checkVersion(toolVersion: Double): Unit = js.native
    
    def getErrorHeader(e: typings.antlr4.errorRecognitionExceptionMod.default): String = js.native
    
    def getErrorListenerDispatch(): typings.antlr4.errorProxyErrorListenerMod.default = js.native
    
    def getLiteralNames(): js.Array[String | Null] = js.native
    
    /**
      * Get a map from rule names to rule indexes.
      * Used for XPath and tree pattern compilation.
      */
    def getRuleIndexMap(): Record[String, Double] = js.native
    
    def getSymbolicNames(): js.Array[String | Null] = js.native
    
    /**
      * @deprecated This method is not called by the ANTLR 4 Runtime. Specific
      * implementations of {@link ErrorStrategy} may provide a similar feature
      * when necessary. For example, see {@link DefaultErrorStrategy.getTokenErrorDisplay}.
      */
    def getTokenErrorDisplay(t: typings.antlr4.tokenMod.default): String = js.native
    
    def getTokenNames(): js.Array[String | LessthansignINVALID] = js.native
    
    def getTokenType(tokenName: String): Double = js.native
    
    def getTokenTypeMap(): Record[String, Double] = js.native
    
    def precpred(localCtx: typings.antlr4.contextParserRuleContextMod.default, precedence: Double): Boolean = js.native
    
    def removeErrorListeners(): Unit = js.native
    
    /**
      * subclass needs to override these if there are sempreds or actions
      * that the ATN interp needs to execute
      */
    def sempred(
      localCtx: typings.antlr4.contextParserRuleContextMod.default,
      ruleIndex: Double,
      actionIndex: Double
    ): Boolean = js.native
    
    def state: Double = js.native
    def state_=(arg: Double): Unit = js.native
  }
}
