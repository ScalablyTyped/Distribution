package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreditSpecificationRequest extends StObject {
  
  /**
    * The credit option for CPU usage of a T instance. Valid values: standard | unlimited 
    */
  var CpuCredits: String
}
object CreditSpecificationRequest {
  
  inline def apply(CpuCredits: String): CreditSpecificationRequest = {
    val __obj = js.Dynamic.literal(CpuCredits = CpuCredits.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreditSpecificationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreditSpecificationRequest] (val x: Self) extends AnyVal {
    
    inline def setCpuCredits(value: String): Self = StObject.set(x, "CpuCredits", value.asInstanceOf[js.Any])
  }
}
