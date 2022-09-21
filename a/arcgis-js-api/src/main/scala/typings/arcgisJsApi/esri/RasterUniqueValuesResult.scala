package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterUniqueValuesResult
  extends StObject
     with Object {
  
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
  
  inline def apply(
    classFieldName: String,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    renderer: UniqueValueRenderer
  ): RasterUniqueValuesResult = {
    val __obj = js.Dynamic.literal(classFieldName = classFieldName.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterUniqueValuesResult]
  }
  
  extension [Self <: RasterUniqueValuesResult](x: Self) {
    
    inline def setClassFieldName(value: String): Self = StObject.set(x, "classFieldName", value.asInstanceOf[js.Any])
    
    inline def setRenderer(value: UniqueValueRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
  }
}
