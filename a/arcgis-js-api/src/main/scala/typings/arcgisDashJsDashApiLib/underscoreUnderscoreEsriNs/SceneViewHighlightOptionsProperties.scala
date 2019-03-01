package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewHighlightOptionsProperties
  extends stdLib.Object {
  /**
    * The color of the highlight.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions)
    *
    * @default #00ffff
    */
  var color: js.UndefOr[Color | js.Array[scala.Double] | java.lang.String] = js.undefined
  /**
    * The opacity of the fill (area within the halo). This will be multiplied with the opacity specified in `color`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions)
    *
    * @default 0.25
    */
  var fillOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * The opacity of the highlight halo. This will be multiplied with the opacity specified in `color`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions)
    *
    * @default 1
    */
  var haloOpacity: js.UndefOr[scala.Double] = js.undefined
}

object SceneViewHighlightOptionsProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    color: Color | js.Array[scala.Double] | java.lang.String = null,
    fillOpacity: scala.Int | scala.Double = null,
    haloOpacity: scala.Int | scala.Double = null
  ): SceneViewHighlightOptionsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (haloOpacity != null) __obj.updateDynamic("haloOpacity")(haloOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewHighlightOptionsProperties]
  }
}

