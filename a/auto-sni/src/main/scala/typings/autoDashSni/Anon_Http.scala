package typings.autoDashSni

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Http extends js.Object {
  var http: js.UndefOr[Double] = js.undefined
  var https: js.UndefOr[Double] = js.undefined
}

object Anon_Http {
  @scala.inline
  def apply(http: Int | Double = null, https: Int | Double = null): Anon_Http = {
    val __obj = js.Dynamic.literal()
    if (http != null) __obj.updateDynamic("http")(http.asInstanceOf[js.Any])
    if (https != null) __obj.updateDynamic("https")(https.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Http]
  }
}

