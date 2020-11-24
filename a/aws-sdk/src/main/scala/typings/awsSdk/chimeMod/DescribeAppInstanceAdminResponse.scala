package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAppInstanceAdminResponse extends js.Object {
  
  /**
    * The ARN and name of the app instance user, the ARN of the app instance, and the created and last-updated timestamps. All timestamps use epoch milliseconds.
    */
  var AppInstanceAdmin: js.UndefOr[typings.awsSdk.chimeMod.AppInstanceAdmin] = js.native
}
object DescribeAppInstanceAdminResponse {
  
  @scala.inline
  def apply(): DescribeAppInstanceAdminResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAppInstanceAdminResponse]
  }
  
  @scala.inline
  implicit class DescribeAppInstanceAdminResponseOps[Self <: DescribeAppInstanceAdminResponse] (val x: Self) extends AnyVal {
    
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
    def setAppInstanceAdmin(value: AppInstanceAdmin): Self = this.set("AppInstanceAdmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppInstanceAdmin: Self = this.set("AppInstanceAdmin", js.undefined)
  }
}
