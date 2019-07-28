package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSuiteRequest extends js.Object {
  /**
    * The suite's ARN.
    */
  var arn: AmazonResourceName
}

object GetSuiteRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): GetSuiteRequest = {
    val __obj = js.Dynamic.literal(arn = arn)
  
    __obj.asInstanceOf[GetSuiteRequest]
  }
}

