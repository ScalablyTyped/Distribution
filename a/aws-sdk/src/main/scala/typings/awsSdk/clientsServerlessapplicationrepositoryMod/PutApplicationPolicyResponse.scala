package typings.awsSdk.clientsServerlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutApplicationPolicyResponse extends StObject {
  
  /**
    * An array of policy statements applied to the application.
    */
  var Statements: js.UndefOr[listOfApplicationPolicyStatement] = js.undefined
}
object PutApplicationPolicyResponse {
  
  inline def apply(): PutApplicationPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutApplicationPolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutApplicationPolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setStatements(value: listOfApplicationPolicyStatement): Self = StObject.set(x, "Statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsUndefined: Self = StObject.set(x, "Statements", js.undefined)
    
    inline def setStatementsVarargs(value: ApplicationPolicyStatement*): Self = StObject.set(x, "Statements", js.Array(value*))
  }
}
