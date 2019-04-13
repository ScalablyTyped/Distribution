package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBasePathMappingRequest extends js.Object {
  /**
    * The base path name that callers of the API must provide as part of the URL after the domain name. This value must be unique for all of the mappings across a single API. Leave this blank if you do not want callers to specify a base path name after the domain name.
    */
  var basePath: js.UndefOr[String] = js.undefined
  /**
    * [Required] The domain name of the BasePathMapping resource to create.
    */
  var domainName: String
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
  /**
    * The name of the API's stage that you want to use for this mapping. Leave this blank if you do not want callers to explicitly specify the stage name after any base path name.
    */
  var stage: js.UndefOr[String] = js.undefined
}

object CreateBasePathMappingRequest {
  @scala.inline
  def apply(domainName: String, restApiId: String, basePath: String = null, stage: String = null): CreateBasePathMappingRequest = {
    val __obj = js.Dynamic.literal(domainName = domainName, restApiId = restApiId)
    if (basePath != null) __obj.updateDynamic("basePath")(basePath)
    if (stage != null) __obj.updateDynamic("stage")(stage)
    __obj.asInstanceOf[CreateBasePathMappingRequest]
  }
}

