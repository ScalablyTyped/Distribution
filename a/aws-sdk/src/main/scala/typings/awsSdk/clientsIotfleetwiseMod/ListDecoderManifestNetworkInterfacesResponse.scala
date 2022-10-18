package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDecoderManifestNetworkInterfacesResponse extends StObject {
  
  /**
    *  A list of information about network interfaces. 
    */
  var networkInterfaces: js.UndefOr[NetworkInterfaces] = js.undefined
  
  /**
    *  The token to retrieve the next set of results, or null if there are no more results. 
    */
  var nextToken: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.nextToken] = js.undefined
}
object ListDecoderManifestNetworkInterfacesResponse {
  
  inline def apply(): ListDecoderManifestNetworkInterfacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDecoderManifestNetworkInterfacesResponse]
  }
  
  extension [Self <: ListDecoderManifestNetworkInterfacesResponse](x: Self) {
    
    inline def setNetworkInterfaces(value: NetworkInterfaces): Self = StObject.set(x, "networkInterfaces", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfacesUndefined: Self = StObject.set(x, "networkInterfaces", js.undefined)
    
    inline def setNetworkInterfacesVarargs(value: NetworkInterface*): Self = StObject.set(x, "networkInterfaces", js.Array(value*))
    
    inline def setNextToken(value: nextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
