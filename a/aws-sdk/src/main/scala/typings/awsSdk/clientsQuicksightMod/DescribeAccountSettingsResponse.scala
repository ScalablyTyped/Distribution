package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountSettingsResponse extends StObject {
  
  /**
    * The Amazon QuickSight settings for this Amazon Web Services account. This information includes the edition of Amazon Amazon QuickSight that you subscribed to (Standard or Enterprise) and the notification email for the Amazon QuickSight subscription.  In the QuickSight console, the Amazon QuickSight subscription is sometimes referred to as a QuickSight "account" even though it's technically not an account by itself. Instead, it's a subscription to the Amazon QuickSight service for your Amazon Web Services account. The edition that you subscribe to applies to Amazon QuickSight in every Amazon Web Services Region where you use it.
    */
  var AccountSettings: js.UndefOr[typings.awsSdk.clientsQuicksightMod.AccountSettings] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object DescribeAccountSettingsResponse {
  
  inline def apply(): DescribeAccountSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountSettingsResponse]
  }
  
  extension [Self <: DescribeAccountSettingsResponse](x: Self) {
    
    inline def setAccountSettings(value: AccountSettings): Self = StObject.set(x, "AccountSettings", value.asInstanceOf[js.Any])
    
    inline def setAccountSettingsUndefined: Self = StObject.set(x, "AccountSettings", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
