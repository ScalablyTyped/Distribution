package typings.awsSdk.clientsConnectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Campaign extends StObject {
  
  var arn: CampaignArn
  
  var connectInstanceId: InstanceId
  
  var dialerConfig: DialerConfig
  
  var id: CampaignId
  
  var name: CampaignName
  
  var outboundCallConfig: OutboundCallConfig
  
  var tags: js.UndefOr[TagMap] = js.undefined
}
object Campaign {
  
  inline def apply(
    arn: CampaignArn,
    connectInstanceId: InstanceId,
    dialerConfig: DialerConfig,
    id: CampaignId,
    name: CampaignName,
    outboundCallConfig: OutboundCallConfig
  ): Campaign = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], connectInstanceId = connectInstanceId.asInstanceOf[js.Any], dialerConfig = dialerConfig.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outboundCallConfig = outboundCallConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Campaign]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Campaign] (val x: Self) extends AnyVal {
    
    inline def setArn(value: CampaignArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setConnectInstanceId(value: InstanceId): Self = StObject.set(x, "connectInstanceId", value.asInstanceOf[js.Any])
    
    inline def setDialerConfig(value: DialerConfig): Self = StObject.set(x, "dialerConfig", value.asInstanceOf[js.Any])
    
    inline def setId(value: CampaignId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: CampaignName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOutboundCallConfig(value: OutboundCallConfig): Self = StObject.set(x, "outboundCallConfig", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
