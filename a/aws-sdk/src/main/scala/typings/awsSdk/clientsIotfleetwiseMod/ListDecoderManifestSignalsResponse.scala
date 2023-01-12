package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDecoderManifestSignalsResponse extends StObject {
  
  /**
    *  The token to retrieve the next set of results, or null if there are no more results. 
    */
  var nextToken: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.nextToken] = js.undefined
  
  /**
    *  Information about a list of signals to decode. 
    */
  var signalDecoders: js.UndefOr[SignalDecoders] = js.undefined
}
object ListDecoderManifestSignalsResponse {
  
  inline def apply(): ListDecoderManifestSignalsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDecoderManifestSignalsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDecoderManifestSignalsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: nextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSignalDecoders(value: SignalDecoders): Self = StObject.set(x, "signalDecoders", value.asInstanceOf[js.Any])
    
    inline def setSignalDecodersUndefined: Self = StObject.set(x, "signalDecoders", js.undefined)
    
    inline def setSignalDecodersVarargs(value: SignalDecoder*): Self = StObject.set(x, "signalDecoders", js.Array(value*))
  }
}
