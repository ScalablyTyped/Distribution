package typings.awsDashLambda

import typings.awsDashLambda.awsDashLambdaMod.CloudFrontRequest
import typings.awsDashLambda.awsDashLambdaMod.CloudFrontResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Request extends js.Object {
  var request: CloudFrontRequest
  var response: CloudFrontResponse
}

object Anon_Request {
  @scala.inline
  def apply(request: CloudFrontRequest, response: CloudFrontResponse): Anon_Request = {
    val __obj = js.Dynamic.literal(request = request, response = response)
  
    __obj.asInstanceOf[Anon_Request]
  }
}

