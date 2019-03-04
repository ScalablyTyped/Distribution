package typings
package awsDashLambdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Request extends js.Object {
  var request: awsDashLambdaLib.awsDashLambdaMod.CloudFrontRequest
  var response: awsDashLambdaLib.awsDashLambdaMod.CloudFrontResponse
}

object Anon_Request {
  @scala.inline
  def apply(
    request: awsDashLambdaLib.awsDashLambdaMod.CloudFrontRequest,
    response: awsDashLambdaLib.awsDashLambdaMod.CloudFrontResponse
  ): Anon_Request = {
    val __obj = js.Dynamic.literal(request = request, response = response)
  
    __obj.asInstanceOf[Anon_Request]
  }
}

