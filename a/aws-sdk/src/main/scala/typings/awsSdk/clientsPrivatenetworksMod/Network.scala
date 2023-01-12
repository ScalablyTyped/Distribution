package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Network extends StObject {
  
  /**
    * The creation time of the network.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the network.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the network.
    */
  var networkArn: Arn
  
  /**
    * The name of the network.
    */
  var networkName: Name
  
  /**
    * The status of the network.
    */
  var status: NetworkStatus
  
  /**
    * The status reason of the network.
    */
  var statusReason: js.UndefOr[String] = js.undefined
}
object Network {
  
  inline def apply(networkArn: Arn, networkName: Name, status: NetworkStatus): Network = {
    val __obj = js.Dynamic.literal(networkArn = networkArn.asInstanceOf[js.Any], networkName = networkName.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Network]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Network] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setNetworkArn(value: Arn): Self = StObject.set(x, "networkArn", value.asInstanceOf[js.Any])
    
    inline def setNetworkName(value: Name): Self = StObject.set(x, "networkName", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: NetworkStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: String): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
  }
}
