package typings.awsSdk.clientsCodeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnomalyInstance extends StObject {
  
  /**
    *  The end time of the period during which the metric is flagged as anomalous. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var endTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The universally unique identifier (UUID) of an instance of an anomaly in a metric. 
    */
  var id: String
  
  /**
    *  The start time of the period during which the metric is flagged as anomalous. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var startTime: js.Date
  
  /**
    * Feedback type on a specific instance of anomaly submitted by the user.
    */
  var userFeedback: js.UndefOr[UserFeedback] = js.undefined
}
object AnomalyInstance {
  
  inline def apply(id: String, startTime: js.Date): AnomalyInstance = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnomalyInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnomalyInstance] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setUserFeedback(value: UserFeedback): Self = StObject.set(x, "userFeedback", value.asInstanceOf[js.Any])
    
    inline def setUserFeedbackUndefined: Self = StObject.set(x, "userFeedback", js.undefined)
  }
}
