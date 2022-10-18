package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scope extends StObject {
  
  /**
    *  The Amazon Web Services accounts that are included in the scope of the assessment. 
    */
  var awsAccounts: js.UndefOr[AWSAccounts] = js.undefined
  
  /**
    *  The Amazon Web Services services that are included in the scope of the assessment. 
    */
  var awsServices: js.UndefOr[AWSServices] = js.undefined
}
object Scope {
  
  inline def apply(): Scope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scope]
  }
  
  extension [Self <: Scope](x: Self) {
    
    inline def setAwsAccounts(value: AWSAccounts): Self = StObject.set(x, "awsAccounts", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountsUndefined: Self = StObject.set(x, "awsAccounts", js.undefined)
    
    inline def setAwsAccountsVarargs(value: AWSAccount*): Self = StObject.set(x, "awsAccounts", js.Array(value*))
    
    inline def setAwsServices(value: AWSServices): Self = StObject.set(x, "awsServices", value.asInstanceOf[js.Any])
    
    inline def setAwsServicesUndefined: Self = StObject.set(x, "awsServices", js.undefined)
    
    inline def setAwsServicesVarargs(value: AWSService*): Self = StObject.set(x, "awsServices", js.Array(value*))
  }
}
