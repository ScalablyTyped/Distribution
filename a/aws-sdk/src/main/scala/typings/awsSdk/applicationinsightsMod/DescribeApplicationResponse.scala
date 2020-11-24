package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeApplicationResponse extends js.Object {
  
  /**
    * Information about the application.
    */
  var ApplicationInfo: js.UndefOr[typings.awsSdk.applicationinsightsMod.ApplicationInfo] = js.native
}
object DescribeApplicationResponse {
  
  @scala.inline
  def apply(): DescribeApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeApplicationResponse]
  }
  
  @scala.inline
  implicit class DescribeApplicationResponseOps[Self <: DescribeApplicationResponse] (val x: Self) extends AnyVal {
    
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
    def setApplicationInfo(value: ApplicationInfo): Self = this.set("ApplicationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationInfo: Self = this.set("ApplicationInfo", js.undefined)
  }
}
