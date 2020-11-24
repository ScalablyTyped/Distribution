package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessEndpoint extends js.Object {
  
  /**
    * The type of interface endpoint.
    */
  var EndpointType: AccessEndpointType = js.native
  
  /**
    * The identifier (ID) of the VPC in which the interface endpoint is used.
    */
  var VpceId: js.UndefOr[String] = js.native
}
object AccessEndpoint {
  
  @scala.inline
  def apply(EndpointType: AccessEndpointType): AccessEndpoint = {
    val __obj = js.Dynamic.literal(EndpointType = EndpointType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessEndpoint]
  }
  
  @scala.inline
  implicit class AccessEndpointOps[Self <: AccessEndpoint] (val x: Self) extends AnyVal {
    
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
    def setEndpointType(value: AccessEndpointType): Self = this.set("EndpointType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpceId(value: String): Self = this.set("VpceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpceId: Self = this.set("VpceId", js.undefined)
  }
}
