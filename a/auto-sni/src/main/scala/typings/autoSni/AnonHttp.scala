package typings.autoSni

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHttp extends js.Object {
  var http: js.UndefOr[Double] = js.undefined
  var https: js.UndefOr[Double] = js.undefined
}

object AnonHttp {
  @scala.inline
  def apply(http: Int | Double = null, https: Int | Double = null): AnonHttp = {
    val __obj = js.Dynamic.literal()
    if (http != null) __obj.updateDynamic("http")(http.asInstanceOf[js.Any])
    if (https != null) __obj.updateDynamic("https")(https.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHttp]
  }
}

