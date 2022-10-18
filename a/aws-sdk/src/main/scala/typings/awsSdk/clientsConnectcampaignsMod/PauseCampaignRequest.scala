package typings.awsSdk.clientsConnectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PauseCampaignRequest extends StObject {
  
  var id: CampaignId
}
object PauseCampaignRequest {
  
  inline def apply(id: CampaignId): PauseCampaignRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PauseCampaignRequest]
  }
  
  extension [Self <: PauseCampaignRequest](x: Self) {
    
    inline def setId(value: CampaignId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
