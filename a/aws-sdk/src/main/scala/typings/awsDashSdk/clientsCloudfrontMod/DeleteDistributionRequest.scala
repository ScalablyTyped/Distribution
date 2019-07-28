package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDistributionRequest extends js.Object {
  /**
    * The distribution ID. 
    */
  var Id: String
  /**
    * The value of the ETag header that you received when you disabled the distribution. For example: E2QWRUHAPOMQZL. 
    */
  var IfMatch: js.UndefOr[String] = js.undefined
}

object DeleteDistributionRequest {
  @scala.inline
  def apply(Id: String, IfMatch: String = null): DeleteDistributionRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
    if (IfMatch != null) __obj.updateDynamic("IfMatch")(IfMatch)
    __obj.asInstanceOf[DeleteDistributionRequest]
  }
}

