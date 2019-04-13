package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoPreprocessor extends js.Object {
  /**
    * Enable the Color corrector (ColorCorrector) feature if necessary. Enable or disable this feature for each output individually. This setting is disabled by default.
    */
  var ColorCorrector: js.UndefOr[ColorCorrector] = js.undefined
  /**
    * Use Deinterlacer (Deinterlacer) to produce smoother motion and a clearer picture.
    */
  var Deinterlacer: js.UndefOr[Deinterlacer] = js.undefined
  /**
    * Enable the Image inserter (ImageInserter) feature to include a graphic overlay on your video. Enable or disable this feature for each output individually. This setting is disabled by default.
    */
  var ImageInserter: js.UndefOr[ImageInserter] = js.undefined
  /**
    * Enable the Noise reducer (NoiseReducer) feature to remove noise from your video output if necessary. Enable or disable this feature for each output individually. This setting is disabled by default.
    */
  var NoiseReducer: js.UndefOr[NoiseReducer] = js.undefined
  /**
    * Timecode burn-in (TimecodeBurnIn)--Burns the output timecode and specified prefix into the output.
    */
  var TimecodeBurnin: js.UndefOr[TimecodeBurnin] = js.undefined
}

object VideoPreprocessor {
  @scala.inline
  def apply(
    ColorCorrector: ColorCorrector = null,
    Deinterlacer: Deinterlacer = null,
    ImageInserter: ImageInserter = null,
    NoiseReducer: NoiseReducer = null,
    TimecodeBurnin: TimecodeBurnin = null
  ): VideoPreprocessor = {
    val __obj = js.Dynamic.literal()
    if (ColorCorrector != null) __obj.updateDynamic("ColorCorrector")(ColorCorrector)
    if (Deinterlacer != null) __obj.updateDynamic("Deinterlacer")(Deinterlacer)
    if (ImageInserter != null) __obj.updateDynamic("ImageInserter")(ImageInserter)
    if (NoiseReducer != null) __obj.updateDynamic("NoiseReducer")(NoiseReducer)
    if (TimecodeBurnin != null) __obj.updateDynamic("TimecodeBurnin")(TimecodeBurnin)
    __obj.asInstanceOf[VideoPreprocessor]
  }
}

