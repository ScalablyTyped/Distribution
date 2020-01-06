package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FpgaImage extends js.Object {
  /**
    * The date and time the AFI was created.
    */
  var CreateTime: js.UndefOr[DateTime] = js.native
  /**
    * Indicates whether data retention support is enabled for the AFI.
    */
  var DataRetentionSupport: js.UndefOr[Boolean] = js.native
  /**
    * The description of the AFI.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The global FPGA image identifier (AGFI ID).
    */
  var FpgaImageGlobalId: js.UndefOr[String] = js.native
  /**
    * The FPGA image identifier (AFI ID).
    */
  var FpgaImageId: js.UndefOr[String] = js.native
  /**
    * The name of the AFI.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The alias of the AFI owner. Possible values include self, amazon, and aws-marketplace.
    */
  var OwnerAlias: js.UndefOr[String] = js.native
  /**
    * The AWS account ID of the AFI owner.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * Information about the PCI bus.
    */
  var PciId: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.PciId] = js.native
  /**
    * The product codes for the AFI.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.native
  /**
    * Indicates whether the AFI is public.
    */
  var Public: js.UndefOr[Boolean] = js.native
  /**
    * The version of the AWS Shell that was used to create the bitstream.
    */
  var ShellVersion: js.UndefOr[String] = js.native
  /**
    * Information about the state of the AFI.
    */
  var State: js.UndefOr[FpgaImageState] = js.native
  /**
    * Any tags assigned to the AFI.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The time of the most recent update to the AFI.
    */
  var UpdateTime: js.UndefOr[DateTime] = js.native
}

object FpgaImage {
  @scala.inline
  def apply(
    CreateTime: DateTime = null,
    DataRetentionSupport: js.UndefOr[scala.Boolean] = js.undefined,
    Description: String = null,
    FpgaImageGlobalId: String = null,
    FpgaImageId: String = null,
    Name: String = null,
    OwnerAlias: String = null,
    OwnerId: String = null,
    PciId: PciId = null,
    ProductCodes: ProductCodeList = null,
    Public: js.UndefOr[scala.Boolean] = js.undefined,
    ShellVersion: String = null,
    State: FpgaImageState = null,
    Tags: TagList = null,
    UpdateTime: DateTime = null
  ): FpgaImage = {
    val __obj = js.Dynamic.literal()
    if (CreateTime != null) __obj.updateDynamic("CreateTime")(CreateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(DataRetentionSupport)) __obj.updateDynamic("DataRetentionSupport")(DataRetentionSupport.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (FpgaImageGlobalId != null) __obj.updateDynamic("FpgaImageGlobalId")(FpgaImageGlobalId.asInstanceOf[js.Any])
    if (FpgaImageId != null) __obj.updateDynamic("FpgaImageId")(FpgaImageId.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (OwnerAlias != null) __obj.updateDynamic("OwnerAlias")(OwnerAlias.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    if (PciId != null) __obj.updateDynamic("PciId")(PciId.asInstanceOf[js.Any])
    if (ProductCodes != null) __obj.updateDynamic("ProductCodes")(ProductCodes.asInstanceOf[js.Any])
    if (!js.isUndefined(Public)) __obj.updateDynamic("Public")(Public.asInstanceOf[js.Any])
    if (ShellVersion != null) __obj.updateDynamic("ShellVersion")(ShellVersion.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (UpdateTime != null) __obj.updateDynamic("UpdateTime")(UpdateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[FpgaImage]
  }
}

