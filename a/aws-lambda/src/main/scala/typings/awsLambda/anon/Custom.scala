package typings.awsLambda.anon

import typings.awsLambda.cloudfrontMod.CloudFrontOrigin
import typings.awsLambda.cloudfrontMod.CloudFrontS3Origin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Custom extends CloudFrontOrigin {
  
  var custom: js.UndefOr[scala.Nothing] = js.native
  
  var s3: CloudFrontS3Origin = js.native
}
object Custom {
  
  @scala.inline
  def apply(s3: CloudFrontS3Origin): Custom = {
    val __obj = js.Dynamic.literal(s3 = s3.asInstanceOf[js.Any])
    __obj.asInstanceOf[Custom]
  }
  
  @scala.inline
  implicit class CustomMutableBuilder[Self <: Custom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3(value: CloudFrontS3Origin): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
  }
}
