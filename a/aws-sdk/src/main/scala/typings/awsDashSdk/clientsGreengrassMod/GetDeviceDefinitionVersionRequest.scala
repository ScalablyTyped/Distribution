package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeviceDefinitionVersionRequest extends js.Object {
  /**
    * The ID of the device definition.
    */
  var DeviceDefinitionId: __string = js.native
  /**
    * The ID of the device definition version. This value maps to the ''Version'' property of the corresponding ''VersionInformation'' object, which is returned by ''ListDeviceDefinitionVersions'' requests. If the version is the last one that was associated with a device definition, the value also maps to the ''LatestVersion'' property of the corresponding ''DefinitionInformation'' object.
    */
  var DeviceDefinitionVersionId: __string = js.native
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[__string] = js.native
}

object GetDeviceDefinitionVersionRequest {
  @scala.inline
  def apply(DeviceDefinitionId: __string, DeviceDefinitionVersionId: __string, NextToken: __string = null): GetDeviceDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(DeviceDefinitionId = DeviceDefinitionId.asInstanceOf[js.Any], DeviceDefinitionVersionId = DeviceDefinitionVersionId.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeviceDefinitionVersionRequest]
  }
}

