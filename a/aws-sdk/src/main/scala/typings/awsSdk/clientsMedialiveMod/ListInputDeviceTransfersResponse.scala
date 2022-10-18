package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInputDeviceTransfersResponse extends StObject {
  
  /**
    * The list of devices that you are transferring or are being transferred to you.
    */
  var InputDeviceTransfers: js.UndefOr[listOfTransferringInputDeviceSummary] = js.undefined
  
  /**
    * A token to get additional list results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListInputDeviceTransfersResponse {
  
  inline def apply(): ListInputDeviceTransfersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInputDeviceTransfersResponse]
  }
  
  extension [Self <: ListInputDeviceTransfersResponse](x: Self) {
    
    inline def setInputDeviceTransfers(value: listOfTransferringInputDeviceSummary): Self = StObject.set(x, "InputDeviceTransfers", value.asInstanceOf[js.Any])
    
    inline def setInputDeviceTransfersUndefined: Self = StObject.set(x, "InputDeviceTransfers", js.undefined)
    
    inline def setInputDeviceTransfersVarargs(value: TransferringInputDeviceSummary*): Self = StObject.set(x, "InputDeviceTransfers", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
