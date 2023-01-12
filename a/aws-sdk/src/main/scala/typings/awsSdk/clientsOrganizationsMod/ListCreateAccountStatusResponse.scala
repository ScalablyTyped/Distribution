package typings.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCreateAccountStatusResponse extends StObject {
  
  /**
    * A list of objects with details about the requests. Certain elements, such as the accountId number, are present in the output only after the account has been successfully created.
    */
  var CreateAccountStatuses: js.UndefOr[typings.awsSdk.clientsOrganizationsMod.CreateAccountStatuses] = js.undefined
  
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsOrganizationsMod.NextToken] = js.undefined
}
object ListCreateAccountStatusResponse {
  
  inline def apply(): ListCreateAccountStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCreateAccountStatusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCreateAccountStatusResponse] (val x: Self) extends AnyVal {
    
    inline def setCreateAccountStatuses(value: CreateAccountStatuses): Self = StObject.set(x, "CreateAccountStatuses", value.asInstanceOf[js.Any])
    
    inline def setCreateAccountStatusesUndefined: Self = StObject.set(x, "CreateAccountStatuses", js.undefined)
    
    inline def setCreateAccountStatusesVarargs(value: CreateAccountStatus*): Self = StObject.set(x, "CreateAccountStatuses", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
