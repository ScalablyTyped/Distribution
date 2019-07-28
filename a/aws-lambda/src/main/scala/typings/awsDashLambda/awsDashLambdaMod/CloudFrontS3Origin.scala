package typings.awsDashLambda.awsDashLambdaMod

import typings.awsDashLambda.awsDashLambdaStrings.`origin-access-identity`
import typings.awsDashLambda.awsDashLambdaStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFrontS3Origin extends js.Object {
  var authMethod: `origin-access-identity` | none
  var customHeaders: CloudFrontHeaders
  var domainName: String
  var path: String
  var region: String
}

object CloudFrontS3Origin {
  @scala.inline
  def apply(
    authMethod: `origin-access-identity` | none,
    customHeaders: CloudFrontHeaders,
    domainName: String,
    path: String,
    region: String
  ): CloudFrontS3Origin = {
    val __obj = js.Dynamic.literal(authMethod = authMethod.asInstanceOf[js.Any], customHeaders = customHeaders, domainName = domainName, path = path, region = region)
  
    __obj.asInstanceOf[CloudFrontS3Origin]
  }
}

