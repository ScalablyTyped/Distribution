package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaExtensionInfo extends js.Object {
  /**
    * A description of the schema extension.
    */
  var Description: js.UndefOr[Description] = js.undefined
  /**
    * The identifier of the directory to which the schema extension is applied.
    */
  var DirectoryId: js.UndefOr[DirectoryId] = js.undefined
  /**
    * The date and time that the schema extension was completed.
    */
  var EndDateTime: js.UndefOr[EndDateTime] = js.undefined
  /**
    * The identifier of the schema extension.
    */
  var SchemaExtensionId: js.UndefOr[SchemaExtensionId] = js.undefined
  /**
    * The current status of the schema extension.
    */
  var SchemaExtensionStatus: js.UndefOr[SchemaExtensionStatus] = js.undefined
  /**
    * The reason for the SchemaExtensionStatus.
    */
  var SchemaExtensionStatusReason: js.UndefOr[SchemaExtensionStatusReason] = js.undefined
  /**
    * The date and time that the schema extension started being applied to the directory.
    */
  var StartDateTime: js.UndefOr[StartDateTime] = js.undefined
}

object SchemaExtensionInfo {
  @scala.inline
  def apply(
    Description: Description = null,
    DirectoryId: DirectoryId = null,
    EndDateTime: EndDateTime = null,
    SchemaExtensionId: SchemaExtensionId = null,
    SchemaExtensionStatus: SchemaExtensionStatus = null,
    SchemaExtensionStatusReason: SchemaExtensionStatusReason = null,
    StartDateTime: StartDateTime = null
  ): SchemaExtensionInfo = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId)
    if (EndDateTime != null) __obj.updateDynamic("EndDateTime")(EndDateTime)
    if (SchemaExtensionId != null) __obj.updateDynamic("SchemaExtensionId")(SchemaExtensionId)
    if (SchemaExtensionStatus != null) __obj.updateDynamic("SchemaExtensionStatus")(SchemaExtensionStatus.asInstanceOf[js.Any])
    if (SchemaExtensionStatusReason != null) __obj.updateDynamic("SchemaExtensionStatusReason")(SchemaExtensionStatusReason)
    if (StartDateTime != null) __obj.updateDynamic("StartDateTime")(StartDateTime)
    __obj.asInstanceOf[SchemaExtensionInfo]
  }
}

