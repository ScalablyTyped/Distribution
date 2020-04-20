package typings.activexShdocvw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBstrUrl extends js.Object {
  var Cancel: Boolean
  val bstrUrl: String
  val bstrUrlContext: String
  val dwFlags: Double
  var ppDisp: js.Any
}

object AnonBstrUrl {
  @scala.inline
  def apply(Cancel: Boolean, bstrUrl: String, bstrUrlContext: String, dwFlags: Double, ppDisp: js.Any): AnonBstrUrl = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], bstrUrl = bstrUrl.asInstanceOf[js.Any], bstrUrlContext = bstrUrlContext.asInstanceOf[js.Any], dwFlags = dwFlags.asInstanceOf[js.Any], ppDisp = ppDisp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBstrUrl]
  }
}

