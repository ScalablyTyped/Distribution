package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateReceiptFilterRequest extends StObject {
  
  /**
    * A data structure that describes the IP address filter to create, which consists of a name, an IP address range, and whether to allow or block mail from it.
    */
  var Filter: ReceiptFilter
}
object CreateReceiptFilterRequest {
  
  inline def apply(Filter: ReceiptFilter): CreateReceiptFilterRequest = {
    val __obj = js.Dynamic.literal(Filter = Filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReceiptFilterRequest]
  }
  
  extension [Self <: CreateReceiptFilterRequest](x: Self) {
    
    inline def setFilter(value: ReceiptFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
  }
}
