package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUploadRequest extends js.Object {
  /**
    * The upload's ARN.
    */
  var arn: AmazonResourceName = js.native
}

object GetUploadRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): GetUploadRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetUploadRequest]
  }
}

