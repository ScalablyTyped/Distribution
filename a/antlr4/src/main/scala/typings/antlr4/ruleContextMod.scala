package typings.antlr4

import typings.antlr4.intervalSetMod.Interval
import typings.antlr4.parserRuleContextMod.ParserRuleContext
import typings.antlr4.treeMod.ParseTree
import typings.antlr4.treeMod.ParseTreeVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4/RuleContext", JSImport.Namespace)
@js.native
object ruleContextMod extends js.Object {
  @js.native
  class RuleContext protected () extends ParseTree {
    def this(parent: js.Any, invokingState: Double) = this()
    val invokingState: Double = js.native
    val parentCtx: ParserRuleContext = js.native
    def accept(visitor: ParseTreeVisitor): Unit = js.native
    def depth(): Double = js.native
    def getAltNumber(): Double = js.native
    def getChild(i: Double): js.Any = js.native
    def getChildCount(): Double = js.native
    def getPayload(): RuleContext = js.native
    def getRuleContext(): RuleContext = js.native
    def getSourceInterval(): Interval = js.native
    def getText(): String = js.native
    def isEmpty(): Boolean = js.native
    def setAltNumber(altNumber: Double): Unit = js.native
    def toStringTree(ruleNames: js.Array[String], recog: js.Any): String = js.native
  }
  
}

