package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDistributionRequest extends js.Object {
  /**
    * The distribution's configuration information.
    */
  var DistributionConfig: typings.awsDashSdk.clientsCloudfrontMod.DistributionConfig
}

object CreateDistributionRequest {
  @scala.inline
  def apply(DistributionConfig: DistributionConfig): CreateDistributionRequest = {
    val __obj = js.Dynamic.literal(DistributionConfig = DistributionConfig)
  
    __obj.asInstanceOf[CreateDistributionRequest]
  }
}

