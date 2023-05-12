package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlPlanePlacementResponse extends StObject {
  
  /**
    * The name of the placement group for the Kubernetes control plane instances.
    */
  var groupName: js.UndefOr[String] = js.undefined
}
object ControlPlanePlacementResponse {
  
  inline def apply(): ControlPlanePlacementResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlPlanePlacementResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ControlPlanePlacementResponse] (val x: Self) extends AnyVal {
    
    inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
  }
}
