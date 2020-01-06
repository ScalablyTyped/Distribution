package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyFpgaImageResult extends js.Object {
  /**
    * The ID of the new AFI.
    */
  var FpgaImageId: js.UndefOr[String] = js.native
}

object CopyFpgaImageResult {
  @scala.inline
  def apply(FpgaImageId: String = null): CopyFpgaImageResult = {
    val __obj = js.Dynamic.literal()
    if (FpgaImageId != null) __obj.updateDynamic("FpgaImageId")(FpgaImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyFpgaImageResult]
  }
}

