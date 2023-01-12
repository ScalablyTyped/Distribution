package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountSubscriptionRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID associated with your Amazon QuickSight account.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
}
object DescribeAccountSubscriptionRequest {
  
  inline def apply(AwsAccountId: AwsAccountId): DescribeAccountSubscriptionRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccountSubscriptionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAccountSubscriptionRequest] (val x: Self) extends AnyVal {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
  }
}
