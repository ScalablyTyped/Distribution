package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSipMediaApplicationRequest extends js.Object {
  
  /**
    * The new set of endpoints for the specified SIP media application.
    */
  var Endpoints: js.UndefOr[SipMediaApplicationEndpointList] = js.native
  
  /**
    * The new name for the specified SIP media application.
    */
  var Name: js.UndefOr[SipMediaApplicationName] = js.native
  
  /**
    * The SIP media application ID.
    */
  var SipMediaApplicationId: NonEmptyString = js.native
}
object UpdateSipMediaApplicationRequest {
  
  @scala.inline
  def apply(SipMediaApplicationId: NonEmptyString): UpdateSipMediaApplicationRequest = {
    val __obj = js.Dynamic.literal(SipMediaApplicationId = SipMediaApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSipMediaApplicationRequest]
  }
  
  @scala.inline
  implicit class UpdateSipMediaApplicationRequestOps[Self <: UpdateSipMediaApplicationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSipMediaApplicationId(value: NonEmptyString): Self = this.set("SipMediaApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointsVarargs(value: SipMediaApplicationEndpoint*): Self = this.set("Endpoints", js.Array(value :_*))
    
    @scala.inline
    def setEndpoints(value: SipMediaApplicationEndpointList): Self = this.set("Endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoints: Self = this.set("Endpoints", js.undefined)
    
    @scala.inline
    def setName(value: SipMediaApplicationName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
