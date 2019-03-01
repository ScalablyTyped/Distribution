package typings
package anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryNode extends js.Object {
  def and(node: BinaryNode): BinaryNode
  def or(node: BinaryNode): BinaryNode
}

object BinaryNode {
  @scala.inline
  def apply(and: js.Function1[BinaryNode, BinaryNode], or: js.Function1[BinaryNode, BinaryNode]): BinaryNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("and")(and)
    __obj.updateDynamic("or")(or)
    __obj.asInstanceOf[BinaryNode]
  }
}

