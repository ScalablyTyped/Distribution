package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLogSourcesResponse extends StObject {
  
  /**
    * If nextToken is returned, there are more results available. You can repeat the call using the returned token to retrieve the next page.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Lists the log sources by Regions for enabled Security Lake accounts.
    */
  var regionSourceTypesAccountsList: RegionSourceTypesAccountsList
}
object ListLogSourcesResponse {
  
  inline def apply(regionSourceTypesAccountsList: RegionSourceTypesAccountsList): ListLogSourcesResponse = {
    val __obj = js.Dynamic.literal(regionSourceTypesAccountsList = regionSourceTypesAccountsList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLogSourcesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListLogSourcesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRegionSourceTypesAccountsList(value: RegionSourceTypesAccountsList): Self = StObject.set(x, "regionSourceTypesAccountsList", value.asInstanceOf[js.Any])
    
    inline def setRegionSourceTypesAccountsListVarargs(value: AllDimensionsMap*): Self = StObject.set(x, "regionSourceTypesAccountsList", js.Array(value*))
  }
}
