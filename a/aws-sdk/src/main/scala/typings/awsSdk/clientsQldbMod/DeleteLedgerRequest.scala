package typings.awsSdk.clientsQldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLedgerRequest extends StObject {
  
  /**
    * The name of the ledger that you want to delete.
    */
  var Name: LedgerName
}
object DeleteLedgerRequest {
  
  inline def apply(Name: LedgerName): DeleteLedgerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLedgerRequest]
  }
  
  extension [Self <: DeleteLedgerRequest](x: Self) {
    
    inline def setName(value: LedgerName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
