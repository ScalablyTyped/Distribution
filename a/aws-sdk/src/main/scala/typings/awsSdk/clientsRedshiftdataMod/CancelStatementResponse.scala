package typings.awsSdk.clientsRedshiftdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelStatementResponse extends StObject {
  
  /**
    * A value that indicates whether the cancel statement succeeded (true). 
    */
  var Status: js.UndefOr[Boolean] = js.undefined
}
object CancelStatementResponse {
  
  inline def apply(): CancelStatementResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelStatementResponse]
  }
  
  extension [Self <: CancelStatementResponse](x: Self) {
    
    inline def setStatus(value: Boolean): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
