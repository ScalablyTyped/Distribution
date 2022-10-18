package typings.awsSdk.clientsConnectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CampaignSummary extends StObject {
  
  var arn: CampaignArn
  
  var connectInstanceId: InstanceId
  
  var id: CampaignId
  
  var name: CampaignName
}
object CampaignSummary {
  
  inline def apply(arn: CampaignArn, connectInstanceId: InstanceId, id: CampaignId, name: CampaignName): CampaignSummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], connectInstanceId = connectInstanceId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CampaignSummary]
  }
  
  extension [Self <: CampaignSummary](x: Self) {
    
    inline def setArn(value: CampaignArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setConnectInstanceId(value: InstanceId): Self = StObject.set(x, "connectInstanceId", value.asInstanceOf[js.Any])
    
    inline def setId(value: CampaignId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: CampaignName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
