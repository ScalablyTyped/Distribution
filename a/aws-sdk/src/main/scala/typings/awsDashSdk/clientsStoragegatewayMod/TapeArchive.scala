package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TapeArchive extends js.Object {
  /**
    * The time that the archiving of the virtual tape was completed. The default time stamp format is in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
    */
  var CompletionTime: js.UndefOr[Time] = js.undefined
  var KMSKey: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.KMSKey] = js.undefined
  /**
    * The ID of the pool that was used to archive the tape. The tapes in this pool are archived in the S3 storage class that is associated with the pool. Valid values: "GLACIER", "DEEP_ARCHIVE"
    */
  var PoolId: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.PoolId] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the tape gateway that the virtual tape is being retrieved to. The virtual tape is retrieved from the virtual tape shelf (VTS).
    */
  var RetrievedTo: js.UndefOr[GatewayARN] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of an archived virtual tape.
    */
  var TapeARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.TapeARN] = js.undefined
  /**
    * The barcode that identifies the archived virtual tape.
    */
  var TapeBarcode: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.TapeBarcode] = js.undefined
  /**
    * The date the virtual tape was created.
    */
  var TapeCreatedDate: js.UndefOr[Time] = js.undefined
  /**
    * The size, in bytes, of the archived virtual tape.
    */
  var TapeSizeInBytes: js.UndefOr[TapeSize] = js.undefined
  /**
    * The current state of the archived virtual tape.
    */
  var TapeStatus: js.UndefOr[TapeArchiveStatus] = js.undefined
  /**
    * The size, in bytes, of data stored on the virtual tape.  This value is not available for tapes created prior to May 13, 2015. 
    */
  var TapeUsedInBytes: js.UndefOr[TapeUsage] = js.undefined
}

object TapeArchive {
  @scala.inline
  def apply(
    CompletionTime: Time = null,
    KMSKey: KMSKey = null,
    PoolId: PoolId = null,
    RetrievedTo: GatewayARN = null,
    TapeARN: TapeARN = null,
    TapeBarcode: TapeBarcode = null,
    TapeCreatedDate: Time = null,
    TapeSizeInBytes: js.UndefOr[TapeSize] = js.undefined,
    TapeStatus: TapeArchiveStatus = null,
    TapeUsedInBytes: js.UndefOr[TapeUsage] = js.undefined
  ): TapeArchive = {
    val __obj = js.Dynamic.literal()
    if (CompletionTime != null) __obj.updateDynamic("CompletionTime")(CompletionTime)
    if (KMSKey != null) __obj.updateDynamic("KMSKey")(KMSKey)
    if (PoolId != null) __obj.updateDynamic("PoolId")(PoolId)
    if (RetrievedTo != null) __obj.updateDynamic("RetrievedTo")(RetrievedTo)
    if (TapeARN != null) __obj.updateDynamic("TapeARN")(TapeARN)
    if (TapeBarcode != null) __obj.updateDynamic("TapeBarcode")(TapeBarcode)
    if (TapeCreatedDate != null) __obj.updateDynamic("TapeCreatedDate")(TapeCreatedDate)
    if (!js.isUndefined(TapeSizeInBytes)) __obj.updateDynamic("TapeSizeInBytes")(TapeSizeInBytes)
    if (TapeStatus != null) __obj.updateDynamic("TapeStatus")(TapeStatus)
    if (!js.isUndefined(TapeUsedInBytes)) __obj.updateDynamic("TapeUsedInBytes")(TapeUsedInBytes)
    __obj.asInstanceOf[TapeArchive]
  }
}

