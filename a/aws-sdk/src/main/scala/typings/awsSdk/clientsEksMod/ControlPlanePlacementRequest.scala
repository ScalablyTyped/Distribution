package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlPlanePlacementRequest extends StObject {
  
  /**
    * The name of the placement group for the Kubernetes control plane instances. This setting can't be changed after cluster creation. 
    */
  var groupName: js.UndefOr[String] = js.undefined
}
object ControlPlanePlacementRequest {
  
  inline def apply(): ControlPlanePlacementRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlPlanePlacementRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ControlPlanePlacementRequest] (val x: Self) extends AnyVal {
    
    inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
  }
}
