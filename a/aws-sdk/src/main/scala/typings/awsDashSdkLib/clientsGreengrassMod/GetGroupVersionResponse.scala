package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGroupVersionResponse extends js.Object {
  /**
    * The ARN of the group version.
    */
  var Arn: js.UndefOr[__string] = js.undefined
  /**
    * The time, in milliseconds since the epoch, when the group version was created.
    */
  var CreationTimestamp: js.UndefOr[__string] = js.undefined
  /**
    * Information about the group version definition.
    */
  var Definition: js.UndefOr[GroupVersion] = js.undefined
  /**
    * The ID of the group version.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * The unique ID for the version of the group.
    */
  var Version: js.UndefOr[__string] = js.undefined
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
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (CreationTimestamp != null) __obj.updateDynamic("CreationTimestamp")(CreationTimestamp)
    if (Definition != null) __obj.updateDynamic("Definition")(Definition)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Version != null) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[GetGroupVersionResponse]
  }
}

