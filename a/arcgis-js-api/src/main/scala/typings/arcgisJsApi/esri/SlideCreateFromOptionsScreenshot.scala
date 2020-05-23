package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideCreateFromOptionsScreenshot extends Object {
  /**
    * The image format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#createFrom)
    *
    * @default jpeg
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * The image height.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#createFrom)
    *
    * @default 75
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The image quality (due to compression).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#createFrom)
    *
    * @default 80
    */
  var quality: js.UndefOr[Double] = js.undefined
  /**
    * The image width.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#createFrom)
    *
    * @default 120
    */
  var width: js.UndefOr[Double] = js.undefined
}

object SlideCreateFromOptionsScreenshot {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    format: String = null,
    height: js.UndefOr[Double] = js.undefined,
    quality: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): SlideCreateFromOptionsScreenshot = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideCreateFromOptionsScreenshot]
  }
}

