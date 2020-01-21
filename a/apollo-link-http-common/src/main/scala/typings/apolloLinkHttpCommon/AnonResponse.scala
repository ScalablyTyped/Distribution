package typings.apolloLinkHttpCommon

import typings.std.Record
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResponse extends js.Object {
  var response: Response
  var result: Record[String, _]
  var statusCode: Double
}

object AnonResponse {
  @scala.inline
  def apply(response: Response, result: Record[String, _], statusCode: Double): AnonResponse = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonResponse]
  }
}

