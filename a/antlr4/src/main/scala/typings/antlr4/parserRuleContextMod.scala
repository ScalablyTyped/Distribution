package typings.antlr4

import typings.antlr4.errorErrorsMod.RecognitionException
import typings.antlr4.ruleContextMod.RuleContext
import typings.antlr4.tokenMod.Token
import typings.antlr4.treeTreeMod.ErrorNode
import typings.antlr4.treeTreeMod.ParseTreeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserRuleContextMod {
  
  @JSImport("antlr4/ParserRuleContext", "ParserRuleContext")
  @js.native
  open class ParserRuleContext protected () extends RuleContext {
    def this(parent: Any, invokingState: Double) = this()
    
    def addChild(child: Any): Any = js.native
    
    def addErrorNode(badToken: Token): ErrorNode = js.native
    
    def addTokenNode(token: Token): Token = js.native
    
    def copyFrom(ctx: Any): Unit = js.native
    
    def enterRule(listener: ParseTreeListener): Unit = js.native
    
    val exception: RecognitionException = js.native
    
    def exitRule(listener: ParseTreeListener): Unit = js.native
    
    def getChild(i: Double, `type`: Any): Any = js.native
    
    def getToken(ttype: Double, i: Double): Token = js.native
    
    def getTokens(ttype: Double): js.Array[Token] = js.native
    
    def getTypedRuleContext(cxtType: Any, i: Double): Any = js.native
    
    def getTypedRuleContexts(cxtType: Any): js.Array[Any] = js.native
    
    def removeLastChild(): Unit = js.native
    
    val ruleIndex: Double = js.native
    
    val start: Token = js.native
    
    val stop: Token = js.native
  }
  /* static members */
  object ParserRuleContext {
    
    @JSImport("antlr4/ParserRuleContext", "ParserRuleContext.EMPTY")
    @js.native
    val EMPTY: ParserRuleContext = js.native
  }
}
