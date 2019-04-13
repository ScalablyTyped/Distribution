package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDataCatalogEncryptionSettingsRequest extends js.Object {
  /**
    * The ID of the Data Catalog for which to retrieve the security configuration. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
}

object GetDataCatalogEncryptionSettingsRequest {
  @scala.inline
  def apply(CatalogId: CatalogIdString = null): GetDataCatalogEncryptionSettingsRequest = {
    val __obj = js.Dynamic.literal()
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    __obj.asInstanceOf[GetDataCatalogEncryptionSettingsRequest]
  }
}

