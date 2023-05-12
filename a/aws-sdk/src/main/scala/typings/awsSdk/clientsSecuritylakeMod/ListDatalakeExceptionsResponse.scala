package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatalakeExceptionsResponse extends StObject {
  
  /**
    * List if there are more results available. The value of nextToken is a unique pagination token for each page. Repeat the call using the returned token to retrieve the next page. Keep all other arguments unchanged.  Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
    */
  var nextToken: js.UndefOr[SafeString] = js.undefined
  
  /**
    * Lists the failures that cannot be retried in the current Region.
    */
  var nonRetryableFailures: FailuresResponseList
}
object ListDatalakeExceptionsResponse {
  
  inline def apply(nonRetryableFailures: FailuresResponseList): ListDatalakeExceptionsResponse = {
    val __obj = js.Dynamic.literal(nonRetryableFailures = nonRetryableFailures.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDatalakeExceptionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDatalakeExceptionsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: SafeString): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setNonRetryableFailures(value: FailuresResponseList): Self = StObject.set(x, "nonRetryableFailures", value.asInstanceOf[js.Any])
    
    inline def setNonRetryableFailuresVarargs(value: FailuresResponse*): Self = StObject.set(x, "nonRetryableFailures", js.Array(value*))
  }
}
