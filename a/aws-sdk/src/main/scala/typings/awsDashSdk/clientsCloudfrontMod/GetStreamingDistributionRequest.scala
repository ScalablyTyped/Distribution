package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStreamingDistributionRequest extends js.Object {
  /**
    * The streaming distribution's ID.
    */
  var Id: String
}

object GetStreamingDistributionRequest {
  @scala.inline
  def apply(Id: String): GetStreamingDistributionRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[GetStreamingDistributionRequest]
  }
}

