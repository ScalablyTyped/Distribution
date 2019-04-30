package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeFpgaImagesResult extends js.Object {
  /**
    * Information about the FPGA images.
    */
  var FpgaImages: js.UndefOr[FpgaImageList] = js.undefined
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeFpgaImagesResult {
  @scala.inline
  def apply(FpgaImages: FpgaImageList = null, NextToken: NextToken = null): DescribeFpgaImagesResult = {
    val __obj = js.Dynamic.literal()
    if (FpgaImages != null) __obj.updateDynamic("FpgaImages")(FpgaImages)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeFpgaImagesResult]
  }
}

