package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputDestination extends js.Object {
  /**
    * User-specified id. This is used in an output group or an output.
    */
  var Id: js.UndefOr[__string] = js.native
  /**
    * Destination settings for a MediaPackage output; one destination for both encoders.
    */
  var MediaPackageSettings: js.UndefOr[__listOfMediaPackageOutputDestinationSettings] = js.native
  /**
    * Destination settings for a Multiplex output; one destination for both encoders.
    */
  var MultiplexSettings: js.UndefOr[MultiplexProgramChannelDestinationSettings] = js.native
  /**
    * Destination settings for a standard output; one destination for each redundant encoder.
    */
  var Settings: js.UndefOr[__listOfOutputDestinationSettings] = js.native
}

object OutputDestination {
  @scala.inline
  def apply(
    Id: __string = null,
    MediaPackageSettings: __listOfMediaPackageOutputDestinationSettings = null,
    MultiplexSettings: MultiplexProgramChannelDestinationSettings = null,
    Settings: __listOfOutputDestinationSettings = null
  ): OutputDestination = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (MediaPackageSettings != null) __obj.updateDynamic("MediaPackageSettings")(MediaPackageSettings.asInstanceOf[js.Any])
    if (MultiplexSettings != null) __obj.updateDynamic("MultiplexSettings")(MultiplexSettings.asInstanceOf[js.Any])
    if (Settings != null) __obj.updateDynamic("Settings")(Settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputDestination]
  }
}

