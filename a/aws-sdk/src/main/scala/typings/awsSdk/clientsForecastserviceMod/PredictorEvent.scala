package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredictorEvent extends StObject {
  
  /**
    * The timestamp for when the event occurred.
    */
  var Datetime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The type of event. For example, Retrain. A retraining event denotes the timepoint when a predictor was retrained. Any monitor results from before the Datetime are from the previous predictor. Any new metrics are for the newly retrained predictor.
    */
  var Detail: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Detail] = js.undefined
}
object PredictorEvent {
  
  inline def apply(): PredictorEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PredictorEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PredictorEvent] (val x: Self) extends AnyVal {
    
    inline def setDatetime(value: js.Date): Self = StObject.set(x, "Datetime", value.asInstanceOf[js.Any])
    
    inline def setDatetimeUndefined: Self = StObject.set(x, "Datetime", js.undefined)
    
    inline def setDetail(value: Detail): Self = StObject.set(x, "Detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "Detail", js.undefined)
  }
}
