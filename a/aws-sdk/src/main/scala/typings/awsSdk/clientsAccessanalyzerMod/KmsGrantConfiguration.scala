package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmsGrantConfiguration extends StObject {
  
  /**
    * Use this structure to propose allowing cryptographic operations in the grant only when the operation request includes the specified encryption context.
    */
  var constraints: js.UndefOr[KmsGrantConstraints] = js.undefined
  
  /**
    * The principal that is given permission to perform the operations that the grant permits.
    */
  var granteePrincipal: GranteePrincipal
  
  /**
    *  The Amazon Web Services account under which the grant was issued. The account is used to propose KMS grants issued by accounts other than the owner of the key.
    */
  var issuingAccount: IssuingAccount
  
  /**
    * A list of operations that the grant permits.
    */
  var operations: KmsGrantOperationsList
  
  /**
    * The principal that is given permission to retire the grant by using RetireGrant operation.
    */
  var retiringPrincipal: js.UndefOr[RetiringPrincipal] = js.undefined
}
object KmsGrantConfiguration {
  
  inline def apply(
    granteePrincipal: GranteePrincipal,
    issuingAccount: IssuingAccount,
    operations: KmsGrantOperationsList
  ): KmsGrantConfiguration = {
    val __obj = js.Dynamic.literal(granteePrincipal = granteePrincipal.asInstanceOf[js.Any], issuingAccount = issuingAccount.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[KmsGrantConfiguration]
  }
  
  extension [Self <: KmsGrantConfiguration](x: Self) {
    
    inline def setConstraints(value: KmsGrantConstraints): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
    
    inline def setGranteePrincipal(value: GranteePrincipal): Self = StObject.set(x, "granteePrincipal", value.asInstanceOf[js.Any])
    
    inline def setIssuingAccount(value: IssuingAccount): Self = StObject.set(x, "issuingAccount", value.asInstanceOf[js.Any])
    
    inline def setOperations(value: KmsGrantOperationsList): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsVarargs(value: KmsGrantOperation*): Self = StObject.set(x, "operations", js.Array(value*))
    
    inline def setRetiringPrincipal(value: RetiringPrincipal): Self = StObject.set(x, "retiringPrincipal", value.asInstanceOf[js.Any])
    
    inline def setRetiringPrincipalUndefined: Self = StObject.set(x, "retiringPrincipal", js.undefined)
  }
}
