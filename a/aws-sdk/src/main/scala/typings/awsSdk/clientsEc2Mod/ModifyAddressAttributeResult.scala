package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyAddressAttributeResult extends StObject {
  
  /**
    * Information about the Elastic IP address.
    */
  var Address: js.UndefOr[AddressAttribute] = js.undefined
}
object ModifyAddressAttributeResult {
  
  inline def apply(): ModifyAddressAttributeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyAddressAttributeResult]
  }
  
  extension [Self <: ModifyAddressAttributeResult](x: Self) {
    
    inline def setAddress(value: AddressAttribute): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
  }
}
