package typings.awsSdk.clientsConnectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCampaignStateRequest extends StObject {
  
  var id: CampaignId
}
object GetCampaignStateRequest {
  
  inline def apply(id: CampaignId): GetCampaignStateRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCampaignStateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCampaignStateRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: CampaignId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
