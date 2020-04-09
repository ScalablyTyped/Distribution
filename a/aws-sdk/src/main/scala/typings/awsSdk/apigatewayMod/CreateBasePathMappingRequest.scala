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
  def apply(domainName: String, restApiId: String, basePath: String = null, stage: String = null): CreateBasePathMappingRequest = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    if (basePath != null) __obj.updateDynamic("basePath")(basePath.asInstanceOf[js.Any])
    if (stage != null) __obj.updateDynamic("stage")(stage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBasePathMappingRequest]
  }
}

