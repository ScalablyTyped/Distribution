package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiplexProgramChannelDestinationSettings extends js.Object {
  /**
    * The ID of the Multiplex that the encoder is providing output to. You do not need to specify the individual inputs to the Multiplex; MediaLive will handle the connection of the two MediaLive pipelines to the two Multiplex instances.
  The Multiplex must be in the same region as the Channel.
    */
  var MultiplexId: js.UndefOr[__stringMin1] = js.native
  /**
    * The program name of the Multiplex program that the encoder is providing output to.
    */
  var ProgramName: js.UndefOr[__stringMin1] = js.native
}

object MultiplexProgramChannelDestinationSettings {
  @scala.inline
  def apply(MultiplexId: __stringMin1 = null, ProgramName: __stringMin1 = null): MultiplexProgramChannelDestinationSettings = {
    val __obj = js.Dynamic.literal()
    if (MultiplexId != null) __obj.updateDynamic("MultiplexId")(MultiplexId.asInstanceOf[js.Any])
    if (ProgramName != null) __obj.updateDynamic("ProgramName")(ProgramName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiplexProgramChannelDestinationSettings]
  }
}

