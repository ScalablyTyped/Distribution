package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBasePathMappingRequest extends js.Object {
  /**
    * [Required] The base path name that callers of the API must provide as part of the URL after the domain name. This value must be unique for all of the mappings across a single API. Specify '(none)' if you do not want callers to specify any base path name after the domain name.
    */
  var basePath: String = js.native
  /**
    * [Required] The domain name of the BasePathMapping resource to be described.
    */
  var domainName: String = js.native
}

object GetBasePathMappingRequest {
  @scala.inline
  def apply(basePath: String, domainName: String): GetBasePathMappingRequest = {
    val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBasePathMappingRequest]
  }
  @scala.inline
  implicit class GetBasePathMappingRequestOps[Self <: GetBasePathMappingRequest] (val x: Self) extends AnyVal {
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
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainName(value: String): Self = this.set("domainName", value.asInstanceOf[js.Any])
  }
  
}

