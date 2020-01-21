package typings.apolloLinkHttpCommon

import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyText extends js.Object {
  var bodyText: String
  var response: Response
  var statusCode: Double
}

object AnonBodyText {
  @scala.inline
  def apply(bodyText: String, response: Response, statusCode: Double): AnonBodyText = {
    val __obj = js.Dynamic.literal(bodyText = bodyText.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBodyText]
  }
}

