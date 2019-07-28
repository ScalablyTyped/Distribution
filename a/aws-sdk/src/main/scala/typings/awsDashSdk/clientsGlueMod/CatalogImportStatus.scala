package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatalogImportStatus extends js.Object {
  /**
    * True if the migration has completed, or False otherwise.
    */
  var ImportCompleted: js.UndefOr[Boolean] = js.undefined
  /**
    * The time that the migration was started.
    */
  var ImportTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the person who initiated the migration.
    */
  var ImportedBy: js.UndefOr[NameString] = js.undefined
}

object CatalogImportStatus {
  @scala.inline
  def apply(
    ImportCompleted: js.UndefOr[Boolean] = js.undefined,
    ImportTime: Timestamp = null,
    ImportedBy: NameString = null
  ): CatalogImportStatus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ImportCompleted)) __obj.updateDynamic("ImportCompleted")(ImportCompleted)
    if (ImportTime != null) __obj.updateDynamic("ImportTime")(ImportTime)
    if (ImportedBy != null) __obj.updateDynamic("ImportedBy")(ImportedBy)
    __obj.asInstanceOf[CatalogImportStatus]
  }
}

