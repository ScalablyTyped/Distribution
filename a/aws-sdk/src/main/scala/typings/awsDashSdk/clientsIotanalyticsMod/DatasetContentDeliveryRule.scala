package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetContentDeliveryRule extends js.Object {
  /**
    * The destination to which data set contents are delivered.
    */
  var destination: DatasetContentDeliveryDestination
  /**
    * The name of the data set content delivery rules entry.
    */
  var entryName: js.UndefOr[EntryName] = js.undefined
}

object DatasetContentDeliveryRule {
  @scala.inline
  def apply(destination: DatasetContentDeliveryDestination, entryName: EntryName = null): DatasetContentDeliveryRule = {
    val __obj = js.Dynamic.literal(destination = destination)
    if (entryName != null) __obj.updateDynamic("entryName")(entryName)
    __obj.asInstanceOf[DatasetContentDeliveryRule]
  }
}

