package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRemediationExecutionStatusRequest extends StObject {
  
  /**
    * A list of Config rule names.
    */
  var ConfigRuleName: typings.awsSdk.clientsConfigserviceMod.ConfigRuleName
  
  /**
    * The maximum number of RemediationExecutionStatuses returned on each page. The default is maximum. If you specify 0, Config uses the default. 
    */
  var Limit: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.Limit] = js.undefined
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of resource keys to be processed with the current request. Each element in the list consists of the resource type and resource ID. 
    */
  var ResourceKeys: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ResourceKeys] = js.undefined
}
object DescribeRemediationExecutionStatusRequest {
  
  inline def apply(ConfigRuleName: ConfigRuleName): DescribeRemediationExecutionStatusRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRemediationExecutionStatusRequest]
  }
  
  extension [Self <: DescribeRemediationExecutionStatusRequest](x: Self) {
    
    inline def setConfigRuleName(value: ConfigRuleName): Self = StObject.set(x, "ConfigRuleName", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: Limit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceKeys(value: ResourceKeys): Self = StObject.set(x, "ResourceKeys", value.asInstanceOf[js.Any])
    
    inline def setResourceKeysUndefined: Self = StObject.set(x, "ResourceKeys", js.undefined)
    
    inline def setResourceKeysVarargs(value: ResourceKey*): Self = StObject.set(x, "ResourceKeys", js.Array(value*))
  }
}
