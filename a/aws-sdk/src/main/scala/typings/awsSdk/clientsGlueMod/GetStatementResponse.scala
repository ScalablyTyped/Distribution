package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStatementResponse extends StObject {
  
  /**
    * Returns the statement.
    */
  var Statement: js.UndefOr[typings.awsSdk.clientsGlueMod.Statement] = js.undefined
}
object GetStatementResponse {
  
  inline def apply(): GetStatementResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStatementResponse]
  }
  
  extension [Self <: GetStatementResponse](x: Self) {
    
    inline def setStatement(value: Statement): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
    
    inline def setStatementUndefined: Self = StObject.set(x, "Statement", js.undefined)
  }
}
