package typings.awsLambda.anon

import typings.awsLambda.cloudfrontMod.CloudFrontRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-lambda.aws-lambda/common/cloudfront.CloudFrontEvent & {  request :aws-lambda.aws-lambda/common/cloudfront.CloudFrontRequest} */
@js.native
trait CloudFrontEventrequestClo extends js.Object {
  var config: DistributionDomainName = js.native
  var request: CloudFrontRequest = js.native
}

object CloudFrontEventrequestClo {
  @scala.inline
  def apply(config: DistributionDomainName, request: CloudFrontRequest): CloudFrontEventrequestClo = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontEventrequestClo]
  }
  @scala.inline
  implicit class CloudFrontEventrequestCloOps[Self <: CloudFrontEventrequestClo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfig(value: DistributionDomainName): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: CloudFrontRequest): Self = this.set("request", value.asInstanceOf[js.Any])
  }
  
}

