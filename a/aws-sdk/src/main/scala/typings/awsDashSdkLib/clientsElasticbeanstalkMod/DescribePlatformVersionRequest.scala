package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePlatformVersionRequest extends js.Object {
  /**
    * The ARN of the version of the platform.
    */
  var PlatformArn: js.UndefOr[PlatformArn] = js.undefined
}

object DescribePlatformVersionRequest {
  @scala.inline
  def apply(PlatformArn: PlatformArn = null): DescribePlatformVersionRequest = {
    val __obj = js.Dynamic.literal()
    if (PlatformArn != null) __obj.updateDynamic("PlatformArn")(PlatformArn)
    __obj.asInstanceOf[DescribePlatformVersionRequest]
  }
}

