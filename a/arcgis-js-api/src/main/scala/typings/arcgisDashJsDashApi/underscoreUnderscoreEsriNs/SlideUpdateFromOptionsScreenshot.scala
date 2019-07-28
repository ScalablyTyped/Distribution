package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideUpdateFromOptionsScreenshot extends Object {
  /**
    * The image format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#updateFrom)
    *
    * @default jpeg
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * The image height.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#updateFrom)
    *
    * @default 75
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The image quality (due to compression).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#updateFrom)
    *
    * @default 80
    */
  var quality: js.UndefOr[Double] = js.undefined
  /**
    * The image width.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#updateFrom)
    *
    * @default 120
    */
  var width: js.UndefOr[Double] = js.undefined
}

object SlideUpdateFromOptionsScreenshot {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    format: String = null,
    height: Int | Double = null,
    quality: Int | Double = null,
    width: Int | Double = null
  ): SlideUpdateFromOptionsScreenshot = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (format != null) __obj.updateDynamic("format")(format)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideUpdateFromOptionsScreenshot]
  }
}

