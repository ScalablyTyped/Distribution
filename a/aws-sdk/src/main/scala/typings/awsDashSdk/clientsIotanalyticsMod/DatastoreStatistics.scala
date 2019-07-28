package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatastoreStatistics extends js.Object {
  /**
    * The estimated size of the data store.
    */
  var size: js.UndefOr[EstimatedResourceSize] = js.undefined
}

object DatastoreStatistics {
  @scala.inline
  def apply(size: EstimatedResourceSize = null): DatastoreStatistics = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[DatastoreStatistics]
  }
}

