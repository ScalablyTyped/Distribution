package typings
package awsDashSdkLib.clientsCognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Record extends js.Object {
  /**
    * The last modified date of the client device.
    */
  var DeviceLastModifiedDate: js.UndefOr[_Date] = js.undefined
  /**
    * The key for the record.
    */
  var Key: js.UndefOr[RecordKey] = js.undefined
  /**
    * The user/device that made the last change to this record.
    */
  var LastModifiedBy: js.UndefOr[String] = js.undefined
  /**
    * The date on which the record was last modified.
    */
  var LastModifiedDate: js.UndefOr[_Date] = js.undefined
  /**
    * The server sync count for this record.
    */
  var SyncCount: js.UndefOr[Long] = js.undefined
  /**
    * The value for the record.
    */
  var Value: js.UndefOr[RecordValue] = js.undefined
}

object Record {
  @scala.inline
  def apply(
    DeviceLastModifiedDate: _Date = null,
    Key: RecordKey = null,
    LastModifiedBy: String = null,
    LastModifiedDate: _Date = null,
    SyncCount: js.UndefOr[Long] = js.undefined,
    Value: RecordValue = null
  ): Record = {
    val __obj = js.Dynamic.literal()
    if (DeviceLastModifiedDate != null) __obj.updateDynamic("DeviceLastModifiedDate")(DeviceLastModifiedDate)
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (LastModifiedBy != null) __obj.updateDynamic("LastModifiedBy")(LastModifiedBy)
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate)
    if (!js.isUndefined(SyncCount)) __obj.updateDynamic("SyncCount")(SyncCount)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[Record]
  }
}

