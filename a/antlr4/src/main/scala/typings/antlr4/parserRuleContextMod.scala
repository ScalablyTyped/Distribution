package typings.antlr4

import typings.antlr4.errorErrorsMod.RecognitionException
import typings.antlr4.parserRuleContextMod.ParserRuleContext
import typings.antlr4.ruleContextMod.RuleContext
import typings.antlr4.tokenMod.Token
import typings.antlr4.treeTreeMod.ErrorNode
import typings.antlr4.treeTreeMod.ParseTreeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4/ParserRuleContext", JSImport.Namespace)
@js.native
object parserRuleContextMod extends js.Object {
  @js.native
  class ParserRuleContext protected () extends RuleContext {
    def this(parent: js.Any, invokingState: Double) = this()
    val exception: RecognitionException = js.native
    val ruleIndex: Double = js.native
    val start: Token = js.native
    val stop: Token = js.native
    def addChild(child: js.Any): js.Any = js.native
    def addErrorNode(badToken: Token): ErrorNode = js.native
    def addTokenNode(token: Token): Token = js.native
    def copyFrom(ctx: js.Any): Unit = js.native
    def enterRule(listener: ParseTreeListener): Unit = js.native
    def exitRule(listener: ParseTreeListener): Unit = js.native
    def getChild(i: Double, `type`: js.Any): js.Any = js.native
    def getToken(ttype: Double, i: Double): Token = js.native
    def getTokens(ttype: Double): js.Array[Token] = js.native
    def getTypedRuleContext(cxtType: js.Any, i: Double): js.Any = js.native
    def getTypedRuleContexts(cxtType: js.Any): js.Array[_] = js.native
    def removeLastChild(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object ParserRuleContext extends js.Object {
    val EMPTY: ParserRuleContext = js.native
  }
  
}

