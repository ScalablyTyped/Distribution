package typings.awsDashSdk.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAttackRequest extends js.Object {
  /**
    * The unique identifier (ID) for the attack that to be described.
    */
  var AttackId: typings.awsDashSdk.clientsShieldMod.AttackId = js.native
}

object DescribeAttackRequest {
  @scala.inline
  def apply(AttackId: AttackId): DescribeAttackRequest = {
    val __obj = js.Dynamic.literal(AttackId = AttackId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeAttackRequest]
  }
}

