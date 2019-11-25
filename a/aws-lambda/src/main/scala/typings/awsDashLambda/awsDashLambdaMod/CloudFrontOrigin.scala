package typings.awsDashLambda.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.awsDashLambda.Anon_S3
  - typings.awsDashLambda.Anon_Custom
*/
trait CloudFrontOrigin extends js.Object

object CloudFrontOrigin {
  @scala.inline
  def Anon_S3(s3: CloudFrontS3Origin): CloudFrontOrigin = {
    val __obj = js.Dynamic.literal(s3 = s3.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CloudFrontOrigin]
  }
  @scala.inline
  def Anon_Custom(custom: CloudFrontCustomOrigin): CloudFrontOrigin = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CloudFrontOrigin]
  }
}

