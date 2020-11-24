package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAppInstanceAdminsResponse extends js.Object {
  
  /**
    * The information for each administrator.
    */
  var AppInstanceAdmins: js.UndefOr[AppInstanceAdminList] = js.native
  
  /**
    * The ARN of the app instance.
    */
  var AppInstanceArn: js.UndefOr[ChimeArn] = js.native
  
  /**
    * The token returned from previous API requests until the number of administrators is reached.
    */
  var NextToken: js.UndefOr[typings.awsSdk.chimeMod.NextToken] = js.native
}
object ListAppInstanceAdminsResponse {
  
  @scala.inline
  def apply(): ListAppInstanceAdminsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAppInstanceAdminsResponse]
  }
  
  @scala.inline
  implicit class ListAppInstanceAdminsResponseOps[Self <: ListAppInstanceAdminsResponse] (val x: Self) extends AnyVal {
    
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
    def setAppInstanceAdminsVarargs(value: AppInstanceAdminSummary*): Self = this.set("AppInstanceAdmins", js.Array(value :_*))
    
    @scala.inline
    def setAppInstanceAdmins(value: AppInstanceAdminList): Self = this.set("AppInstanceAdmins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppInstanceAdmins: Self = this.set("AppInstanceAdmins", js.undefined)
    
    @scala.inline
    def setAppInstanceArn(value: ChimeArn): Self = this.set("AppInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppInstanceArn: Self = this.set("AppInstanceArn", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
