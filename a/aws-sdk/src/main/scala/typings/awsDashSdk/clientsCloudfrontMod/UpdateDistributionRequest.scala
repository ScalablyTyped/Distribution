package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDistributionRequest extends js.Object {
  /**
    * The distribution's configuration information.
    */
  var DistributionConfig: typings.awsDashSdk.clientsCloudfrontMod.DistributionConfig
  /**
    * The distribution's id.
    */
  var Id: String
  /**
    * The value of the ETag header that you received when retrieving the distribution's configuration. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[String] = js.undefined
}

object UpdateDistributionRequest {
  @scala.inline
  def apply(DistributionConfig: DistributionConfig, Id: String, IfMatch: String = null): UpdateDistributionRequest = {
    val __obj = js.Dynamic.literal(DistributionConfig = DistributionConfig, Id = Id)
    if (IfMatch != null) __obj.updateDynamic("IfMatch")(IfMatch)
    __obj.asInstanceOf[UpdateDistributionRequest]
  }
}

