package typings.awsLambda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CfCloudFrontEventreadonlyre extends js.Object {
  
  var cf: CloudFrontEventreadonlyre = js.native
}
object CfCloudFrontEventreadonlyre {
  
  @scala.inline
  def apply(cf: CloudFrontEventreadonlyre): CfCloudFrontEventreadonlyre = {
    val __obj = js.Dynamic.literal(cf = cf.asInstanceOf[js.Any])
    __obj.asInstanceOf[CfCloudFrontEventreadonlyre]
  }
  
  @scala.inline
  implicit class CfCloudFrontEventreadonlyreOps[Self <: CfCloudFrontEventreadonlyre] (val x: Self) extends AnyVal {
    
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
    def setCf(value: CloudFrontEventreadonlyre): Self = this.set("cf", value.asInstanceOf[js.Any])
  }
}
