package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTestRequest extends js.Object {
  /**
    * The test's ARN.
    */
  var arn: AmazonResourceName
}

object GetTestRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): GetTestRequest = {
    val __obj = js.Dynamic.literal(arn = arn)
  
    __obj.asInstanceOf[GetTestRequest]
  }
}

