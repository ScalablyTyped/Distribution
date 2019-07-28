package typings.awsDashSdk.clientsMobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBundleResult extends js.Object {
  /**
    *  The details of the bundle. 
    */
  var details: js.UndefOr[BundleDetails] = js.undefined
}

object DescribeBundleResult {
  @scala.inline
  def apply(details: BundleDetails = null): DescribeBundleResult = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details)
    __obj.asInstanceOf[DescribeBundleResult]
  }
}

