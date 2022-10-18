package typings.awsSdk.clientsMarketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entity extends StObject {
  
  /**
    * The identifier for the entity.
    */
  var Identifier: js.UndefOr[typings.awsSdk.clientsMarketplacecatalogMod.Identifier] = js.undefined
  
  /**
    * The type of entity.
    */
  var Type: EntityType
}
object Entity {
  
  inline def apply(Type: EntityType): Entity = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entity]
  }
  
  extension [Self <: Entity](x: Self) {
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "Identifier", js.undefined)
    
    inline def setType(value: EntityType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
