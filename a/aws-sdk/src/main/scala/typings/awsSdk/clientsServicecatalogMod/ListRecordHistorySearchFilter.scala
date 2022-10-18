package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRecordHistorySearchFilter extends StObject {
  
  /**
    * The filter key.    product - Filter results based on the specified product identifier.    provisionedproduct - Filter results based on the provisioned product identifier.  
    */
  var Key: js.UndefOr[SearchFilterKey] = js.undefined
  
  /**
    * The filter value.
    */
  var Value: js.UndefOr[SearchFilterValue] = js.undefined
}
object ListRecordHistorySearchFilter {
  
  inline def apply(): ListRecordHistorySearchFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRecordHistorySearchFilter]
  }
  
  extension [Self <: ListRecordHistorySearchFilter](x: Self) {
    
    inline def setKey(value: SearchFilterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setValue(value: SearchFilterValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
