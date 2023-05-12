package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataQualityRulesetEvaluationRunResponse extends StObject {
  
  /**
    * Additional run options you can specify for an evaluation run.
    */
  var AdditionalRunOptions: js.UndefOr[DataQualityEvaluationRunAdditionalRunOptions] = js.undefined
  
  /**
    * The date and time when this run was completed.
    */
  var CompletedOn: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The data source (an Glue table) associated with this evaluation run.
    */
  var DataSource: js.UndefOr[typings.awsSdk.clientsGlueMod.DataSource] = js.undefined
  
  /**
    * The error strings that are associated with the run.
    */
  var ErrorString: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The amount of time (in seconds) that the run consumed resources.
    */
  var ExecutionTime: js.UndefOr[typings.awsSdk.clientsGlueMod.ExecutionTime] = js.undefined
  
  /**
    * A timestamp. The last point in time when this data quality rule recommendation run was modified.
    */
  var LastModifiedOn: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The number of G.1X workers to be used in the run. The default is 5.
    */
  var NumberOfWorkers: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * A list of result IDs for the data quality results for the run.
    */
  var ResultIds: js.UndefOr[DataQualityResultIdList] = js.undefined
  
  /**
    * An IAM role supplied to encrypt the results of the run.
    */
  var Role: js.UndefOr[RoleString] = js.undefined
  
  /**
    * A list of ruleset names for the run.
    */
  var RulesetNames: js.UndefOr[typings.awsSdk.clientsGlueMod.RulesetNames] = js.undefined
  
  /**
    * The unique run identifier associated with this run.
    */
  var RunId: js.UndefOr[HashString] = js.undefined
  
  /**
    * The date and time when this run started.
    */
  var StartedOn: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status for this run.
    */
  var Status: js.UndefOr[TaskStatusType] = js.undefined
  
  /**
    * The timeout for a run in minutes. This is the maximum time that a run can consume resources before it is terminated and enters TIMEOUT status. The default is 2,880 minutes (48 hours).
    */
  var Timeout: js.UndefOr[typings.awsSdk.clientsGlueMod.Timeout] = js.undefined
}
object GetDataQualityRulesetEvaluationRunResponse {
  
  inline def apply(): GetDataQualityRulesetEvaluationRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataQualityRulesetEvaluationRunResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDataQualityRulesetEvaluationRunResponse] (val x: Self) extends AnyVal {
    
    inline def setAdditionalRunOptions(value: DataQualityEvaluationRunAdditionalRunOptions): Self = StObject.set(x, "AdditionalRunOptions", value.asInstanceOf[js.Any])
    
    inline def setAdditionalRunOptionsUndefined: Self = StObject.set(x, "AdditionalRunOptions", js.undefined)
    
    inline def setCompletedOn(value: js.Date): Self = StObject.set(x, "CompletedOn", value.asInstanceOf[js.Any])
    
    inline def setCompletedOnUndefined: Self = StObject.set(x, "CompletedOn", js.undefined)
    
    inline def setDataSource(value: DataSource): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "DataSource", js.undefined)
    
    inline def setErrorString(value: GenericString): Self = StObject.set(x, "ErrorString", value.asInstanceOf[js.Any])
    
    inline def setErrorStringUndefined: Self = StObject.set(x, "ErrorString", js.undefined)
    
    inline def setExecutionTime(value: ExecutionTime): Self = StObject.set(x, "ExecutionTime", value.asInstanceOf[js.Any])
    
    inline def setExecutionTimeUndefined: Self = StObject.set(x, "ExecutionTime", js.undefined)
    
    inline def setLastModifiedOn(value: js.Date): Self = StObject.set(x, "LastModifiedOn", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedOnUndefined: Self = StObject.set(x, "LastModifiedOn", js.undefined)
    
    inline def setNumberOfWorkers(value: NullableInteger): Self = StObject.set(x, "NumberOfWorkers", value.asInstanceOf[js.Any])
    
    inline def setNumberOfWorkersUndefined: Self = StObject.set(x, "NumberOfWorkers", js.undefined)
    
    inline def setResultIds(value: DataQualityResultIdList): Self = StObject.set(x, "ResultIds", value.asInstanceOf[js.Any])
    
    inline def setResultIdsUndefined: Self = StObject.set(x, "ResultIds", js.undefined)
    
    inline def setResultIdsVarargs(value: HashString*): Self = StObject.set(x, "ResultIds", js.Array(value*))
    
    inline def setRole(value: RoleString): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    inline def setRulesetNames(value: RulesetNames): Self = StObject.set(x, "RulesetNames", value.asInstanceOf[js.Any])
    
    inline def setRulesetNamesUndefined: Self = StObject.set(x, "RulesetNames", js.undefined)
    
    inline def setRulesetNamesVarargs(value: NameString*): Self = StObject.set(x, "RulesetNames", js.Array(value*))
    
    inline def setRunId(value: HashString): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
    
    inline def setRunIdUndefined: Self = StObject.set(x, "RunId", js.undefined)
    
    inline def setStartedOn(value: js.Date): Self = StObject.set(x, "StartedOn", value.asInstanceOf[js.Any])
    
    inline def setStartedOnUndefined: Self = StObject.set(x, "StartedOn", js.undefined)
    
    inline def setStatus(value: TaskStatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTimeout(value: Timeout): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "Timeout", js.undefined)
  }
}
