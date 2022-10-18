package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpamPoolCidrFailureReason extends StObject {
  
  /**
    * An error code related to why an IPAM pool CIDR failed to be provisioned.
    */
  var Code: js.UndefOr[IpamPoolCidrFailureCode] = js.undefined
  
  /**
    * A message related to why an IPAM pool CIDR failed to be provisioned.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object IpamPoolCidrFailureReason {
  
  inline def apply(): IpamPoolCidrFailureReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpamPoolCidrFailureReason]
  }
  
  extension [Self <: IpamPoolCidrFailureReason](x: Self) {
    
    inline def setCode(value: IpamPoolCidrFailureCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
