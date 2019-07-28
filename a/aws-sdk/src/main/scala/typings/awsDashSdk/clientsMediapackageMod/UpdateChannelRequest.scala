package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateChannelRequest extends js.Object {
  /**
    * A short text description of the Channel.
    */
  var Description: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the Channel to update.
    */
  var Id: __string
}

object UpdateChannelRequest {
  @scala.inline
  def apply(Id: __string, Description: __string = null): UpdateChannelRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[UpdateChannelRequest]
  }
}

