package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDataQualityRulesetEvaluationRunRequest extends StObject {
  
  /**
    * Additional run options you can specify for an evaluation run.
    */
  var AdditionalRunOptions: js.UndefOr[DataQualityEvaluationRunAdditionalRunOptions] = js.undefined
  
  /**
    * Used for idempotency and is recommended to be set to a random ID (such as a UUID) to avoid creating or starting multiple instances of the same resource.
    */
  var ClientToken: js.UndefOr[HashString] = js.undefined
  
  /**
    * The data source (Glue table) associated with this run.
    */
  var DataSource: typings.awsSdk.clientsGlueMod.DataSource
  
  /**
    * The number of G.1X workers to be used in the run. The default is 5.
    */
  var NumberOfWorkers: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * An IAM role supplied to encrypt the results of the run.
    */
  var Role: RoleString
  
  /**
    * A list of ruleset names.
    */
  var RulesetNames: typings.awsSdk.clientsGlueMod.RulesetNames
  
  /**
    * The timeout for a run in minutes. This is the maximum time that a run can consume resources before it is terminated and enters TIMEOUT status. The default is 2,880 minutes (48 hours).
    */
  var Timeout: js.UndefOr[typings.awsSdk.clientsGlueMod.Timeout] = js.undefined
}
object StartDataQualityRulesetEvaluationRunRequest {
  
  inline def apply(DataSource: DataSource, Role: RoleString, RulesetNames: RulesetNames): StartDataQualityRulesetEvaluationRunRequest = {
    val __obj = js.Dynamic.literal(DataSource = DataSource.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any], RulesetNames = RulesetNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDataQualityRulesetEvaluationRunRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartDataQualityRulesetEvaluationRunRequest] (val x: Self) extends AnyVal {
    
    inline def setAdditionalRunOptions(value: DataQualityEvaluationRunAdditionalRunOptions): Self = StObject.set(x, "AdditionalRunOptions", value.asInstanceOf[js.Any])
    
    inline def setAdditionalRunOptionsUndefined: Self = StObject.set(x, "AdditionalRunOptions", js.undefined)
    
    inline def setClientToken(value: HashString): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDataSource(value: DataSource): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    inline def setNumberOfWorkers(value: NullableInteger): Self = StObject.set(x, "NumberOfWorkers", value.asInstanceOf[js.Any])
    
    inline def setNumberOfWorkersUndefined: Self = StObject.set(x, "NumberOfWorkers", js.undefined)
    
    inline def setRole(value: RoleString): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setRulesetNames(value: RulesetNames): Self = StObject.set(x, "RulesetNames", value.asInstanceOf[js.Any])
    
    inline def setRulesetNamesVarargs(value: NameString*): Self = StObject.set(x, "RulesetNames", js.Array(value*))
    
    inline def setTimeout(value: Timeout): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "Timeout", js.undefined)
  }
}
