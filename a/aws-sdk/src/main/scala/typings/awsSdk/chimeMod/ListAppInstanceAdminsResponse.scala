package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAppInstanceAdminsResponse extends StObject {
  
  /**
    * The information for each administrator.
    */
  var AppInstanceAdmins: js.UndefOr[AppInstanceAdminList] = js.undefined
  
  /**
    * The ARN of the app instance.
    */
  var AppInstanceArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The token returned from previous API requests until the number of administrators is reached.
    */
  var NextToken: js.UndefOr[typings.awsSdk.chimeMod.NextToken] = js.undefined
}
object ListAppInstanceAdminsResponse {
  
  inline def apply(): ListAppInstanceAdminsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAppInstanceAdminsResponse]
  }
  
  extension [Self <: ListAppInstanceAdminsResponse](x: Self) {
    
    inline def setAppInstanceAdmins(value: AppInstanceAdminList): Self = StObject.set(x, "AppInstanceAdmins", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceAdminsUndefined: Self = StObject.set(x, "AppInstanceAdmins", js.undefined)
    
    inline def setAppInstanceAdminsVarargs(value: AppInstanceAdminSummary*): Self = StObject.set(x, "AppInstanceAdmins", js.Array(value :_*))
    
    inline def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceArnUndefined: Self = StObject.set(x, "AppInstanceArn", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
