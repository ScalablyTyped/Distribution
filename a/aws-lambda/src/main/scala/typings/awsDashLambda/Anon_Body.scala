package typings.awsDashLambda

import typings.awsDashLambda.awsDashLambdaMod.CloudFrontRequest
import typings.awsDashLambda.awsDashLambdaMod.CloudFrontResponse
import typings.awsDashLambda.awsDashLambdaStrings.body
import typings.awsDashLambda.awsDashLambdaStrings.clientIp
import typings.awsDashLambda.awsDashLambdaStrings.headers
import typings.awsDashLambda.awsDashLambdaStrings.method
import typings.awsDashLambda.awsDashLambdaStrings.origin
import typings.awsDashLambda.awsDashLambdaStrings.querystring
import typings.awsDashLambda.awsDashLambdaStrings.uri
import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  val request: Pick[
    CloudFrontRequest, 
    Exclude[body | clientIp | method | uri | querystring | headers | origin, body]
  ]
  var response: CloudFrontResponse
}

object Anon_Body {
  @scala.inline
  def apply(
    request: Pick[
      CloudFrontRequest, 
      Exclude[body | clientIp | method | uri | querystring | headers | origin, body]
    ],
    response: CloudFrontResponse
  ): Anon_Body = {
    val __obj = js.Dynamic.literal(request = request, response = response)
  
    __obj.asInstanceOf[Anon_Body]
  }
}

