package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFpgaImageResult extends js.Object {
  /**
    * The global FPGA image identifier (AGFI ID).
    */
  var FpgaImageGlobalId: js.UndefOr[String] = js.undefined
  /**
    * The FPGA image identifier (AFI ID).
    */
  var FpgaImageId: js.UndefOr[String] = js.undefined
}

object CreateFpgaImageResult {
  @scala.inline
  def apply(FpgaImageGlobalId: String = null, FpgaImageId: String = null): CreateFpgaImageResult = {
    val __obj = js.Dynamic.literal()
    if (FpgaImageGlobalId != null) __obj.updateDynamic("FpgaImageGlobalId")(FpgaImageGlobalId)
    if (FpgaImageId != null) __obj.updateDynamic("FpgaImageId")(FpgaImageId)
    __obj.asInstanceOf[CreateFpgaImageResult]
  }
}

