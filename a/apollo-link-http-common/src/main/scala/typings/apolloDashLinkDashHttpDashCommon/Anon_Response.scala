package typings.apolloDashLinkDashHttpDashCommon

import typings.std.Record
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Response extends js.Object {
  var response: Response
  var result: Record[String, _]
  var statusCode: Double
}

object Anon_Response {
  @scala.inline
  def apply(response: Response, result: Record[String, _], statusCode: Double): Anon_Response = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Response]
  }
}

