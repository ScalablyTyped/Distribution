package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVoiceConnectorGroupResponse extends StObject {
  
  /**
    * The details of the Voice Connector group.
    */
  var VoiceConnectorGroup: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.VoiceConnectorGroup] = js.undefined
}
object CreateVoiceConnectorGroupResponse {
  
  inline def apply(): CreateVoiceConnectorGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVoiceConnectorGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVoiceConnectorGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setVoiceConnectorGroup(value: VoiceConnectorGroup): Self = StObject.set(x, "VoiceConnectorGroup", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorGroupUndefined: Self = StObject.set(x, "VoiceConnectorGroup", js.undefined)
  }
}
