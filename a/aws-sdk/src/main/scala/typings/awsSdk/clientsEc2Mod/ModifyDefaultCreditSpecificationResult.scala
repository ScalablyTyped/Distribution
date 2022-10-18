package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyDefaultCreditSpecificationResult extends StObject {
  
  /**
    * The default credit option for CPU usage of the instance family.
    */
  var InstanceFamilyCreditSpecification: js.UndefOr[typings.awsSdk.clientsEc2Mod.InstanceFamilyCreditSpecification] = js.undefined
}
object ModifyDefaultCreditSpecificationResult {
  
  inline def apply(): ModifyDefaultCreditSpecificationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyDefaultCreditSpecificationResult]
  }
  
  extension [Self <: ModifyDefaultCreditSpecificationResult](x: Self) {
    
    inline def setInstanceFamilyCreditSpecification(value: InstanceFamilyCreditSpecification): Self = StObject.set(x, "InstanceFamilyCreditSpecification", value.asInstanceOf[js.Any])
    
    inline def setInstanceFamilyCreditSpecificationUndefined: Self = StObject.set(x, "InstanceFamilyCreditSpecification", js.undefined)
  }
}
