package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidDBInstanceModificationsMessage extends js.Object {
  /**
    * Valid storage options for your DB instance. 
    */
  var Storage: js.UndefOr[ValidStorageOptionsList] = js.native
  /**
    * Valid processor features for your DB instance. 
    */
  var ValidProcessorFeatures: js.UndefOr[AvailableProcessorFeatureList] = js.native
}

object ValidDBInstanceModificationsMessage {
  @scala.inline
  def apply(
    Storage: ValidStorageOptionsList = null,
    ValidProcessorFeatures: AvailableProcessorFeatureList = null
  ): ValidDBInstanceModificationsMessage = {
    val __obj = js.Dynamic.literal()
    if (Storage != null) __obj.updateDynamic("Storage")(Storage.asInstanceOf[js.Any])
    if (ValidProcessorFeatures != null) __obj.updateDynamic("ValidProcessorFeatures")(ValidProcessorFeatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidDBInstanceModificationsMessage]
  }
}

