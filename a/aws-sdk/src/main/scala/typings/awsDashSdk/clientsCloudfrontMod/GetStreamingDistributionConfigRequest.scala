package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStreamingDistributionConfigRequest extends js.Object {
  /**
    * The streaming distribution's ID.
    */
  var Id: String
}

object GetStreamingDistributionConfigRequest {
  @scala.inline
  def apply(Id: String): GetStreamingDistributionConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[GetStreamingDistributionConfigRequest]
  }
}

