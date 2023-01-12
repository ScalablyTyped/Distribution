package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServiceProfilesResponse extends StObject {
  
  /**
    * The token to use to get the next set of results, or null if there are no additional results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.NextToken] = js.undefined
  
  /**
    * The list of service profiles.
    */
  var ServiceProfileList: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.ServiceProfileList] = js.undefined
}
object ListServiceProfilesResponse {
  
  inline def apply(): ListServiceProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceProfilesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListServiceProfilesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServiceProfileList(value: ServiceProfileList): Self = StObject.set(x, "ServiceProfileList", value.asInstanceOf[js.Any])
    
    inline def setServiceProfileListUndefined: Self = StObject.set(x, "ServiceProfileList", js.undefined)
    
    inline def setServiceProfileListVarargs(value: ServiceProfile*): Self = StObject.set(x, "ServiceProfileList", js.Array(value*))
  }
}
