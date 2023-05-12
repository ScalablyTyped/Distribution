package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDataQualityRuleRecommendationRunRequest extends StObject {
  
  /**
    * Used for idempotency and is recommended to be set to a random ID (such as a UUID) to avoid creating or starting multiple instances of the same resource.
    */
  var ClientToken: js.UndefOr[HashString] = js.undefined
  
  /**
    * A name for the ruleset.
    */
  var CreatedRulesetName: js.UndefOr[NameString] = js.undefined
  
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
    * The timeout for a run in minutes. This is the maximum time that a run can consume resources before it is terminated and enters TIMEOUT status. The default is 2,880 minutes (48 hours).
    */
  var Timeout: js.UndefOr[typings.awsSdk.clientsGlueMod.Timeout] = js.undefined
}
object StartDataQualityRuleRecommendationRunRequest {
  
  inline def apply(DataSource: DataSource, Role: RoleString): StartDataQualityRuleRecommendationRunRequest = {
    val __obj = js.Dynamic.literal(DataSource = DataSource.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDataQualityRuleRecommendationRunRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartDataQualityRuleRecommendationRunRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: HashString): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setCreatedRulesetName(value: NameString): Self = StObject.set(x, "CreatedRulesetName", value.asInstanceOf[js.Any])
    
    inline def setCreatedRulesetNameUndefined: Self = StObject.set(x, "CreatedRulesetName", js.undefined)
    
    inline def setDataSource(value: DataSource): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    inline def setNumberOfWorkers(value: NullableInteger): Self = StObject.set(x, "NumberOfWorkers", value.asInstanceOf[js.Any])
    
    inline def setNumberOfWorkersUndefined: Self = StObject.set(x, "NumberOfWorkers", js.undefined)
    
    inline def setRole(value: RoleString): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Timeout): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "Timeout", js.undefined)
  }
}
