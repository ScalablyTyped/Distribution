package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Symbol3DLayerProperties extends js.Object {
  /**
    * The material used to shade the geometry. For `material` properties, see the documentation of the individual symbol layer classes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3DLayer.html#material)
    */
  var material: js.UndefOr[js.Any] = js.undefined
}

object Symbol3DLayerProperties {
  @scala.inline
  def apply(material: js.Any = null): Symbol3DLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (material != null) __obj.updateDynamic("material")(material)
    __obj.asInstanceOf[Symbol3DLayerProperties]
  }
}

