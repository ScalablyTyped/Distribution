package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoiceConnectorTerminationHealthResponse extends StObject {
  
  /**
    * The termination health details.
    */
  var TerminationHealth: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.TerminationHealth] = js.undefined
}
object GetVoiceConnectorTerminationHealthResponse {
  
  inline def apply(): GetVoiceConnectorTerminationHealthResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVoiceConnectorTerminationHealthResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetVoiceConnectorTerminationHealthResponse] (val x: Self) extends AnyVal {
    
    inline def setTerminationHealth(value: TerminationHealth): Self = StObject.set(x, "TerminationHealth", value.asInstanceOf[js.Any])
    
    inline def setTerminationHealthUndefined: Self = StObject.set(x, "TerminationHealth", js.undefined)
  }
}
