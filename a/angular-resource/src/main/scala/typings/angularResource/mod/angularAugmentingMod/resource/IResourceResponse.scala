package typings.angularResource.mod.angularAugmentingMod.resource

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
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IResourceResponse]
  }
}

