package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DnsRecordCreationState extends StObject {
  
  /**
    * The status code for the automated DNS record creation. Following are the possible values:    SUCCEEDED - The validation records were successfully added to the domain.    STARTED - The automatic DNS record creation has started.    FAILED - The validation records failed to be added to the domain.  
    */
  var code: js.UndefOr[DnsRecordCreationStateCode] = js.undefined
  
  /**
    * The message that describes the reason for the status code.
    */
  var message: js.UndefOr[String] = js.undefined
}
object DnsRecordCreationState {
  
  inline def apply(): DnsRecordCreationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnsRecordCreationState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DnsRecordCreationState] (val x: Self) extends AnyVal {
    
    inline def setCode(value: DnsRecordCreationStateCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
