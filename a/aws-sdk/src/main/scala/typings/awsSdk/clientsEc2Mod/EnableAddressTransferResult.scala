package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableAddressTransferResult extends StObject {
  
  /**
    * An Elastic IP address transfer.
    */
  var AddressTransfer: js.UndefOr[typings.awsSdk.clientsEc2Mod.AddressTransfer] = js.undefined
}
object EnableAddressTransferResult {
  
  inline def apply(): EnableAddressTransferResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableAddressTransferResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnableAddressTransferResult] (val x: Self) extends AnyVal {
    
    inline def setAddressTransfer(value: AddressTransfer): Self = StObject.set(x, "AddressTransfer", value.asInstanceOf[js.Any])
    
    inline def setAddressTransferUndefined: Self = StObject.set(x, "AddressTransfer", js.undefined)
  }
}
