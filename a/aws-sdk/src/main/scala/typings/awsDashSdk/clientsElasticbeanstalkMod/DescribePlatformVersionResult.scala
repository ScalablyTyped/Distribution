package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePlatformVersionResult extends js.Object {
  /**
    * Detailed information about the version of the platform.
    */
  var PlatformDescription: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.PlatformDescription] = js.native
}

object DescribePlatformVersionResult {
  @scala.inline
  def apply(PlatformDescription: PlatformDescription = null): DescribePlatformVersionResult = {
    val __obj = js.Dynamic.literal()
    if (PlatformDescription != null) __obj.updateDynamic("PlatformDescription")(PlatformDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePlatformVersionResult]
  }
}

