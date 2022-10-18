package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExperienceEntitiesSummary extends StObject {
  
  /**
    * Information about the user entity.
    */
  var DisplayData: js.UndefOr[EntityDisplayData] = js.undefined
  
  /**
    * The identifier of a user or group in your IAM Identity Center identity source. For example, a user ID could be an email.
    */
  var EntityId: js.UndefOr[typings.awsSdk.clientsKendraMod.EntityId] = js.undefined
  
  /**
    * Shows the type as User or Group.
    */
  var EntityType: js.UndefOr[typings.awsSdk.clientsKendraMod.EntityType] = js.undefined
}
object ExperienceEntitiesSummary {
  
  inline def apply(): ExperienceEntitiesSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperienceEntitiesSummary]
  }
  
  extension [Self <: ExperienceEntitiesSummary](x: Self) {
    
    inline def setDisplayData(value: EntityDisplayData): Self = StObject.set(x, "DisplayData", value.asInstanceOf[js.Any])
    
    inline def setDisplayDataUndefined: Self = StObject.set(x, "DisplayData", js.undefined)
    
    inline def setEntityId(value: EntityId): Self = StObject.set(x, "EntityId", value.asInstanceOf[js.Any])
    
    inline def setEntityIdUndefined: Self = StObject.set(x, "EntityId", js.undefined)
    
    inline def setEntityType(value: EntityType): Self = StObject.set(x, "EntityType", value.asInstanceOf[js.Any])
    
    inline def setEntityTypeUndefined: Self = StObject.set(x, "EntityType", js.undefined)
  }
}
