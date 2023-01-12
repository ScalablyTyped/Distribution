package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDecoderManifestRequest extends StObject {
  
  /**
    *  The name of the decoder manifest to retrieve information about. 
    */
  var name: resourceName
}
object GetDecoderManifestRequest {
  
  inline def apply(name: resourceName): GetDecoderManifestRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDecoderManifestRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDecoderManifestRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: resourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
