package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterSliceValue extends StObject {
  
  /**
    * The magnitude and direction values for services containing vector data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#RasterSliceValue)
    */
  var magdirValue: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * A dimensional definition associated with a given slice.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#RasterSliceValue)
    */
  var multidimensionalDefinition: js.Array[DimensionalDefinition]
  
  /**
    * Image service pixel values for a given slice.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#RasterSliceValue)
    */
  var value: js.Array[Double]
}
object RasterSliceValue {
  
  inline def apply(multidimensionalDefinition: js.Array[DimensionalDefinition], value: js.Array[Double]): RasterSliceValue = {
    val __obj = js.Dynamic.literal(multidimensionalDefinition = multidimensionalDefinition.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterSliceValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RasterSliceValue] (val x: Self) extends AnyVal {
    
    inline def setMagdirValue(value: js.Array[Double]): Self = StObject.set(x, "magdirValue", value.asInstanceOf[js.Any])
    
    inline def setMagdirValueUndefined: Self = StObject.set(x, "magdirValue", js.undefined)
    
    inline def setMagdirValueVarargs(value: Double*): Self = StObject.set(x, "magdirValue", js.Array(value*))
    
    inline def setMultidimensionalDefinition(value: js.Array[DimensionalDefinition]): Self = StObject.set(x, "multidimensionalDefinition", value.asInstanceOf[js.Any])
    
    inline def setMultidimensionalDefinitionVarargs(value: DimensionalDefinition*): Self = StObject.set(x, "multidimensionalDefinition", js.Array(value*))
    
    inline def setValue(value: js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
