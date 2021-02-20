package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVoiceConnectorTerminationHealthResponse extends StObject {
  
  /**
    * The termination health details.
    */
  var TerminationHealth: js.UndefOr[typings.awsSdk.chimeMod.TerminationHealth] = js.native
}
object GetVoiceConnectorTerminationHealthResponse {
  
  @scala.inline
  def apply(): GetVoiceConnectorTerminationHealthResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVoiceConnectorTerminationHealthResponse]
  }
  
  @scala.inline
  implicit class GetVoiceConnectorTerminationHealthResponseMutableBuilder[Self <: GetVoiceConnectorTerminationHealthResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTerminationHealth(value: TerminationHealth): Self = StObject.set(x, "TerminationHealth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminationHealthUndefined: Self = StObject.set(x, "TerminationHealth", js.undefined)
  }
}
