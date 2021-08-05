package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoiceConnectorTerminationResponse extends StObject {
  
  /**
    * The termination setting details.
    */
  var Termination: js.UndefOr[typings.awsSdk.chimeMod.Termination] = js.undefined
}
object GetVoiceConnectorTerminationResponse {
  
  inline def apply(): GetVoiceConnectorTerminationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVoiceConnectorTerminationResponse]
  }
  
  extension [Self <: GetVoiceConnectorTerminationResponse](x: Self) {
    
    inline def setTermination(value: Termination): Self = StObject.set(x, "Termination", value.asInstanceOf[js.Any])
    
    inline def setTerminationUndefined: Self = StObject.set(x, "Termination", js.undefined)
  }
}
