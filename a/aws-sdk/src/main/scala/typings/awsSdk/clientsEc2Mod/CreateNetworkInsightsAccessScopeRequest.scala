package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNetworkInsightsAccessScopeRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to ensure idempotency.
    */
  var ClientToken: String
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The paths to exclude.
    */
  var ExcludePaths: js.UndefOr[AccessScopePathListRequest] = js.undefined
  
  /**
    * The paths to match.
    */
  var MatchPaths: js.UndefOr[AccessScopePathListRequest] = js.undefined
  
  /**
    * The tags to apply.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
}
object CreateNetworkInsightsAccessScopeRequest {
  
  inline def apply(ClientToken: String): CreateNetworkInsightsAccessScopeRequest = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNetworkInsightsAccessScopeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateNetworkInsightsAccessScopeRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setExcludePaths(value: AccessScopePathListRequest): Self = StObject.set(x, "ExcludePaths", value.asInstanceOf[js.Any])
    
    inline def setExcludePathsUndefined: Self = StObject.set(x, "ExcludePaths", js.undefined)
    
    inline def setExcludePathsVarargs(value: AccessScopePathRequest*): Self = StObject.set(x, "ExcludePaths", js.Array(value*))
    
    inline def setMatchPaths(value: AccessScopePathListRequest): Self = StObject.set(x, "MatchPaths", value.asInstanceOf[js.Any])
    
    inline def setMatchPathsUndefined: Self = StObject.set(x, "MatchPaths", js.undefined)
    
    inline def setMatchPathsVarargs(value: AccessScopePathRequest*): Self = StObject.set(x, "MatchPaths", js.Array(value*))
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
  }
}
