package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Symbol3DProperties extends SymbolProperties {
  /**
    * The origin of the style from which the symbol was originally referenced. A reference to the style origin can be either by styleName or by styleUrl (but not both). This information is part of the WebScene persistence model and may be used to understand where a symbol was originally sourced from. It does not affect actual appearance or rendering of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3D.html#styleOrigin)
    */
  var styleOrigin: js.UndefOr[Symbol3DStyleOrigin] = js.native
  /**
    * A Collection of [Symbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3DLayer.html) objects used to visualize the graphic or feature. Individual symbol layers may be autocast as objects and specified using the `type` property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3D.html#symbolLayers)
    */
  var symbolLayers: js.UndefOr[CollectionProperties[Symbol3DLayerProperties]] = js.native
}

object Symbol3DProperties {
  @scala.inline
  def apply(): Symbol3DProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Symbol3DProperties]
  }
  @scala.inline
  implicit class Symbol3DPropertiesOps[Self <: Symbol3DProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStyleOrigin(value: Symbol3DStyleOrigin): Self = this.set("styleOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleOrigin: Self = this.set("styleOrigin", js.undefined)
    @scala.inline
    def setSymbolLayersVarargs(value: Symbol3DLayerProperties*): Self = this.set("symbolLayers", js.Array(value :_*))
    @scala.inline
    def setSymbolLayers(value: CollectionProperties[Symbol3DLayerProperties]): Self = this.set("symbolLayers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolLayers: Self = this.set("symbolLayers", js.undefined)
  }
  
}

