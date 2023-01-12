package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkInsightsAccessScopeContentResult extends StObject {
  
  /**
    * The Network Access Scope content.
    */
  var NetworkInsightsAccessScopeContent: js.UndefOr[typings.awsSdk.clientsEc2Mod.NetworkInsightsAccessScopeContent] = js.undefined
}
object GetNetworkInsightsAccessScopeContentResult {
  
  inline def apply(): GetNetworkInsightsAccessScopeContentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNetworkInsightsAccessScopeContentResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetNetworkInsightsAccessScopeContentResult] (val x: Self) extends AnyVal {
    
    inline def setNetworkInsightsAccessScopeContent(value: NetworkInsightsAccessScopeContent): Self = StObject.set(x, "NetworkInsightsAccessScopeContent", value.asInstanceOf[js.Any])
    
    inline def setNetworkInsightsAccessScopeContentUndefined: Self = StObject.set(x, "NetworkInsightsAccessScopeContent", js.undefined)
  }
}
