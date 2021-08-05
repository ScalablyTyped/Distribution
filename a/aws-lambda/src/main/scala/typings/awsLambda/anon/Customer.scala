package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Customer extends StObject {
  
  var Customer: Audio
}
object Customer {
  
  inline def apply(Customer: Audio): Customer = {
    val __obj = js.Dynamic.literal(Customer = Customer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Customer]
  }
  
  extension [Self <: Customer](x: Self) {
    
    inline def setCustomer(value: Audio): Self = StObject.set(x, "Customer", value.asInstanceOf[js.Any])
  }
}
