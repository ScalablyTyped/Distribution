package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGroupResponse extends js.Object {
  /**
    * The ARN of the definition.
    */
  var Arn: js.UndefOr[__string] = js.undefined
  /**
    * The time, in milliseconds since the epoch, when the definition was created.
    */
  var CreationTimestamp: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the definition.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * The time, in milliseconds since the epoch, when the definition was last updated.
    */
  var LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined
  /**
    * The latest version of the definition.
    */
  var LatestVersion: js.UndefOr[__string] = js.undefined
  /**
    * The ARN of the latest version of the definition.
    */
  var LatestVersionArn: js.UndefOr[__string] = js.undefined
  /**
    * The name of the definition.
    */
  var Name: js.UndefOr[__string] = js.undefined
  /**
    * The tags for the definition.
    */
  var tags: js.UndefOr[__mapOf__string] = js.undefined
}

object GetGroupResponse {
  @scala.inline
  def apply(
    Arn: __string = null,
    CreationTimestamp: __string = null,
    Id: __string = null,
    LastUpdatedTimestamp: __string = null,
    LatestVersion: __string = null,
    LatestVersionArn: __string = null,
    Name: __string = null,
    tags: __mapOf__string = null
  ): GetGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (CreationTimestamp != null) __obj.updateDynamic("CreationTimestamp")(CreationTimestamp)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (LastUpdatedTimestamp != null) __obj.updateDynamic("LastUpdatedTimestamp")(LastUpdatedTimestamp)
    if (LatestVersion != null) __obj.updateDynamic("LatestVersion")(LatestVersion)
    if (LatestVersionArn != null) __obj.updateDynamic("LatestVersionArn")(LatestVersionArn)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetGroupResponse]
  }
}

