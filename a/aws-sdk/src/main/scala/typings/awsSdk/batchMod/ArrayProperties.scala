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
  def apply(size: Int | Double = null): ArrayProperties = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayProperties]
  }
}

