package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkAttributeAction extends StObject {
  
  /**
    * A type that can be either UPDATE_OR_CREATE or DELETE.
    */
  var AttributeActionType: js.UndefOr[UpdateActionType] = js.undefined
  
  /**
    * The value that you want to update to.
    */
  var AttributeUpdateValue: js.UndefOr[TypedAttributeValue] = js.undefined
}
object LinkAttributeAction {
  
  inline def apply(): LinkAttributeAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkAttributeAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinkAttributeAction] (val x: Self) extends AnyVal {
    
    inline def setAttributeActionType(value: UpdateActionType): Self = StObject.set(x, "AttributeActionType", value.asInstanceOf[js.Any])
    
    inline def setAttributeActionTypeUndefined: Self = StObject.set(x, "AttributeActionType", js.undefined)
    
    inline def setAttributeUpdateValue(value: TypedAttributeValue): Self = StObject.set(x, "AttributeUpdateValue", value.asInstanceOf[js.Any])
    
    inline def setAttributeUpdateValueUndefined: Self = StObject.set(x, "AttributeUpdateValue", js.undefined)
  }
}
