package typings.awsDashSdk.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceResponse extends js.Object {
  /**
    * A complex type that contains information about a specified instance.
    */
  var Instance: js.UndefOr[typings.awsDashSdk.clientsServicediscoveryMod.Instance] = js.undefined
}

object GetInstanceResponse {
  @scala.inline
  def apply(Instance: Instance = null): GetInstanceResponse = {
    val __obj = js.Dynamic.literal()
    if (Instance != null) __obj.updateDynamic("Instance")(Instance)
    __obj.asInstanceOf[GetInstanceResponse]
  }
}

