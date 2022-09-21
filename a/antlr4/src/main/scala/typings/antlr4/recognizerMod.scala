package typings.antlr4

import typings.antlr4.errorListenerMod.ErrorListener
import typings.antlr4.errorListenerMod.ProxyErrorListener
import typings.antlr4.parserRuleContextMod.ParserRuleContext
import typings.antlr4.tokenMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recognizerMod {
  
  @JSImport("antlr4/Recognizer", "Recognizer")
  @js.native
  open class Recognizer () extends StObject {
    
    def addErrorListener(listener: ErrorListener): Unit = js.native
    
    def checkVersion(toolVersion: Double): Unit = js.native
    
    def getErrorHeader(e: Any): String = js.native
    
    def getErrorListenerDispatch(): ProxyErrorListener = js.native
    
    def getRuleIndexMap(): Any = js.native
    
    def getTokenErrorDisplay(t: Token): String = js.native
    
    def getTokenType(tokenName: String): Any = js.native
    
    def getTokenTypeMap(): Any = js.native
    
    def precpred(localCtx: ParserRuleContext, precedence: Any): Boolean = js.native
    
    def removeErrorListeners(): Unit = js.native
    
    def sempred(localCtx: ParserRuleContext, ruleIndex: Double, actionIndex: Double): Boolean = js.native
    
    var state: Double = js.native
  }
}
