package typings.awsDashSdk.clientsTranslateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportTerminologyRequest extends js.Object {
  /**
    * The description of the custom terminology being imported.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsTranslateMod.Description] = js.undefined
  /**
    * The encryption key for the custom terminology being imported.
    */
  var EncryptionKey: js.UndefOr[typings.awsDashSdk.clientsTranslateMod.EncryptionKey] = js.undefined
  /**
    * The merge strategy of the custom terminology being imported. Currently, only the OVERWRITE merge strategy is supported. In this case, the imported terminology will overwrite an existing terminology of the same name.
    */
  var MergeStrategy: typings.awsDashSdk.clientsTranslateMod.MergeStrategy
  /**
    * The name of the custom terminology being imported.
    */
  var Name: ResourceName
  /**
    * The terminology data for the custom terminology being imported.
    */
  var TerminologyData: typings.awsDashSdk.clientsTranslateMod.TerminologyData
}

object ImportTerminologyRequest {
  @scala.inline
  def apply(
    MergeStrategy: MergeStrategy,
    Name: ResourceName,
    TerminologyData: TerminologyData,
    Description: Description = null,
    EncryptionKey: EncryptionKey = null
  ): ImportTerminologyRequest = {
    val __obj = js.Dynamic.literal(MergeStrategy = MergeStrategy.asInstanceOf[js.Any], Name = Name, TerminologyData = TerminologyData)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (EncryptionKey != null) __obj.updateDynamic("EncryptionKey")(EncryptionKey)
    __obj.asInstanceOf[ImportTerminologyRequest]
  }
}

