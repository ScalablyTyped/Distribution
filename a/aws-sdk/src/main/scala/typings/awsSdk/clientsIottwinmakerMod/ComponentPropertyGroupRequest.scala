package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentPropertyGroupRequest extends StObject {
  
  /**
    * The group type.
    */
  var groupType: js.UndefOr[GroupType] = js.undefined
  
  /**
    * The property names.
    */
  var propertyNames: js.UndefOr[PropertyNames] = js.undefined
  
  /**
    * The update type.
    */
  var updateType: js.UndefOr[PropertyGroupUpdateType] = js.undefined
}
object ComponentPropertyGroupRequest {
  
  inline def apply(): ComponentPropertyGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentPropertyGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentPropertyGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setGroupType(value: GroupType): Self = StObject.set(x, "groupType", value.asInstanceOf[js.Any])
    
    inline def setGroupTypeUndefined: Self = StObject.set(x, "groupType", js.undefined)
    
    inline def setPropertyNames(value: PropertyNames): Self = StObject.set(x, "propertyNames", value.asInstanceOf[js.Any])
    
    inline def setPropertyNamesUndefined: Self = StObject.set(x, "propertyNames", js.undefined)
    
    inline def setPropertyNamesVarargs(value: Name*): Self = StObject.set(x, "propertyNames", js.Array(value*))
    
    inline def setUpdateType(value: PropertyGroupUpdateType): Self = StObject.set(x, "updateType", value.asInstanceOf[js.Any])
    
    inline def setUpdateTypeUndefined: Self = StObject.set(x, "updateType", js.undefined)
  }
}
