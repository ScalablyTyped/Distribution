package typings.awsLambda.anon

import typings.awsLambda.cloudfrontMod.CloudFrontOrigin
import typings.awsLambda.cloudfrontMod.CloudFrontS3Origin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3 extends CloudFrontOrigin {
  var s3: CloudFrontS3Origin
}

object S3 {
  @scala.inline
  def apply(s3: CloudFrontS3Origin): S3 = {
    val __obj = js.Dynamic.literal(s3 = s3.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3]
  }
}

