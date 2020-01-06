package typings.awsDashSdk.clientsCognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordPatch extends js.Object {
  /**
    * The last modified date of the client device.
    */
  var DeviceLastModifiedDate: js.UndefOr[_Date] = js.native
  /**
    * The key associated with the record patch.
    */
  var Key: RecordKey = js.native
  /**
    * An operation, either replace or remove.
    */
  var Op: Operation = js.native
  /**
    * Last known server sync count for this record. Set to 0 if unknown.
    */
  var SyncCount: Long = js.native
  /**
    * The value associated with the record patch.
    */
  var Value: js.UndefOr[RecordValue] = js.native
}

object RecordPatch {
  @scala.inline
  def apply(
    Key: RecordKey,
    Op: Operation,
    SyncCount: Long,
    DeviceLastModifiedDate: _Date = null,
    Value: RecordValue = null
  ): RecordPatch = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Op = Op.asInstanceOf[js.Any], SyncCount = SyncCount.asInstanceOf[js.Any])
    if (DeviceLastModifiedDate != null) __obj.updateDynamic("DeviceLastModifiedDate")(DeviceLastModifiedDate.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordPatch]
  }
}

