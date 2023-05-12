package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAvailableVoiceConnectorRegionsResponse extends StObject {
  
  /**
    * The list of AWS Regions.
    */
  var VoiceConnectorRegions: js.UndefOr[VoiceConnectorAwsRegionList] = js.undefined
}
object ListAvailableVoiceConnectorRegionsResponse {
  
  inline def apply(): ListAvailableVoiceConnectorRegionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAvailableVoiceConnectorRegionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAvailableVoiceConnectorRegionsResponse] (val x: Self) extends AnyVal {
    
    inline def setVoiceConnectorRegions(value: VoiceConnectorAwsRegionList): Self = StObject.set(x, "VoiceConnectorRegions", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorRegionsUndefined: Self = StObject.set(x, "VoiceConnectorRegions", js.undefined)
    
    inline def setVoiceConnectorRegionsVarargs(value: VoiceConnectorAwsRegion*): Self = StObject.set(x, "VoiceConnectorRegions", js.Array(value*))
  }
}
