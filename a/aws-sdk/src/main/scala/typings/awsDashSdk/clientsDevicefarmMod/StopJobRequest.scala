package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopJobRequest extends js.Object {
  /**
    * Represents the Amazon Resource Name (ARN) of the Device Farm job you wish to stop.
    */
  var arn: AmazonResourceName
}

object StopJobRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): StopJobRequest = {
    val __obj = js.Dynamic.literal(arn = arn)
  
    __obj.asInstanceOf[StopJobRequest]
  }
}

