package typings.awsSdk.clientsServerlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApplicationPolicyResponse extends StObject {
  
  /**
    * An array of policy statements applied to the application.
    */
  var Statements: js.UndefOr[listOfApplicationPolicyStatement] = js.undefined
}
object GetApplicationPolicyResponse {
  
  inline def apply(): GetApplicationPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetApplicationPolicyResponse]
  }
  
  extension [Self <: GetApplicationPolicyResponse](x: Self) {
    
    inline def setStatements(value: listOfApplicationPolicyStatement): Self = StObject.set(x, "Statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsUndefined: Self = StObject.set(x, "Statements", js.undefined)
    
    inline def setStatementsVarargs(value: ApplicationPolicyStatement*): Self = StObject.set(x, "Statements", js.Array(value*))
  }
}
