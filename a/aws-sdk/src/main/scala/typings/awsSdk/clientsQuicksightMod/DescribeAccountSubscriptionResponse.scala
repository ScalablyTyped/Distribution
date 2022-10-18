package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountSubscriptionResponse extends StObject {
  
  /**
    * A structure that contains the following elements:   Your Amazon QuickSight account name.   The edition of Amazon QuickSight that your account is using.   The notification email address that is associated with the Amazon QuickSight account.    The authentication type of the Amazon QuickSight account.   The status of the Amazon QuickSight account's subscription.  
    */
  var AccountInfo: js.UndefOr[typings.awsSdk.clientsQuicksightMod.AccountInfo] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object DescribeAccountSubscriptionResponse {
  
  inline def apply(): DescribeAccountSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountSubscriptionResponse]
  }
  
  extension [Self <: DescribeAccountSubscriptionResponse](x: Self) {
    
    inline def setAccountInfo(value: AccountInfo): Self = StObject.set(x, "AccountInfo", value.asInstanceOf[js.Any])
    
    inline def setAccountInfoUndefined: Self = StObject.set(x, "AccountInfo", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
