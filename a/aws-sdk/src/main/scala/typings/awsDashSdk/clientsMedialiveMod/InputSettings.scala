package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputSettings extends js.Object {
  /**
    * Used to select the audio stream to decode for inputs that have multiple available.
    */
  var AudioSelectors: js.UndefOr[__listOfAudioSelector] = js.undefined
  /**
    * Used to select the caption input to use for inputs that have multiple available.
    */
  var CaptionSelectors: js.UndefOr[__listOfCaptionSelector] = js.undefined
  /**
    * Enable or disable the deblock filter when filtering.
    */
  var DeblockFilter: js.UndefOr[InputDeblockFilter] = js.undefined
  /**
    * Enable or disable the denoise filter when filtering.
    */
  var DenoiseFilter: js.UndefOr[InputDenoiseFilter] = js.undefined
  /**
    * Adjusts the magnitude of filtering from 1 (minimal) to 5 (strongest).
    */
  var FilterStrength: js.UndefOr[__integerMin1Max5] = js.undefined
  /**
    * Turns on the filter for this input. MPEG-2 inputs have the deblocking filter enabled by default.
  1) auto - filtering will be applied depending on input type/quality
  2) disabled - no filtering will be applied to the input
  3) forced - filtering will be applied regardless of input type
    */
  var InputFilter: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.InputFilter] = js.undefined
  /**
    * Input settings.
    */
  var NetworkInputSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.NetworkInputSettings] = js.undefined
  /**
    * Loop input if it is a file. This allows a file input to be streamed indefinitely.
    */
  var SourceEndBehavior: js.UndefOr[InputSourceEndBehavior] = js.undefined
  /**
    * Informs which video elementary stream to decode for input types that have multiple available.
    */
  var VideoSelector: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.VideoSelector] = js.undefined
}

object InputSettings {
  @scala.inline
  def apply(
    AudioSelectors: __listOfAudioSelector = null,
    CaptionSelectors: __listOfCaptionSelector = null,
    DeblockFilter: InputDeblockFilter = null,
    DenoiseFilter: InputDenoiseFilter = null,
    FilterStrength: Int | Double = null,
    InputFilter: InputFilter = null,
    NetworkInputSettings: NetworkInputSettings = null,
    SourceEndBehavior: InputSourceEndBehavior = null,
    VideoSelector: VideoSelector = null
  ): InputSettings = {
    val __obj = js.Dynamic.literal()
    if (AudioSelectors != null) __obj.updateDynamic("AudioSelectors")(AudioSelectors)
    if (CaptionSelectors != null) __obj.updateDynamic("CaptionSelectors")(CaptionSelectors)
    if (DeblockFilter != null) __obj.updateDynamic("DeblockFilter")(DeblockFilter.asInstanceOf[js.Any])
    if (DenoiseFilter != null) __obj.updateDynamic("DenoiseFilter")(DenoiseFilter.asInstanceOf[js.Any])
    if (FilterStrength != null) __obj.updateDynamic("FilterStrength")(FilterStrength.asInstanceOf[js.Any])
    if (InputFilter != null) __obj.updateDynamic("InputFilter")(InputFilter.asInstanceOf[js.Any])
    if (NetworkInputSettings != null) __obj.updateDynamic("NetworkInputSettings")(NetworkInputSettings)
    if (SourceEndBehavior != null) __obj.updateDynamic("SourceEndBehavior")(SourceEndBehavior.asInstanceOf[js.Any])
    if (VideoSelector != null) __obj.updateDynamic("VideoSelector")(VideoSelector)
    __obj.asInstanceOf[InputSettings]
  }
}

