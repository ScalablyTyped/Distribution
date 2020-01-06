package typings.awsDashSdk.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceResponse extends js.Object {
  /**
    * A complex type that contains information about a specified instance.
    */
  var Instance: js.UndefOr[typings.awsDashSdk.clientsServicediscoveryMod.Instance] = js.native
}

object GetInstanceResponse {
  @scala.inline
  def apply(Instance: Instance = null): GetInstanceResponse = {
    val __obj = js.Dynamic.literal()
    if (Instance != null) __obj.updateDynamic("Instance")(Instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceResponse]
  }
}

