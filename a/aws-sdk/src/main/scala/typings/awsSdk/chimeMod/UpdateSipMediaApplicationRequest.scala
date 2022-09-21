package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSipMediaApplicationRequest extends StObject {
  
  /**
    * The new set of endpoints for the specified SIP media application.
    */
  var Endpoints: js.UndefOr[SipMediaApplicationEndpointList] = js.undefined
  
  /**
    * The new name for the specified SIP media application.
    */
  var Name: js.UndefOr[SipMediaApplicationName] = js.undefined
  
  /**
    * The SIP media application ID.
    */
  var SipMediaApplicationId: NonEmptyString
}
object UpdateSipMediaApplicationRequest {
  
  inline def apply(SipMediaApplicationId: NonEmptyString): UpdateSipMediaApplicationRequest = {
    val __obj = js.Dynamic.literal(SipMediaApplicationId = SipMediaApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSipMediaApplicationRequest]
  }
  
  extension [Self <: UpdateSipMediaApplicationRequest](x: Self) {
    
    inline def setEndpoints(value: SipMediaApplicationEndpointList): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsUndefined: Self = StObject.set(x, "Endpoints", js.undefined)
    
    inline def setEndpointsVarargs(value: SipMediaApplicationEndpoint*): Self = StObject.set(x, "Endpoints", js.Array(value*))
    
    inline def setName(value: SipMediaApplicationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSipMediaApplicationId(value: NonEmptyString): Self = StObject.set(x, "SipMediaApplicationId", value.asInstanceOf[js.Any])
  }
}
