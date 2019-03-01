package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtrudeSymbol3DLayerProperties extends Symbol3DLayerProperties {
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
  def apply(edges: Edges3DProperties = null, material: js.Any = null, size: scala.Int | scala.Double = null): ExtrudeSymbol3DLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (edges != null) __obj.updateDynamic("edges")(edges)
    if (material != null) __obj.updateDynamic("material")(material)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtrudeSymbol3DLayerProperties]
  }
}

