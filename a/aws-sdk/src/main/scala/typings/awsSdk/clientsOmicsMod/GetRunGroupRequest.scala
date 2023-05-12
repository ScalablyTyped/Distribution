package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRunGroupRequest extends StObject {
  
  /**
    * The group's ID.
    */
  var id: RunGroupId
}
object GetRunGroupRequest {
  
  inline def apply(id: RunGroupId): GetRunGroupRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRunGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRunGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: RunGroupId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
