package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDistributionRequest extends js.Object {
  /**
    * The distribution's ID. If the ID is empty, an empty distribution configuration is returned.
    */
  var Id: java.lang.String
}

object GetDistributionRequest {
  @scala.inline
  def apply(Id: java.lang.String): GetDistributionRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[GetDistributionRequest]
  }
}

