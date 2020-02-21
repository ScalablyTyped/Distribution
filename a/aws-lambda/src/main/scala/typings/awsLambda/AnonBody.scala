package typings.awsLambda

import typings.awsLambda.awsLambdaStrings.body
import typings.awsLambda.awsLambdaStrings.clientIp
import typings.awsLambda.awsLambdaStrings.headers
import typings.awsLambda.awsLambdaStrings.method
import typings.awsLambda.awsLambdaStrings.origin
import typings.awsLambda.awsLambdaStrings.querystring
import typings.awsLambda.awsLambdaStrings.uri
import typings.awsLambda.cloudfrontMod.CloudFrontRequest
import typings.awsLambda.cloudfrontMod.CloudFrontResponse
import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  val request: Pick[
    CloudFrontRequest, 
    Exclude[body | clientIp | method | uri | querystring | headers | origin, body]
  ]
  var response: CloudFrontResponse
}

object AnonBody {
  @scala.inline
  def apply(
    request: Pick[
      CloudFrontRequest, 
      Exclude[body | clientIp | method | uri | querystring | headers | origin, body]
    ],
    response: CloudFrontResponse
  ): AnonBody = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBody]
  }
}

