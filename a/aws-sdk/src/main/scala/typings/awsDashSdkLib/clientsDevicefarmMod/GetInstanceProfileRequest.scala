package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceProfileRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of your instance profile.
    */
  var arn: AmazonResourceName
}

object GetInstanceProfileRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): GetInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(arn = arn)
  
    __obj.asInstanceOf[GetInstanceProfileRequest]
  }
}

