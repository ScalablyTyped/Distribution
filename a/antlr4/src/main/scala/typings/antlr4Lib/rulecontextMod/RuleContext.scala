package typings
package antlr4Lib.rulecontextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4/RuleContext", "RuleContext")
@js.native
class RuleContext protected ()
  extends antlr4Lib.treeTreeMod.RuleNode {
  def this(parent: js.Any, invokingState: scala.Double) = this()
  val invokingState: scala.Double = js.native
  val parentCtx: antlr4Lib.parserrulecontextMod.ParserRuleContext = js.native
  def accept(visitor: antlr4Lib.treeTreeMod.ParseTreeVisitor): scala.Unit = js.native
  def depth(): scala.Double = js.native
  def getAltNumber(): scala.Double = js.native
  def getChild(i: scala.Double): js.Any = js.native
  def getChildCount(): scala.Double = js.native
  def getPayload(): RuleContext = js.native
  def getRuleContext(): RuleContext = js.native
  def getSourceInterval(): antlr4Lib.intervalsetMod.Interval = js.native
  def getText(): java.lang.String = js.native
  def isEmpty(): scala.Boolean = js.native
  def setAltNumber(altNumber: scala.Double): scala.Unit = js.native
  def toStringTree(ruleNames: js.Array[java.lang.String], recog: js.Any): java.lang.String = js.native
}

