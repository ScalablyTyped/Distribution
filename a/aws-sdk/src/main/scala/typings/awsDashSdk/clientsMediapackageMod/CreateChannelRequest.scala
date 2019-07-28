package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateChannelRequest extends js.Object {
  /**
    * A short text description of the Channel.
    */
  var Description: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the Channel. The ID must be unique within the region and it
  cannot be changed after a Channel is created.
    */
  var Id: __string
  var Tags: js.UndefOr[typings.awsDashSdk.clientsMediapackageMod.Tags] = js.undefined
}

object CreateChannelRequest {
  @scala.inline
  def apply(Id: __string, Description: __string = null, Tags: Tags = null): CreateChannelRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateChannelRequest]
  }
}

