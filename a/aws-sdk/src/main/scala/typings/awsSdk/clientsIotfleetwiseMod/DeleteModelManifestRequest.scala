package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteModelManifestRequest extends StObject {
  
  /**
    *  The name of the model manifest to delete. 
    */
  var name: resourceName
}
object DeleteModelManifestRequest {
  
  inline def apply(name: resourceName): DeleteModelManifestRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteModelManifestRequest]
  }
  
  extension [Self <: DeleteModelManifestRequest](x: Self) {
    
    inline def setName(value: resourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
