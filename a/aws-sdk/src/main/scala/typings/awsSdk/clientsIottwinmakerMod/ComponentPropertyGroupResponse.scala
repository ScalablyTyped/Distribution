package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentPropertyGroupResponse extends StObject {
  
  /**
    * The group type.
    */
  var groupType: GroupType
  
  /**
    * A Boolean value that specifies whether the property group is inherited from a parent entity
    */
  var isInherited: Boolean
  
  /**
    * The names of properties
    */
  var propertyNames: PropertyNames
}
object ComponentPropertyGroupResponse {
  
  inline def apply(groupType: GroupType, isInherited: Boolean, propertyNames: PropertyNames): ComponentPropertyGroupResponse = {
    val __obj = js.Dynamic.literal(groupType = groupType.asInstanceOf[js.Any], isInherited = isInherited.asInstanceOf[js.Any], propertyNames = propertyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentPropertyGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentPropertyGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setGroupType(value: GroupType): Self = StObject.set(x, "groupType", value.asInstanceOf[js.Any])
    
    inline def setIsInherited(value: Boolean): Self = StObject.set(x, "isInherited", value.asInstanceOf[js.Any])
    
    inline def setPropertyNames(value: PropertyNames): Self = StObject.set(x, "propertyNames", value.asInstanceOf[js.Any])
    
    inline def setPropertyNamesVarargs(value: Name*): Self = StObject.set(x, "propertyNames", js.Array(value*))
  }
}
