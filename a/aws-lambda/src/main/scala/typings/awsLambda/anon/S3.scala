package typings.awsLambda.anon

import typings.awsLambda.cloudfrontMod.CloudFrontCustomOrigin
import typings.awsLambda.cloudfrontMod.CloudFrontOrigin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3 extends CloudFrontOrigin {
  
  var custom: CloudFrontCustomOrigin = js.native
  
  var s3: js.UndefOr[scala.Nothing] = js.native
}
object S3 {
  
  @scala.inline
  def apply(custom: CloudFrontCustomOrigin): S3 = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3]
  }
  
  @scala.inline
  implicit class S3MutableBuilder[Self <: S3] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustom(value: CloudFrontCustomOrigin): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
  }
}
