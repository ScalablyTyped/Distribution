package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSipMediaApplicationRequest extends js.Object {
  
  /**
    * AWS Region assigned to the SIP media application.
    */
  var AwsRegion: String = js.native
  
  /**
    * List of endpoints (Lambda Amazon Resource Names) specified for the SIP media application. Currently, only one endpoint is supported.
    */
  var Endpoints: SipMediaApplicationEndpointList = js.native
  
  /**
    * The SIP media application name.
    */
  var Name: js.UndefOr[SipMediaApplicationName] = js.native
}
object CreateSipMediaApplicationRequest {
  
  @scala.inline
  def apply(AwsRegion: String, Endpoints: SipMediaApplicationEndpointList): CreateSipMediaApplicationRequest = {
    val __obj = js.Dynamic.literal(AwsRegion = AwsRegion.asInstanceOf[js.Any], Endpoints = Endpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSipMediaApplicationRequest]
  }
  
  @scala.inline
  implicit class CreateSipMediaApplicationRequestOps[Self <: CreateSipMediaApplicationRequest] (val x: Self) extends AnyVal {
    
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
    def setAwsRegion(value: String): Self = this.set("AwsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointsVarargs(value: SipMediaApplicationEndpoint*): Self = this.set("Endpoints", js.Array(value :_*))
    
    @scala.inline
    def setEndpoints(value: SipMediaApplicationEndpointList): Self = this.set("Endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: SipMediaApplicationName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
