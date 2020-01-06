package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCoreDefinitionResponse extends js.Object {
  /**
    * The ARN of the definition.
    */
  var Arn: js.UndefOr[__string] = js.native
  /**
    * The time, in milliseconds since the epoch, when the definition was created.
    */
  var CreationTimestamp: js.UndefOr[__string] = js.native
  /**
    * The ID of the definition.
    */
  var Id: js.UndefOr[__string] = js.native
  /**
    * The time, in milliseconds since the epoch, when the definition was last updated.
    */
  var LastUpdatedTimestamp: js.UndefOr[__string] = js.native
  /**
    * The ID of the latest version associated with the definition.
    */
  var LatestVersion: js.UndefOr[__string] = js.native
  /**
    * The ARN of the latest version associated with the definition.
    */
  var LatestVersionArn: js.UndefOr[__string] = js.native
  /**
    * The name of the definition.
    */
  var Name: js.UndefOr[__string] = js.native
}

object CreateCoreDefinitionResponse {
  @scala.inline
  def apply(
    Arn: __string = null,
    CreationTimestamp: __string = null,
    Id: __string = null,
    LastUpdatedTimestamp: __string = null,
    LatestVersion: __string = null,
    LatestVersionArn: __string = null,
    Name: __string = null
  ): CreateCoreDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreationTimestamp != null) __obj.updateDynamic("CreationTimestamp")(CreationTimestamp.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (LastUpdatedTimestamp != null) __obj.updateDynamic("LastUpdatedTimestamp")(LastUpdatedTimestamp.asInstanceOf[js.Any])
    if (LatestVersion != null) __obj.updateDynamic("LatestVersion")(LatestVersion.asInstanceOf[js.Any])
    if (LatestVersionArn != null) __obj.updateDynamic("LatestVersionArn")(LatestVersionArn.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCoreDefinitionResponse]
  }
}

