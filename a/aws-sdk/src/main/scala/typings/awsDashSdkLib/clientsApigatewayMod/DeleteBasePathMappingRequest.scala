package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBasePathMappingRequest extends js.Object {
  /**
    * [Required] The base path name of the BasePathMapping resource to delete.
    */
  var basePath: String
  /**
    * [Required] The domain name of the BasePathMapping resource to delete.
    */
  var domainName: String
}

object DeleteBasePathMappingRequest {
  @scala.inline
  def apply(basePath: String, domainName: String): DeleteBasePathMappingRequest = {
    val __obj = js.Dynamic.literal(basePath = basePath, domainName = domainName)
  
    __obj.asInstanceOf[DeleteBasePathMappingRequest]
  }
}

