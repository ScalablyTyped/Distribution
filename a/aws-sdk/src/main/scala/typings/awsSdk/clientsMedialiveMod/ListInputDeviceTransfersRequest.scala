package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInputDeviceTransfersRequest extends StObject {
  
  var MaxResults: js.UndefOr[typings.awsSdk.clientsMedialiveMod.MaxResults] = js.undefined
  
  var NextToken: js.UndefOr[string] = js.undefined
  
  var TransferType: string
}
object ListInputDeviceTransfersRequest {
  
  inline def apply(TransferType: string): ListInputDeviceTransfersRequest = {
    val __obj = js.Dynamic.literal(TransferType = TransferType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInputDeviceTransfersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListInputDeviceTransfersRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTransferType(value: string): Self = StObject.set(x, "TransferType", value.asInstanceOf[js.Any])
  }
}
