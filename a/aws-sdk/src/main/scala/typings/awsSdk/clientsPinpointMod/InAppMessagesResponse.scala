package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InAppMessagesResponse extends StObject {
  
  /**
    * List of targeted in-app message campaigns.
    */
  var InAppMessageCampaigns: js.UndefOr[ListOfInAppMessageCampaign] = js.undefined
}
object InAppMessagesResponse {
  
  inline def apply(): InAppMessagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InAppMessagesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InAppMessagesResponse] (val x: Self) extends AnyVal {
    
    inline def setInAppMessageCampaigns(value: ListOfInAppMessageCampaign): Self = StObject.set(x, "InAppMessageCampaigns", value.asInstanceOf[js.Any])
    
    inline def setInAppMessageCampaignsUndefined: Self = StObject.set(x, "InAppMessageCampaigns", js.undefined)
    
    inline def setInAppMessageCampaignsVarargs(value: InAppMessageCampaign*): Self = StObject.set(x, "InAppMessageCampaigns", js.Array(value*))
  }
}
