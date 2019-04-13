package typings
package awsDashSdkLib.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAttackResponse extends js.Object {
  /**
    * The attack that is described.
    */
  var Attack: js.UndefOr[AttackDetail] = js.undefined
}

object DescribeAttackResponse {
  @scala.inline
  def apply(Attack: AttackDetail = null): DescribeAttackResponse = {
    val __obj = js.Dynamic.literal()
    if (Attack != null) __obj.updateDynamic("Attack")(Attack)
    __obj.asInstanceOf[DescribeAttackResponse]
  }
}

