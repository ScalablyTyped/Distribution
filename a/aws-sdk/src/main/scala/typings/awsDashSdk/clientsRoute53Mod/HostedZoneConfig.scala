package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostedZoneConfig extends js.Object {
  /**
    * Any comments that you want to include about the hosted zone.
    */
  var Comment: js.UndefOr[ResourceDescription] = js.undefined
  /**
    * A value that indicates whether this is a private hosted zone.
    */
  var PrivateZone: js.UndefOr[IsPrivateZone] = js.undefined
}

object HostedZoneConfig {
  @scala.inline
  def apply(Comment: ResourceDescription = null, PrivateZone: js.UndefOr[Boolean] = js.undefined): HostedZoneConfig = {
    val __obj = js.Dynamic.literal()
    if (Comment != null) __obj.updateDynamic("Comment")(Comment)
    if (!js.isUndefined(PrivateZone)) __obj.updateDynamic("PrivateZone")(PrivateZone)
    __obj.asInstanceOf[HostedZoneConfig]
  }
}

