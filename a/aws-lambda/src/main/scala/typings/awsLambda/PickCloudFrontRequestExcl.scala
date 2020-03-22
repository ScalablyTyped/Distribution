package typings.awsLambda

import typings.awsLambda.cloudfrontMod.CloudFrontHeaders
import typings.awsLambda.cloudfrontMod.CloudFrontOrigin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<aws-lambda.aws-lambda/common/cloudfront.CloudFrontRequest, std.Exclude<keyof aws-lambda.aws-lambda/common/cloudfront.CloudFrontRequest, 'body'>> */
trait PickCloudFrontRequestExcl extends js.Object {
  var clientIp: String
  var headers: CloudFrontHeaders
  var method: String
  var origin: js.UndefOr[CloudFrontOrigin] = js.undefined
  var querystring: String
  var uri: String
}

object PickCloudFrontRequestExcl {
  @scala.inline
  def apply(
    clientIp: String,
    headers: CloudFrontHeaders,
    method: String,
    querystring: String,
    uri: String,
    origin: CloudFrontOrigin = null
  ): PickCloudFrontRequestExcl = {
    val __obj = js.Dynamic.literal(clientIp = clientIp.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], querystring = querystring.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickCloudFrontRequestExcl]
  }
}

