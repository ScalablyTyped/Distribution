package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutDedicatedIpInPoolRequest extends StObject {
  
  /**
    * The name of the IP pool that you want to add the dedicated IP address to. You have to specify an IP pool that already exists.
    */
  var DestinationPoolName: PoolName
  
  /**
    * The IP address that you want to move to the dedicated IP pool. The value you specify has to be a dedicated IP address that's associated with your Amazon Web Services account.
    */
  var Ip: typings.awsSdk.clientsSesv2Mod.Ip
}
object PutDedicatedIpInPoolRequest {
  
  inline def apply(DestinationPoolName: PoolName, Ip: Ip): PutDedicatedIpInPoolRequest = {
    val __obj = js.Dynamic.literal(DestinationPoolName = DestinationPoolName.asInstanceOf[js.Any], Ip = Ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDedicatedIpInPoolRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutDedicatedIpInPoolRequest] (val x: Self) extends AnyVal {
    
    inline def setDestinationPoolName(value: PoolName): Self = StObject.set(x, "DestinationPoolName", value.asInstanceOf[js.Any])
    
    inline def setIp(value: Ip): Self = StObject.set(x, "Ip", value.asInstanceOf[js.Any])
  }
}
