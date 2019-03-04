package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideTitleProperties
  extends stdLib.Object {
  /**
    * The title.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#title)
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object SlideTitleProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    text: java.lang.String = null
  ): SlideTitleProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[SlideTitleProperties]
  }
}

