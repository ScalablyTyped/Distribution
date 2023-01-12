package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventType extends StObject {
  
  /**
    * The entity type ARN.
    */
  var arn: js.UndefOr[fraudDetectorArn] = js.undefined
  
  /**
    * Timestamp of when the event type was created.
    */
  var createdTime: js.UndefOr[time] = js.undefined
  
  /**
    * The event type description.
    */
  var description: js.UndefOr[typings.awsSdk.clientsFrauddetectorMod.description] = js.undefined
  
  /**
    * The event type entity types.
    */
  var entityTypes: js.UndefOr[NonEmptyListOfStrings] = js.undefined
  
  /**
    * If Enabled, Amazon Fraud Detector stores event data when you generate a prediction and uses that data to update calculated variables in near real-time. Amazon Fraud Detector uses this data, known as INGESTED_EVENTS, to train your model and improve fraud predictions.
    */
  var eventIngestion: js.UndefOr[EventIngestion] = js.undefined
  
  /**
    * The event type event variables.
    */
  var eventVariables: js.UndefOr[ListOfStrings] = js.undefined
  
  /**
    * Data about the stored events.
    */
  var ingestedEventStatistics: js.UndefOr[IngestedEventStatistics] = js.undefined
  
  /**
    * The event type labels.
    */
  var labels: js.UndefOr[ListOfStrings] = js.undefined
  
  /**
    * Timestamp of when the event type was last updated.
    */
  var lastUpdatedTime: js.UndefOr[time] = js.undefined
  
  /**
    * The event type name.
    */
  var name: js.UndefOr[String] = js.undefined
}
object EventType {
  
  inline def apply(): EventType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventType] (val x: Self) extends AnyVal {
    
    inline def setArn(value: fraudDetectorArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedTime(value: time): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "createdTime", js.undefined)
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEntityTypes(value: NonEmptyListOfStrings): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    inline def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    inline def setEntityTypesVarargs(value: String*): Self = StObject.set(x, "entityTypes", js.Array(value*))
    
    inline def setEventIngestion(value: EventIngestion): Self = StObject.set(x, "eventIngestion", value.asInstanceOf[js.Any])
    
    inline def setEventIngestionUndefined: Self = StObject.set(x, "eventIngestion", js.undefined)
    
    inline def setEventVariables(value: ListOfStrings): Self = StObject.set(x, "eventVariables", value.asInstanceOf[js.Any])
    
    inline def setEventVariablesUndefined: Self = StObject.set(x, "eventVariables", js.undefined)
    
    inline def setEventVariablesVarargs(value: String*): Self = StObject.set(x, "eventVariables", js.Array(value*))
    
    inline def setIngestedEventStatistics(value: IngestedEventStatistics): Self = StObject.set(x, "ingestedEventStatistics", value.asInstanceOf[js.Any])
    
    inline def setIngestedEventStatisticsUndefined: Self = StObject.set(x, "ingestedEventStatistics", js.undefined)
    
    inline def setLabels(value: ListOfStrings): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setLastUpdatedTime(value: time): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
