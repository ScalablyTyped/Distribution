package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDecoderManifestRequest extends StObject {
  
  /**
    *  A brief description of the decoder manifest to update. 
    */
  var description: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.description] = js.undefined
  
  /**
    *  The name of the decoder manifest to update.
    */
  var name: resourceName
  
  /**
    *  A list of information about the network interfaces to add to the decoder manifest. 
    */
  var networkInterfacesToAdd: js.UndefOr[NetworkInterfaces] = js.undefined
  
  /**
    *  A list of network interfaces to remove from the decoder manifest.
    */
  var networkInterfacesToRemove: js.UndefOr[InterfaceIds] = js.undefined
  
  /**
    *  A list of information about the network interfaces to update in the decoder manifest. 
    */
  var networkInterfacesToUpdate: js.UndefOr[NetworkInterfaces] = js.undefined
  
  /**
    *  A list of information about decoding additional signals to add to the decoder manifest. 
    */
  var signalDecodersToAdd: js.UndefOr[SignalDecoders] = js.undefined
  
  /**
    *  A list of signal decoders to remove from the decoder manifest. 
    */
  var signalDecodersToRemove: js.UndefOr[Fqns] = js.undefined
  
  /**
    *  A list of updated information about decoding signals to update in the decoder manifest. 
    */
  var signalDecodersToUpdate: js.UndefOr[SignalDecoders] = js.undefined
  
  /**
    *  The state of the decoder manifest. If the status is ACTIVE, the decoder manifest can't be edited. If the status is DRAFT, you can edit the decoder manifest. 
    */
  var status: js.UndefOr[ManifestStatus] = js.undefined
}
object UpdateDecoderManifestRequest {
  
  inline def apply(name: resourceName): UpdateDecoderManifestRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDecoderManifestRequest]
  }
  
  extension [Self <: UpdateDecoderManifestRequest](x: Self) {
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: resourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfacesToAdd(value: NetworkInterfaces): Self = StObject.set(x, "networkInterfacesToAdd", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfacesToAddUndefined: Self = StObject.set(x, "networkInterfacesToAdd", js.undefined)
    
    inline def setNetworkInterfacesToAddVarargs(value: NetworkInterface*): Self = StObject.set(x, "networkInterfacesToAdd", js.Array(value*))
    
    inline def setNetworkInterfacesToRemove(value: InterfaceIds): Self = StObject.set(x, "networkInterfacesToRemove", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfacesToRemoveUndefined: Self = StObject.set(x, "networkInterfacesToRemove", js.undefined)
    
    inline def setNetworkInterfacesToRemoveVarargs(value: InterfaceId*): Self = StObject.set(x, "networkInterfacesToRemove", js.Array(value*))
    
    inline def setNetworkInterfacesToUpdate(value: NetworkInterfaces): Self = StObject.set(x, "networkInterfacesToUpdate", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfacesToUpdateUndefined: Self = StObject.set(x, "networkInterfacesToUpdate", js.undefined)
    
    inline def setNetworkInterfacesToUpdateVarargs(value: NetworkInterface*): Self = StObject.set(x, "networkInterfacesToUpdate", js.Array(value*))
    
    inline def setSignalDecodersToAdd(value: SignalDecoders): Self = StObject.set(x, "signalDecodersToAdd", value.asInstanceOf[js.Any])
    
    inline def setSignalDecodersToAddUndefined: Self = StObject.set(x, "signalDecodersToAdd", js.undefined)
    
    inline def setSignalDecodersToAddVarargs(value: SignalDecoder*): Self = StObject.set(x, "signalDecodersToAdd", js.Array(value*))
    
    inline def setSignalDecodersToRemove(value: Fqns): Self = StObject.set(x, "signalDecodersToRemove", value.asInstanceOf[js.Any])
    
    inline def setSignalDecodersToRemoveUndefined: Self = StObject.set(x, "signalDecodersToRemove", js.undefined)
    
    inline def setSignalDecodersToRemoveVarargs(value: FullyQualifiedName*): Self = StObject.set(x, "signalDecodersToRemove", js.Array(value*))
    
    inline def setSignalDecodersToUpdate(value: SignalDecoders): Self = StObject.set(x, "signalDecodersToUpdate", value.asInstanceOf[js.Any])
    
    inline def setSignalDecodersToUpdateUndefined: Self = StObject.set(x, "signalDecodersToUpdate", js.undefined)
    
    inline def setSignalDecodersToUpdateVarargs(value: SignalDecoder*): Self = StObject.set(x, "signalDecodersToUpdate", js.Array(value*))
    
    inline def setStatus(value: ManifestStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
