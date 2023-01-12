package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeHubResponse extends StObject {
  
  /**
    * Whether to automatically enable new controls when they are added to standards that are enabled. If set to true, then new controls for enabled standards are enabled automatically. If set to false, then new controls are not enabled.
    */
  var AutoEnableControls: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ARN of the Hub resource that was retrieved.
    */
  var HubArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The date and time when Security Hub was enabled in the account.
    */
  var SubscribedAt: js.UndefOr[NonEmptyString] = js.undefined
}
object DescribeHubResponse {
  
  inline def apply(): DescribeHubResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHubResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeHubResponse] (val x: Self) extends AnyVal {
    
    inline def setAutoEnableControls(value: Boolean): Self = StObject.set(x, "AutoEnableControls", value.asInstanceOf[js.Any])
    
    inline def setAutoEnableControlsUndefined: Self = StObject.set(x, "AutoEnableControls", js.undefined)
    
    inline def setHubArn(value: NonEmptyString): Self = StObject.set(x, "HubArn", value.asInstanceOf[js.Any])
    
    inline def setHubArnUndefined: Self = StObject.set(x, "HubArn", js.undefined)
    
    inline def setSubscribedAt(value: NonEmptyString): Self = StObject.set(x, "SubscribedAt", value.asInstanceOf[js.Any])
    
    inline def setSubscribedAtUndefined: Self = StObject.set(x, "SubscribedAt", js.undefined)
  }
}
