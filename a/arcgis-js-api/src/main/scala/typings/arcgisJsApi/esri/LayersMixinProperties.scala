package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayersMixinProperties extends StObject {
  
  /**
    * A collection of operational [layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayersMixin.html#layers)
    */
  var layers: js.UndefOr[CollectionProperties[LayerProperties] | js.Array[LayerProperties]] = js.undefined
}
object LayersMixinProperties {
  
  @scala.inline
  def apply(): LayersMixinProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersMixinProperties]
  }
  
  @scala.inline
  implicit class LayersMixinPropertiesMutableBuilder[Self <: LayersMixinProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayers(value: CollectionProperties[LayerProperties] | js.Array[LayerProperties]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: LayerProperties*): Self = StObject.set(x, "layers", js.Array(value :_*))
  }
}
