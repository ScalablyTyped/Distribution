package typings.awsLambda.anon

import typings.awsLambda.cloudfrontMod.CloudFrontOrigin
import typings.awsLambda.cloudfrontMod.CloudFrontS3Origin
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
  implicit class CustomOps[Self <: Custom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setS3(value: CloudFrontS3Origin): Self = this.set("s3", value.asInstanceOf[js.Any])
  }
}
