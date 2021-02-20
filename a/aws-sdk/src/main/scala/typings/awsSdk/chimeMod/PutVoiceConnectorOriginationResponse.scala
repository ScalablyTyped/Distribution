package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutVoiceConnectorOriginationResponse extends StObject {
  
  /**
    * The updated origination setting details.
    */
  var Origination: js.UndefOr[typings.awsSdk.chimeMod.Origination] = js.native
}
object PutVoiceConnectorOriginationResponse {
  
  @scala.inline
  def apply(): PutVoiceConnectorOriginationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutVoiceConnectorOriginationResponse]
  }
  
  @scala.inline
  implicit class PutVoiceConnectorOriginationResponseMutableBuilder[Self <: PutVoiceConnectorOriginationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrigination(value: Origination): Self = StObject.set(x, "Origination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginationUndefined: Self = StObject.set(x, "Origination", js.undefined)
  }
}
