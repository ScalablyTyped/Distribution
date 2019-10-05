package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TapeInfo extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the gateway. Use the ListGateways operation to return a list of gateways for your account and AWS Region.
    */
  var GatewayARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN] = js.undefined
  /**
    * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the S3 storage class that is associated with the pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class (Glacier or Deep Archive) that corresponds to the pool. Valid values: "GLACIER", "DEEP_ARCHIVE"
    */
  var PoolId: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.PoolId] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of a virtual tape.
    */
  var TapeARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.TapeARN] = js.undefined
  /**
    * The barcode that identifies a specific virtual tape.
    */
  var TapeBarcode: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.TapeBarcode] = js.undefined
  /**
    * The size, in bytes, of a virtual tape.
    */
  var TapeSizeInBytes: js.UndefOr[TapeSize] = js.undefined
  /**
    * The status of the tape.
    */
  var TapeStatus: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.TapeStatus] = js.undefined
}

object TapeInfo {
  @scala.inline
  def apply(
    GatewayARN: GatewayARN = null,
    PoolId: PoolId = null,
    TapeARN: TapeARN = null,
    TapeBarcode: TapeBarcode = null,
    TapeSizeInBytes: Int | Double = null,
    TapeStatus: TapeStatus = null
  ): TapeInfo = {
    val __obj = js.Dynamic.literal()
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN)
    if (PoolId != null) __obj.updateDynamic("PoolId")(PoolId)
    if (TapeARN != null) __obj.updateDynamic("TapeARN")(TapeARN)
    if (TapeBarcode != null) __obj.updateDynamic("TapeBarcode")(TapeBarcode)
    if (TapeSizeInBytes != null) __obj.updateDynamic("TapeSizeInBytes")(TapeSizeInBytes.asInstanceOf[js.Any])
    if (TapeStatus != null) __obj.updateDynamic("TapeStatus")(TapeStatus)
    __obj.asInstanceOf[TapeInfo]
  }
}

