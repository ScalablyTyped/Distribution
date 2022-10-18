package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelationshipValue extends StObject {
  
  /**
    * The name of the target component associated with the relationship value.
    */
  var targetComponentName: js.UndefOr[Name] = js.undefined
  
  /**
    * The ID of the target entity associated with this relationship value.
    */
  var targetEntityId: js.UndefOr[EntityId] = js.undefined
}
object RelationshipValue {
  
  inline def apply(): RelationshipValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationshipValue]
  }
  
  extension [Self <: RelationshipValue](x: Self) {
    
    inline def setTargetComponentName(value: Name): Self = StObject.set(x, "targetComponentName", value.asInstanceOf[js.Any])
    
    inline def setTargetComponentNameUndefined: Self = StObject.set(x, "targetComponentName", js.undefined)
    
    inline def setTargetEntityId(value: EntityId): Self = StObject.set(x, "targetEntityId", value.asInstanceOf[js.Any])
    
    inline def setTargetEntityIdUndefined: Self = StObject.set(x, "targetEntityId", js.undefined)
  }
}
