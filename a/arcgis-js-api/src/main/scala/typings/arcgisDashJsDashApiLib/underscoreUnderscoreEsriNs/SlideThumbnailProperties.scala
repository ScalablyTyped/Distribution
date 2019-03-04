package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideThumbnailProperties
  extends stdLib.Object {
  /**
    * The URI pointing to the thumbnail image representing the slide.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#thumbnail)
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object SlideThumbnailProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    url: java.lang.String = null
  ): SlideThumbnailProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[SlideThumbnailProperties]
  }
}

