package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkInsightsAccessScopeContent extends StObject {
  
  /**
    * The paths to exclude.
    */
  var ExcludePaths: js.UndefOr[AccessScopePathList] = js.undefined
  
  /**
    * The paths to match.
    */
  var MatchPaths: js.UndefOr[AccessScopePathList] = js.undefined
  
  /**
    * The ID of the Network Access Scope.
    */
  var NetworkInsightsAccessScopeId: js.UndefOr[typings.awsSdk.clientsEc2Mod.NetworkInsightsAccessScopeId] = js.undefined
}
object NetworkInsightsAccessScopeContent {
  
  inline def apply(): NetworkInsightsAccessScopeContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInsightsAccessScopeContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkInsightsAccessScopeContent] (val x: Self) extends AnyVal {
    
    inline def setExcludePaths(value: AccessScopePathList): Self = StObject.set(x, "ExcludePaths", value.asInstanceOf[js.Any])
    
    inline def setExcludePathsUndefined: Self = StObject.set(x, "ExcludePaths", js.undefined)
    
    inline def setExcludePathsVarargs(value: AccessScopePath*): Self = StObject.set(x, "ExcludePaths", js.Array(value*))
    
    inline def setMatchPaths(value: AccessScopePathList): Self = StObject.set(x, "MatchPaths", value.asInstanceOf[js.Any])
    
    inline def setMatchPathsUndefined: Self = StObject.set(x, "MatchPaths", js.undefined)
    
    inline def setMatchPathsVarargs(value: AccessScopePath*): Self = StObject.set(x, "MatchPaths", js.Array(value*))
    
    inline def setNetworkInsightsAccessScopeId(value: NetworkInsightsAccessScopeId): Self = StObject.set(x, "NetworkInsightsAccessScopeId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInsightsAccessScopeIdUndefined: Self = StObject.set(x, "NetworkInsightsAccessScopeId", js.undefined)
  }
}
