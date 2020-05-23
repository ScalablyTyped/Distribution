package typings.autoSni.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Http extends js.Object {
  var http: js.UndefOr[Double] = js.undefined
  var https: js.UndefOr[Double] = js.undefined
}

object Http {
  @scala.inline
  def apply(http: js.UndefOr[Double] = js.undefined, https: js.UndefOr[Double] = js.undefined): Http = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(http)) __obj.updateDynamic("http")(http.get.asInstanceOf[js.Any])
    if (!js.isUndefined(https)) __obj.updateDynamic("https")(https.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Http]
  }
}

