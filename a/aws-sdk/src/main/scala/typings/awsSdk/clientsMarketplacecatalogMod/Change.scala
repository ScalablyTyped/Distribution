package typings.awsSdk.clientsMarketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Change extends StObject {
  
  /**
    * Optional name for the change.
    */
  var ChangeName: js.UndefOr[typings.awsSdk.clientsMarketplacecatalogMod.ChangeName] = js.undefined
  
  /**
    * Change types are single string values that describe your intention for the change. Each change type is unique for each EntityType provided in the change's scope. For more information on change types available for single-AMI products, see Working with single-AMI products. Also, for more information on change types available for container-based products, see Working with container products.
    */
  var ChangeType: typings.awsSdk.clientsMarketplacecatalogMod.ChangeType
  
  /**
    * This object contains details specific to the change type of the requested change. For more information on change types available for single-AMI products, see Working with single-AMI products. Also, for more information on change types available for container-based products, see Working with container products.
    */
  var Details: Json
  
  /**
    * The entity to be changed.
    */
  var Entity: typings.awsSdk.clientsMarketplacecatalogMod.Entity
  
  /**
    * The tags associated with the change.
    */
  var EntityTags: js.UndefOr[TagList] = js.undefined
}
object Change {
  
  inline def apply(ChangeType: ChangeType, Details: Json, Entity: Entity): Change = {
    val __obj = js.Dynamic.literal(ChangeType = ChangeType.asInstanceOf[js.Any], Details = Details.asInstanceOf[js.Any], Entity = Entity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Change] (val x: Self) extends AnyVal {
    
    inline def setChangeName(value: ChangeName): Self = StObject.set(x, "ChangeName", value.asInstanceOf[js.Any])
    
    inline def setChangeNameUndefined: Self = StObject.set(x, "ChangeName", js.undefined)
    
    inline def setChangeType(value: ChangeType): Self = StObject.set(x, "ChangeType", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: Json): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    inline def setEntity(value: Entity): Self = StObject.set(x, "Entity", value.asInstanceOf[js.Any])
    
    inline def setEntityTags(value: TagList): Self = StObject.set(x, "EntityTags", value.asInstanceOf[js.Any])
    
    inline def setEntityTagsUndefined: Self = StObject.set(x, "EntityTags", js.undefined)
    
    inline def setEntityTagsVarargs(value: Tag*): Self = StObject.set(x, "EntityTags", js.Array(value*))
  }
}
