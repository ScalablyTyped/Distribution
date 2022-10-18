package typings.awsSdk.clientsQldbsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSessionRequest extends StObject {
  
  /**
    * The name of the ledger to start a new session against.
    */
  var LedgerName: typings.awsSdk.clientsQldbsessionMod.LedgerName
}
object StartSessionRequest {
  
  inline def apply(LedgerName: LedgerName): StartSessionRequest = {
    val __obj = js.Dynamic.literal(LedgerName = LedgerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSessionRequest]
  }
  
  extension [Self <: StartSessionRequest](x: Self) {
    
    inline def setLedgerName(value: LedgerName): Self = StObject.set(x, "LedgerName", value.asInstanceOf[js.Any])
  }
}
