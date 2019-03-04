package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait colorCreatePCTrueColorRendererParams
  extends stdLib.Object {
  /**
    * The number of points per inch in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createPCTrueColorRenderer)
    *
    * @default 25
    */
  var density: js.UndefOr[scala.Double] = js.undefined
  /**
    * The layer for which the visualization is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createPCTrueColorRenderer)
    */
  var layer: PointCloudLayer
  /**
    * The size of each point expressed as a percentage. This value will determine point sizes scaled based on the given `density` of points. When the value is `100%`, the size of each point is set so that it minimizes the number of gaps between neighboring points. Any value above `100%` will allow for points to overlap neighboring points scaled to the given value. Values below `100%` scale point sizes smaller so there appear to be more gaps between points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createPCTrueColorRenderer)
    *
    * @default 100%
    */
  var size: js.UndefOr[java.lang.String] = js.undefined
}

object colorCreatePCTrueColorRendererParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    layer: PointCloudLayer,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    density: scala.Int | scala.Double = null,
    size: java.lang.String = null
  ): colorCreatePCTrueColorRendererParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, layer = layer, propertyIsEnumerable = propertyIsEnumerable)
    if (density != null) __obj.updateDynamic("density")(density.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[colorCreatePCTrueColorRendererParams]
  }
}

