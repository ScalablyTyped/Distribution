package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyFpgaImageRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * The description for the new AFI.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The name for the new AFI. The default is the name of the source AFI.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The ID of the source AFI.
    */
  var SourceFpgaImageId: String
  /**
    * The Region that contains the source AFI.
    */
  var SourceRegion: String
}

object CopyFpgaImageRequest {
  @scala.inline
  def apply(
    SourceFpgaImageId: String,
    SourceRegion: String,
    ClientToken: String = null,
    Description: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Name: String = null
  ): CopyFpgaImageRequest = {
    val __obj = js.Dynamic.literal(SourceFpgaImageId = SourceFpgaImageId, SourceRegion = SourceRegion)
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[CopyFpgaImageRequest]
  }
}

