package typings.awsLambda.anon

import typings.awsLambda.cloudfrontMod.CloudFrontCustomOrigin
import typings.awsLambda.cloudfrontMod.CloudFrontOrigin
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
  implicit class S3Ops[Self <: S3] (val x: Self) extends AnyVal {
    
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
    def setCustom(value: CloudFrontCustomOrigin): Self = this.set("custom", value.asInstanceOf[js.Any])
  }
}
