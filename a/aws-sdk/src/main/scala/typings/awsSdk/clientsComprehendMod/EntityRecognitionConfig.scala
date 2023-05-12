package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityRecognitionConfig extends StObject {
  
  /**
    * Up to 25 entity types that the model is trained to recognize.
    */
  var EntityTypes: EntityTypesList
}
object EntityRecognitionConfig {
  
  inline def apply(EntityTypes: EntityTypesList): EntityRecognitionConfig = {
    val __obj = js.Dynamic.literal(EntityTypes = EntityTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityRecognitionConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntityRecognitionConfig] (val x: Self) extends AnyVal {
    
    inline def setEntityTypes(value: EntityTypesList): Self = StObject.set(x, "EntityTypes", value.asInstanceOf[js.Any])
    
    inline def setEntityTypesVarargs(value: EntityTypesListItem*): Self = StObject.set(x, "EntityTypes", js.Array(value*))
  }
}
