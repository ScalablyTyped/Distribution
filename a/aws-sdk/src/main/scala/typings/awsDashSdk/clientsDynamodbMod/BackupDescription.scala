package typings.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupDescription extends js.Object {
  /**
    * Contains the details of the backup created for the table. 
    */
  var BackupDetails: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.BackupDetails] = js.undefined
  /**
    * Contains the details of the table when the backup was created. 
    */
  var SourceTableDetails: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.SourceTableDetails] = js.undefined
  /**
    * Contains the details of the features enabled on the table when the backup was created. For example, LSIs, GSIs, streams, TTL.
    */
  var SourceTableFeatureDetails: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.SourceTableFeatureDetails] = js.undefined
}

object BackupDescription {
  @scala.inline
  def apply(
    BackupDetails: BackupDetails = null,
    SourceTableDetails: SourceTableDetails = null,
    SourceTableFeatureDetails: SourceTableFeatureDetails = null
  ): BackupDescription = {
    val __obj = js.Dynamic.literal()
    if (BackupDetails != null) __obj.updateDynamic("BackupDetails")(BackupDetails)
    if (SourceTableDetails != null) __obj.updateDynamic("SourceTableDetails")(SourceTableDetails)
    if (SourceTableFeatureDetails != null) __obj.updateDynamic("SourceTableFeatureDetails")(SourceTableFeatureDetails)
    __obj.asInstanceOf[BackupDescription]
  }
}

