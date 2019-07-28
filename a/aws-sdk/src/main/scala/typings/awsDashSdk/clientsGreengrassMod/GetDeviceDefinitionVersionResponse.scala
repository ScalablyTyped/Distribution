package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDeviceDefinitionVersionResponse extends js.Object {
  /**
    * The ARN of the device definition version.
    */
  var Arn: js.UndefOr[__string] = js.undefined
  /**
    * The time, in milliseconds since the epoch, when the device definition version was created.
    */
  var CreationTimestamp: js.UndefOr[__string] = js.undefined
  /**
    * Information about the device definition version.
    */
  var Definition: js.UndefOr[DeviceDefinitionVersion] = js.undefined
  /**
    * The ID of the device definition version.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
  /**
    * The version of the device definition version.
    */
  var Version: js.UndefOr[__string] = js.undefined
}

object GetDeviceDefinitionVersionResponse {
  @scala.inline
  def apply(
    Arn: __string = null,
    CreationTimestamp: __string = null,
    Definition: DeviceDefinitionVersion = null,
    Id: __string = null,
    NextToken: __string = null,
    Version: __string = null
  ): GetDeviceDefinitionVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (CreationTimestamp != null) __obj.updateDynamic("CreationTimestamp")(CreationTimestamp)
    if (Definition != null) __obj.updateDynamic("Definition")(Definition)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Version != null) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[GetDeviceDefinitionVersionResponse]
  }
}

