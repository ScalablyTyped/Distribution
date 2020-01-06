package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGroupVersionResponse extends js.Object {
  /**
    * The ARN of the group version.
    */
  var Arn: js.UndefOr[__string] = js.native
  /**
    * The time, in milliseconds since the epoch, when the group version was created.
    */
  var CreationTimestamp: js.UndefOr[__string] = js.native
  /**
    * Information about the group version definition.
    */
  var Definition: js.UndefOr[GroupVersion] = js.native
  /**
    * The ID of the group that the version is associated with.
    */
  var Id: js.UndefOr[__string] = js.native
  /**
    * The ID of the group version.
    */
  var Version: js.UndefOr[__string] = js.native
}

object GetGroupVersionResponse {
  @scala.inline
  def apply(
    Arn: __string = null,
    CreationTimestamp: __string = null,
    Definition: GroupVersion = null,
    Id: __string = null,
    Version: __string = null
  ): GetGroupVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreationTimestamp != null) __obj.updateDynamic("CreationTimestamp")(CreationTimestamp.asInstanceOf[js.Any])
    if (Definition != null) __obj.updateDynamic("Definition")(Definition.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGroupVersionResponse]
  }
}

