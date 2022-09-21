package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureLayerSaveOptions
  extends StObject
     with Object {
  
  /**
    * Options for validating the save operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#save)
    */
  var validationOptions: js.UndefOr[FeatureLayerSaveOptionsValidationOptions] = js.undefined
}
object FeatureLayerSaveOptions {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): FeatureLayerSaveOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[FeatureLayerSaveOptions]
  }
  
  extension [Self <: FeatureLayerSaveOptions](x: Self) {
    
    inline def setValidationOptions(value: FeatureLayerSaveOptionsValidationOptions): Self = StObject.set(x, "validationOptions", value.asInstanceOf[js.Any])
    
    inline def setValidationOptionsUndefined: Self = StObject.set(x, "validationOptions", js.undefined)
  }
}
