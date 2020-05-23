package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayProperties extends js.Object {
  /**
    * The size of the array job.
    */
  var size: js.UndefOr[Integer] = js.native
}

object ArrayProperties {
  @scala.inline
  def apply(size: js.UndefOr[Integer] = js.undefined): ArrayProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayProperties]
  }
}

