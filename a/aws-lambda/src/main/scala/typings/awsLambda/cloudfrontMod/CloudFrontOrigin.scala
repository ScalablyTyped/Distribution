package typings.awsLambda.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.awsLambda.anon.Custom
  - typings.awsLambda.anon.S3
*/
trait CloudFrontOrigin extends js.Object
object CloudFrontOrigin {
  
  @scala.inline
  def Custom(s3: CloudFrontS3Origin): CloudFrontOrigin = {
    val __obj = js.Dynamic.literal(s3 = s3.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontOrigin]
  }
  
  @scala.inline
  def S3(custom: CloudFrontCustomOrigin): CloudFrontOrigin = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontOrigin]
  }
}
