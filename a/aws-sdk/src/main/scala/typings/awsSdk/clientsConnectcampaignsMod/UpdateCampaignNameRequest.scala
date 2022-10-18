package typings.awsSdk.clientsConnectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCampaignNameRequest extends StObject {
  
  var id: CampaignId
  
  var name: CampaignName
}
object UpdateCampaignNameRequest {
  
  inline def apply(id: CampaignId, name: CampaignName): UpdateCampaignNameRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCampaignNameRequest]
  }
  
  extension [Self <: UpdateCampaignNameRequest](x: Self) {
    
    inline def setId(value: CampaignId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: CampaignName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
