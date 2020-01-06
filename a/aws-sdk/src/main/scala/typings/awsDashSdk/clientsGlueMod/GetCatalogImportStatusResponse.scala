package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCatalogImportStatusResponse extends js.Object {
  /**
    * The status of the specified catalog migration.
    */
  var ImportStatus: js.UndefOr[CatalogImportStatus] = js.native
}

object GetCatalogImportStatusResponse {
  @scala.inline
  def apply(ImportStatus: CatalogImportStatus = null): GetCatalogImportStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (ImportStatus != null) __obj.updateDynamic("ImportStatus")(ImportStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCatalogImportStatusResponse]
  }
}

