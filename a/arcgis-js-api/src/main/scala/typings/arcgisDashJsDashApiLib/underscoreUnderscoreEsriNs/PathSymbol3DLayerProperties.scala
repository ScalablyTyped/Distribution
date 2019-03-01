package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathSymbol3DLayerProperties extends Symbol3DLayerProperties {
  /**
    * The diameter of the tube in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#size)
    *
    * @default 1
    */
  var size: js.UndefOr[scala.Double] = js.undefined
}

object PathSymbol3DLayerProperties {
  @scala.inline
  def apply(material: js.Any = null, size: scala.Int | scala.Double = null): PathSymbol3DLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (material != null) __obj.updateDynamic("material")(material)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathSymbol3DLayerProperties]
  }
}

