package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDataCatalogEncryptionSettingsRequest extends js.Object {
  /**
    * The ID of the Data Catalog to retrieve the security configuration for. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
}

object GetDataCatalogEncryptionSettingsRequest {
  @scala.inline
  def apply(CatalogId: CatalogIdString = null): GetDataCatalogEncryptionSettingsRequest = {
    val __obj = js.Dynamic.literal()
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataCatalogEncryptionSettingsRequest]
  }
}

