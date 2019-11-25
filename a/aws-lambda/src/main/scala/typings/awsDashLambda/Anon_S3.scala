package typings.awsDashLambda

import typings.awsDashLambda.awsDashLambdaMod.CloudFrontOrigin
import typings.awsDashLambda.awsDashLambdaMod.CloudFrontS3Origin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_S3 extends CloudFrontOrigin {
  var s3: CloudFrontS3Origin
}

object Anon_S3 {
  @scala.inline
  def apply(s3: CloudFrontS3Origin): Anon_S3 = {
    val __obj = js.Dynamic.literal(s3 = s3.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_S3]
  }
}

