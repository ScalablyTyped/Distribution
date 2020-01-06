package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBasePathMappingRequest extends js.Object {
  /**
    * [Required] The base path name of the BasePathMapping resource to delete. To specify an empty base path, set this parameter to '(none)'.
    */
  var basePath: String = js.native
  /**
    * [Required] The domain name of the BasePathMapping resource to delete.
    */
  var domainName: String = js.native
}

object DeleteBasePathMappingRequest {
  @scala.inline
  def apply(basePath: String, domainName: String): DeleteBasePathMappingRequest = {
    val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteBasePathMappingRequest]
  }
}

