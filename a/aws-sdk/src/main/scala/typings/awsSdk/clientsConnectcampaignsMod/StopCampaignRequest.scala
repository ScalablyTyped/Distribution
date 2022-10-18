package typings.awsSdk.clientsConnectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopCampaignRequest extends StObject {
  
  var id: CampaignId
}
object StopCampaignRequest {
  
  inline def apply(id: CampaignId): StopCampaignRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopCampaignRequest]
  }
  
  extension [Self <: StopCampaignRequest](x: Self) {
    
    inline def setId(value: CampaignId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
