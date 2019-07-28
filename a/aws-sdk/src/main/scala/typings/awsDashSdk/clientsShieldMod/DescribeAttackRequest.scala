package typings.awsDashSdk.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAttackRequest extends js.Object {
  /**
    * The unique identifier (ID) for the attack that to be described.
    */
  var AttackId: typings.awsDashSdk.clientsShieldMod.AttackId
}

object DescribeAttackRequest {
  @scala.inline
  def apply(AttackId: AttackId): DescribeAttackRequest = {
    val __obj = js.Dynamic.literal(AttackId = AttackId)
  
    __obj.asInstanceOf[DescribeAttackRequest]
  }
}

