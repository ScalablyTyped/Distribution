package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLFTagRequest extends StObject {
  
  /**
    * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata store. It contains database definitions, table definitions, and other control information to manage your Lake Formation environment. 
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The key-name for the LF-tag for which to add or delete values.
    */
  var TagKey: LFTagKey
  
  /**
    * A list of LF-tag values to add from the LF-tag.
    */
  var TagValuesToAdd: js.UndefOr[TagValueList] = js.undefined
  
  /**
    * A list of LF-tag values to delete from the LF-tag.
    */
  var TagValuesToDelete: js.UndefOr[TagValueList] = js.undefined
}
object UpdateLFTagRequest {
  
  inline def apply(TagKey: LFTagKey): UpdateLFTagRequest = {
    val __obj = js.Dynamic.literal(TagKey = TagKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLFTagRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateLFTagRequest] (val x: Self) extends AnyVal {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setTagKey(value: LFTagKey): Self = StObject.set(x, "TagKey", value.asInstanceOf[js.Any])
    
    inline def setTagValuesToAdd(value: TagValueList): Self = StObject.set(x, "TagValuesToAdd", value.asInstanceOf[js.Any])
    
    inline def setTagValuesToAddUndefined: Self = StObject.set(x, "TagValuesToAdd", js.undefined)
    
    inline def setTagValuesToAddVarargs(value: LFTagValue*): Self = StObject.set(x, "TagValuesToAdd", js.Array(value*))
    
    inline def setTagValuesToDelete(value: TagValueList): Self = StObject.set(x, "TagValuesToDelete", value.asInstanceOf[js.Any])
    
    inline def setTagValuesToDeleteUndefined: Self = StObject.set(x, "TagValuesToDelete", js.undefined)
    
    inline def setTagValuesToDeleteVarargs(value: LFTagValue*): Self = StObject.set(x, "TagValuesToDelete", js.Array(value*))
  }
}
