package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDevicePoolsRequest extends js.Object {
  /**
    * The project ARN.
    */
  var arn: AmazonResourceName
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * The device pools' type. Allowed values include:   CURATED: A device pool that is created and managed by AWS Device Farm.   PRIVATE: A device pool that is created and managed by the device pool developer.  
    */
  var `type`: js.UndefOr[DevicePoolType] = js.undefined
}

object ListDevicePoolsRequest {
  @scala.inline
  def apply(arn: AmazonResourceName, nextToken: PaginationToken = null, `type`: DevicePoolType = null): ListDevicePoolsRequest = {
    val __obj = js.Dynamic.literal(arn = arn)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDevicePoolsRequest]
  }
}

