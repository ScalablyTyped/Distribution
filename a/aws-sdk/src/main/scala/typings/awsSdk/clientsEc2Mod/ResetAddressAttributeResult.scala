package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetAddressAttributeResult extends StObject {
  
  /**
    * Information about the IP address.
    */
  var Address: js.UndefOr[AddressAttribute] = js.undefined
}
object ResetAddressAttributeResult {
  
  inline def apply(): ResetAddressAttributeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetAddressAttributeResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResetAddressAttributeResult] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: AddressAttribute): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
  }
}
