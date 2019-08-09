package typings.awsDashSdk.clientsLakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDataLakeSettingsResponse extends js.Object {
  /**
    * A list of AWS Lake Formation principals. 
    */
  var DataLakeSettings: js.UndefOr[typings.awsDashSdk.clientsLakeformationMod.DataLakeSettings] = js.undefined
}

object GetDataLakeSettingsResponse {
  @scala.inline
  def apply(DataLakeSettings: DataLakeSettings = null): GetDataLakeSettingsResponse = {
    val __obj = js.Dynamic.literal()
    if (DataLakeSettings != null) __obj.updateDynamic("DataLakeSettings")(DataLakeSettings)
    __obj.asInstanceOf[GetDataLakeSettingsResponse]
  }
}

