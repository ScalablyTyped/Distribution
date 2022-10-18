package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrokerNodeInfo extends StObject {
  
  /**
    * 
    The attached elastic network interface of the broker.
    
    */
  var AttachedENIId: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The ID of the broker.
    
    */
  var BrokerId: js.UndefOr[double] = js.undefined
  
  /**
    * 
    The client subnet to which this broker node belongs.
    
    */
  var ClientSubnet: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The virtual private cloud (VPC) of the client.
    
    */
  var ClientVpcIpAddress: js.UndefOr[string] = js.undefined
  
  /**
    * 
    Information about the version of software currently deployed on the Apache Kafka brokers in the cluster.
    
    */
  var CurrentBrokerSoftwareInfo: js.UndefOr[BrokerSoftwareInfo] = js.undefined
  
  /**
    * 
    Endpoints for accessing the broker.
    
    */
  var Endpoints: js.UndefOr[listOfString] = js.undefined
}
object BrokerNodeInfo {
  
  inline def apply(): BrokerNodeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerNodeInfo]
  }
  
  extension [Self <: BrokerNodeInfo](x: Self) {
    
    inline def setAttachedENIId(value: string): Self = StObject.set(x, "AttachedENIId", value.asInstanceOf[js.Any])
    
    inline def setAttachedENIIdUndefined: Self = StObject.set(x, "AttachedENIId", js.undefined)
    
    inline def setBrokerId(value: double): Self = StObject.set(x, "BrokerId", value.asInstanceOf[js.Any])
    
    inline def setBrokerIdUndefined: Self = StObject.set(x, "BrokerId", js.undefined)
    
    inline def setClientSubnet(value: string): Self = StObject.set(x, "ClientSubnet", value.asInstanceOf[js.Any])
    
    inline def setClientSubnetUndefined: Self = StObject.set(x, "ClientSubnet", js.undefined)
    
    inline def setClientVpcIpAddress(value: string): Self = StObject.set(x, "ClientVpcIpAddress", value.asInstanceOf[js.Any])
    
    inline def setClientVpcIpAddressUndefined: Self = StObject.set(x, "ClientVpcIpAddress", js.undefined)
    
    inline def setCurrentBrokerSoftwareInfo(value: BrokerSoftwareInfo): Self = StObject.set(x, "CurrentBrokerSoftwareInfo", value.asInstanceOf[js.Any])
    
    inline def setCurrentBrokerSoftwareInfoUndefined: Self = StObject.set(x, "CurrentBrokerSoftwareInfo", js.undefined)
    
    inline def setEndpoints(value: listOfString): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsUndefined: Self = StObject.set(x, "Endpoints", js.undefined)
    
    inline def setEndpointsVarargs(value: string*): Self = StObject.set(x, "Endpoints", js.Array(value*))
  }
}
