package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Relationship extends StObject {
  
  /**
    * The type of the relationship.
    */
  var relationshipType: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the target component type associated with this relationship.
    */
  var targetComponentTypeId: js.UndefOr[ComponentTypeId] = js.undefined
}
object Relationship {
  
  inline def apply(): Relationship = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Relationship]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Relationship] (val x: Self) extends AnyVal {
    
    inline def setRelationshipType(value: String): Self = StObject.set(x, "relationshipType", value.asInstanceOf[js.Any])
    
    inline def setRelationshipTypeUndefined: Self = StObject.set(x, "relationshipType", js.undefined)
    
    inline def setTargetComponentTypeId(value: ComponentTypeId): Self = StObject.set(x, "targetComponentTypeId", value.asInstanceOf[js.Any])
    
    inline def setTargetComponentTypeIdUndefined: Self = StObject.set(x, "targetComponentTypeId", js.undefined)
  }
}
