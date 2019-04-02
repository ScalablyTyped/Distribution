package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeatmapRampElement
  extends stdLib.Object
     with LegendElement {
  /**
    * The individual color stops rendered in the legend that correspond to the heatmap colorStops in the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#HeatmapRampElement)
    */
  var infos: js.Array[HeatmapRampStop]
  /**
    * The title of the heatmap ramp as displayed in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#HeatmapRampElement)
    */
  var title: js.UndefOr[java.lang.String | RampTitle] = js.undefined
  /**
    * The type of this element is always `heatmap-ramp`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#HeatmapRampElement)
    */
  var `type`: java.lang.String
}

object HeatmapRampElement {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    infos: js.Array[HeatmapRampStop],
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    `type`: java.lang.String,
    title: java.lang.String | RampTitle = null
  ): HeatmapRampElement = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), infos = infos, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapRampElement]
  }
}

