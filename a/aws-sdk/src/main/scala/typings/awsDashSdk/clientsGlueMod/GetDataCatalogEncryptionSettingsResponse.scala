package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDataCatalogEncryptionSettingsResponse extends js.Object {
  /**
    * The requested security configuration.
    */
  var DataCatalogEncryptionSettings: js.UndefOr[typings.awsDashSdk.clientsGlueMod.DataCatalogEncryptionSettings] = js.native
}

object GetDataCatalogEncryptionSettingsResponse {
  @scala.inline
  def apply(DataCatalogEncryptionSettings: DataCatalogEncryptionSettings = null): GetDataCatalogEncryptionSettingsResponse = {
    val __obj = js.Dynamic.literal()
    if (DataCatalogEncryptionSettings != null) __obj.updateDynamic("DataCatalogEncryptionSettings")(DataCatalogEncryptionSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataCatalogEncryptionSettingsResponse]
  }
}

