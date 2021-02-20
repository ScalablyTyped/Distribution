package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Customer extends StObject {
  
  var Customer: Audio = js.native
}
object Customer {
  
  @scala.inline
  def apply(Customer: Audio): Customer = {
    val __obj = js.Dynamic.literal(Customer = Customer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Customer]
  }
  
  @scala.inline
  implicit class CustomerMutableBuilder[Self <: Customer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomer(value: Audio): Self = StObject.set(x, "Customer", value.asInstanceOf[js.Any])
  }
}
