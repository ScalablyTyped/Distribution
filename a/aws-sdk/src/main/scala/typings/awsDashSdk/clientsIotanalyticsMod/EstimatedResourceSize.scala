package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EstimatedResourceSize extends js.Object {
  /**
    * The time when the estimate of the size of the resource was made.
    */
  var estimatedOn: js.UndefOr[Timestamp] = js.undefined
  /**
    * The estimated size of the resource in bytes.
    */
  var estimatedSizeInBytes: js.UndefOr[SizeInBytes] = js.undefined
}

object EstimatedResourceSize {
  @scala.inline
  def apply(estimatedOn: Timestamp = null, estimatedSizeInBytes: js.UndefOr[SizeInBytes] = js.undefined): EstimatedResourceSize = {
    val __obj = js.Dynamic.literal()
    if (estimatedOn != null) __obj.updateDynamic("estimatedOn")(estimatedOn)
    if (!js.isUndefined(estimatedSizeInBytes)) __obj.updateDynamic("estimatedSizeInBytes")(estimatedSizeInBytes)
    __obj.asInstanceOf[EstimatedResourceSize]
  }
}

