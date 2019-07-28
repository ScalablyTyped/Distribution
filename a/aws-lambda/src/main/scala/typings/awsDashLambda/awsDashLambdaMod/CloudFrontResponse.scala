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
    val __obj = js.Dynamic.literal(headers = headers, status = status, statusDescription = statusDescription)
  
    __obj.asInstanceOf[CloudFrontResponse]
  }
}

