package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlackoutSlate extends js.Object {
  /**
    * Blackout slate image to be used. Leave empty for solid black. Only bmp and png images are supported.
    */
  var BlackoutSlateImage: js.UndefOr[InputLocation] = js.undefined
  /**
    * Setting to enabled causes the encoder to blackout the video, audio, and captions, and raise the "Network Blackout Image" slate when an SCTE104/35 Network End Segmentation Descriptor is encountered. The blackout will be lifted when the Network Start Segmentation Descriptor is encountered. The Network End and Network Start descriptors must contain a network ID that matches the value entered in "Network ID".
    */
  var NetworkEndBlackout: js.UndefOr[BlackoutSlateNetworkEndBlackout] = js.undefined
  /**
    * Path to local file to use as Network End Blackout image. Image will be scaled to fill the entire output raster.
    */
  var NetworkEndBlackoutImage: js.UndefOr[InputLocation] = js.undefined
  /**
    * Provides Network ID that matches EIDR ID format (e.g., "10.XXXX/XXXX-XXXX-XXXX-XXXX-XXXX-C").
    */
  var NetworkId: js.UndefOr[__stringMin34Max34] = js.undefined
  /**
    * When set to enabled, causes video, audio and captions to be blanked when indicated by program metadata.
    */
  var State: js.UndefOr[BlackoutSlateState] = js.undefined
}

object BlackoutSlate {
  @scala.inline
  def apply(
    BlackoutSlateImage: InputLocation = null,
    NetworkEndBlackout: BlackoutSlateNetworkEndBlackout = null,
    NetworkEndBlackoutImage: InputLocation = null,
    NetworkId: __stringMin34Max34 = null,
    State: BlackoutSlateState = null
  ): BlackoutSlate = {
    val __obj = js.Dynamic.literal()
    if (BlackoutSlateImage != null) __obj.updateDynamic("BlackoutSlateImage")(BlackoutSlateImage)
    if (NetworkEndBlackout != null) __obj.updateDynamic("NetworkEndBlackout")(NetworkEndBlackout.asInstanceOf[js.Any])
    if (NetworkEndBlackoutImage != null) __obj.updateDynamic("NetworkEndBlackoutImage")(NetworkEndBlackoutImage)
    if (NetworkId != null) __obj.updateDynamic("NetworkId")(NetworkId)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlackoutSlate]
  }
}

