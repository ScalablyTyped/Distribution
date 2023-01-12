package typings.awsSdk.clientsQldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDigestRequest extends StObject {
  
  /**
    * The name of the ledger.
    */
  var Name: LedgerName
}
object GetDigestRequest {
  
  inline def apply(Name: LedgerName): GetDigestRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDigestRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDigestRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: LedgerName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
