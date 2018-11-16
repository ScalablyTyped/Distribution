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

