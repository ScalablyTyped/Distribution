package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationComponentConfigRequest extends StObject {
  
  /**
    *  The ID of the application component. The ID is unique within an AWS account. 
    */
  var applicationComponentId: ApplicationComponentId
  
  /**
    *  Indicates whether the application component has been included for server recommendation or not. 
    */
  var inclusionStatus: js.UndefOr[InclusionStatus] = js.undefined
  
  /**
    *  Database credentials. 
    */
  var secretsManagerKey: js.UndefOr[SecretsManagerKey] = js.undefined
  
  /**
    *  The list of source code configurations to update for the application component. 
    */
  var sourceCodeList: js.UndefOr[SourceCodeList] = js.undefined
  
  /**
    *  The preferred strategy options for the application component. Use values from the GetApplicationComponentStrategies response. 
    */
  var strategyOption: js.UndefOr[StrategyOption] = js.undefined
}
object UpdateApplicationComponentConfigRequest {
  
  inline def apply(applicationComponentId: ApplicationComponentId): UpdateApplicationComponentConfigRequest = {
    val __obj = js.Dynamic.literal(applicationComponentId = applicationComponentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationComponentConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateApplicationComponentConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationComponentId(value: ApplicationComponentId): Self = StObject.set(x, "applicationComponentId", value.asInstanceOf[js.Any])
    
    inline def setInclusionStatus(value: InclusionStatus): Self = StObject.set(x, "inclusionStatus", value.asInstanceOf[js.Any])
    
    inline def setInclusionStatusUndefined: Self = StObject.set(x, "inclusionStatus", js.undefined)
    
    inline def setSecretsManagerKey(value: SecretsManagerKey): Self = StObject.set(x, "secretsManagerKey", value.asInstanceOf[js.Any])
    
    inline def setSecretsManagerKeyUndefined: Self = StObject.set(x, "secretsManagerKey", js.undefined)
    
    inline def setSourceCodeList(value: SourceCodeList): Self = StObject.set(x, "sourceCodeList", value.asInstanceOf[js.Any])
    
    inline def setSourceCodeListUndefined: Self = StObject.set(x, "sourceCodeList", js.undefined)
    
    inline def setSourceCodeListVarargs(value: SourceCode*): Self = StObject.set(x, "sourceCodeList", js.Array(value*))
    
    inline def setStrategyOption(value: StrategyOption): Self = StObject.set(x, "strategyOption", value.asInstanceOf[js.Any])
    
    inline def setStrategyOptionUndefined: Self = StObject.set(x, "strategyOption", js.undefined)
  }
}
