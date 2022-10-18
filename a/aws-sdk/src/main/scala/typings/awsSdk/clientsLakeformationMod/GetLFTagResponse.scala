package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLFTagResponse extends StObject {
  
  /**
    * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata store. It contains database definitions, table definitions, and other control information to manage your Lake Formation environment. 
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The key-name for the LF-tag.
    */
  var TagKey: js.UndefOr[LFTagKey] = js.undefined
  
  /**
    * A list of possible values an attribute can take.
    */
  var TagValues: js.UndefOr[TagValueList] = js.undefined
}
object GetLFTagResponse {
  
  inline def apply(): GetLFTagResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLFTagResponse]
  }
  
  extension [Self <: GetLFTagResponse](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setTagKey(value: LFTagKey): Self = StObject.set(x, "TagKey", value.asInstanceOf[js.Any])
    
    inline def setTagKeyUndefined: Self = StObject.set(x, "TagKey", js.undefined)
    
    inline def setTagValues(value: TagValueList): Self = StObject.set(x, "TagValues", value.asInstanceOf[js.Any])
    
    inline def setTagValuesUndefined: Self = StObject.set(x, "TagValues", js.undefined)
    
    inline def setTagValuesVarargs(value: LFTagValue*): Self = StObject.set(x, "TagValues", js.Array(value*))
  }
}
