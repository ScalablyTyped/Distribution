package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSipMediaApplicationsResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[NextTokenString] = js.undefined
  
  /**
    * List of SIP media applications and application details.
    */
  var SipMediaApplications: js.UndefOr[SipMediaApplicationList] = js.undefined
}
object ListSipMediaApplicationsResponse {
  
  inline def apply(): ListSipMediaApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSipMediaApplicationsResponse]
  }
  
  extension [Self <: ListSipMediaApplicationsResponse](x: Self) {
    
    inline def setNextToken(value: NextTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSipMediaApplications(value: SipMediaApplicationList): Self = StObject.set(x, "SipMediaApplications", value.asInstanceOf[js.Any])
    
    inline def setSipMediaApplicationsUndefined: Self = StObject.set(x, "SipMediaApplications", js.undefined)
    
    inline def setSipMediaApplicationsVarargs(value: SipMediaApplication*): Self = StObject.set(x, "SipMediaApplications", js.Array(value*))
  }
}
