package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostedZoneConfig extends js.Object {
  /**
    * Any comments that you want to include about the hosted zone.
    */
  var Comment: js.UndefOr[ResourceDescription] = js.native
  /**
    * A value that indicates whether this is a private hosted zone.
    */
  var PrivateZone: js.UndefOr[IsPrivateZone] = js.native
}

object HostedZoneConfig {
  @scala.inline
  def apply(Comment: ResourceDescription = null, PrivateZone: js.UndefOr[Boolean] = js.undefined): HostedZoneConfig = {
    val __obj = js.Dynamic.literal()
    if (Comment != null) __obj.updateDynamic("Comment")(Comment.asInstanceOf[js.Any])
    if (!js.isUndefined(PrivateZone)) __obj.updateDynamic("PrivateZone")(PrivateZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedZoneConfig]
  }
}

