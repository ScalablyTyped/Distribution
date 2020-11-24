package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsIamConfig extends js.Object {
  
  /**
    * The signing region for AWS IAM authorization.
    */
  var signingRegion: js.UndefOr[String] = js.native
  
  /**
    * The signing service name for AWS IAM authorization.
    */
  var signingServiceName: js.UndefOr[String] = js.native
}
object AwsIamConfig {
  
  @scala.inline
  def apply(): AwsIamConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamConfig]
  }
  
  @scala.inline
  implicit class AwsIamConfigOps[Self <: AwsIamConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSigningRegion(value: String): Self = this.set("signingRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningRegion: Self = this.set("signingRegion", js.undefined)
    
    @scala.inline
    def setSigningServiceName(value: String): Self = this.set("signingServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningServiceName: Self = this.set("signingServiceName", js.undefined)
  }
}
