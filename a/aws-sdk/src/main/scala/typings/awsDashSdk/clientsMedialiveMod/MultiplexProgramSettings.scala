package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiplexProgramSettings extends js.Object {
  /**
    * Unique program number.
    */
  var ProgramNumber: __integerMin0Max65535 = js.native
  /**
    * Transport stream service descriptor configuration for the Multiplex program.
    */
  var ServiceDescriptor: js.UndefOr[MultiplexProgramServiceDescriptor] = js.native
  /**
    * Program video settings configuration.
    */
  var VideoSettings: js.UndefOr[MultiplexVideoSettings] = js.native
}

object MultiplexProgramSettings {
  @scala.inline
  def apply(
    ProgramNumber: __integerMin0Max65535,
    ServiceDescriptor: MultiplexProgramServiceDescriptor = null,
    VideoSettings: MultiplexVideoSettings = null
  ): MultiplexProgramSettings = {
    val __obj = js.Dynamic.literal(ProgramNumber = ProgramNumber.asInstanceOf[js.Any])
    if (ServiceDescriptor != null) __obj.updateDynamic("ServiceDescriptor")(ServiceDescriptor.asInstanceOf[js.Any])
    if (VideoSettings != null) __obj.updateDynamic("VideoSettings")(VideoSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiplexProgramSettings]
  }
}

