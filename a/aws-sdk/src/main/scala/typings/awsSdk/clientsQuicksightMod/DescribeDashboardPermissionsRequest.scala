package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDashboardPermissionsRequest extends StObject {
  
  /**
    * The ID of the Amazon Web Services account that contains the dashboard that you're describing permissions for.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The ID for the dashboard, also added to the IAM policy.
    */
  var DashboardId: ShortRestrictiveResourceId
}
object DescribeDashboardPermissionsRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, DashboardId: ShortRestrictiveResourceId): DescribeDashboardPermissionsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DashboardId = DashboardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDashboardPermissionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDashboardPermissionsRequest] (val x: Self) extends AnyVal {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setDashboardId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "DashboardId", value.asInstanceOf[js.Any])
  }
}
