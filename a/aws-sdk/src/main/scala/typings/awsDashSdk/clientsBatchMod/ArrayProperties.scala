package typings.awsDashSdk.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayProperties extends js.Object {
  /**
    * The size of the array job.
    */
  var size: js.UndefOr[Integer] = js.undefined
}

object ArrayProperties {
  @scala.inline
  def apply(size: Int | Double = null): ArrayProperties = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayProperties]
  }
}

