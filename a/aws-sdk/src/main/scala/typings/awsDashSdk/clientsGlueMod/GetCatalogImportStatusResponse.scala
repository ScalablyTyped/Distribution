package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCatalogImportStatusResponse extends js.Object {
  /**
    * The status of the specified catalog migration.
    */
  var ImportStatus: js.UndefOr[CatalogImportStatus] = js.undefined
}

object GetCatalogImportStatusResponse {
  @scala.inline
  def apply(ImportStatus: CatalogImportStatus = null): GetCatalogImportStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (ImportStatus != null) __obj.updateDynamic("ImportStatus")(ImportStatus)
    __obj.asInstanceOf[GetCatalogImportStatusResponse]
  }
}

