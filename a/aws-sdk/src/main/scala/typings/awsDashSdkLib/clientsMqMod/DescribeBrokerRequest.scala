package typings
package awsDashSdkLib.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBrokerRequest extends js.Object {
  /**
    * The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or special characters.
    */
  var BrokerId: __string
}

object DescribeBrokerRequest {
  @scala.inline
  def apply(BrokerId: __string): DescribeBrokerRequest = {
    val __obj = js.Dynamic.literal(BrokerId = BrokerId)
  
    __obj.asInstanceOf[DescribeBrokerRequest]
  }
}

