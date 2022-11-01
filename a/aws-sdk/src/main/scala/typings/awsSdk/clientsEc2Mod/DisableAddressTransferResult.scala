package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableAddressTransferResult extends StObject {
  
  /**
    * An Elastic IP address transfer.
    */
  var AddressTransfer: js.UndefOr[typings.awsSdk.clientsEc2Mod.AddressTransfer] = js.undefined
}
object DisableAddressTransferResult {
  
  inline def apply(): DisableAddressTransferResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableAddressTransferResult]
  }
  
  extension [Self <: DisableAddressTransferResult](x: Self) {
    
    inline def setAddressTransfer(value: AddressTransfer): Self = StObject.set(x, "AddressTransfer", value.asInstanceOf[js.Any])
    
    inline def setAddressTransferUndefined: Self = StObject.set(x, "AddressTransfer", js.undefined)
  }
}
