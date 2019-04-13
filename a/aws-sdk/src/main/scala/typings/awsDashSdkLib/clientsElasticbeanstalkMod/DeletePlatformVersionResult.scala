package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePlatformVersionResult extends js.Object {
  /**
    * Detailed information about the version of the custom platform.
    */
  var PlatformSummary: js.UndefOr[PlatformSummary] = js.undefined
}

object DeletePlatformVersionResult {
  @scala.inline
  def apply(PlatformSummary: PlatformSummary = null): DeletePlatformVersionResult = {
    val __obj = js.Dynamic.literal()
    if (PlatformSummary != null) __obj.updateDynamic("PlatformSummary")(PlatformSummary)
    __obj.asInstanceOf[DeletePlatformVersionResult]
  }
}

