package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineSymbol3DLayerProperties extends Symbol3DLayerProperties {
  /**
    * The width of the line in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html#size)
    *
    * @default "1px"
    */
  var size: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object LineSymbol3DLayerProperties {
  @scala.inline
  def apply(material: js.Any = null, size: scala.Double | java.lang.String = null): LineSymbol3DLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (material != null) __obj.updateDynamic("material")(material)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineSymbol3DLayerProperties]
  }
}

