package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidDBInstanceModificationsMessage extends js.Object {
  /**
    * Valid storage options for your DB instance. 
    */
  var Storage: js.UndefOr[ValidStorageOptionsList] = js.undefined
  /**
    * Valid processor features for your DB instance. 
    */
  var ValidProcessorFeatures: js.UndefOr[AvailableProcessorFeatureList] = js.undefined
}

object ValidDBInstanceModificationsMessage {
  @scala.inline
  def apply(
    Storage: ValidStorageOptionsList = null,
    ValidProcessorFeatures: AvailableProcessorFeatureList = null
  ): ValidDBInstanceModificationsMessage = {
    val __obj = js.Dynamic.literal()
    if (Storage != null) __obj.updateDynamic("Storage")(Storage)
    if (ValidProcessorFeatures != null) __obj.updateDynamic("ValidProcessorFeatures")(ValidProcessorFeatures)
    __obj.asInstanceOf[ValidDBInstanceModificationsMessage]
  }
}

