package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionTask extends js.Object {
  /**
    * The ID of the conversion task.
    */
  var ConversionTaskId: js.UndefOr[String] = js.undefined
  /**
    * The time when the task expires. If the upload isn't complete before the expiration time, we automatically cancel the task.
    */
  var ExpirationTime: js.UndefOr[String] = js.undefined
  /**
    * If the task is for importing an instance, this contains information about the import instance task.
    */
  var ImportInstance: js.UndefOr[ImportInstanceTaskDetails] = js.undefined
  /**
    * If the task is for importing a volume, this contains information about the import volume task.
    */
  var ImportVolume: js.UndefOr[ImportVolumeTaskDetails] = js.undefined
  /**
    * The state of the conversion task.
    */
  var State: js.UndefOr[ConversionTaskState] = js.undefined
  /**
    * The status message related to the conversion task.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
  /**
    * Any tags assigned to the task.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object ConversionTask {
  @scala.inline
  def apply(
    ConversionTaskId: String = null,
    ExpirationTime: String = null,
    ImportInstance: ImportInstanceTaskDetails = null,
    ImportVolume: ImportVolumeTaskDetails = null,
    State: ConversionTaskState = null,
    StatusMessage: String = null,
    Tags: TagList = null
  ): ConversionTask = {
    val __obj = js.Dynamic.literal()
    if (ConversionTaskId != null) __obj.updateDynamic("ConversionTaskId")(ConversionTaskId)
    if (ExpirationTime != null) __obj.updateDynamic("ExpirationTime")(ExpirationTime)
    if (ImportInstance != null) __obj.updateDynamic("ImportInstance")(ImportInstance)
    if (ImportVolume != null) __obj.updateDynamic("ImportVolume")(ImportVolume)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ConversionTask]
  }
}

