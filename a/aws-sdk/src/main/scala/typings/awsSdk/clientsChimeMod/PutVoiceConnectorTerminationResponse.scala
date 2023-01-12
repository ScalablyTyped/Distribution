package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutVoiceConnectorTerminationResponse extends StObject {
  
  /**
    * The updated termination setting details.
    */
  var Termination: js.UndefOr[typings.awsSdk.clientsChimeMod.Termination] = js.undefined
}
object PutVoiceConnectorTerminationResponse {
  
  inline def apply(): PutVoiceConnectorTerminationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutVoiceConnectorTerminationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutVoiceConnectorTerminationResponse] (val x: Self) extends AnyVal {
    
    inline def setTermination(value: Termination): Self = StObject.set(x, "Termination", value.asInstanceOf[js.Any])
    
    inline def setTerminationUndefined: Self = StObject.set(x, "Termination", js.undefined)
  }
}
