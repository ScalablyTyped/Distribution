package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEventPredictionMetadataResult extends StObject {
  
  /**
    *  The detector ID. 
    */
  var detectorId: js.UndefOr[identifier] = js.undefined
  
  /**
    *  The detector version ID. 
    */
  var detectorVersionId: js.UndefOr[wholeNumberVersionString] = js.undefined
  
  /**
    *  The status of the detector version. 
    */
  var detectorVersionStatus: js.UndefOr[String] = js.undefined
  
  /**
    *  The entity ID. 
    */
  var entityId: js.UndefOr[String] = js.undefined
  
  /**
    *  The entity type. 
    */
  var entityType: js.UndefOr[String] = js.undefined
  
  /**
    *  External (Amazon SageMaker) models that were evaluated for generating predictions. 
    */
  var evaluatedExternalModels: js.UndefOr[ListOfEvaluatedExternalModels] = js.undefined
  
  /**
    *  Model versions that were evaluated for generating predictions. 
    */
  var evaluatedModelVersions: js.UndefOr[ListOfEvaluatedModelVersions] = js.undefined
  
  /**
    *  The event ID. 
    */
  var eventId: js.UndefOr[identifier] = js.undefined
  
  /**
    *  The timestamp for when the prediction was generated for the associated event ID. 
    */
  var eventTimestamp: js.UndefOr[time] = js.undefined
  
  /**
    *  The event type associated with the detector specified for this prediction. 
    */
  var eventTypeName: js.UndefOr[identifier] = js.undefined
  
  /**
    *  A list of event variables that influenced the prediction scores. 
    */
  var eventVariables: js.UndefOr[ListOfEventVariableSummaries] = js.undefined
  
  /**
    *  The outcomes of the matched rule, based on the rule execution mode. 
    */
  var outcomes: js.UndefOr[ListOfStrings] = js.undefined
  
  /**
    * The timestamp that defines when the prediction was generated. 
    */
  var predictionTimestamp: js.UndefOr[time] = js.undefined
  
  /**
    *  The execution mode of the rule used for evaluating variable values. 
    */
  var ruleExecutionMode: js.UndefOr[RuleExecutionMode] = js.undefined
  
  /**
    *  List of rules associated with the detector version that were used for evaluating variable values. 
    */
  var rules: js.UndefOr[EvaluatedRuleList] = js.undefined
}
object GetEventPredictionMetadataResult {
  
  inline def apply(): GetEventPredictionMetadataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEventPredictionMetadataResult]
  }
  
  extension [Self <: GetEventPredictionMetadataResult](x: Self) {
    
    inline def setDetectorId(value: identifier): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
    
    inline def setDetectorIdUndefined: Self = StObject.set(x, "detectorId", js.undefined)
    
    inline def setDetectorVersionId(value: wholeNumberVersionString): Self = StObject.set(x, "detectorVersionId", value.asInstanceOf[js.Any])
    
    inline def setDetectorVersionIdUndefined: Self = StObject.set(x, "detectorVersionId", js.undefined)
    
    inline def setDetectorVersionStatus(value: String): Self = StObject.set(x, "detectorVersionStatus", value.asInstanceOf[js.Any])
    
    inline def setDetectorVersionStatusUndefined: Self = StObject.set(x, "detectorVersionStatus", js.undefined)
    
    inline def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
    
    inline def setEntityType(value: String): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    inline def setEntityTypeUndefined: Self = StObject.set(x, "entityType", js.undefined)
    
    inline def setEvaluatedExternalModels(value: ListOfEvaluatedExternalModels): Self = StObject.set(x, "evaluatedExternalModels", value.asInstanceOf[js.Any])
    
    inline def setEvaluatedExternalModelsUndefined: Self = StObject.set(x, "evaluatedExternalModels", js.undefined)
    
    inline def setEvaluatedExternalModelsVarargs(value: EvaluatedExternalModel*): Self = StObject.set(x, "evaluatedExternalModels", js.Array(value*))
    
    inline def setEvaluatedModelVersions(value: ListOfEvaluatedModelVersions): Self = StObject.set(x, "evaluatedModelVersions", value.asInstanceOf[js.Any])
    
    inline def setEvaluatedModelVersionsUndefined: Self = StObject.set(x, "evaluatedModelVersions", js.undefined)
    
    inline def setEvaluatedModelVersionsVarargs(value: EvaluatedModelVersion*): Self = StObject.set(x, "evaluatedModelVersions", js.Array(value*))
    
    inline def setEventId(value: identifier): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    inline def setEventTimestamp(value: time): Self = StObject.set(x, "eventTimestamp", value.asInstanceOf[js.Any])
    
    inline def setEventTimestampUndefined: Self = StObject.set(x, "eventTimestamp", js.undefined)
    
    inline def setEventTypeName(value: identifier): Self = StObject.set(x, "eventTypeName", value.asInstanceOf[js.Any])
    
    inline def setEventTypeNameUndefined: Self = StObject.set(x, "eventTypeName", js.undefined)
    
    inline def setEventVariables(value: ListOfEventVariableSummaries): Self = StObject.set(x, "eventVariables", value.asInstanceOf[js.Any])
    
    inline def setEventVariablesUndefined: Self = StObject.set(x, "eventVariables", js.undefined)
    
    inline def setEventVariablesVarargs(value: EventVariableSummary*): Self = StObject.set(x, "eventVariables", js.Array(value*))
    
    inline def setOutcomes(value: ListOfStrings): Self = StObject.set(x, "outcomes", value.asInstanceOf[js.Any])
    
    inline def setOutcomesUndefined: Self = StObject.set(x, "outcomes", js.undefined)
    
    inline def setOutcomesVarargs(value: String*): Self = StObject.set(x, "outcomes", js.Array(value*))
    
    inline def setPredictionTimestamp(value: time): Self = StObject.set(x, "predictionTimestamp", value.asInstanceOf[js.Any])
    
    inline def setPredictionTimestampUndefined: Self = StObject.set(x, "predictionTimestamp", js.undefined)
    
    inline def setRuleExecutionMode(value: RuleExecutionMode): Self = StObject.set(x, "ruleExecutionMode", value.asInstanceOf[js.Any])
    
    inline def setRuleExecutionModeUndefined: Self = StObject.set(x, "ruleExecutionMode", js.undefined)
    
    inline def setRules(value: EvaluatedRuleList): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: EvaluatedRule*): Self = StObject.set(x, "rules", js.Array(value*))
  }
}
