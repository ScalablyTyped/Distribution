package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVoiceConnectorTerminationResponse extends StObject {
  
  /**
    * The termination setting details.
    */
  var Termination: js.UndefOr[typings.awsSdk.chimeMod.Termination] = js.native
}
object GetVoiceConnectorTerminationResponse {
  
  @scala.inline
  def apply(): GetVoiceConnectorTerminationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVoiceConnectorTerminationResponse]
  }
  
  @scala.inline
  implicit class GetVoiceConnectorTerminationResponseMutableBuilder[Self <: GetVoiceConnectorTerminationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTermination(value: Termination): Self = StObject.set(x, "Termination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminationUndefined: Self = StObject.set(x, "Termination", js.undefined)
  }
}
