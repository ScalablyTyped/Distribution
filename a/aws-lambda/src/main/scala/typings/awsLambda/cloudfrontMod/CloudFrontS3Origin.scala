package typings.awsLambda.cloudfrontMod

import typings.awsLambda.awsLambdaStrings.`origin-access-identity`
import typings.awsLambda.awsLambdaStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudFrontS3Origin extends js.Object {
  var authMethod: `origin-access-identity` | none_ = js.native
  var customHeaders: CloudFrontHeaders = js.native
  var domainName: String = js.native
  var path: String = js.native
  var region: String = js.native
}

object CloudFrontS3Origin {
  @scala.inline
  def apply(
    authMethod: `origin-access-identity` | none_,
    customHeaders: CloudFrontHeaders,
    domainName: String,
    path: String,
    region: String
  ): CloudFrontS3Origin = {
    val __obj = js.Dynamic.literal(authMethod = authMethod.asInstanceOf[js.Any], customHeaders = customHeaders.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontS3Origin]
  }
  @scala.inline
  implicit class CloudFrontS3OriginOps[Self <: CloudFrontS3Origin] (val x: Self) extends AnyVal {
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
    def setAuthMethod(value: `origin-access-identity` | none_): Self = this.set("authMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomHeaders(value: CloudFrontHeaders): Self = this.set("customHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainName(value: String): Self = this.set("domainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
  }
  
}

