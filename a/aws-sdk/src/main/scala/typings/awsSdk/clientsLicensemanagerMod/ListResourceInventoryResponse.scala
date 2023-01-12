package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourceInventoryResponse extends StObject {
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the resources.
    */
  var ResourceInventoryList: js.UndefOr[typings.awsSdk.clientsLicensemanagerMod.ResourceInventoryList] = js.undefined
}
object ListResourceInventoryResponse {
  
  inline def apply(): ListResourceInventoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourceInventoryResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListResourceInventoryResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceInventoryList(value: ResourceInventoryList): Self = StObject.set(x, "ResourceInventoryList", value.asInstanceOf[js.Any])
    
    inline def setResourceInventoryListUndefined: Self = StObject.set(x, "ResourceInventoryList", js.undefined)
    
    inline def setResourceInventoryListVarargs(value: ResourceInventory*): Self = StObject.set(x, "ResourceInventoryList", js.Array(value*))
  }
}
