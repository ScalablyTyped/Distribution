package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRunRequest extends js.Object {
  /**
    * The run's ARN.
    */
  var arn: AmazonResourceName = js.native
}

object GetRunRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): GetRunRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetRunRequest]
  }
}

