package typings.awsSdk.clientsInternetmonitorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkImpairment extends StObject {
  
  /**
    * The combination of the Autonomous System Number (ASN) of the network and the name of the network.
    */
  var AsPath: NetworkList
  
  /**
    * Type of network impairment.
    */
  var NetworkEventType: TriangulationEventType
  
  /**
    * The networks that could be impacted by a network impairment event.
    */
  var Networks: NetworkList
}
object NetworkImpairment {
  
  inline def apply(AsPath: NetworkList, NetworkEventType: TriangulationEventType, Networks: NetworkList): NetworkImpairment = {
    val __obj = js.Dynamic.literal(AsPath = AsPath.asInstanceOf[js.Any], NetworkEventType = NetworkEventType.asInstanceOf[js.Any], Networks = Networks.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkImpairment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkImpairment] (val x: Self) extends AnyVal {
    
    inline def setAsPath(value: NetworkList): Self = StObject.set(x, "AsPath", value.asInstanceOf[js.Any])
    
    inline def setAsPathVarargs(value: Network*): Self = StObject.set(x, "AsPath", js.Array(value*))
    
    inline def setNetworkEventType(value: TriangulationEventType): Self = StObject.set(x, "NetworkEventType", value.asInstanceOf[js.Any])
    
    inline def setNetworks(value: NetworkList): Self = StObject.set(x, "Networks", value.asInstanceOf[js.Any])
    
    inline def setNetworksVarargs(value: Network*): Self = StObject.set(x, "Networks", js.Array(value*))
  }
}
