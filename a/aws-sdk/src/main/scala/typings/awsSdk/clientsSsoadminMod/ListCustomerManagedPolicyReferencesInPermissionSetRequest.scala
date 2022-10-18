package typings.awsSdk.clientsSsoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomerManagedPolicyReferencesInPermissionSetRequest extends StObject {
  
  /**
    * The ARN of the IAM Identity Center instance under which the operation will be executed. 
    */
  var InstanceArn: typings.awsSdk.clientsSsoadminMod.InstanceArn
  
  /**
    * The maximum number of results to display for the list call.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSsoadminMod.MaxResults] = js.undefined
  
  /**
    * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make subsequent calls.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * The ARN of the PermissionSet. 
    */
  var PermissionSetArn: typings.awsSdk.clientsSsoadminMod.PermissionSetArn
}
object ListCustomerManagedPolicyReferencesInPermissionSetRequest {
  
  inline def apply(InstanceArn: InstanceArn, PermissionSetArn: PermissionSetArn): ListCustomerManagedPolicyReferencesInPermissionSetRequest = {
    val __obj = js.Dynamic.literal(InstanceArn = InstanceArn.asInstanceOf[js.Any], PermissionSetArn = PermissionSetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCustomerManagedPolicyReferencesInPermissionSetRequest]
  }
  
  extension [Self <: ListCustomerManagedPolicyReferencesInPermissionSetRequest](x: Self) {
    
    inline def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "InstanceArn", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPermissionSetArn(value: PermissionSetArn): Self = StObject.set(x, "PermissionSetArn", value.asInstanceOf[js.Any])
  }
}
