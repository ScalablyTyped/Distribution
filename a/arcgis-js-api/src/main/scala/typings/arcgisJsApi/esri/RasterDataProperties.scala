package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterDataProperties extends StObject {
  
  /**
    * Specifies the format of the raster data, such as "jpg", "tif", etc.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RasterData.html#format)
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the uploaded file returned as a result of the upload operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RasterData.html#itemId)
    */
  var itemId: js.UndefOr[String] = js.undefined
  
  /**
    * URL to the location of the raster data file.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RasterData.html#url)
    */
  var url: js.UndefOr[String] = js.undefined
}
object RasterDataProperties {
  
  inline def apply(): RasterDataProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RasterDataProperties]
  }
  
  extension [Self <: RasterDataProperties](x: Self) {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
