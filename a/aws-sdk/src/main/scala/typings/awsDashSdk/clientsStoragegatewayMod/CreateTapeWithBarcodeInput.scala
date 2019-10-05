package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTapeWithBarcodeInput extends js.Object {
  /**
    * The unique Amazon Resource Name (ARN) that represents the gateway to associate the virtual tape with. Use the ListGateways operation to return a list of gateways for your account and AWS Region.
    */
  var GatewayARN: typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN
  /**
    * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon S3. Optional.
    */
  var KMSEncrypted: js.UndefOr[Boolean] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the AWS KMS Key used for Amazon S3 server side encryption. This value can only be set when KMSEncrypted is true. Optional.
    */
  var KMSKey: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.KMSKey] = js.undefined
  /**
    * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the S3 storage class that is associated with the pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class (Glacier or Deep Archive) that corresponds to the pool. Valid values: "GLACIER", "DEEP_ARCHIVE"
    */
  var PoolId: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.PoolId] = js.undefined
  /**
    * A list of up to 50 tags that can be assigned to a virtual tape that has a barcode. Each tag is a key-value pair.  Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the maximum length for a tag's value is 256. 
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.Tags] = js.undefined
  /**
    * The barcode that you want to assign to the tape.  Barcodes cannot be reused. This includes barcodes used for tapes that have been deleted. 
    */
  var TapeBarcode: typings.awsDashSdk.clientsStoragegatewayMod.TapeBarcode
  /**
    * The size, in bytes, of the virtual tape that you want to create.  The size must be aligned by gigabyte (1024*1024*1024 byte). 
    */
  var TapeSizeInBytes: TapeSize
}

object CreateTapeWithBarcodeInput {
  @scala.inline
  def apply(
    GatewayARN: GatewayARN,
    TapeBarcode: TapeBarcode,
    TapeSizeInBytes: TapeSize,
    KMSEncrypted: js.UndefOr[scala.Boolean] = js.undefined,
    KMSKey: KMSKey = null,
    PoolId: PoolId = null,
    Tags: Tags = null
  ): CreateTapeWithBarcodeInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN, TapeBarcode = TapeBarcode, TapeSizeInBytes = TapeSizeInBytes)
    if (!js.isUndefined(KMSEncrypted)) __obj.updateDynamic("KMSEncrypted")(KMSEncrypted)
    if (KMSKey != null) __obj.updateDynamic("KMSKey")(KMSKey)
    if (PoolId != null) __obj.updateDynamic("PoolId")(PoolId)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateTapeWithBarcodeInput]
  }
}

