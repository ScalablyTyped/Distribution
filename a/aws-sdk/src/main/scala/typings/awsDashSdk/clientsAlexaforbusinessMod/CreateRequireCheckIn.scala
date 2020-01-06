package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRequireCheckIn extends js.Object {
  /**
    * Whether require check in is enabled or not.
    */
  var Enabled: Boolean = js.native
  /**
    * Duration between 5 and 20 minutes to determine when to release the room if it's not checked into.
    */
  var ReleaseAfterMinutes: Minutes = js.native
}

object CreateRequireCheckIn {
  @scala.inline
  def apply(Enabled: Boolean, ReleaseAfterMinutes: Minutes): CreateRequireCheckIn = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], ReleaseAfterMinutes = ReleaseAfterMinutes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateRequireCheckIn]
  }
}

