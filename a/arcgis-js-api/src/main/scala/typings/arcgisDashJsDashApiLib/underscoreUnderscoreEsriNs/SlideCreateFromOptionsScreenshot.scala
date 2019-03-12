package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideCreateFromOptionsScreenshot
  extends stdLib.Object {
  /**
    * The image format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#createFrom)
    *
    * @default jpeg
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The image height.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#createFrom)
    *
    * @default 75
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * The image quality (due to compression).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#createFrom)
    *
    * @default 80
    */
  var quality: js.UndefOr[scala.Double] = js.undefined
  /**
    * The image width.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#createFrom)
    *
    * @default 120
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object SlideCreateFromOptionsScreenshot {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    format: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    quality: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): SlideCreateFromOptionsScreenshot = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (format != null) __obj.updateDynamic("format")(format)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideCreateFromOptionsScreenshot]
  }
}

