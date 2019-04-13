package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobExecutionStatusDetails extends js.Object {
  /**
    * The job execution status.
    */
  var detailsMap: js.UndefOr[DetailsMap] = js.undefined
}

object JobExecutionStatusDetails {
  @scala.inline
  def apply(detailsMap: DetailsMap = null): JobExecutionStatusDetails = {
    val __obj = js.Dynamic.literal()
    if (detailsMap != null) __obj.updateDynamic("detailsMap")(detailsMap)
    __obj.asInstanceOf[JobExecutionStatusDetails]
  }
}

