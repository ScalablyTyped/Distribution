package typings.awsLambda.anon

import typings.awsLambda.cloudfrontMod.CloudFrontResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-lambda.aws-lambda/common/cloudfront.CloudFrontEvent & { readonly request :std.Pick<aws-lambda.aws-lambda/common/cloudfront.CloudFrontRequest, std.Exclude<keyof aws-lambda.aws-lambda/common/cloudfront.CloudFrontRequest, 'body'>>,   response :aws-lambda.aws-lambda/common/cloudfront.CloudFrontResponse} */
@js.native
trait CloudFrontEventreadonlyre extends js.Object {
  var config: DistributionDomainName = js.native
  val request: PickCloudFrontRequestExcl = js.native
  var response: CloudFrontResponse = js.native
}

object CloudFrontEventreadonlyre {
  @scala.inline
  def apply(config: DistributionDomainName, request: PickCloudFrontRequestExcl, response: CloudFrontResponse): CloudFrontEventreadonlyre = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontEventreadonlyre]
  }
  @scala.inline
  implicit class CloudFrontEventreadonlyreOps[Self <: CloudFrontEventreadonlyre] (val x: Self) extends AnyVal {
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
    def setRequest(value: PickCloudFrontRequestExcl): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: CloudFrontResponse): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

