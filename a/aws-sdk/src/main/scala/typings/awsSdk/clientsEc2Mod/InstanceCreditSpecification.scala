package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceCreditSpecification extends StObject {
  
  /**
    * The credit option for CPU usage of the instance. Valid values: standard | unlimited 
    */
  var CpuCredits: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
}
object InstanceCreditSpecification {
  
  inline def apply(): InstanceCreditSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceCreditSpecification]
  }
  
  extension [Self <: InstanceCreditSpecification](x: Self) {
    
    inline def setCpuCredits(value: String): Self = StObject.set(x, "CpuCredits", value.asInstanceOf[js.Any])
    
    inline def setCpuCreditsUndefined: Self = StObject.set(x, "CpuCredits", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
  }
}
