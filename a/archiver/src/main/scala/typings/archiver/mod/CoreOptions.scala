package typings.archiver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoreOptions extends js.Object {
  var statConcurrency: js.UndefOr[Double] = js.undefined
}

object CoreOptions {
  @scala.inline
  def apply(statConcurrency: Int | Double = null): CoreOptions = {
    val __obj = js.Dynamic.literal()
    if (statConcurrency != null) __obj.updateDynamic("statConcurrency")(statConcurrency.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreOptions]
  }
}

