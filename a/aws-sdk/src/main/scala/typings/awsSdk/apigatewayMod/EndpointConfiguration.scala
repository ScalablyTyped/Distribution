package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointConfiguration extends js.Object {
  
  /**
    * A list of endpoint types of an API (RestApi) or its custom domain name (DomainName). For an edge-optimized API and its custom domain name, the endpoint type is "EDGE". For a regional API and its custom domain name, the endpoint type is REGIONAL. For a private API, the endpoint type is PRIVATE.
    */
  var types: js.UndefOr[ListOfEndpointType] = js.native
  
  /**
    * A list of VpcEndpointIds of an API (RestApi) against which to create Route53 ALIASes. It is only supported for PRIVATE endpoint type.
    */
  var vpcEndpointIds: js.UndefOr[ListOfString] = js.native
}
object EndpointConfiguration {
  
  @scala.inline
  def apply(): EndpointConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointConfiguration]
  }
  
  @scala.inline
  implicit class EndpointConfigurationOps[Self <: EndpointConfiguration] (val x: Self) extends AnyVal {
    
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
    def setTypesVarargs(value: EndpointType*): Self = this.set("types", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: ListOfEndpointType): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
    
    @scala.inline
    def setVpcEndpointIdsVarargs(value: String*): Self = this.set("vpcEndpointIds", js.Array(value :_*))
    
    @scala.inline
    def setVpcEndpointIds(value: ListOfString): Self = this.set("vpcEndpointIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcEndpointIds: Self = this.set("vpcEndpointIds", js.undefined)
  }
}
