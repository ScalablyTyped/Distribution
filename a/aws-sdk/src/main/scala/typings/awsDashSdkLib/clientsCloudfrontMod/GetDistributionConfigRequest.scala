package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDistributionConfigRequest extends js.Object {
  /**
    * The distribution's ID.
    */
  var Id: java.lang.String
}

object GetDistributionConfigRequest {
  @scala.inline
  def apply(Id: java.lang.String): GetDistributionConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[GetDistributionConfigRequest]
  }
}

