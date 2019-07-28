package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDataCatalogEncryptionSettingsResponse extends js.Object {
  /**
    * The requested security configuration.
    */
  var DataCatalogEncryptionSettings: js.UndefOr[typings.awsDashSdk.clientsGlueMod.DataCatalogEncryptionSettings] = js.undefined
}

object GetDataCatalogEncryptionSettingsResponse {
  @scala.inline
  def apply(DataCatalogEncryptionSettings: DataCatalogEncryptionSettings = null): GetDataCatalogEncryptionSettingsResponse = {
    val __obj = js.Dynamic.literal()
    if (DataCatalogEncryptionSettings != null) __obj.updateDynamic("DataCatalogEncryptionSettings")(DataCatalogEncryptionSettings)
    __obj.asInstanceOf[GetDataCatalogEncryptionSettingsResponse]
  }
}

