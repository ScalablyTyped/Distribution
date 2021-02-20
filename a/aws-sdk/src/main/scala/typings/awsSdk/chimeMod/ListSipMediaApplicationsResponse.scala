package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSipMediaApplicationsResponse extends StObject {
  
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
  implicit class ListSipMediaApplicationsResponseMutableBuilder[Self <: ListSipMediaApplicationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSipMediaApplications(value: SipMediaApplicationList): Self = StObject.set(x, "SipMediaApplications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSipMediaApplicationsUndefined: Self = StObject.set(x, "SipMediaApplications", js.undefined)
    
    @scala.inline
    def setSipMediaApplicationsVarargs(value: SipMediaApplication*): Self = StObject.set(x, "SipMediaApplications", js.Array(value :_*))
  }
}
