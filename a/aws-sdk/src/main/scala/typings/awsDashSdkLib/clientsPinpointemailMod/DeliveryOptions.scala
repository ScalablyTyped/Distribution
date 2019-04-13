package typings
package awsDashSdkLib.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeliveryOptions extends js.Object {
  /**
    * The name of the dedicated IP pool that you want to associate with the configuration set.
    */
  var SendingPoolName: js.UndefOr[PoolName] = js.undefined
}

object DeliveryOptions {
  @scala.inline
  def apply(SendingPoolName: PoolName = null): DeliveryOptions = {
    val __obj = js.Dynamic.literal()
    if (SendingPoolName != null) __obj.updateDynamic("SendingPoolName")(SendingPoolName)
    __obj.asInstanceOf[DeliveryOptions]
  }
}

