package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoiceConnectorTerminationResponse extends StObject {
  
  /**
    * The termination setting details.
    */
  var Termination: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.Termination] = js.undefined
}
object GetVoiceConnectorTerminationResponse {
  
  inline def apply(): GetVoiceConnectorTerminationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVoiceConnectorTerminationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetVoiceConnectorTerminationResponse] (val x: Self) extends AnyVal {
    
    inline def setTermination(value: Termination): Self = StObject.set(x, "Termination", value.asInstanceOf[js.Any])
    
    inline def setTerminationUndefined: Self = StObject.set(x, "Termination", js.undefined)
  }
}
