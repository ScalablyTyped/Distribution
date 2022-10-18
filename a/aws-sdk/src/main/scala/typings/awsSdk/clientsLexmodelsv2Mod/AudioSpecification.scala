package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioSpecification extends StObject {
  
  /**
    * Time for which a bot waits after the customer stops speaking to assume the utterance is finished.
    */
  var endTimeoutMs: TimeInMilliSeconds
  
  /**
    * Time for how long Amazon Lex waits before speech input is truncated and the speech is returned to application.
    */
  var maxLengthMs: TimeInMilliSeconds
}
object AudioSpecification {
  
  inline def apply(endTimeoutMs: TimeInMilliSeconds, maxLengthMs: TimeInMilliSeconds): AudioSpecification = {
    val __obj = js.Dynamic.literal(endTimeoutMs = endTimeoutMs.asInstanceOf[js.Any], maxLengthMs = maxLengthMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioSpecification]
  }
  
  extension [Self <: AudioSpecification](x: Self) {
    
    inline def setEndTimeoutMs(value: TimeInMilliSeconds): Self = StObject.set(x, "endTimeoutMs", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthMs(value: TimeInMilliSeconds): Self = StObject.set(x, "maxLengthMs", value.asInstanceOf[js.Any])
  }
}
