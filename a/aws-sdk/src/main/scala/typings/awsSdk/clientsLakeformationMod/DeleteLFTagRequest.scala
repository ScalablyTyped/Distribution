package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLFTagRequest extends StObject {
  
  /**
    * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata store. It contains database definitions, table definitions, and other control information to manage your Lake Formation environment. 
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The key-name for the LF-tag to delete.
    */
  var TagKey: LFTagKey
}
object DeleteLFTagRequest {
  
  inline def apply(TagKey: LFTagKey): DeleteLFTagRequest = {
    val __obj = js.Dynamic.literal(TagKey = TagKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLFTagRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteLFTagRequest] (val x: Self) extends AnyVal {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setTagKey(value: LFTagKey): Self = StObject.set(x, "TagKey", value.asInstanceOf[js.Any])
  }
}
