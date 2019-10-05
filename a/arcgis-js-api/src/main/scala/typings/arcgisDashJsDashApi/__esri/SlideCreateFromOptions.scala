package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideCreateFromOptions extends Object {
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
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    screenshot: SlideCreateFromOptionsScreenshot = null
  ): SlideCreateFromOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (screenshot != null) __obj.updateDynamic("screenshot")(screenshot)
    __obj.asInstanceOf[SlideCreateFromOptions]
  }
}

