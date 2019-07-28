package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteStreamingDistributionRequest extends js.Object {
  /**
    * The distribution ID. 
    */
  var Id: String
  /**
    * The value of the ETag header that you received when you disabled the streaming distribution. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[String] = js.undefined
}

object DeleteStreamingDistributionRequest {
  @scala.inline
  def apply(Id: String, IfMatch: String = null): DeleteStreamingDistributionRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
    if (IfMatch != null) __obj.updateDynamic("IfMatch")(IfMatch)
    __obj.asInstanceOf[DeleteStreamingDistributionRequest]
  }
}

