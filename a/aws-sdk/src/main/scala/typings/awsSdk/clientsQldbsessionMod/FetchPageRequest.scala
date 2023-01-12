package typings.awsSdk.clientsQldbsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchPageRequest extends StObject {
  
  /**
    * Specifies the next page token of the page to be fetched.
    */
  var NextPageToken: PageToken
  
  /**
    * Specifies the transaction ID of the page to be fetched.
    */
  var TransactionId: typings.awsSdk.clientsQldbsessionMod.TransactionId
}
object FetchPageRequest {
  
  inline def apply(NextPageToken: PageToken, TransactionId: TransactionId): FetchPageRequest = {
    val __obj = js.Dynamic.literal(NextPageToken = NextPageToken.asInstanceOf[js.Any], TransactionId = TransactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchPageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FetchPageRequest] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setTransactionId(value: TransactionId): Self = StObject.set(x, "TransactionId", value.asInstanceOf[js.Any])
  }
}
