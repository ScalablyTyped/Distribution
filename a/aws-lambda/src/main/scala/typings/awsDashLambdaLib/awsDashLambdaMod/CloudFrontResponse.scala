package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFrontResponse extends js.Object {
  var headers: CloudFrontHeaders
  var status: java.lang.String
  var statusDescription: java.lang.String
}

object CloudFrontResponse {
  @scala.inline
  def apply(headers: CloudFrontHeaders, status: java.lang.String, statusDescription: java.lang.String): CloudFrontResponse = {
    val __obj = js.Dynamic.literal(headers = headers, status = status, statusDescription = statusDescription)
  
    __obj.asInstanceOf[CloudFrontResponse]
  }
}

