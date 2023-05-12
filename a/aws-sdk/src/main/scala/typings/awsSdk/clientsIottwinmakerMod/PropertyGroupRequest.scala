package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyGroupRequest extends StObject {
  
  /**
    * The group type.
    */
  var groupType: js.UndefOr[GroupType] = js.undefined
  
  /**
    * The names of properties.
    */
  var propertyNames: js.UndefOr[PropertyNames] = js.undefined
}
object PropertyGroupRequest {
  
  inline def apply(): PropertyGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertyGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setGroupType(value: GroupType): Self = StObject.set(x, "groupType", value.asInstanceOf[js.Any])
    
    inline def setGroupTypeUndefined: Self = StObject.set(x, "groupType", js.undefined)
    
    inline def setPropertyNames(value: PropertyNames): Self = StObject.set(x, "propertyNames", value.asInstanceOf[js.Any])
    
    inline def setPropertyNamesUndefined: Self = StObject.set(x, "propertyNames", js.undefined)
    
    inline def setPropertyNamesVarargs(value: Name*): Self = StObject.set(x, "propertyNames", js.Array(value*))
  }
}
