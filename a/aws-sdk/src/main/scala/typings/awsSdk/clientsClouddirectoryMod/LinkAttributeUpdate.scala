package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkAttributeUpdate extends StObject {
  
  /**
    * The action to perform as part of the attribute update.
    */
  var AttributeAction: js.UndefOr[LinkAttributeAction] = js.undefined
  
  /**
    * The key of the attribute being updated.
    */
  var AttributeKey: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.AttributeKey] = js.undefined
}
object LinkAttributeUpdate {
  
  inline def apply(): LinkAttributeUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkAttributeUpdate]
  }
  
  extension [Self <: LinkAttributeUpdate](x: Self) {
    
    inline def setAttributeAction(value: LinkAttributeAction): Self = StObject.set(x, "AttributeAction", value.asInstanceOf[js.Any])
    
    inline def setAttributeActionUndefined: Self = StObject.set(x, "AttributeAction", js.undefined)
    
    inline def setAttributeKey(value: AttributeKey): Self = StObject.set(x, "AttributeKey", value.asInstanceOf[js.Any])
    
    inline def setAttributeKeyUndefined: Self = StObject.set(x, "AttributeKey", js.undefined)
  }
}
