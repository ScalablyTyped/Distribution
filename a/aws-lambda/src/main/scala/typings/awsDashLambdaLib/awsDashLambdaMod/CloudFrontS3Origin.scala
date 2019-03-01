package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFrontS3Origin extends js.Object {
  var authMethod: awsDashLambdaLib.awsDashLambdaLibStrings.`origin-access-identity` | awsDashLambdaLib.awsDashLambdaLibStrings.none
  var customHeaders: CloudFrontHeaders
  var domainName: java.lang.String
  var path: java.lang.String
  var region: java.lang.String
}

object CloudFrontS3Origin {
  @scala.inline
  def apply(
    authMethod: awsDashLambdaLib.awsDashLambdaLibStrings.`origin-access-identity` | awsDashLambdaLib.awsDashLambdaLibStrings.none,
    customHeaders: CloudFrontHeaders,
    domainName: java.lang.String,
    path: java.lang.String,
    region: java.lang.String
  ): CloudFrontS3Origin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authMethod")(authMethod.asInstanceOf[js.Any])
    __obj.updateDynamic("customHeaders")(customHeaders)
    __obj.updateDynamic("domainName")(domainName)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[CloudFrontS3Origin]
  }
}

