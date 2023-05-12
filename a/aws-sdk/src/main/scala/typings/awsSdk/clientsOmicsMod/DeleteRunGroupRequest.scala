package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRunGroupRequest extends StObject {
  
  /**
    * The run group's ID.
    */
  var id: RunGroupId
}
object DeleteRunGroupRequest {
  
  inline def apply(id: RunGroupId): DeleteRunGroupRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRunGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteRunGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: RunGroupId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
