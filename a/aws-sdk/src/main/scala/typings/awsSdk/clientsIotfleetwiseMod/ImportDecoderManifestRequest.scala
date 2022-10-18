package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportDecoderManifestRequest extends StObject {
  
  /**
    *  The name of the decoder manifest to import. 
    */
  var name: resourceName
  
  /**
    *  The file to load into an Amazon Web Services account. 
    */
  var networkFileDefinitions: NetworkFileDefinitions
}
object ImportDecoderManifestRequest {
  
  inline def apply(name: resourceName, networkFileDefinitions: NetworkFileDefinitions): ImportDecoderManifestRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], networkFileDefinitions = networkFileDefinitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportDecoderManifestRequest]
  }
  
  extension [Self <: ImportDecoderManifestRequest](x: Self) {
    
    inline def setName(value: resourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNetworkFileDefinitions(value: NetworkFileDefinitions): Self = StObject.set(x, "networkFileDefinitions", value.asInstanceOf[js.Any])
    
    inline def setNetworkFileDefinitionsVarargs(value: NetworkFileDefinition*): Self = StObject.set(x, "networkFileDefinitions", js.Array(value*))
  }
}
