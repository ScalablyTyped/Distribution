package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioAndDTMFInputSpecification extends StObject {
  
  /**
    * Specifies the settings on audio input.
    */
  var audioSpecification: js.UndefOr[AudioSpecification] = js.undefined
  
  /**
    * Specifies the settings on DTMF input.
    */
  var dtmfSpecification: js.UndefOr[DTMFSpecification] = js.undefined
  
  /**
    * Time for which a bot waits before assuming that the customer isn't going to speak or press a key. This timeout is shared between Audio and DTMF inputs.
    */
  var startTimeoutMs: TimeInMilliSeconds
}
object AudioAndDTMFInputSpecification {
  
  inline def apply(startTimeoutMs: TimeInMilliSeconds): AudioAndDTMFInputSpecification = {
    val __obj = js.Dynamic.literal(startTimeoutMs = startTimeoutMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioAndDTMFInputSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioAndDTMFInputSpecification] (val x: Self) extends AnyVal {
    
    inline def setAudioSpecification(value: AudioSpecification): Self = StObject.set(x, "audioSpecification", value.asInstanceOf[js.Any])
    
    inline def setAudioSpecificationUndefined: Self = StObject.set(x, "audioSpecification", js.undefined)
    
    inline def setDtmfSpecification(value: DTMFSpecification): Self = StObject.set(x, "dtmfSpecification", value.asInstanceOf[js.Any])
    
    inline def setDtmfSpecificationUndefined: Self = StObject.set(x, "dtmfSpecification", js.undefined)
    
    inline def setStartTimeoutMs(value: TimeInMilliSeconds): Self = StObject.set(x, "startTimeoutMs", value.asInstanceOf[js.Any])
  }
}
