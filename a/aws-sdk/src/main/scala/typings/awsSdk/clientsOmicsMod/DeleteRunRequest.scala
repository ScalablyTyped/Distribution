package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRunRequest extends StObject {
  
  /**
    * The run's ID.
    */
  var id: RunId
}
object DeleteRunRequest {
  
  inline def apply(id: RunId): DeleteRunRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRunRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteRunRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: RunId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
