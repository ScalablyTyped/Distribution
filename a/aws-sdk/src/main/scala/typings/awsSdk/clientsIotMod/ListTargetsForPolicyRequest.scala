package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTargetsForPolicyRequest extends StObject {
  
  /**
    * A marker used to get the next set of results.
    */
  var marker: js.UndefOr[Marker] = js.undefined
  
  /**
    * The maximum number of results to return at one time.
    */
  var pageSize: js.UndefOr[PageSize] = js.undefined
  
  /**
    * The policy name.
    */
  var policyName: PolicyName
}
object ListTargetsForPolicyRequest {
  
  inline def apply(policyName: PolicyName): ListTargetsForPolicyRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTargetsForPolicyRequest]
  }
  
  extension [Self <: ListTargetsForPolicyRequest](x: Self) {
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setPageSize(value: PageSize): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPolicyName(value: PolicyName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
  }
}
