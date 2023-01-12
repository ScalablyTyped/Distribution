package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadBalancerTlsCertificateDnsRecordCreationState extends StObject {
  
  /**
    * The status code for the automated DNS record creation. Following are the possible values:    SUCCEEDED - The validation records were successfully added.    STARTED - The automatic DNS record creation has started.    FAILED - The validation record addition failed.  
    */
  var code: js.UndefOr[LoadBalancerTlsCertificateDnsRecordCreationStateCode] = js.undefined
  
  /**
    * The message that describes the reason for the status code.
    */
  var message: js.UndefOr[String] = js.undefined
}
object LoadBalancerTlsCertificateDnsRecordCreationState {
  
  inline def apply(): LoadBalancerTlsCertificateDnsRecordCreationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerTlsCertificateDnsRecordCreationState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoadBalancerTlsCertificateDnsRecordCreationState] (val x: Self) extends AnyVal {
    
    inline def setCode(value: LoadBalancerTlsCertificateDnsRecordCreationStateCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
