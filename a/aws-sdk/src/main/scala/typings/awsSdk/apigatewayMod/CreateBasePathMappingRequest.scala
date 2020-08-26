package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBasePathMappingRequest extends js.Object {
  /**
    * The base path name that callers of the API must provide as part of the URL after the domain name. This value must be unique for all of the mappings across a single API. Specify '(none)' if you do not want callers to specify a base path name after the domain name.
    */
  var basePath: js.UndefOr[String] = js.native
  /**
    * [Required] The domain name of the BasePathMapping resource to create.
    */
  var domainName: String = js.native
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
  /**
    * The name of the API's stage that you want to use for this mapping. Specify '(none)' if you want callers to explicitly specify the stage name after any base path name.
    */
  var stage: js.UndefOr[String] = js.native
}

object CreateBasePathMappingRequest {
  @scala.inline
  def apply(domainName: String, restApiId: String): CreateBasePathMappingRequest = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBasePathMappingRequest]
  }
  @scala.inline
  implicit class CreateBasePathMappingRequestOps[Self <: CreateBasePathMappingRequest] (val x: Self) extends AnyVal {
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
    def setDomainName(value: String): Self = this.set("domainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestApiId(value: String): Self = this.set("restApiId", value.asInstanceOf[js.Any])
    @scala.inline
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasePath: Self = this.set("basePath", js.undefined)
    @scala.inline
    def setStage(value: String): Self = this.set("stage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStage: Self = this.set("stage", js.undefined)
  }
  
}

