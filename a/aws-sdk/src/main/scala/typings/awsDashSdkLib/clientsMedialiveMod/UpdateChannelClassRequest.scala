package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateChannelClassRequest extends js.Object {
  /**
    * The channel class that you wish to update this channel to use.
    */
  var ChannelClass: awsDashSdkLib.clientsMedialiveMod.ChannelClass
  /**
    * Channel Id of the channel whose class should be updated.
    */
  var ChannelId: __string
  /**
    * A list of output destinations for this channel.
    */
  var Destinations: js.UndefOr[__listOfOutputDestination] = js.undefined
}

object UpdateChannelClassRequest {
  @scala.inline
  def apply(ChannelClass: ChannelClass, ChannelId: __string, Destinations: __listOfOutputDestination = null): UpdateChannelClassRequest = {
    val __obj = js.Dynamic.literal(ChannelClass = ChannelClass.asInstanceOf[js.Any], ChannelId = ChannelId)
    if (Destinations != null) __obj.updateDynamic("Destinations")(Destinations)
    __obj.asInstanceOf[UpdateChannelClassRequest]
  }
}

