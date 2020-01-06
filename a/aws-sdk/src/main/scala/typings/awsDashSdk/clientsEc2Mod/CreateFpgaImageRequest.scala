package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFpgaImageRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * A description for the AFI.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The location of the encrypted design checkpoint in Amazon S3. The input must be a tarball.
    */
  var InputStorageLocation: StorageLocation = js.native
  /**
    * The location in Amazon S3 for the output logs.
    */
  var LogsStorageLocation: js.UndefOr[StorageLocation] = js.native
  /**
    * A name for the AFI.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The tags to apply to the FPGA image during creation.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
}

object CreateFpgaImageRequest {
  @scala.inline
  def apply(
    InputStorageLocation: StorageLocation,
    ClientToken: String = null,
    Description: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    LogsStorageLocation: StorageLocation = null,
    Name: String = null,
    TagSpecifications: TagSpecificationList = null
  ): CreateFpgaImageRequest = {
    val __obj = js.Dynamic.literal(InputStorageLocation = InputStorageLocation.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (LogsStorageLocation != null) __obj.updateDynamic("LogsStorageLocation")(LogsStorageLocation.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (TagSpecifications != null) __obj.updateDynamic("TagSpecifications")(TagSpecifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFpgaImageRequest]
  }
}

