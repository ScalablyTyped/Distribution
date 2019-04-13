package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDeviceInstancesResult extends js.Object {
  /**
    * An object containing information about your device instances.
    */
  var deviceInstances: js.UndefOr[DeviceInstances] = js.undefined
  /**
    * An identifier that can be used in the next call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListDeviceInstancesResult {
  @scala.inline
  def apply(deviceInstances: DeviceInstances = null, nextToken: PaginationToken = null): ListDeviceInstancesResult = {
    val __obj = js.Dynamic.literal()
    if (deviceInstances != null) __obj.updateDynamic("deviceInstances")(deviceInstances)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListDeviceInstancesResult]
  }
}

