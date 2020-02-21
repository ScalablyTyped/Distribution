package typings.awsLambda

import typings.awsLambda.cloudfrontMod.CloudFrontRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequest extends js.Object {
  var request: CloudFrontRequest
}

object AnonRequest {
  @scala.inline
  def apply(request: CloudFrontRequest): AnonRequest = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRequest]
  }
}

