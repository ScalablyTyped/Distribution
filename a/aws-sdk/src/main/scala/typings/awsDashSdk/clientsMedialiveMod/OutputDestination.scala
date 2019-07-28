package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputDestination extends js.Object {
  /**
    * User-specified id. This is used in an output group or an output.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * Destination settings for a MediaPackage output; one destination for both encoders.
    */
  var MediaPackageSettings: js.UndefOr[__listOfMediaPackageOutputDestinationSettings] = js.undefined
  /**
    * Destination settings for a standard output; one destination for each redundant encoder.
    */
  var Settings: js.UndefOr[__listOfOutputDestinationSettings] = js.undefined
}

object OutputDestination {
  @scala.inline
  def apply(
    Id: __string = null,
    MediaPackageSettings: __listOfMediaPackageOutputDestinationSettings = null,
    Settings: __listOfOutputDestinationSettings = null
  ): OutputDestination = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (MediaPackageSettings != null) __obj.updateDynamic("MediaPackageSettings")(MediaPackageSettings)
    if (Settings != null) __obj.updateDynamic("Settings")(Settings)
    __obj.asInstanceOf[OutputDestination]
  }
}

