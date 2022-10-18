package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferInputDeviceRequest extends StObject {
  
  /**
    * The unique ID of this input device. For example, hd-123456789abcdef.
    */
  var InputDeviceId: string
  
  /**
    * The AWS account ID (12 digits) for the recipient of the device transfer.
    */
  var TargetCustomerId: js.UndefOr[string] = js.undefined
  
  /**
    * The target AWS region to transfer the device.
    */
  var TargetRegion: js.UndefOr[string] = js.undefined
  
  /**
    * An optional message for the recipient. Maximum 280 characters.
    */
  var TransferMessage: js.UndefOr[string] = js.undefined
}
object TransferInputDeviceRequest {
  
  inline def apply(InputDeviceId: string): TransferInputDeviceRequest = {
    val __obj = js.Dynamic.literal(InputDeviceId = InputDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferInputDeviceRequest]
  }
  
  extension [Self <: TransferInputDeviceRequest](x: Self) {
    
    inline def setInputDeviceId(value: string): Self = StObject.set(x, "InputDeviceId", value.asInstanceOf[js.Any])
    
    inline def setTargetCustomerId(value: string): Self = StObject.set(x, "TargetCustomerId", value.asInstanceOf[js.Any])
    
    inline def setTargetCustomerIdUndefined: Self = StObject.set(x, "TargetCustomerId", js.undefined)
    
    inline def setTargetRegion(value: string): Self = StObject.set(x, "TargetRegion", value.asInstanceOf[js.Any])
    
    inline def setTargetRegionUndefined: Self = StObject.set(x, "TargetRegion", js.undefined)
    
    inline def setTransferMessage(value: string): Self = StObject.set(x, "TransferMessage", value.asInstanceOf[js.Any])
    
    inline def setTransferMessageUndefined: Self = StObject.set(x, "TransferMessage", js.undefined)
  }
}
