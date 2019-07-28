package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopRunRequest extends js.Object {
  /**
    * Represents the Amazon Resource Name (ARN) of the Device Farm run you wish to stop.
    */
  var arn: AmazonResourceName
}

object StopRunRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): StopRunRequest = {
    val __obj = js.Dynamic.literal(arn = arn)
  
    __obj.asInstanceOf[StopRunRequest]
  }
}

