package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkReachabilityDetails extends StObject {
  
  /**
    * An object that contains details about a network path associated with a finding.
    */
  var networkPath: NetworkPath
  
  /**
    * An object that contains details about the open port range associated with a finding.
    */
  var openPortRange: PortRange
  
  /**
    * The protocol associated with a finding.
    */
  var protocol: NetworkProtocol
}
object NetworkReachabilityDetails {
  
  inline def apply(networkPath: NetworkPath, openPortRange: PortRange, protocol: NetworkProtocol): NetworkReachabilityDetails = {
    val __obj = js.Dynamic.literal(networkPath = networkPath.asInstanceOf[js.Any], openPortRange = openPortRange.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkReachabilityDetails]
  }
  
  extension [Self <: NetworkReachabilityDetails](x: Self) {
    
    inline def setNetworkPath(value: NetworkPath): Self = StObject.set(x, "networkPath", value.asInstanceOf[js.Any])
    
    inline def setOpenPortRange(value: PortRange): Self = StObject.set(x, "openPortRange", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: NetworkProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}
