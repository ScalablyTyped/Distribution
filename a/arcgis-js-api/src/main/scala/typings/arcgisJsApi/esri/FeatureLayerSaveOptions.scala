package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureLayerSaveOptions extends StObject {
  
  /**
    * Options for validating the save operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#save)
    */
  var validationOptions: js.UndefOr[FeatureLayerSaveOptionsValidationOptions] = js.undefined
}
object FeatureLayerSaveOptions {
  
  inline def apply(): FeatureLayerSaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureLayerSaveOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureLayerSaveOptions] (val x: Self) extends AnyVal {
    
    inline def setValidationOptions(value: FeatureLayerSaveOptionsValidationOptions): Self = StObject.set(x, "validationOptions", value.asInstanceOf[js.Any])
    
    inline def setValidationOptionsUndefined: Self = StObject.set(x, "validationOptions", js.undefined)
  }
}
