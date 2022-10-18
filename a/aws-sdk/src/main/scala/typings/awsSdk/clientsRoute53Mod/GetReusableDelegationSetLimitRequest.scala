package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReusableDelegationSetLimitRequest extends StObject {
  
  /**
    * The ID of the delegation set that you want to get the limit for.
    */
  var DelegationSetId: ResourceId
  
  /**
    * Specify MAX_ZONES_BY_REUSABLE_DELEGATION_SET to get the maximum number of hosted zones that you can associate with the specified reusable delegation set.
    */
  var Type: ReusableDelegationSetLimitType
}
object GetReusableDelegationSetLimitRequest {
  
  inline def apply(DelegationSetId: ResourceId, Type: ReusableDelegationSetLimitType): GetReusableDelegationSetLimitRequest = {
    val __obj = js.Dynamic.literal(DelegationSetId = DelegationSetId.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReusableDelegationSetLimitRequest]
  }
  
  extension [Self <: GetReusableDelegationSetLimitRequest](x: Self) {
    
    inline def setDelegationSetId(value: ResourceId): Self = StObject.set(x, "DelegationSetId", value.asInstanceOf[js.Any])
    
    inline def setType(value: ReusableDelegationSetLimitType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
