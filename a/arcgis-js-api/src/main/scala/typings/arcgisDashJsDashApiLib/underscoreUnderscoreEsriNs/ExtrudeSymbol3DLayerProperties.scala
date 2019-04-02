package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtrudeSymbol3DLayerProperties extends Symbol3DLayerProperties {
  /**
    * Indicates whether the symbol layer geometry casts shadows in the scene. Setting this property to `false` will disable shadows for the symbol layer even if direct shadows are enabled in [SceneView.environment](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html#castShadows)
    *
    * @default true
    */
  var castShadows: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets the contour edges on polygons symbolized with ExtrudeSymbol3DLayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html#edges)
    */
  var edges: js.UndefOr[Edges3DProperties] = js.undefined
  /**
    * The height of the extrusion in meters. Negative values will extrude the polygon surface downward towards or below the ground.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html#size)
    *
    * @default 1
    */
  var size: js.UndefOr[scala.Double] = js.undefined
}

object ExtrudeSymbol3DLayerProperties {
  @scala.inline
  def apply(
    castShadows: js.UndefOr[scala.Boolean] = js.undefined,
    edges: Edges3DProperties = null,
    material: js.Any = null,
    size: scala.Int | scala.Double = null
  ): ExtrudeSymbol3DLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(castShadows)) __obj.updateDynamic("castShadows")(castShadows)
    if (edges != null) __obj.updateDynamic("edges")(edges)
    if (material != null) __obj.updateDynamic("material")(material)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtrudeSymbol3DLayerProperties]
  }
}

