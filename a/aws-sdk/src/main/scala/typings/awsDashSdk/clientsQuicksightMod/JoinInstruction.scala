package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JoinInstruction extends js.Object {
  /**
    * Left operand.
    */
  var LeftOperand: LogicalTableId = js.native
  /**
    * On Clause.
    */
  var OnClause: typings.awsDashSdk.clientsQuicksightMod.OnClause = js.native
  /**
    * Right operand.
    */
  var RightOperand: LogicalTableId = js.native
  /**
    * Type.
    */
  var Type: JoinType = js.native
}

object JoinInstruction {
  @scala.inline
  def apply(LeftOperand: LogicalTableId, OnClause: OnClause, RightOperand: LogicalTableId, Type: JoinType): JoinInstruction = {
    val __obj = js.Dynamic.literal(LeftOperand = LeftOperand.asInstanceOf[js.Any], OnClause = OnClause.asInstanceOf[js.Any], RightOperand = RightOperand.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JoinInstruction]
  }
}

