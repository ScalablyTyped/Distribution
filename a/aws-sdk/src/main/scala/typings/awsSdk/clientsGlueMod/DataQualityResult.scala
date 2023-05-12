package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataQualityResult extends StObject {
  
  /**
    * The date and time when this data quality run completed.
    */
  var CompletedOn: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The table associated with the data quality result, if any.
    */
  var DataSource: js.UndefOr[typings.awsSdk.clientsGlueMod.DataSource] = js.undefined
  
  /**
    * In the context of a job in Glue Studio, each node in the canvas is typically assigned some sort of name and data quality nodes will have names. In the case of multiple nodes, the evaluationContext can differentiate the nodes.
    */
  var EvaluationContext: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The job name associated with the data quality result, if any.
    */
  var JobName: js.UndefOr[NameString] = js.undefined
  
  /**
    * The job run ID associated with the data quality result, if any.
    */
  var JobRunId: js.UndefOr[HashString] = js.undefined
  
  /**
    * A unique result ID for the data quality result.
    */
  var ResultId: js.UndefOr[HashString] = js.undefined
  
  /**
    * A list of DataQualityRuleResult objects representing the results for each rule. 
    */
  var RuleResults: js.UndefOr[DataQualityRuleResults] = js.undefined
  
  /**
    * The unique run ID for the ruleset evaluation for this data quality result.
    */
  var RulesetEvaluationRunId: js.UndefOr[HashString] = js.undefined
  
  /**
    * The name of the ruleset associated with the data quality result.
    */
  var RulesetName: js.UndefOr[NameString] = js.undefined
  
  /**
    * An aggregate data quality score. Represents the ratio of rules that passed to the total number of rules.
    */
  var Score: js.UndefOr[GenericBoundedDouble] = js.undefined
  
  /**
    * The date and time when this data quality run started.
    */
  var StartedOn: js.UndefOr[js.Date] = js.undefined
}
object DataQualityResult {
  
  inline def apply(): DataQualityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataQualityResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataQualityResult] (val x: Self) extends AnyVal {
    
    inline def setCompletedOn(value: js.Date): Self = StObject.set(x, "CompletedOn", value.asInstanceOf[js.Any])
    
    inline def setCompletedOnUndefined: Self = StObject.set(x, "CompletedOn", js.undefined)
    
    inline def setDataSource(value: DataSource): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "DataSource", js.undefined)
    
    inline def setEvaluationContext(value: GenericString): Self = StObject.set(x, "EvaluationContext", value.asInstanceOf[js.Any])
    
    inline def setEvaluationContextUndefined: Self = StObject.set(x, "EvaluationContext", js.undefined)
    
    inline def setJobName(value: NameString): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    inline def setJobRunId(value: HashString): Self = StObject.set(x, "JobRunId", value.asInstanceOf[js.Any])
    
    inline def setJobRunIdUndefined: Self = StObject.set(x, "JobRunId", js.undefined)
    
    inline def setResultId(value: HashString): Self = StObject.set(x, "ResultId", value.asInstanceOf[js.Any])
    
    inline def setResultIdUndefined: Self = StObject.set(x, "ResultId", js.undefined)
    
    inline def setRuleResults(value: DataQualityRuleResults): Self = StObject.set(x, "RuleResults", value.asInstanceOf[js.Any])
    
    inline def setRuleResultsUndefined: Self = StObject.set(x, "RuleResults", js.undefined)
    
    inline def setRuleResultsVarargs(value: DataQualityRuleResult*): Self = StObject.set(x, "RuleResults", js.Array(value*))
    
    inline def setRulesetEvaluationRunId(value: HashString): Self = StObject.set(x, "RulesetEvaluationRunId", value.asInstanceOf[js.Any])
    
    inline def setRulesetEvaluationRunIdUndefined: Self = StObject.set(x, "RulesetEvaluationRunId", js.undefined)
    
    inline def setRulesetName(value: NameString): Self = StObject.set(x, "RulesetName", value.asInstanceOf[js.Any])
    
    inline def setRulesetNameUndefined: Self = StObject.set(x, "RulesetName", js.undefined)
    
    inline def setScore(value: GenericBoundedDouble): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
    
    inline def setStartedOn(value: js.Date): Self = StObject.set(x, "StartedOn", value.asInstanceOf[js.Any])
    
    inline def setStartedOnUndefined: Self = StObject.set(x, "StartedOn", js.undefined)
  }
}
