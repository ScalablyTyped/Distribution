package typings.archiver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoreOptions extends js.Object {
  var statConcurrency: js.UndefOr[Double] = js.undefined
}

object CoreOptions {
  @scala.inline
  def apply(statConcurrency: js.UndefOr[Double] = js.undefined): CoreOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(statConcurrency)) __obj.updateDynamic("statConcurrency")(statConcurrency.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreOptions]
  }
}

