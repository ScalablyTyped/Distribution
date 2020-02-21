package typings.awsLambda.cloudfrontMod

import typings.awsLambda.awsLambdaStrings.`origin-access-identity`
import typings.awsLambda.awsLambdaStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFrontS3Origin extends js.Object {
  var authMethod: `origin-access-identity` | none_
  var customHeaders: CloudFrontHeaders
  var domainName: String
  var path: String
  var region: String
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
}

