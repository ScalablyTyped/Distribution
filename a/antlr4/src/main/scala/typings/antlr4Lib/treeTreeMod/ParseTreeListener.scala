package typings
package antlr4Lib.treeTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseTreeListener extends js.Object {
  def enterEveryRule(node: antlr4Lib.parserrulecontextMod.ParserRuleContext): scala.Unit
  def exitEveryRule(node: antlr4Lib.parserrulecontextMod.ParserRuleContext): scala.Unit
  def visitErrorNode(node: ErrorNode): scala.Unit
  def visitTerminal(node: TerminalNode): scala.Unit
}

