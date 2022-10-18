package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HdfsNameNode extends StObject {
  
  /**
    * The hostname of the NameNode in the HDFS cluster. This value is the IP address or Domain Name Service (DNS) name of the NameNode. An agent that's installed on-premises uses this hostname to communicate with the NameNode in the network.
    */
  var Hostname: HdfsServerHostname
  
  /**
    * The port that the NameNode uses to listen to client requests.
    */
  var Port: HdfsServerPort
}
object HdfsNameNode {
  
  inline def apply(Hostname: HdfsServerHostname, Port: HdfsServerPort): HdfsNameNode = {
    val __obj = js.Dynamic.literal(Hostname = Hostname.asInstanceOf[js.Any], Port = Port.asInstanceOf[js.Any])
    __obj.asInstanceOf[HdfsNameNode]
  }
  
  extension [Self <: HdfsNameNode](x: Self) {
    
    inline def setHostname(value: HdfsServerHostname): Self = StObject.set(x, "Hostname", value.asInstanceOf[js.Any])
    
    inline def setPort(value: HdfsServerPort): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
  }
}
