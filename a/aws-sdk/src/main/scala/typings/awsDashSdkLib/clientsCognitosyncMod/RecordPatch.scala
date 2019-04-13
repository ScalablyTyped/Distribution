package typings
package awsDashSdkLib.clientsCognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordPatch extends js.Object {
  /**
    * The last modified date of the client device.
    */
  var DeviceLastModifiedDate: js.UndefOr[_Date] = js.undefined
  /**
    * The key associated with the record patch.
    */
  var Key: RecordKey
  /**
    * An operation, either replace or remove.
    */
  var Op: Operation
  /**
    * Last known server sync count for this record. Set to 0 if unknown.
    */
  var SyncCount: Long
  /**
    * The value associated with the record patch.
    */
  var Value: js.UndefOr[RecordValue] = js.undefined
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
    val __obj = js.Dynamic.literal(Key = Key, Op = Op.asInstanceOf[js.Any], SyncCount = SyncCount)
    if (DeviceLastModifiedDate != null) __obj.updateDynamic("DeviceLastModifiedDate")(DeviceLastModifiedDate)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[RecordPatch]
  }
}

