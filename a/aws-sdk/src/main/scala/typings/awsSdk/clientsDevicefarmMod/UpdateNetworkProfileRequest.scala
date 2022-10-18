package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateNetworkProfileRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the project for which you want to update network profile settings.
    */
  var arn: AmazonResourceName
  
  /**
    * The description of the network profile about which you are returning information.
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
    * The name of the network profile about which you are returning information.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * The type of network profile to return information about. Valid values are listed here.
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
object UpdateNetworkProfileRequest {
  
  inline def apply(arn: AmazonResourceName): UpdateNetworkProfileRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNetworkProfileRequest]
  }
  
  extension [Self <: UpdateNetworkProfileRequest](x: Self) {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
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
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
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
