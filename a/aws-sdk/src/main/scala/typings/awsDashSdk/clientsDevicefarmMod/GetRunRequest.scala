package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRunRequest extends js.Object {
  /**
    * The run's ARN.
    */
  var arn: AmazonResourceName
}

object GetRunRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): GetRunRequest = {
    val __obj = js.Dynamic.literal(arn = arn)
  
    __obj.asInstanceOf[GetRunRequest]
  }
}

