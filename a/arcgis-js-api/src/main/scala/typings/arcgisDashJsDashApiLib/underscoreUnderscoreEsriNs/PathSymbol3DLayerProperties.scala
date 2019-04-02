package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathSymbol3DLayerProperties extends Symbol3DLayerProperties {
  /**
    * Indicates whether the symbol layer geometry casts shadows in the scene. Setting this property to `false` will disable shadows for the symbol layer even if direct shadows are enabled in [SceneView.environment](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#castShadows)
    *
    * @default true
    */
  var castShadows: js.UndefOr[scala.Boolean] = js.undefined
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
  def apply(
    castShadows: js.UndefOr[scala.Boolean] = js.undefined,
    material: js.Any = null,
    size: scala.Int | scala.Double = null
  ): PathSymbol3DLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(castShadows)) __obj.updateDynamic("castShadows")(castShadows)
    if (material != null) __obj.updateDynamic("material")(material)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathSymbol3DLayerProperties]
  }
}

