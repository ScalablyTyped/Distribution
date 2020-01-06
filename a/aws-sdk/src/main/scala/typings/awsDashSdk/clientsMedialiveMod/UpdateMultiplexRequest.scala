package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMultiplexRequest extends js.Object {
  /**
    * ID of the multiplex to update.
    */
  var MultiplexId: __string = js.native
  /**
    * The new settings for a multiplex.
    */
  var MultiplexSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.MultiplexSettings] = js.native
  /**
    * Name of the multiplex.
    */
  var Name: js.UndefOr[__string] = js.native
}

object UpdateMultiplexRequest {
  @scala.inline
  def apply(MultiplexId: __string, MultiplexSettings: MultiplexSettings = null, Name: __string = null): UpdateMultiplexRequest = {
    val __obj = js.Dynamic.literal(MultiplexId = MultiplexId.asInstanceOf[js.Any])
    if (MultiplexSettings != null) __obj.updateDynamic("MultiplexSettings")(MultiplexSettings.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMultiplexRequest]
  }
}

