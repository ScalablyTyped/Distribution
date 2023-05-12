package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpamDiscoveryFailureReason extends StObject {
  
  /**
    * The discovery failure code.    assume-role-failure - IPAM could not assume the Amazon Web Services IAM service-linked role. This could be because of any of the following:   SLR has not been created yet and IPAM is still creating it.   You have opted-out of the IPAM home Region.   Account you are using as your IPAM account has been suspended.      throttling-failure - IPAM account is already using the allotted transactions per second and IPAM is receiving a throttling error when assuming the Amazon Web Services IAM SLR.    unauthorized-failure - Amazon Web Services account making the request is not authorized. For more information, see AuthFailure in the Amazon Elastic Compute Cloud API Reference.  
    */
  var Code: js.UndefOr[IpamDiscoveryFailureCode] = js.undefined
  
  /**
    * The discovery failure message.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object IpamDiscoveryFailureReason {
  
  inline def apply(): IpamDiscoveryFailureReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpamDiscoveryFailureReason]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IpamDiscoveryFailureReason] (val x: Self) extends AnyVal {
    
    inline def setCode(value: IpamDiscoveryFailureCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
