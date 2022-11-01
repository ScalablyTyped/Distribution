package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptAddressTransferResult extends StObject {
  
  /**
    * An Elastic IP address transfer.
    */
  var AddressTransfer: js.UndefOr[typings.awsSdk.clientsEc2Mod.AddressTransfer] = js.undefined
}
object AcceptAddressTransferResult {
  
  inline def apply(): AcceptAddressTransferResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptAddressTransferResult]
  }
  
  extension [Self <: AcceptAddressTransferResult](x: Self) {
    
    inline def setAddressTransfer(value: AddressTransfer): Self = StObject.set(x, "AddressTransfer", value.asInstanceOf[js.Any])
    
    inline def setAddressTransferUndefined: Self = StObject.set(x, "AddressTransfer", js.undefined)
  }
}
