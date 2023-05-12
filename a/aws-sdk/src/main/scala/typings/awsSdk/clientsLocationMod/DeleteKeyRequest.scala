package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteKeyRequest extends StObject {
  
  /**
    * The name of the API key to delete.
    */
  var KeyName: ResourceName
}
object DeleteKeyRequest {
  
  inline def apply(KeyName: ResourceName): DeleteKeyRequest = {
    val __obj = js.Dynamic.literal(KeyName = KeyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteKeyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteKeyRequest] (val x: Self) extends AnyVal {
    
    inline def setKeyName(value: ResourceName): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
  }
}
