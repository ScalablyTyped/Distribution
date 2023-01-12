package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayInfo extends StObject {
  
  /**
    * The ID of the Amazon EC2 instance that was used to launch the gateway.
    */
  var Ec2InstanceId: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.Ec2InstanceId] = js.undefined
  
  /**
    * The Amazon Web Services Region where the Amazon EC2 instance is located.
    */
  var Ec2InstanceRegion: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.Ec2InstanceRegion] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the gateway. Use the ListGateways operation to return a list of gateways for your account and Amazon Web Services Region.
    */
  var GatewayARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.GatewayARN] = js.undefined
  
  /**
    * The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway Amazon Resource Name (ARN), which you use as input for other operations.
    */
  var GatewayId: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.GatewayId] = js.undefined
  
  /**
    * The name of the gateway.
    */
  var GatewayName: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the gateway. Valid Values: DISABLED | ACTIVE 
    */
  var GatewayOperationalState: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.GatewayOperationalState] = js.undefined
  
  /**
    * The type of the gateway.
    */
  var GatewayType: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.GatewayType] = js.undefined
  
  /**
    * The type of hardware or software platform on which the gateway is running.
    */
  var HostEnvironment: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.HostEnvironment] = js.undefined
  
  /**
    * A unique identifier for the specific instance of the host platform running the gateway. This value is only available for certain host environments, and its format depends on the host environment type.
    */
  var HostEnvironmentId: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.HostEnvironmentId] = js.undefined
}
object GatewayInfo {
  
  inline def apply(): GatewayInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewayInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GatewayInfo] (val x: Self) extends AnyVal {
    
    inline def setEc2InstanceId(value: Ec2InstanceId): Self = StObject.set(x, "Ec2InstanceId", value.asInstanceOf[js.Any])
    
    inline def setEc2InstanceIdUndefined: Self = StObject.set(x, "Ec2InstanceId", js.undefined)
    
    inline def setEc2InstanceRegion(value: Ec2InstanceRegion): Self = StObject.set(x, "Ec2InstanceRegion", value.asInstanceOf[js.Any])
    
    inline def setEc2InstanceRegionUndefined: Self = StObject.set(x, "Ec2InstanceRegion", js.undefined)
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
    
    inline def setGatewayId(value: GatewayId): Self = StObject.set(x, "GatewayId", value.asInstanceOf[js.Any])
    
    inline def setGatewayIdUndefined: Self = StObject.set(x, "GatewayId", js.undefined)
    
    inline def setGatewayName(value: String): Self = StObject.set(x, "GatewayName", value.asInstanceOf[js.Any])
    
    inline def setGatewayNameUndefined: Self = StObject.set(x, "GatewayName", js.undefined)
    
    inline def setGatewayOperationalState(value: GatewayOperationalState): Self = StObject.set(x, "GatewayOperationalState", value.asInstanceOf[js.Any])
    
    inline def setGatewayOperationalStateUndefined: Self = StObject.set(x, "GatewayOperationalState", js.undefined)
    
    inline def setGatewayType(value: GatewayType): Self = StObject.set(x, "GatewayType", value.asInstanceOf[js.Any])
    
    inline def setGatewayTypeUndefined: Self = StObject.set(x, "GatewayType", js.undefined)
    
    inline def setHostEnvironment(value: HostEnvironment): Self = StObject.set(x, "HostEnvironment", value.asInstanceOf[js.Any])
    
    inline def setHostEnvironmentId(value: HostEnvironmentId): Self = StObject.set(x, "HostEnvironmentId", value.asInstanceOf[js.Any])
    
    inline def setHostEnvironmentIdUndefined: Self = StObject.set(x, "HostEnvironmentId", js.undefined)
    
    inline def setHostEnvironmentUndefined: Self = StObject.set(x, "HostEnvironment", js.undefined)
  }
}
