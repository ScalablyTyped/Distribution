package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeConfiguration extends StObject {
  
  /**
    * The Availability Zone in which the node exists. Required for Ethereum nodes. 
    */
  var AvailabilityZone: js.UndefOr[AvailabilityZoneString] = js.undefined
  
  /**
    * The Amazon Managed Blockchain instance type for the node.
    */
  var InstanceType: InstanceTypeString
  
  /**
    * Configuration properties for logging events associated with a peer node on a Hyperledger Fabric network on Managed Blockchain. 
    */
  var LogPublishingConfiguration: js.UndefOr[NodeLogPublishingConfiguration] = js.undefined
  
  /**
    * The state database that the node uses. Values are LevelDB or CouchDB. When using an Amazon Managed Blockchain network with Hyperledger Fabric version 1.4 or later, the default is CouchDB. Applies only to Hyperledger Fabric.
    */
  var StateDB: js.UndefOr[StateDBType] = js.undefined
}
object NodeConfiguration {
  
  inline def apply(InstanceType: InstanceTypeString): NodeConfiguration = {
    val __obj = js.Dynamic.literal(InstanceType = InstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeConfiguration]
  }
  
  extension [Self <: NodeConfiguration](x: Self) {
    
    inline def setAvailabilityZone(value: AvailabilityZoneString): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setInstanceType(value: InstanceTypeString): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setLogPublishingConfiguration(value: NodeLogPublishingConfiguration): Self = StObject.set(x, "LogPublishingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLogPublishingConfigurationUndefined: Self = StObject.set(x, "LogPublishingConfiguration", js.undefined)
    
    inline def setStateDB(value: StateDBType): Self = StObject.set(x, "StateDB", value.asInstanceOf[js.Any])
    
    inline def setStateDBUndefined: Self = StObject.set(x, "StateDB", js.undefined)
  }
}
