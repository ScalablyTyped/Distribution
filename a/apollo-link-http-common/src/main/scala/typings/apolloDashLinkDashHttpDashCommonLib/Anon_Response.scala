package typings
package apolloDashLinkDashHttpDashCommonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Response extends js.Object {
  var response: stdLib.Response
  var result: stdLib.Record[java.lang.String, _]
  var statusCode: scala.Double
}

object Anon_Response {
  @scala.inline
  def apply(response: stdLib.Response, result: stdLib.Record[java.lang.String, _], statusCode: scala.Double): Anon_Response = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("response")(response)
    __obj.updateDynamic("result")(result)
    __obj.updateDynamic("statusCode")(statusCode)
    __obj.asInstanceOf[Anon_Response]
  }
}

