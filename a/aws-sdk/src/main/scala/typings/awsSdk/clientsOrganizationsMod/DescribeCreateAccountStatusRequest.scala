package typings.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCreateAccountStatusRequest extends StObject {
  
  /**
    * Specifies the Id value that uniquely identifies the CreateAccount request. You can get the value from the CreateAccountStatus.Id response in an earlier CreateAccount request, or from the ListCreateAccountStatus operation. The regex pattern for a create account request ID string requires "car-" followed by from 8 to 32 lowercase letters or digits.
    */
  var CreateAccountRequestId: typings.awsSdk.clientsOrganizationsMod.CreateAccountRequestId
}
object DescribeCreateAccountStatusRequest {
  
  inline def apply(CreateAccountRequestId: CreateAccountRequestId): DescribeCreateAccountStatusRequest = {
    val __obj = js.Dynamic.literal(CreateAccountRequestId = CreateAccountRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCreateAccountStatusRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeCreateAccountStatusRequest] (val x: Self) extends AnyVal {
    
    inline def setCreateAccountRequestId(value: CreateAccountRequestId): Self = StObject.set(x, "CreateAccountRequestId", value.asInstanceOf[js.Any])
  }
}
