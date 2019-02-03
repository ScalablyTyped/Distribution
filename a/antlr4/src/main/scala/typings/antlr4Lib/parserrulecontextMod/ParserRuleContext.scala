package typings
package antlr4Lib.parserrulecontextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4/ParserRuleContext", "ParserRuleContext")
@js.native
class ParserRuleContext protected ()
  extends antlr4Lib.rulecontextMod.RuleContext {
  def this(parent: js.Any, invokingState: scala.Double) = this()
  val exception: antlr4Lib.errorErrorsMod.RecognitionException = js.native
  val ruleIndex: scala.Double = js.native
  val start: antlr4Lib.tokenMod.Token = js.native
  val stop: antlr4Lib.tokenMod.Token = js.native
  def addChild(child: js.Any): js.Any = js.native
  def addErrorNode(badToken: antlr4Lib.tokenMod.Token): antlr4Lib.treeTreeMod.ErrorNode = js.native
  def addTokenNode(token: antlr4Lib.tokenMod.Token): antlr4Lib.tokenMod.Token = js.native
  def copyFrom(ctx: js.Any): scala.Unit = js.native
  def enterRule(listener: antlr4Lib.treeTreeMod.ParseTreeListener): scala.Unit = js.native
  def exitRule(listener: antlr4Lib.treeTreeMod.ParseTreeListener): scala.Unit = js.native
  def getChild(i: scala.Double, `type`: js.Any): js.Any = js.native
  def getToken(ttype: scala.Double, i: scala.Double): antlr4Lib.tokenMod.Token = js.native
  def getTokens(ttype: scala.Double): js.Array[antlr4Lib.tokenMod.Token] = js.native
  def getTypedRuleContext(cxtType: js.Any, i: scala.Double): js.Any = js.native
  def getTypedRuleContexts(cxtType: js.Any): js.Array[_] = js.native
  def removeLastChild(): scala.Unit = js.native
}

/* static members */
@JSImport("antlr4/ParserRuleContext", "ParserRuleContext")
@js.native
object ParserRuleContext extends js.Object {
  val EMPTY: antlr4Lib.parserrulecontextMod.ParserRuleContext = js.native
}

