package typings
package apolloDashLinkDashHttpDashCommonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyText extends js.Object {
  var bodyText: java.lang.String
  var response: stdLib.Response
  var statusCode: scala.Double
}

object Anon_BodyText {
  @scala.inline
  def apply(bodyText: java.lang.String, response: stdLib.Response, statusCode: scala.Double): Anon_BodyText = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bodyText")(bodyText)
    __obj.updateDynamic("response")(response)
    __obj.updateDynamic("statusCode")(statusCode)
    __obj.asInstanceOf[Anon_BodyText]
  }
}

