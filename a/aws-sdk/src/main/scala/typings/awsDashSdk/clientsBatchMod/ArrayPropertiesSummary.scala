package typings.awsDashSdk.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayPropertiesSummary extends js.Object {
  /**
    * The job index within the array that is associated with this job. This parameter is returned for children of array jobs.
    */
  var index: js.UndefOr[Integer] = js.native
  /**
    * The size of the array job. This parameter is returned for parent array jobs.
    */
  var size: js.UndefOr[Integer] = js.native
}

object ArrayPropertiesSummary {
  @scala.inline
  def apply(index: Int | Double = null, size: Int | Double = null): ArrayPropertiesSummary = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayPropertiesSummary]
  }
}

