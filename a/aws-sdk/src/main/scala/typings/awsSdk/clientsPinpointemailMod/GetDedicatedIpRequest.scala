package typings.awsSdk.clientsPinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDedicatedIpRequest extends StObject {
  
  /**
    * The IP address that you want to obtain more information about. The value you specify has to be a dedicated IP address that's assocaited with your Amazon Pinpoint account.
    */
  var Ip: typings.awsSdk.clientsPinpointemailMod.Ip
}
object GetDedicatedIpRequest {
  
  inline def apply(Ip: Ip): GetDedicatedIpRequest = {
    val __obj = js.Dynamic.literal(Ip = Ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDedicatedIpRequest]
  }
  
  extension [Self <: GetDedicatedIpRequest](x: Self) {
    
    inline def setIp(value: Ip): Self = StObject.set(x, "Ip", value.asInstanceOf[js.Any])
  }
}
