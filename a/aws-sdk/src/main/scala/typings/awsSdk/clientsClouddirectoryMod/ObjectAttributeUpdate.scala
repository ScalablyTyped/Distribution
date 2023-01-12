package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectAttributeUpdate extends StObject {
  
  /**
    * The action to perform as part of the attribute update.
    */
  var ObjectAttributeAction: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.ObjectAttributeAction] = js.undefined
  
  /**
    * The key of the attribute being updated.
    */
  var ObjectAttributeKey: js.UndefOr[AttributeKey] = js.undefined
}
object ObjectAttributeUpdate {
  
  inline def apply(): ObjectAttributeUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectAttributeUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectAttributeUpdate] (val x: Self) extends AnyVal {
    
    inline def setObjectAttributeAction(value: ObjectAttributeAction): Self = StObject.set(x, "ObjectAttributeAction", value.asInstanceOf[js.Any])
    
    inline def setObjectAttributeActionUndefined: Self = StObject.set(x, "ObjectAttributeAction", js.undefined)
    
    inline def setObjectAttributeKey(value: AttributeKey): Self = StObject.set(x, "ObjectAttributeKey", value.asInstanceOf[js.Any])
    
    inline def setObjectAttributeKeyUndefined: Self = StObject.set(x, "ObjectAttributeKey", js.undefined)
  }
}
