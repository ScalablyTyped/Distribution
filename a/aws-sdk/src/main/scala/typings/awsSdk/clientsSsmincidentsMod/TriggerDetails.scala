package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerDetails extends StObject {
  
  /**
    * Raw data passed from either Amazon EventBridge, Amazon CloudWatch, or Incident Manager when an incident is created.
    */
  var rawData: js.UndefOr[RawData] = js.undefined
  
  /**
    * Identifies the service that sourced the event. All events sourced from within Amazon Web Services begin with "aws." Customer-generated events can have any value here, as long as it doesn't begin with "aws." We recommend the use of Java package-name style reverse domain-name strings. 
    */
  var source: IncidentSource
  
  /**
    * The time that the incident was detected.
    */
  var timestamp: js.Date
  
  /**
    * The Amazon Resource Name (ARN) of the source that detected the incident.
    */
  var triggerArn: js.UndefOr[Arn] = js.undefined
}
object TriggerDetails {
  
  inline def apply(source: IncidentSource, timestamp: js.Date): TriggerDetails = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TriggerDetails] (val x: Self) extends AnyVal {
    
    inline def setRawData(value: RawData): Self = StObject.set(x, "rawData", value.asInstanceOf[js.Any])
    
    inline def setRawDataUndefined: Self = StObject.set(x, "rawData", js.undefined)
    
    inline def setSource(value: IncidentSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTriggerArn(value: Arn): Self = StObject.set(x, "triggerArn", value.asInstanceOf[js.Any])
    
    inline def setTriggerArnUndefined: Self = StObject.set(x, "triggerArn", js.undefined)
  }
}
