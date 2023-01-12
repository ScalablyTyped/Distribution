package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveLFTagsFromResourceRequest extends StObject {
  
  /**
    * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata store. It contains database definitions, table definitions, and other control information to manage your Lake Formation environment. 
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The LF-tags to be removed from the resource.
    */
  var LFTags: LFTagsList
  
  /**
    * The database, table, or column resource where you want to remove an LF-tag.
    */
  var Resource: typings.awsSdk.clientsLakeformationMod.Resource
}
object RemoveLFTagsFromResourceRequest {
  
  inline def apply(LFTags: LFTagsList, Resource: Resource): RemoveLFTagsFromResourceRequest = {
    val __obj = js.Dynamic.literal(LFTags = LFTags.asInstanceOf[js.Any], Resource = Resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveLFTagsFromResourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveLFTagsFromResourceRequest] (val x: Self) extends AnyVal {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setLFTags(value: LFTagsList): Self = StObject.set(x, "LFTags", value.asInstanceOf[js.Any])
    
    inline def setLFTagsVarargs(value: LFTagPair*): Self = StObject.set(x, "LFTags", js.Array(value*))
    
    inline def setResource(value: Resource): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
  }
}
