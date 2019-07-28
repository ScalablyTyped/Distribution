package typings.awsDashSdk.clientsMobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBundleRequest extends js.Object {
  /**
    *  Unique bundle identifier. 
    */
  var bundleId: BundleId
}

object DescribeBundleRequest {
  @scala.inline
  def apply(bundleId: BundleId): DescribeBundleRequest = {
    val __obj = js.Dynamic.literal(bundleId = bundleId)
  
    __obj.asInstanceOf[DescribeBundleRequest]
  }
}

