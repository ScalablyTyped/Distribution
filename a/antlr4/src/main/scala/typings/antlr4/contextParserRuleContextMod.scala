package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextParserRuleContextMod {
  
  @JSImport("antlr4/context/ParserRuleContext", JSImport.Default)
  @js.native
  open class default () extends ParserRuleContext {
    def this(parent: typings.antlr4.contextRuleContextMod.default) = this()
    def this(parent: Unit, invokingState: Double) = this()
    def this(parent: typings.antlr4.contextRuleContextMod.default, invokingState: Double) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antlr4/context/ParserRuleContext", "default.EMPTY")
    @js.native
    val EMPTY: ParserRuleContext = js.native
  }
  
  @js.native
  trait ParserRuleContext
    extends typings.antlr4.contextRuleContextMod.default {
    
    def addChild(child: ParserRuleContext): typings.antlr4.treeTerminalNodeMod.default = js.native
    
    def addErrorNode(badToken: typings.antlr4.tokenMod.default): typings.antlr4.treeErrorNodeMod.default = js.native
    
    def addTokenNode(token: typings.antlr4.tokenMod.default): typings.antlr4.tokenMod.default = js.native
    
    def copyFrom(ctx: ParserRuleContext): Unit = js.native
    
    def enterRule(listener: typings.antlr4.treeParseTreeListenerMod.default): Unit = js.native
    
    val exception: typings.antlr4.errorRecognitionExceptionMod.default = js.native
    
    def exitRule(listener: typings.antlr4.treeParseTreeListenerMod.default): Unit = js.native
    
    def getChild[T /* <: typings.antlr4.treeParseTreeMod.default */](i: Double, `type`: T): T | Null = js.native
    
    def getToken(ttype: Double, i: Double): typings.antlr4.tokenMod.default = js.native
    
    def getTokens(ttype: Double): js.Array[typings.antlr4.tokenMod.default] = js.native
    
    def getTypedRuleContext[T /* <: ParserRuleContext */](cxtType: T, i: Double): T = js.native
    
    def getTypedRuleContexts[T /* <: ParserRuleContext */](cxtType: T): js.Array[T] = js.native
    
    def removeLastChild(): Unit = js.native
    
    val ruleIndex: Double = js.native
    
    val start: typings.antlr4.tokenMod.default = js.native
    
    val stop: typings.antlr4.tokenMod.default = js.native
  }
}
