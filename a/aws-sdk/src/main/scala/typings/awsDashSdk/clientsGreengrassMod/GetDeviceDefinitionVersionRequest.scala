package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDeviceDefinitionVersionRequest extends js.Object {
  /**
    * The ID of the device definition.
    */
  var DeviceDefinitionId: __string
  /**
    * The ID of the device definition version. This value maps to the ''Version'' property of the corresponding ''VersionInformation'' object, which is returned by ''ListDeviceDefinitionVersions'' requests. If the version is the last one that was associated with a device definition, the value also maps to the ''LatestVersion'' property of the corresponding ''DefinitionInformation'' object.
    */
  var DeviceDefinitionVersionId: __string
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object GetDeviceDefinitionVersionRequest {
  @scala.inline
  def apply(DeviceDefinitionId: __string, DeviceDefinitionVersionId: __string, NextToken: __string = null): GetDeviceDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(DeviceDefinitionId = DeviceDefinitionId, DeviceDefinitionVersionId = DeviceDefinitionVersionId)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetDeviceDefinitionVersionRequest]
  }
}

