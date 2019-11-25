package typings.awsDashLambda.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFrontResponse extends js.Object {
  var headers: CloudFrontHeaders
  var status: String
  var statusDescription: String
}

object CloudFrontResponse {
  @scala.inline
  def apply(headers: CloudFrontHeaders, status: String, statusDescription: String): CloudFrontResponse = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusDescription = statusDescription.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CloudFrontResponse]
  }
}

