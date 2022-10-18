package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNetworkProfileRequest extends StObject {
  
  /**
    * The description of the network profile.
    */
  var description: js.UndefOr[Message] = js.undefined
  
  /**
    * The data throughput rate in bits per second, as an integer from 0 to 104857600.
    */
  var downlinkBandwidthBits: js.UndefOr[Long] = js.undefined
  
  /**
    * Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
    */
  var downlinkDelayMs: js.UndefOr[Long] = js.undefined
  
  /**
    * Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
    */
  var downlinkJitterMs: js.UndefOr[Long] = js.undefined
  
  /**
    * Proportion of received packets that fail to arrive from 0 to 100 percent.
    */
  var downlinkLossPercent: js.UndefOr[PercentInteger] = js.undefined
  
  /**
    * The name for the new network profile.
    */
  var name: Name
  
  /**
    * The Amazon Resource Name (ARN) of the project for which you want to create a network profile.
    */
  var projectArn: AmazonResourceName
  
  /**
    * The type of network profile to create. Valid values are listed here.
    */
  var `type`: js.UndefOr[NetworkProfileType] = js.undefined
  
  /**
    * The data throughput rate in bits per second, as an integer from 0 to 104857600.
    */
  var uplinkBandwidthBits: js.UndefOr[Long] = js.undefined
  
  /**
    * Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
    */
  var uplinkDelayMs: js.UndefOr[Long] = js.undefined
  
  /**
    * Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
    */
  var uplinkJitterMs: js.UndefOr[Long] = js.undefined
  
  /**
    * Proportion of transmitted packets that fail to arrive from 0 to 100 percent.
    */
  var uplinkLossPercent: js.UndefOr[PercentInteger] = js.undefined
}
object CreateNetworkProfileRequest {
  
  inline def apply(name: Name, projectArn: AmazonResourceName): CreateNetworkProfileRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], projectArn = projectArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNetworkProfileRequest]
  }
  
  extension [Self <: CreateNetworkProfileRequest](x: Self) {
    
    inline def setDescription(value: Message): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDownlinkBandwidthBits(value: Long): Self = StObject.set(x, "downlinkBandwidthBits", value.asInstanceOf[js.Any])
    
    inline def setDownlinkBandwidthBitsUndefined: Self = StObject.set(x, "downlinkBandwidthBits", js.undefined)
    
    inline def setDownlinkDelayMs(value: Long): Self = StObject.set(x, "downlinkDelayMs", value.asInstanceOf[js.Any])
    
    inline def setDownlinkDelayMsUndefined: Self = StObject.set(x, "downlinkDelayMs", js.undefined)
    
    inline def setDownlinkJitterMs(value: Long): Self = StObject.set(x, "downlinkJitterMs", value.asInstanceOf[js.Any])
    
    inline def setDownlinkJitterMsUndefined: Self = StObject.set(x, "downlinkJitterMs", js.undefined)
    
    inline def setDownlinkLossPercent(value: PercentInteger): Self = StObject.set(x, "downlinkLossPercent", value.asInstanceOf[js.Any])
    
    inline def setDownlinkLossPercentUndefined: Self = StObject.set(x, "downlinkLossPercent", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProjectArn(value: AmazonResourceName): Self = StObject.set(x, "projectArn", value.asInstanceOf[js.Any])
    
    inline def setType(value: NetworkProfileType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUplinkBandwidthBits(value: Long): Self = StObject.set(x, "uplinkBandwidthBits", value.asInstanceOf[js.Any])
    
    inline def setUplinkBandwidthBitsUndefined: Self = StObject.set(x, "uplinkBandwidthBits", js.undefined)
    
    inline def setUplinkDelayMs(value: Long): Self = StObject.set(x, "uplinkDelayMs", value.asInstanceOf[js.Any])
    
    inline def setUplinkDelayMsUndefined: Self = StObject.set(x, "uplinkDelayMs", js.undefined)
    
    inline def setUplinkJitterMs(value: Long): Self = StObject.set(x, "uplinkJitterMs", value.asInstanceOf[js.Any])
    
    inline def setUplinkJitterMsUndefined: Self = StObject.set(x, "uplinkJitterMs", js.undefined)
    
    inline def setUplinkLossPercent(value: PercentInteger): Self = StObject.set(x, "uplinkLossPercent", value.asInstanceOf[js.Any])
    
    inline def setUplinkLossPercentUndefined: Self = StObject.set(x, "uplinkLossPercent", js.undefined)
  }
}
