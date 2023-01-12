package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterFunctionInfo extends StObject {
  
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
  
  inline def apply(description: String, functionType: Double, help: String, name: String, thumbnail: String): RasterFunctionInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], functionType = functionType.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterFunctionInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RasterFunctionInfo] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFunctionType(value: Double): Self = StObject.set(x, "functionType", value.asInstanceOf[js.Any])
    
    inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
  }
}
