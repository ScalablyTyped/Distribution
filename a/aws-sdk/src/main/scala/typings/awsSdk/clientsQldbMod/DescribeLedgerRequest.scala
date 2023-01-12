package typings.awsSdk.clientsQldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLedgerRequest extends StObject {
  
  /**
    * The name of the ledger that you want to describe.
    */
  var Name: LedgerName
}
object DescribeLedgerRequest {
  
  inline def apply(Name: LedgerName): DescribeLedgerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLedgerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeLedgerRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: LedgerName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
