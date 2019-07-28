package typings.apolloDashLinkDashHttpDashCommon

import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyText extends js.Object {
  var bodyText: String
  var response: Response
  var statusCode: Double
}

object Anon_BodyText {
  @scala.inline
  def apply(bodyText: String, response: Response, statusCode: Double): Anon_BodyText = {
    val __obj = js.Dynamic.literal(bodyText = bodyText, response = response, statusCode = statusCode)
  
    __obj.asInstanceOf[Anon_BodyText]
  }
}

