package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Symbol3DProperties extends SymbolProperties {
  /**
    * The origin of the style from which the symbol was originally referenced. A reference to the style origin can be either by styleName or by styleUrl (but not both). This information is part of the WebScene persistence model and may be used to understand where a symbol was originally sourced from. It does not affect actual appearance or rendering of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3D.html#styleOrigin)
    */
  var styleOrigin: js.UndefOr[Symbol3DStyleOrigin] = js.undefined
  /**
    * A Collection of [Symbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3DLayer.html) objects used to visualize the graphic or feature. Individual symbol layers may be autocast as objects and specified using the `type` property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3D.html#symbolLayers)
    */
  var symbolLayers: js.UndefOr[CollectionProperties[Symbol3DLayerProperties]] = js.undefined
}

object Symbol3DProperties {
  @scala.inline
  def apply(
    color: Color | js.Array[Double] | String = null,
    styleOrigin: Symbol3DStyleOrigin = null,
    symbolLayers: CollectionProperties[Symbol3DLayerProperties] = null
  ): Symbol3DProperties = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (styleOrigin != null) __obj.updateDynamic("styleOrigin")(styleOrigin)
    if (symbolLayers != null) __obj.updateDynamic("symbolLayers")(symbolLayers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Symbol3DProperties]
  }
}

