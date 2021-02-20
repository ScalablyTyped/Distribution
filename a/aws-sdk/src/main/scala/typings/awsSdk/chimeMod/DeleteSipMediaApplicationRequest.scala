package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSipMediaApplicationRequest extends StObject {
  
  /**
    * The SIP media application ID.
    */
  var SipMediaApplicationId: NonEmptyString = js.native
}
object DeleteSipMediaApplicationRequest {
  
  @scala.inline
  def apply(SipMediaApplicationId: NonEmptyString): DeleteSipMediaApplicationRequest = {
    val __obj = js.Dynamic.literal(SipMediaApplicationId = SipMediaApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSipMediaApplicationRequest]
  }
  
  @scala.inline
  implicit class DeleteSipMediaApplicationRequestMutableBuilder[Self <: DeleteSipMediaApplicationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSipMediaApplicationId(value: NonEmptyString): Self = StObject.set(x, "SipMediaApplicationId", value.asInstanceOf[js.Any])
  }
}
