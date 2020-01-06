package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFpgaImageResult extends js.Object {
  /**
    * The global FPGA image identifier (AGFI ID).
    */
  var FpgaImageGlobalId: js.UndefOr[String] = js.native
  /**
    * The FPGA image identifier (AFI ID).
    */
  var FpgaImageId: js.UndefOr[String] = js.native
}

object CreateFpgaImageResult {
  @scala.inline
  def apply(FpgaImageGlobalId: String = null, FpgaImageId: String = null): CreateFpgaImageResult = {
    val __obj = js.Dynamic.literal()
    if (FpgaImageGlobalId != null) __obj.updateDynamic("FpgaImageGlobalId")(FpgaImageGlobalId.asInstanceOf[js.Any])
    if (FpgaImageId != null) __obj.updateDynamic("FpgaImageId")(FpgaImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFpgaImageResult]
  }
}

