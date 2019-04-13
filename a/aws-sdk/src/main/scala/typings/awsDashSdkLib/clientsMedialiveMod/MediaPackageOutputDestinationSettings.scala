package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaPackageOutputDestinationSettings extends js.Object {
  /**
    * ID of the channel in MediaPackage that is the destination for this output group. You do not need to specify the individual inputs in MediaPackage; MediaLive will handle the connection of the two MediaLive pipelines to the two MediaPackage inputs. The MediaPackage channel and MediaLive channel must be in the same region.
    */
  var ChannelId: js.UndefOr[__stringMin1] = js.undefined
}

object MediaPackageOutputDestinationSettings {
  @scala.inline
  def apply(ChannelId: __stringMin1 = null): MediaPackageOutputDestinationSettings = {
    val __obj = js.Dynamic.literal()
    if (ChannelId != null) __obj.updateDynamic("ChannelId")(ChannelId)
    __obj.asInstanceOf[MediaPackageOutputDestinationSettings]
  }
}

