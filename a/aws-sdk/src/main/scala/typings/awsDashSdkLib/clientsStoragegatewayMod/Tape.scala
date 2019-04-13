package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tape extends js.Object {
  var KMSKey: js.UndefOr[KMSKey] = js.undefined
  /**
    * The ID of the pool that contains tapes that will be archived. The tapes in this pool are archived in the S3 storage class that is associated with the pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class (Glacier or Deep Archive) that corresponds to the pool. Valid values: "GLACIER", "DEEP_ARCHIVE"
    */
  var PoolId: js.UndefOr[PoolId] = js.undefined
  /**
    * For archiving virtual tapes, indicates how much data remains to be uploaded before archiving is complete. Range: 0 (not started) to 100 (complete).
    */
  var Progress: js.UndefOr[DoubleObject] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the virtual tape.
    */
  var TapeARN: js.UndefOr[TapeARN] = js.undefined
  /**
    * The barcode that identifies a specific virtual tape.
    */
  var TapeBarcode: js.UndefOr[TapeBarcode] = js.undefined
  /**
    * The date the virtual tape was created.
    */
  var TapeCreatedDate: js.UndefOr[Time] = js.undefined
  /**
    * The size, in bytes, of the virtual tape capacity.
    */
  var TapeSizeInBytes: js.UndefOr[TapeSize] = js.undefined
  /**
    * The current state of the virtual tape.
    */
  var TapeStatus: js.UndefOr[TapeStatus] = js.undefined
  /**
    * The size, in bytes, of data stored on the virtual tape.  This value is not available for tapes created prior to May 13, 2015. 
    */
  var TapeUsedInBytes: js.UndefOr[TapeUsage] = js.undefined
  /**
    * The virtual tape library (VTL) device that the virtual tape is associated with.
    */
  var VTLDevice: js.UndefOr[VTLDeviceARN] = js.undefined
}

object Tape {
  @scala.inline
  def apply(
    KMSKey: KMSKey = null,
    PoolId: PoolId = null,
    Progress: js.UndefOr[DoubleObject] = js.undefined,
    TapeARN: TapeARN = null,
    TapeBarcode: TapeBarcode = null,
    TapeCreatedDate: Time = null,
    TapeSizeInBytes: js.UndefOr[TapeSize] = js.undefined,
    TapeStatus: TapeStatus = null,
    TapeUsedInBytes: js.UndefOr[TapeUsage] = js.undefined,
    VTLDevice: VTLDeviceARN = null
  ): Tape = {
    val __obj = js.Dynamic.literal()
    if (KMSKey != null) __obj.updateDynamic("KMSKey")(KMSKey)
    if (PoolId != null) __obj.updateDynamic("PoolId")(PoolId)
    if (!js.isUndefined(Progress)) __obj.updateDynamic("Progress")(Progress)
    if (TapeARN != null) __obj.updateDynamic("TapeARN")(TapeARN)
    if (TapeBarcode != null) __obj.updateDynamic("TapeBarcode")(TapeBarcode)
    if (TapeCreatedDate != null) __obj.updateDynamic("TapeCreatedDate")(TapeCreatedDate)
    if (!js.isUndefined(TapeSizeInBytes)) __obj.updateDynamic("TapeSizeInBytes")(TapeSizeInBytes)
    if (TapeStatus != null) __obj.updateDynamic("TapeStatus")(TapeStatus)
    if (!js.isUndefined(TapeUsedInBytes)) __obj.updateDynamic("TapeUsedInBytes")(TapeUsedInBytes)
    if (VTLDevice != null) __obj.updateDynamic("VTLDevice")(VTLDevice)
    __obj.asInstanceOf[Tape]
  }
}

