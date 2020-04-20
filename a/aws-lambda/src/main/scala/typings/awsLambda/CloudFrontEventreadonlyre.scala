package typings.awsLambda

import typings.awsLambda.cloudfrontMod.CloudFrontResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-lambda.aws-lambda/common/cloudfront.CloudFrontEvent & { readonly request  :std.Pick<aws-lambda.aws-lambda/common/cloudfront.CloudFrontRequest, std.Exclude<keyof aws-lambda.aws-lambda/common/cloudfront.CloudFrontRequest, 'body'>>,   response  :aws-lambda.aws-lambda/common/cloudfront.CloudFrontResponse} */
trait CloudFrontEventreadonlyre extends js.Object {
  var config: AnonDistributionDomainName
  val request: PickCloudFrontRequestExcl
  var response: CloudFrontResponse
}

object CloudFrontEventreadonlyre {
  @scala.inline
  def apply(
    config: AnonDistributionDomainName,
    request: PickCloudFrontRequestExcl,
    response: CloudFrontResponse
  ): CloudFrontEventreadonlyre = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontEventreadonlyre]
  }
}

