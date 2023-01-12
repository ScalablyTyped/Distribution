package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricFilterMatchRecord extends StObject {
  
  /**
    * The raw event data.
    */
  var eventMessage: js.UndefOr[EventMessage] = js.undefined
  
  /**
    * The event number.
    */
  var eventNumber: js.UndefOr[EventNumber] = js.undefined
  
  /**
    * The values extracted from the event data by the filter.
    */
  var extractedValues: js.UndefOr[ExtractedValues] = js.undefined
}
object MetricFilterMatchRecord {
  
  inline def apply(): MetricFilterMatchRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricFilterMatchRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricFilterMatchRecord] (val x: Self) extends AnyVal {
    
    inline def setEventMessage(value: EventMessage): Self = StObject.set(x, "eventMessage", value.asInstanceOf[js.Any])
    
    inline def setEventMessageUndefined: Self = StObject.set(x, "eventMessage", js.undefined)
    
    inline def setEventNumber(value: EventNumber): Self = StObject.set(x, "eventNumber", value.asInstanceOf[js.Any])
    
    inline def setEventNumberUndefined: Self = StObject.set(x, "eventNumber", js.undefined)
    
    inline def setExtractedValues(value: ExtractedValues): Self = StObject.set(x, "extractedValues", value.asInstanceOf[js.Any])
    
    inline def setExtractedValuesUndefined: Self = StObject.set(x, "extractedValues", js.undefined)
  }
}
