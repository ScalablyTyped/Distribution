package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextInputSpecification extends StObject {
  
  /**
    * Time for which a bot waits before re-prompting a customer for text input.
    */
  var startTimeoutMs: TimeInMilliSeconds
}
object TextInputSpecification {
  
  inline def apply(startTimeoutMs: TimeInMilliSeconds): TextInputSpecification = {
    val __obj = js.Dynamic.literal(startTimeoutMs = startTimeoutMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputSpecification]
  }
  
  extension [Self <: TextInputSpecification](x: Self) {
    
    inline def setStartTimeoutMs(value: TimeInMilliSeconds): Self = StObject.set(x, "startTimeoutMs", value.asInstanceOf[js.Any])
  }
}
