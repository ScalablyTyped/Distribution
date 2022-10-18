package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGatewayInformationInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group that you want to use to monitor and log events in the gateway. For more information, see What is Amazon CloudWatch Logs? 
    */
  var CloudWatchLogGroupARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.CloudWatchLogGroupARN] = js.undefined
  
  var GatewayARN: typings.awsSdk.clientsStoragegatewayMod.GatewayARN
  
  /**
    * Specifies the size of the gateway's metadata cache.
    */
  var GatewayCapacity: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.GatewayCapacity] = js.undefined
  
  var GatewayName: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.GatewayName] = js.undefined
  
  /**
    * A value that indicates the time zone of the gateway.
    */
  var GatewayTimezone: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.GatewayTimezone] = js.undefined
}
object UpdateGatewayInformationInput {
  
  inline def apply(GatewayARN: GatewayARN): UpdateGatewayInformationInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGatewayInformationInput]
  }
  
  extension [Self <: UpdateGatewayInformationInput](x: Self) {
    
    inline def setCloudWatchLogGroupARN(value: CloudWatchLogGroupARN): Self = StObject.set(x, "CloudWatchLogGroupARN", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogGroupARNUndefined: Self = StObject.set(x, "CloudWatchLogGroupARN", js.undefined)
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setGatewayCapacity(value: GatewayCapacity): Self = StObject.set(x, "GatewayCapacity", value.asInstanceOf[js.Any])
    
    inline def setGatewayCapacityUndefined: Self = StObject.set(x, "GatewayCapacity", js.undefined)
    
    inline def setGatewayName(value: GatewayName): Self = StObject.set(x, "GatewayName", value.asInstanceOf[js.Any])
    
    inline def setGatewayNameUndefined: Self = StObject.set(x, "GatewayName", js.undefined)
    
    inline def setGatewayTimezone(value: GatewayTimezone): Self = StObject.set(x, "GatewayTimezone", value.asInstanceOf[js.Any])
    
    inline def setGatewayTimezoneUndefined: Self = StObject.set(x, "GatewayTimezone", js.undefined)
  }
}
