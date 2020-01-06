package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetContentDeliveryRule extends js.Object {
  /**
    * The destination to which data set contents are delivered.
    */
  var destination: DatasetContentDeliveryDestination = js.native
  /**
    * The name of the data set content delivery rules entry.
    */
  var entryName: js.UndefOr[EntryName] = js.native
}

object DatasetContentDeliveryRule {
  @scala.inline
  def apply(destination: DatasetContentDeliveryDestination, entryName: EntryName = null): DatasetContentDeliveryRule = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    if (entryName != null) __obj.updateDynamic("entryName")(entryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetContentDeliveryRule]
  }
}

