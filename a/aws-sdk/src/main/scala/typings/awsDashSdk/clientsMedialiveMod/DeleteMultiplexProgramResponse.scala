package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMultiplexProgramResponse extends js.Object {
  /**
    * The MediaLive channel associated with the program.
    */
  var ChannelId: js.UndefOr[__string] = js.native
  /**
    * The settings for this multiplex program.
    */
  var MultiplexProgramSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.MultiplexProgramSettings] = js.native
  /**
    * The packet identifier map for this multiplex program.
    */
  var PacketIdentifiersMap: js.UndefOr[MultiplexProgramPacketIdentifiersMap] = js.native
  /**
    * The name of the multiplex program.
    */
  var ProgramName: js.UndefOr[__string] = js.native
}

object DeleteMultiplexProgramResponse {
  @scala.inline
  def apply(
    ChannelId: __string = null,
    MultiplexProgramSettings: MultiplexProgramSettings = null,
    PacketIdentifiersMap: MultiplexProgramPacketIdentifiersMap = null,
    ProgramName: __string = null
  ): DeleteMultiplexProgramResponse = {
    val __obj = js.Dynamic.literal()
    if (ChannelId != null) __obj.updateDynamic("ChannelId")(ChannelId.asInstanceOf[js.Any])
    if (MultiplexProgramSettings != null) __obj.updateDynamic("MultiplexProgramSettings")(MultiplexProgramSettings.asInstanceOf[js.Any])
    if (PacketIdentifiersMap != null) __obj.updateDynamic("PacketIdentifiersMap")(PacketIdentifiersMap.asInstanceOf[js.Any])
    if (ProgramName != null) __obj.updateDynamic("ProgramName")(ProgramName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMultiplexProgramResponse]
  }
}

