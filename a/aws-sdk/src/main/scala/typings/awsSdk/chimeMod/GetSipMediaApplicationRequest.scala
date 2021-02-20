package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSipMediaApplicationRequest extends StObject {
  
  /**
    * The SIP media application ID.
    */
  var SipMediaApplicationId: NonEmptyString = js.native
}
object GetSipMediaApplicationRequest {
  
  @scala.inline
  def apply(SipMediaApplicationId: NonEmptyString): GetSipMediaApplicationRequest = {
    val __obj = js.Dynamic.literal(SipMediaApplicationId = SipMediaApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSipMediaApplicationRequest]
  }
  
  @scala.inline
  implicit class GetSipMediaApplicationRequestMutableBuilder[Self <: GetSipMediaApplicationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSipMediaApplicationId(value: NonEmptyString): Self = StObject.set(x, "SipMediaApplicationId", value.asInstanceOf[js.Any])
  }
}
