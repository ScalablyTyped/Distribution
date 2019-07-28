package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePlatformVersionRequest extends js.Object {
  /**
    * The ARN of the version of the custom platform.
    */
  var PlatformArn: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.PlatformArn] = js.undefined
}

object DeletePlatformVersionRequest {
  @scala.inline
  def apply(PlatformArn: PlatformArn = null): DeletePlatformVersionRequest = {
    val __obj = js.Dynamic.literal()
    if (PlatformArn != null) __obj.updateDynamic("PlatformArn")(PlatformArn)
    __obj.asInstanceOf[DeletePlatformVersionRequest]
  }
}

