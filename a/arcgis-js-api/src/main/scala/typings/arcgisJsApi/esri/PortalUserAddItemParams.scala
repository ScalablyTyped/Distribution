package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortalUserAddItemParams extends StObject {
  
  /**
  		 * The component used to stream the data represented by the item to the client.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#addItem)
  		 */
  var data: js.UndefOr[String | Any] = js.undefined
  
  /**
  		 * The portal folder in which to store the item.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#addItem)
  		 */
  var folder: js.UndefOr[String | PortalFolder] = js.undefined
  
  /**
  		 * The item to add to the user's content.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#addItem)
  		 */
  var item: PortalItem
}
object PortalUserAddItemParams {
  
  inline def apply(item: PortalItem): PortalUserAddItemParams = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalUserAddItemParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PortalUserAddItemParams] (val x: Self) extends AnyVal {
    
    inline def setData(value: String | Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFolder(value: String | PortalFolder): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    
    inline def setItem(value: PortalItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
