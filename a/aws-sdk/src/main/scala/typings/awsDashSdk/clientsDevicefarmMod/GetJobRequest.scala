package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetJobRequest extends js.Object {
  /**
    * The job's ARN.
    */
  var arn: AmazonResourceName
}

object GetJobRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): GetJobRequest = {
    val __obj = js.Dynamic.literal(arn = arn)
  
    __obj.asInstanceOf[GetJobRequest]
  }
}

