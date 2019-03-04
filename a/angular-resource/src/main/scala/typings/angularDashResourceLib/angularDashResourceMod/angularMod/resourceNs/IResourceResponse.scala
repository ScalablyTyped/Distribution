package typings
package angularDashResourceLib.angularDashResourceMod.angularMod.resourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceResponse extends js.Object {
  var config: js.Any
  var data: js.Any
  var headers: js.Any
  var resource: js.Any
  var status: scala.Double
  var statusText: java.lang.String
}

object IResourceResponse {
  @scala.inline
  def apply(
    config: js.Any,
    data: js.Any,
    headers: js.Any,
    resource: js.Any,
    status: scala.Double,
    statusText: java.lang.String
  ): IResourceResponse = {
    val __obj = js.Dynamic.literal(config = config, data = data, headers = headers, resource = resource, status = status, statusText = statusText)
  
    __obj.asInstanceOf[IResourceResponse]
  }
}

