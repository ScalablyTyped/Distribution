package typings.awsLambda.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.awsLambda.AnonS3
  - typings.awsLambda.AnonCustom
*/
trait CloudFrontOrigin extends js.Object

object CloudFrontOrigin {
  @scala.inline
  def AnonS3(s3: CloudFrontS3Origin): CloudFrontOrigin = {
    val __obj = js.Dynamic.literal(s3 = s3.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CloudFrontOrigin]
  }
  @scala.inline
  def AnonCustom(custom: CloudFrontCustomOrigin): CloudFrontOrigin = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CloudFrontOrigin]
  }
}

