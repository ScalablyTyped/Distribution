package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSipMediaApplicationsResponse extends js.Object {
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[NextTokenString] = js.native
  
  /**
    * List of SIP media applications and application details.
    */
  var SipMediaApplications: js.UndefOr[SipMediaApplicationList] = js.native
}
object ListSipMediaApplicationsResponse {
  
  @scala.inline
  def apply(): ListSipMediaApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSipMediaApplicationsResponse]
  }
  
  @scala.inline
  implicit class ListSipMediaApplicationsResponseOps[Self <: ListSipMediaApplicationsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextTokenString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setSipMediaApplicationsVarargs(value: SipMediaApplication*): Self = this.set("SipMediaApplications", js.Array(value :_*))
    
    @scala.inline
    def setSipMediaApplications(value: SipMediaApplicationList): Self = this.set("SipMediaApplications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSipMediaApplications: Self = this.set("SipMediaApplications", js.undefined)
  }
}
