package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterIdentifyOptions
  extends StObject
     with Object {
  
  /**
    * A dimensional definition that will be used for the `identify` operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#RasterIdentifyOptions)
    */
  var multidimensionalDefinition: js.UndefOr[js.Array[DimensionalDefinition]] = js.undefined
  
  /**
    * [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) allows for cancelable requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#RasterIdentifyOptions)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object RasterIdentifyOptions {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): RasterIdentifyOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[RasterIdentifyOptions]
  }
  
  extension [Self <: RasterIdentifyOptions](x: Self) {
    
    inline def setMultidimensionalDefinition(value: js.Array[DimensionalDefinition]): Self = StObject.set(x, "multidimensionalDefinition", value.asInstanceOf[js.Any])
    
    inline def setMultidimensionalDefinitionUndefined: Self = StObject.set(x, "multidimensionalDefinition", js.undefined)
    
    inline def setMultidimensionalDefinitionVarargs(value: DimensionalDefinition*): Self = StObject.set(x, "multidimensionalDefinition", js.Array(value :_*))
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
