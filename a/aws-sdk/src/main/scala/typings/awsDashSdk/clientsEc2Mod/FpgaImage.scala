package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FpgaImage extends js.Object {
  /**
    * The date and time the AFI was created.
    */
  var CreateTime: js.UndefOr[DateTime] = js.undefined
  /**
    * Indicates whether data retention support is enabled for the AFI.
    */
  var DataRetentionSupport: js.UndefOr[Boolean] = js.undefined
  /**
    * The description of the AFI.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The global FPGA image identifier (AGFI ID).
    */
  var FpgaImageGlobalId: js.UndefOr[String] = js.undefined
  /**
    * The FPGA image identifier (AFI ID).
    */
  var FpgaImageId: js.UndefOr[String] = js.undefined
  /**
    * The name of the AFI.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The alias of the AFI owner. Possible values include self, amazon, and aws-marketplace.
    */
  var OwnerAlias: js.UndefOr[String] = js.undefined
  /**
    * The AWS account ID of the AFI owner.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  /**
    * Information about the PCI bus.
    */
  var PciId: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.PciId] = js.undefined
  /**
    * The product codes for the AFI.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.undefined
  /**
    * Indicates whether the AFI is public.
    */
  var Public: js.UndefOr[Boolean] = js.undefined
  /**
    * The version of the AWS Shell that was used to create the bitstream.
    */
  var ShellVersion: js.UndefOr[String] = js.undefined
  /**
    * Information about the state of the AFI.
    */
  var State: js.UndefOr[FpgaImageState] = js.undefined
  /**
    * Any tags assigned to the AFI.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The time of the most recent update to the AFI.
    */
  var UpdateTime: js.UndefOr[DateTime] = js.undefined
}

object FpgaImage {
  @scala.inline
  def apply(
    CreateTime: DateTime = null,
    DataRetentionSupport: js.UndefOr[Boolean] = js.undefined,
    Description: String = null,
    FpgaImageGlobalId: String = null,
    FpgaImageId: String = null,
    Name: String = null,
    OwnerAlias: String = null,
    OwnerId: String = null,
    PciId: PciId = null,
    ProductCodes: ProductCodeList = null,
    Public: js.UndefOr[Boolean] = js.undefined,
    ShellVersion: String = null,
    State: FpgaImageState = null,
    Tags: TagList = null,
    UpdateTime: DateTime = null
  ): FpgaImage = {
    val __obj = js.Dynamic.literal()
    if (CreateTime != null) __obj.updateDynamic("CreateTime")(CreateTime)
    if (!js.isUndefined(DataRetentionSupport)) __obj.updateDynamic("DataRetentionSupport")(DataRetentionSupport)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (FpgaImageGlobalId != null) __obj.updateDynamic("FpgaImageGlobalId")(FpgaImageGlobalId)
    if (FpgaImageId != null) __obj.updateDynamic("FpgaImageId")(FpgaImageId)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (OwnerAlias != null) __obj.updateDynamic("OwnerAlias")(OwnerAlias)
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId)
    if (PciId != null) __obj.updateDynamic("PciId")(PciId)
    if (ProductCodes != null) __obj.updateDynamic("ProductCodes")(ProductCodes)
    if (!js.isUndefined(Public)) __obj.updateDynamic("Public")(Public)
    if (ShellVersion != null) __obj.updateDynamic("ShellVersion")(ShellVersion)
    if (State != null) __obj.updateDynamic("State")(State)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (UpdateTime != null) __obj.updateDynamic("UpdateTime")(UpdateTime)
    __obj.asInstanceOf[FpgaImage]
  }
}

