package typings.angularDashResource.angularDashResourceMod.angularMod.resourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceResponse extends js.Object {
  var config: js.Any
  var data: js.Any
  var headers: js.Any
  var resource: js.Any
  var status: Double
  var statusText: String
}

object IResourceResponse {
  @scala.inline
  def apply(
    config: js.Any,
    data: js.Any,
    headers: js.Any,
    resource: js.Any,
    status: Double,
    statusText: String
  ): IResourceResponse = {
    val __obj = js.Dynamic.literal(config = config, data = data, headers = headers, resource = resource, status = status, statusText = statusText)
  
    __obj.asInstanceOf[IResourceResponse]
  }
}

