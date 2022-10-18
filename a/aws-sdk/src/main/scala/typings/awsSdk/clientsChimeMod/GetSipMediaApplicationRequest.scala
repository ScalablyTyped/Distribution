package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSipMediaApplicationRequest extends StObject {
  
  /**
    * The SIP media application ID.
    */
  var SipMediaApplicationId: NonEmptyString
}
object GetSipMediaApplicationRequest {
  
  inline def apply(SipMediaApplicationId: NonEmptyString): GetSipMediaApplicationRequest = {
    val __obj = js.Dynamic.literal(SipMediaApplicationId = SipMediaApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSipMediaApplicationRequest]
  }
  
  extension [Self <: GetSipMediaApplicationRequest](x: Self) {
    
    inline def setSipMediaApplicationId(value: NonEmptyString): Self = StObject.set(x, "SipMediaApplicationId", value.asInstanceOf[js.Any])
  }
}
