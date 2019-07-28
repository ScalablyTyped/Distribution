package typings.anydbDashSql.anydbDashSqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryNode extends js.Object {
  def and(node: BinaryNode): BinaryNode
  def or(node: BinaryNode): BinaryNode
}

object BinaryNode {
  @scala.inline
  def apply(and: BinaryNode => BinaryNode, or: BinaryNode => BinaryNode): BinaryNode = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), or = js.Any.fromFunction1(or))
  
    __obj.asInstanceOf[BinaryNode]
  }
}

