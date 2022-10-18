package typings.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entity extends StObject {
  
  /**
    *  The extracted attributes that relate to this entity.
    */
  var Attributes: js.UndefOr[AttributeList] = js.undefined
  
  /**
    *  The 0-based character offset in the input text that shows where the entity begins. The offset returns the UTF-8 code point in the string. 
    */
  var BeginOffset: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The category of the entity.
    */
  var Category: js.UndefOr[EntityType] = js.undefined
  
  /**
    *  The 0-based character offset in the input text that shows where the entity ends. The offset returns the UTF-8 code point in the string. 
    */
  var EndOffset: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The numeric identifier for the entity. This is a monotonically increasing id unique within this response rather than a global unique identifier. 
    */
  var Id: js.UndefOr[Integer] = js.undefined
  
  /**
    * The level of confidence that Comprehend Medical; has in the accuracy of the detection.
    */
  var Score: js.UndefOr[Float] = js.undefined
  
  /**
    *  The segment of input text extracted as this entity.
    */
  var Text: js.UndefOr[String] = js.undefined
  
  /**
    * Contextual information for the entity.
    */
  var Traits: js.UndefOr[TraitList] = js.undefined
  
  /**
    *  Describes the specific type of entity with category of entities.
    */
  var Type: js.UndefOr[EntitySubType] = js.undefined
}
object Entity {
  
  inline def apply(): Entity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Entity]
  }
  
  extension [Self <: Entity](x: Self) {
    
    inline def setAttributes(value: AttributeList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "Attributes", js.Array(value*))
    
    inline def setBeginOffset(value: Integer): Self = StObject.set(x, "BeginOffset", value.asInstanceOf[js.Any])
    
    inline def setBeginOffsetUndefined: Self = StObject.set(x, "BeginOffset", js.undefined)
    
    inline def setCategory(value: EntityType): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    inline def setEndOffset(value: Integer): Self = StObject.set(x, "EndOffset", value.asInstanceOf[js.Any])
    
    inline def setEndOffsetUndefined: Self = StObject.set(x, "EndOffset", js.undefined)
    
    inline def setId(value: Integer): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setScore(value: Float): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
    
    inline def setTraits(value: TraitList): Self = StObject.set(x, "Traits", value.asInstanceOf[js.Any])
    
    inline def setTraitsUndefined: Self = StObject.set(x, "Traits", js.undefined)
    
    inline def setTraitsVarargs(value: Trait*): Self = StObject.set(x, "Traits", js.Array(value*))
    
    inline def setType(value: EntitySubType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
