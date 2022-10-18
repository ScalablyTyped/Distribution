package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeFabricLogPublishingConfiguration extends StObject {
  
  /**
    * Configuration properties for logging events associated with chaincode execution on a peer node. Chaincode logs contain the results of instantiating, invoking, and querying the chaincode. A peer can run multiple instances of chaincode. When enabled, a log stream is created for all chaincodes, with an individual log stream for each chaincode.
    */
  var ChaincodeLogs: js.UndefOr[LogConfigurations] = js.undefined
  
  /**
    * Configuration properties for a peer node log. Peer node logs contain messages generated when your client submits transaction proposals to peer nodes, requests to join channels, enrolls an admin peer, and lists the chaincode instances on a peer node. 
    */
  var PeerLogs: js.UndefOr[LogConfigurations] = js.undefined
}
object NodeFabricLogPublishingConfiguration {
  
  inline def apply(): NodeFabricLogPublishingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeFabricLogPublishingConfiguration]
  }
  
  extension [Self <: NodeFabricLogPublishingConfiguration](x: Self) {
    
    inline def setChaincodeLogs(value: LogConfigurations): Self = StObject.set(x, "ChaincodeLogs", value.asInstanceOf[js.Any])
    
    inline def setChaincodeLogsUndefined: Self = StObject.set(x, "ChaincodeLogs", js.undefined)
    
    inline def setPeerLogs(value: LogConfigurations): Self = StObject.set(x, "PeerLogs", value.asInstanceOf[js.Any])
    
    inline def setPeerLogsUndefined: Self = StObject.set(x, "PeerLogs", js.undefined)
  }
}
