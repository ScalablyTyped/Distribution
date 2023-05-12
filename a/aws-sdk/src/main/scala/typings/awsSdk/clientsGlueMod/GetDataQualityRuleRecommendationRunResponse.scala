package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataQualityRuleRecommendationRunResponse extends StObject {
  
  /**
    * The date and time when this run was completed.
    */
  var CompletedOn: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the ruleset that was created by the run.
    */
  var CreatedRulesetName: js.UndefOr[NameString] = js.undefined
  
  /**
    * The data source (an Glue table) associated with this run.
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
    * When a start rule recommendation run completes, it creates a recommended ruleset (a set of rules). This member has those rules in Data Quality Definition Language (DQDL) format.
    */
  var RecommendedRuleset: js.UndefOr[DataQualityRulesetString] = js.undefined
  
  /**
    * An IAM role supplied to encrypt the results of the run.
    */
  var Role: js.UndefOr[RoleString] = js.undefined
  
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
object GetDataQualityRuleRecommendationRunResponse {
  
  inline def apply(): GetDataQualityRuleRecommendationRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataQualityRuleRecommendationRunResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDataQualityRuleRecommendationRunResponse] (val x: Self) extends AnyVal {
    
    inline def setCompletedOn(value: js.Date): Self = StObject.set(x, "CompletedOn", value.asInstanceOf[js.Any])
    
    inline def setCompletedOnUndefined: Self = StObject.set(x, "CompletedOn", js.undefined)
    
    inline def setCreatedRulesetName(value: NameString): Self = StObject.set(x, "CreatedRulesetName", value.asInstanceOf[js.Any])
    
    inline def setCreatedRulesetNameUndefined: Self = StObject.set(x, "CreatedRulesetName", js.undefined)
    
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
    
    inline def setRecommendedRuleset(value: DataQualityRulesetString): Self = StObject.set(x, "RecommendedRuleset", value.asInstanceOf[js.Any])
    
    inline def setRecommendedRulesetUndefined: Self = StObject.set(x, "RecommendedRuleset", js.undefined)
    
    inline def setRole(value: RoleString): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
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
