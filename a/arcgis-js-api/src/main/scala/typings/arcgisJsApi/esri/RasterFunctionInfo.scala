package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterFunctionInfo
  extends StObject
     with Object {
  
  /**
    * Description of the raster function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#RasterFunctionInfo)
    */
  var description: String
  
  /**
    * The function type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#RasterFunctionInfo)
    */
  var functionType: Double
  
  /**
    * Additional info describing what the raster function does.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#RasterFunctionInfo)
    */
  var help: String
  
  /**
    * Name of the raster function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#RasterFunctionInfo)
    */
  var name: String
  
  /**
    * Inline base64 encoded thumbnail of the raster function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#RasterFunctionInfo)
    */
  var thumbnail: String
}
object RasterFunctionInfo {
  
  inline def apply(
    constructor: js.Function,
    description: String,
    functionType: Double,
    hasOwnProperty: PropertyKey => Boolean,
    help: String,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    thumbnail: String
  ): RasterFunctionInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], functionType = functionType.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterFunctionInfo]
  }
  
  extension [Self <: RasterFunctionInfo](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFunctionType(value: Double): Self = StObject.set(x, "functionType", value.asInstanceOf[js.Any])
    
    inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
  }
}
