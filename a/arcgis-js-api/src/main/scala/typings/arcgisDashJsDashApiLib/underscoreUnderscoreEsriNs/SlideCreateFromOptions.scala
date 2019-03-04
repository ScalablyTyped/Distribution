package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideCreateFromOptions
  extends stdLib.Object {
  /**
    * Screenshot options to use. See properties below for object specifications.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#createFrom)
    */
  var screenshot: js.UndefOr[SlideCreateFromOptionsScreenshot] = js.undefined
}

object SlideCreateFromOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    screenshot: SlideCreateFromOptionsScreenshot = null
  ): SlideCreateFromOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (screenshot != null) __obj.updateDynamic("screenshot")(screenshot)
    __obj.asInstanceOf[SlideCreateFromOptions]
  }
}

