package typings.awsSdk.clientsIotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSystemInstanceRequest extends StObject {
  
  /**
    * The ID of the system instance to be deleted.
    */
  var id: js.UndefOr[Urn] = js.undefined
}
object DeleteSystemInstanceRequest {
  
  inline def apply(): DeleteSystemInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSystemInstanceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSystemInstanceRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: Urn): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
