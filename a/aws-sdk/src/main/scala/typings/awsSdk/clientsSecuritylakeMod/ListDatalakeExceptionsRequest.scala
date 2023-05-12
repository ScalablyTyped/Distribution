package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatalakeExceptionsRequest extends StObject {
  
  /**
    * List the maximum number of failures in Security Lake.
    */
  var maxFailures: js.UndefOr[Integer] = js.undefined
  
  /**
    * List if there are more results available. The value of nextToken is a unique pagination token for each page. Repeat the call using the returned token to retrieve the next page. Keep all other arguments unchanged.  Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
    */
  var nextToken: js.UndefOr[SafeString] = js.undefined
  
  /**
    * List the Amazon Web Services Regions from which exceptions are retrieved.
    */
  var regionSet: js.UndefOr[RegionSet] = js.undefined
}
object ListDatalakeExceptionsRequest {
  
  inline def apply(): ListDatalakeExceptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatalakeExceptionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDatalakeExceptionsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxFailures(value: Integer): Self = StObject.set(x, "maxFailures", value.asInstanceOf[js.Any])
    
    inline def setMaxFailuresUndefined: Self = StObject.set(x, "maxFailures", js.undefined)
    
    inline def setNextToken(value: SafeString): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRegionSet(value: RegionSet): Self = StObject.set(x, "regionSet", value.asInstanceOf[js.Any])
    
    inline def setRegionSetUndefined: Self = StObject.set(x, "regionSet", js.undefined)
    
    inline def setRegionSetVarargs(value: Region*): Self = StObject.set(x, "regionSet", js.Array(value*))
  }
}
