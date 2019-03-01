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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("config")(config)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("resource")(resource)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("statusText")(statusText)
    __obj.asInstanceOf[IResourceResponse]
  }
}

