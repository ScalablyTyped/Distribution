package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReservedInstancesId extends js.Object {
  /**
    * The ID of the Reserved Instance.
    */
  var ReservedInstancesId: js.UndefOr[String] = js.undefined
}

object ReservedInstancesId {
  @scala.inline
  def apply(ReservedInstancesId: String = null): ReservedInstancesId = {
    val __obj = js.Dynamic.literal()
    if (ReservedInstancesId != null) __obj.updateDynamic("ReservedInstancesId")(ReservedInstancesId)
    __obj.asInstanceOf[ReservedInstancesId]
  }
}

