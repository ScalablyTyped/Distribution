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
  def apply(estimatedOn: Timestamp = null, estimatedSizeInBytes: Int | Double = null): EstimatedResourceSize = {
    val __obj = js.Dynamic.literal()
    if (estimatedOn != null) __obj.updateDynamic("estimatedOn")(estimatedOn)
    if (estimatedSizeInBytes != null) __obj.updateDynamic("estimatedSizeInBytes")(estimatedSizeInBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[EstimatedResourceSize]
  }
}

