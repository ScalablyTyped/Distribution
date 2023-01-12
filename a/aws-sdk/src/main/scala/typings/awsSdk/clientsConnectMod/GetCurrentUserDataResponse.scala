package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCurrentUserDataResponse extends StObject {
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConnectMod.NextToken] = js.undefined
  
  /**
    * A list of the user data that is returned.
    */
  var UserDataList: js.UndefOr[typings.awsSdk.clientsConnectMod.UserDataList] = js.undefined
}
object GetCurrentUserDataResponse {
  
  inline def apply(): GetCurrentUserDataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCurrentUserDataResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCurrentUserDataResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setUserDataList(value: UserDataList): Self = StObject.set(x, "UserDataList", value.asInstanceOf[js.Any])
    
    inline def setUserDataListUndefined: Self = StObject.set(x, "UserDataList", js.undefined)
    
    inline def setUserDataListVarargs(value: UserData*): Self = StObject.set(x, "UserDataList", js.Array(value*))
  }
}
