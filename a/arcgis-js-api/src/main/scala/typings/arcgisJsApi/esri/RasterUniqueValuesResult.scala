package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterUniqueValuesResult extends StObject {
  
  /**
    * The class field name from which the unique value infos were generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-uniqueValue.html#RasterUniqueValuesResult)
    */
  var classFieldName: String
  
  /**
    * The UniqueValueRenderer renderer to apply to the input layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-uniqueValue.html#RasterUniqueValuesResult)
    */
  var renderer: UniqueValueRenderer
}
object RasterUniqueValuesResult {
  
  inline def apply(classFieldName: String, renderer: UniqueValueRenderer): RasterUniqueValuesResult = {
    val __obj = js.Dynamic.literal(classFieldName = classFieldName.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterUniqueValuesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RasterUniqueValuesResult] (val x: Self) extends AnyVal {
    
    inline def setClassFieldName(value: String): Self = StObject.set(x, "classFieldName", value.asInstanceOf[js.Any])
    
    inline def setRenderer(value: UniqueValueRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
  }
}
