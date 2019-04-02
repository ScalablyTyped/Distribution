package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeRampElement
  extends stdLib.Object
     with LegendElement {
  /**
    * The individual size stops rendered in the legend that correspond to the size visual variable in the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SizeRampElement)
    */
  var infos: js.Array[SizeRampStop]
  /**
    * The title of the size ramp as displayed in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SizeRampElement)
    */
  var title: js.UndefOr[java.lang.String | RampTitle] = js.undefined
  /**
    * The type of this element is always `size-ramp`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SizeRampElement)
    */
  var `type`: java.lang.String
}

object SizeRampElement {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    infos: js.Array[SizeRampStop],
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    `type`: java.lang.String,
    title: java.lang.String | RampTitle = null
  ): SizeRampElement = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), infos = infos, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeRampElement]
  }
}

