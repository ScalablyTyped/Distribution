package typings.alexaDashSdk.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseBody extends js.Object {
  var response: Response
  var sessionAttributes: js.UndefOr[js.Any] = js.undefined
  var version: String
}

object ResponseBody {
  @scala.inline
  def apply(response: Response, version: String, sessionAttributes: js.Any = null): ResponseBody = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (sessionAttributes != null) __obj.updateDynamic("sessionAttributes")(sessionAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseBody]
  }
}

