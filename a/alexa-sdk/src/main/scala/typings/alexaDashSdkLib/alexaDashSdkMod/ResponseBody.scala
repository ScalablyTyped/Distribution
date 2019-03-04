package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseBody extends js.Object {
  var response: Response
  var sessionAttributes: js.UndefOr[js.Any] = js.undefined
  var version: java.lang.String
}

object ResponseBody {
  @scala.inline
  def apply(response: Response, version: java.lang.String, sessionAttributes: js.Any = null): ResponseBody = {
    val __obj = js.Dynamic.literal(response = response, version = version)
    if (sessionAttributes != null) __obj.updateDynamic("sessionAttributes")(sessionAttributes)
    __obj.asInstanceOf[ResponseBody]
  }
}

