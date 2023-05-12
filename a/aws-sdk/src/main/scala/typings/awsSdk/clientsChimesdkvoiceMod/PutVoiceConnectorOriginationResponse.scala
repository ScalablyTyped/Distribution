package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutVoiceConnectorOriginationResponse extends StObject {
  
  /**
    * The updated origination settings.
    */
  var Origination: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.Origination] = js.undefined
}
object PutVoiceConnectorOriginationResponse {
  
  inline def apply(): PutVoiceConnectorOriginationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutVoiceConnectorOriginationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutVoiceConnectorOriginationResponse] (val x: Self) extends AnyVal {
    
    inline def setOrigination(value: Origination): Self = StObject.set(x, "Origination", value.asInstanceOf[js.Any])
    
    inline def setOriginationUndefined: Self = StObject.set(x, "Origination", js.undefined)
  }
}
