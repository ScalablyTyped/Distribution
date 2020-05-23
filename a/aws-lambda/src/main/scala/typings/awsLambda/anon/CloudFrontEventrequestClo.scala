package typings.awsLambda.anon

import typings.awsLambda.cloudfrontMod.CloudFrontRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-lambda.aws-lambda/common/cloudfront.CloudFrontEvent & {  request  :aws-lambda.aws-lambda/common/cloudfront.CloudFrontRequest} */
trait CloudFrontEventrequestClo extends js.Object {
  var config: DistributionDomainName
  var request: CloudFrontRequest
}

object CloudFrontEventrequestClo {
  @scala.inline
  def apply(config: DistributionDomainName, request: CloudFrontRequest): CloudFrontEventrequestClo = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontEventrequestClo]
  }
}

