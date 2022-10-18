package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoiceConnectorOriginationResponse extends StObject {
  
  /**
    * The origination setting details.
    */
  var Origination: js.UndefOr[typings.awsSdk.clientsChimeMod.Origination] = js.undefined
}
object GetVoiceConnectorOriginationResponse {
  
  inline def apply(): GetVoiceConnectorOriginationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVoiceConnectorOriginationResponse]
  }
  
  extension [Self <: GetVoiceConnectorOriginationResponse](x: Self) {
    
    inline def setOrigination(value: Origination): Self = StObject.set(x, "Origination", value.asInstanceOf[js.Any])
    
    inline def setOriginationUndefined: Self = StObject.set(x, "Origination", js.undefined)
  }
}
