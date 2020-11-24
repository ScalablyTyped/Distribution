package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayersMixinProperties extends js.Object {
  
  /**
    * A collection of operational [layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayersMixin.html#layers)
    */
  var layers: js.UndefOr[CollectionProperties[LayerProperties] | js.Array[LayerProperties]] = js.native
}
object LayersMixinProperties {
  
  @scala.inline
  def apply(): LayersMixinProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersMixinProperties]
  }
  
  @scala.inline
  implicit class LayersMixinPropertiesOps[Self <: LayersMixinProperties] (val x: Self) extends AnyVal {
    
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
    def setLayersVarargs(value: LayerProperties*): Self = this.set("layers", js.Array(value :_*))
    
    @scala.inline
    def setLayers(value: CollectionProperties[LayerProperties] | js.Array[LayerProperties]): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
  }
}
