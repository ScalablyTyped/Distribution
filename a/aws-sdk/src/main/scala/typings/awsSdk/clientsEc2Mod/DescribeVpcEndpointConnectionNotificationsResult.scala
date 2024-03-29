package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVpcEndpointConnectionNotificationsResult extends StObject {
  
  /**
    * The notifications.
    */
  var ConnectionNotificationSet: js.UndefOr[typings.awsSdk.clientsEc2Mod.ConnectionNotificationSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeVpcEndpointConnectionNotificationsResult {
  
  inline def apply(): DescribeVpcEndpointConnectionNotificationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcEndpointConnectionNotificationsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeVpcEndpointConnectionNotificationsResult] (val x: Self) extends AnyVal {
    
    inline def setConnectionNotificationSet(value: ConnectionNotificationSet): Self = StObject.set(x, "ConnectionNotificationSet", value.asInstanceOf[js.Any])
    
    inline def setConnectionNotificationSetUndefined: Self = StObject.set(x, "ConnectionNotificationSet", js.undefined)
    
    inline def setConnectionNotificationSetVarargs(value: ConnectionNotification*): Self = StObject.set(x, "ConnectionNotificationSet", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
