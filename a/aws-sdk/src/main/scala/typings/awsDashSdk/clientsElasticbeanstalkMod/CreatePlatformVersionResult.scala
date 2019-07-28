package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePlatformVersionResult extends js.Object {
  /**
    * The builder used to create the custom platform.
    */
  var Builder: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.Builder] = js.undefined
  /**
    * Detailed information about the new version of the custom platform.
    */
  var PlatformSummary: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.PlatformSummary] = js.undefined
}

object CreatePlatformVersionResult {
  @scala.inline
  def apply(Builder: Builder = null, PlatformSummary: PlatformSummary = null): CreatePlatformVersionResult = {
    val __obj = js.Dynamic.literal()
    if (Builder != null) __obj.updateDynamic("Builder")(Builder)
    if (PlatformSummary != null) __obj.updateDynamic("PlatformSummary")(PlatformSummary)
    __obj.asInstanceOf[CreatePlatformVersionResult]
  }
}

