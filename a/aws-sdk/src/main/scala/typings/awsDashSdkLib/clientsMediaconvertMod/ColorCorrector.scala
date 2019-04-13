package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorCorrector extends js.Object {
  /**
    * Brightness level.
    */
  var Brightness: js.UndefOr[__integerMin1Max100] = js.undefined
  /**
    * Determines if colorspace conversion will be performed. If set to _None_, no conversion will be performed. If _Force 601_ or _Force 709_ are selected, conversion will be performed for inputs with differing colorspaces. An input's colorspace can be specified explicitly in the "Video Selector":#inputs-video_selector if necessary.
    */
  var ColorSpaceConversion: js.UndefOr[ColorSpaceConversion] = js.undefined
  /**
    * Contrast level.
    */
  var Contrast: js.UndefOr[__integerMin1Max100] = js.undefined
  /**
    * Use the HDR master display (Hdr10Metadata) settings to correct HDR metadata or to provide missing metadata. Note that these settings are not color correction.
    */
  var Hdr10Metadata: js.UndefOr[Hdr10Metadata] = js.undefined
  /**
    * Hue in degrees.
    */
  var Hue: js.UndefOr[__integerMinNegative180Max180] = js.undefined
  /**
    * Saturation level.
    */
  var Saturation: js.UndefOr[__integerMin1Max100] = js.undefined
}

object ColorCorrector {
  @scala.inline
  def apply(
    Brightness: js.UndefOr[__integerMin1Max100] = js.undefined,
    ColorSpaceConversion: ColorSpaceConversion = null,
    Contrast: js.UndefOr[__integerMin1Max100] = js.undefined,
    Hdr10Metadata: Hdr10Metadata = null,
    Hue: js.UndefOr[__integerMinNegative180Max180] = js.undefined,
    Saturation: js.UndefOr[__integerMin1Max100] = js.undefined
  ): ColorCorrector = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Brightness)) __obj.updateDynamic("Brightness")(Brightness)
    if (ColorSpaceConversion != null) __obj.updateDynamic("ColorSpaceConversion")(ColorSpaceConversion.asInstanceOf[js.Any])
    if (!js.isUndefined(Contrast)) __obj.updateDynamic("Contrast")(Contrast)
    if (Hdr10Metadata != null) __obj.updateDynamic("Hdr10Metadata")(Hdr10Metadata)
    if (!js.isUndefined(Hue)) __obj.updateDynamic("Hue")(Hue)
    if (!js.isUndefined(Saturation)) __obj.updateDynamic("Saturation")(Saturation)
    __obj.asInstanceOf[ColorCorrector]
  }
}

