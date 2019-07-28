package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFpgaImageRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * A description for the AFI.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The location of the encrypted design checkpoint in Amazon S3. The input must be a tarball.
    */
  var InputStorageLocation: StorageLocation
  /**
    * The location in Amazon S3 for the output logs.
    */
  var LogsStorageLocation: js.UndefOr[StorageLocation] = js.undefined
  /**
    * A name for the AFI.
    */
  var Name: js.UndefOr[String] = js.undefined
}

object CreateFpgaImageRequest {
  @scala.inline
  def apply(
    InputStorageLocation: StorageLocation,
    ClientToken: String = null,
    Description: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    LogsStorageLocation: StorageLocation = null,
    Name: String = null
  ): CreateFpgaImageRequest = {
    val __obj = js.Dynamic.literal(InputStorageLocation = InputStorageLocation)
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (LogsStorageLocation != null) __obj.updateDynamic("LogsStorageLocation")(LogsStorageLocation)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[CreateFpgaImageRequest]
  }
}

