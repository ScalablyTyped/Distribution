package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreditSpecification extends StObject {
  
  /**
    * The credit option for CPU usage of a T instance. Valid values: standard | unlimited 
    */
  var CpuCredits: js.UndefOr[String] = js.undefined
}
object CreditSpecification {
  
  inline def apply(): CreditSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreditSpecification]
  }
  
  extension [Self <: CreditSpecification](x: Self) {
    
    inline def setCpuCredits(value: String): Self = StObject.set(x, "CpuCredits", value.asInstanceOf[js.Any])
    
    inline def setCpuCreditsUndefined: Self = StObject.set(x, "CpuCredits", js.undefined)
  }
}
