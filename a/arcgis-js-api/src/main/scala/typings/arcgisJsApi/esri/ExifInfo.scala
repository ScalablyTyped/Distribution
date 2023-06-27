package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExifInfo extends StObject {
  
  /**
  		 * The file name.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-query-support-AttachmentInfo.html#ExifInfo)
  		 */
  var name: js.UndefOr[String] = js.undefined
  
  /**
  		 * Array of tag objects containing the following properties:
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-query-support-AttachmentInfo.html#ExifInfo)
  		 */
  var tags: js.UndefOr[js.Array[ExifInfoTags]] = js.undefined
}
object ExifInfo {
  
  inline def apply(): ExifInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExifInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExifInfo] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTags(value: js.Array[ExifInfoTags]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: ExifInfoTags*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
