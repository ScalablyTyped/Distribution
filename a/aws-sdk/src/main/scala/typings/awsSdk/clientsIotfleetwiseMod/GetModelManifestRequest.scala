package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetModelManifestRequest extends StObject {
  
  /**
    *  The name of the vehicle model to retrieve information about. 
    */
  var name: resourceName
}
object GetModelManifestRequest {
  
  inline def apply(name: resourceName): GetModelManifestRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetModelManifestRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetModelManifestRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: resourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
