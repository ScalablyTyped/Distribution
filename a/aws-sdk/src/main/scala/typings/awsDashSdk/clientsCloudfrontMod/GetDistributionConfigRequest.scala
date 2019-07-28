package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDistributionConfigRequest extends js.Object {
  /**
    * The distribution's ID. If the ID is empty, an empty distribution configuration is returned.
    */
  var Id: String
}

object GetDistributionConfigRequest {
  @scala.inline
  def apply(Id: String): GetDistributionConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[GetDistributionConfigRequest]
  }
}

