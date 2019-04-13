package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePlatformVersionResult extends js.Object {
  /**
    * Detailed information about the version of the platform.
    */
  var PlatformDescription: js.UndefOr[PlatformDescription] = js.undefined
}

object DescribePlatformVersionResult {
  @scala.inline
  def apply(PlatformDescription: PlatformDescription = null): DescribePlatformVersionResult = {
    val __obj = js.Dynamic.literal()
    if (PlatformDescription != null) __obj.updateDynamic("PlatformDescription")(PlatformDescription)
    __obj.asInstanceOf[DescribePlatformVersionResult]
  }
}

