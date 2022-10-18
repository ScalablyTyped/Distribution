package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCatalogItemsInput extends StObject {
  
  /**
    * Filters the results by EC2 family (for example, M5).
    */
  var EC2FamilyFilter: js.UndefOr[EC2FamilyList] = js.undefined
  
  /**
    * Filters the results by item class.
    */
  var ItemClassFilter: js.UndefOr[CatalogItemClassList] = js.undefined
  
  var MaxResults: js.UndefOr[MaxResults1000] = js.undefined
  
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * Filters the results by storage option.
    */
  var SupportedStorageFilter: js.UndefOr[SupportedStorageList] = js.undefined
}
object ListCatalogItemsInput {
  
  inline def apply(): ListCatalogItemsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCatalogItemsInput]
  }
  
  extension [Self <: ListCatalogItemsInput](x: Self) {
    
    inline def setEC2FamilyFilter(value: EC2FamilyList): Self = StObject.set(x, "EC2FamilyFilter", value.asInstanceOf[js.Any])
    
    inline def setEC2FamilyFilterUndefined: Self = StObject.set(x, "EC2FamilyFilter", js.undefined)
    
    inline def setEC2FamilyFilterVarargs(value: Family*): Self = StObject.set(x, "EC2FamilyFilter", js.Array(value*))
    
    inline def setItemClassFilter(value: CatalogItemClassList): Self = StObject.set(x, "ItemClassFilter", value.asInstanceOf[js.Any])
    
    inline def setItemClassFilterUndefined: Self = StObject.set(x, "ItemClassFilter", js.undefined)
    
    inline def setItemClassFilterVarargs(value: CatalogItemClass*): Self = StObject.set(x, "ItemClassFilter", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults1000): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSupportedStorageFilter(value: SupportedStorageList): Self = StObject.set(x, "SupportedStorageFilter", value.asInstanceOf[js.Any])
    
    inline def setSupportedStorageFilterUndefined: Self = StObject.set(x, "SupportedStorageFilter", js.undefined)
    
    inline def setSupportedStorageFilterVarargs(value: SupportedStorageEnum*): Self = StObject.set(x, "SupportedStorageFilter", js.Array(value*))
  }
}
