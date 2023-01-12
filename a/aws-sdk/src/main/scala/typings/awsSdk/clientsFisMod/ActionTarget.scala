package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionTarget extends StObject {
  
  /**
    * The resource type of the target.
    */
  var resourceType: js.UndefOr[TargetResourceTypeId] = js.undefined
}
object ActionTarget {
  
  inline def apply(): ActionTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionTarget] (val x: Self) extends AnyVal {
    
    inline def setResourceType(value: TargetResourceTypeId): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
