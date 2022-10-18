package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddPermissionResponse extends StObject {
  
  /**
    * The permission statement that's added to the function policy.
    */
  var Statement: js.UndefOr[String] = js.undefined
}
object AddPermissionResponse {
  
  inline def apply(): AddPermissionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddPermissionResponse]
  }
  
  extension [Self <: AddPermissionResponse](x: Self) {
    
    inline def setStatement(value: String): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
    
    inline def setStatementUndefined: Self = StObject.set(x, "Statement", js.undefined)
  }
}
