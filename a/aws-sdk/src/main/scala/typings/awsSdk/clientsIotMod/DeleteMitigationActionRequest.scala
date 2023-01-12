package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMitigationActionRequest extends StObject {
  
  /**
    * The name of the mitigation action that you want to delete.
    */
  var actionName: MitigationActionName
}
object DeleteMitigationActionRequest {
  
  inline def apply(actionName: MitigationActionName): DeleteMitigationActionRequest = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMitigationActionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteMitigationActionRequest] (val x: Self) extends AnyVal {
    
    inline def setActionName(value: MitigationActionName): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
  }
}
