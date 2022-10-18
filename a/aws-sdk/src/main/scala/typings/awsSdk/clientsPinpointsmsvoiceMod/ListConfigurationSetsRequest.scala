package typings.awsSdk.clientsPinpointsmsvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConfigurationSetsRequest extends StObject {
  
  /**
    * A token returned from a previous call to the API that indicates the position in the list of results.
    */
  var NextToken: js.UndefOr[_String] = js.undefined
  
  /**
    * Used to specify the number of items that should be returned in the response.
    */
  var PageSize: js.UndefOr[_String] = js.undefined
}
object ListConfigurationSetsRequest {
  
  inline def apply(): ListConfigurationSetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConfigurationSetsRequest]
  }
  
  extension [Self <: ListConfigurationSetsRequest](x: Self) {
    
    inline def setNextToken(value: _String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPageSize(value: _String): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
  }
}
