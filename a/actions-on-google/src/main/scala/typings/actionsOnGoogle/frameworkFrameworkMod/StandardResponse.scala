package typings.actionsOnGoogle.frameworkFrameworkMod

import typings.actionsOnGoogle.commonMod.JsonObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardResponse extends js.Object {
  /** @public */
  var body: JsonObject
  /** @public */
  var headers: js.UndefOr[Headers] = js.undefined
  /** @public */
  var status: Double
}

object StandardResponse {
  @scala.inline
  def apply(body: JsonObject, status: Double, headers: Headers = null): StandardResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardResponse]
  }
}

