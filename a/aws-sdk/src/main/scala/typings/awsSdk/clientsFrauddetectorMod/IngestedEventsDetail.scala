package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestedEventsDetail extends StObject {
  
  /**
    * The start and stop time of the ingested events.
    */
  var ingestedEventsTimeWindow: IngestedEventsTimeWindow
}
object IngestedEventsDetail {
  
  inline def apply(ingestedEventsTimeWindow: IngestedEventsTimeWindow): IngestedEventsDetail = {
    val __obj = js.Dynamic.literal(ingestedEventsTimeWindow = ingestedEventsTimeWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestedEventsDetail]
  }
  
  extension [Self <: IngestedEventsDetail](x: Self) {
    
    inline def setIngestedEventsTimeWindow(value: IngestedEventsTimeWindow): Self = StObject.set(x, "ingestedEventsTimeWindow", value.asInstanceOf[js.Any])
  }
}
