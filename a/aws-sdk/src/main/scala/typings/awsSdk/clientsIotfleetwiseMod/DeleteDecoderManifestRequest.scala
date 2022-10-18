package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDecoderManifestRequest extends StObject {
  
  /**
    *  The name of the decoder manifest to delete. 
    */
  var name: resourceName
}
object DeleteDecoderManifestRequest {
  
  inline def apply(name: resourceName): DeleteDecoderManifestRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDecoderManifestRequest]
  }
  
  extension [Self <: DeleteDecoderManifestRequest](x: Self) {
    
    inline def setName(value: resourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
