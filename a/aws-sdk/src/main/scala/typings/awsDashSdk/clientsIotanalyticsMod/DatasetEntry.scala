package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetEntry extends js.Object {
  /**
    * The pre-signed URI of the data set item.
    */
  var dataURI: js.UndefOr[PresignedURI] = js.undefined
  /**
    * The name of the data set item.
    */
  var entryName: js.UndefOr[EntryName] = js.undefined
}

object DatasetEntry {
  @scala.inline
  def apply(dataURI: PresignedURI = null, entryName: EntryName = null): DatasetEntry = {
    val __obj = js.Dynamic.literal()
    if (dataURI != null) __obj.updateDynamic("dataURI")(dataURI)
    if (entryName != null) __obj.updateDynamic("entryName")(entryName)
    __obj.asInstanceOf[DatasetEntry]
  }
}

