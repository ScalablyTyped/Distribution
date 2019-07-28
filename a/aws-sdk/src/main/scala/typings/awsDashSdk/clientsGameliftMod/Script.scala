package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Script extends js.Object {
  /**
    * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Descriptive label that is associated with a script. Script names do not need to be unique.
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Unique identifier for a Realtime script
    */
  var ScriptId: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.ScriptId] = js.undefined
  /**
    * File size of the uploaded Realtime script, expressed in bytes. When files are uploaded from an S3 location, this value remains at "0".
    */
  var SizeOnDisk: js.UndefOr[PositiveLong] = js.undefined
  var StorageLocation: js.UndefOr[S3Location] = js.undefined
  /**
    * Version that is associated with a build or script. Version strings do not need to be unique.
    */
  var Version: js.UndefOr[NonZeroAndMaxString] = js.undefined
}

object Script {
  @scala.inline
  def apply(
    CreationTime: Timestamp = null,
    Name: NonZeroAndMaxString = null,
    ScriptId: ScriptId = null,
    SizeOnDisk: js.UndefOr[PositiveLong] = js.undefined,
    StorageLocation: S3Location = null,
    Version: NonZeroAndMaxString = null
  ): Script = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (ScriptId != null) __obj.updateDynamic("ScriptId")(ScriptId)
    if (!js.isUndefined(SizeOnDisk)) __obj.updateDynamic("SizeOnDisk")(SizeOnDisk)
    if (StorageLocation != null) __obj.updateDynamic("StorageLocation")(StorageLocation)
    if (Version != null) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[Script]
  }
}

