package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMultiOptions extends js.Object {
  var quite: js.UndefOr[Boolean] = js.undefined
   // quite mode or verbose mode, default is false
  var timeout: js.UndefOr[Double] = js.undefined
}

object DeleteMultiOptions {
  @scala.inline
  def apply(quite: js.UndefOr[Boolean] = js.undefined, timeout: js.UndefOr[Double] = js.undefined): DeleteMultiOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(quite)) __obj.updateDynamic("quite")(quite.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMultiOptions]
  }
}

