package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterIdentifyOptions extends StObject {
  
  /**
    * A dimensional definition used for the `identify` operation.
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
  
  /**
    * Name of the transposed variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#RasterIdentifyOptions)
    */
  var transposedVariableName: js.UndefOr[String] = js.undefined
}
object RasterIdentifyOptions {
  
  inline def apply(): RasterIdentifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RasterIdentifyOptions]
  }
  
  extension [Self <: RasterIdentifyOptions](x: Self) {
    
    inline def setMultidimensionalDefinition(value: js.Array[DimensionalDefinition]): Self = StObject.set(x, "multidimensionalDefinition", value.asInstanceOf[js.Any])
    
    inline def setMultidimensionalDefinitionUndefined: Self = StObject.set(x, "multidimensionalDefinition", js.undefined)
    
    inline def setMultidimensionalDefinitionVarargs(value: DimensionalDefinition*): Self = StObject.set(x, "multidimensionalDefinition", js.Array(value*))
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setTransposedVariableName(value: String): Self = StObject.set(x, "transposedVariableName", value.asInstanceOf[js.Any])
    
    inline def setTransposedVariableNameUndefined: Self = StObject.set(x, "transposedVariableName", js.undefined)
  }
}
