package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUploadRequest extends js.Object {
  /**
    * The upload's ARN.
    */
  var arn: AmazonResourceName
}

object GetUploadRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): GetUploadRequest = {
    val __obj = js.Dynamic.literal(arn = arn)
  
    __obj.asInstanceOf[GetUploadRequest]
  }
}

