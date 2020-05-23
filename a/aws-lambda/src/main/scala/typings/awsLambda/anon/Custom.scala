package typings.awsLambda.anon

import typings.awsLambda.cloudfrontMod.CloudFrontCustomOrigin
import typings.awsLambda.cloudfrontMod.CloudFrontOrigin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Custom extends CloudFrontOrigin {
  var custom: CloudFrontCustomOrigin
}

object Custom {
  @scala.inline
  def apply(custom: CloudFrontCustomOrigin): Custom = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Custom]
  }
}

