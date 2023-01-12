package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataFileProperties extends StObject {
  
  /**
    * The ID of the uploaded file returned as a result of the upload operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DataFile.html#itemId)
    */
  var itemId: js.UndefOr[String] = js.undefined
  
  /**
    * URL to the location of the data file.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DataFile.html#url)
    */
  var url: js.UndefOr[String] = js.undefined
}
object DataFileProperties {
  
  inline def apply(): DataFileProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataFileProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataFileProperties] (val x: Self) extends AnyVal {
    
    inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
