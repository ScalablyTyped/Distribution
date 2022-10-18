package typings.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SNOMEDCTAttribute extends StObject {
  
  /**
    *  The 0-based character offset in the input text that shows where the attribute begins. The offset returns the UTF-8 code point in the string. 
    */
  var BeginOffset: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The category of the detected attribute. Possible categories include MEDICAL_CONDITION, ANATOMY, and TEST_TREATMENT_PROCEDURE. 
    */
  var Category: js.UndefOr[SNOMEDCTEntityCategory] = js.undefined
  
  /**
    *  The 0-based character offset in the input text that shows where the attribute ends. The offset returns the UTF-8 code point in the string. 
    */
  var EndOffset: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The numeric identifier for this attribute. This is a monotonically increasing id unique within this response rather than a global unique identifier. 
    */
  var Id: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The level of confidence that Comprehend Medical has that this attribute is correctly related to this entity. 
    */
  var RelationshipScore: js.UndefOr[Float] = js.undefined
  
  /**
    *  The type of relationship that exists between the entity and the related attribute. 
    */
  var RelationshipType: js.UndefOr[SNOMEDCTRelationshipType] = js.undefined
  
  /**
    *  The SNOMED-CT concepts specific to an attribute, along with a score indicating the likelihood of the match. 
    */
  var SNOMEDCTConcepts: js.UndefOr[SNOMEDCTConceptList] = js.undefined
  
  /**
    *  The level of confidence that Comprehend Medical has that the segment of text is correctly recognized as an attribute. 
    */
  var Score: js.UndefOr[Float] = js.undefined
  
  /**
    *  The segment of input text extracted as this attribute. 
    */
  var Text: js.UndefOr[String] = js.undefined
  
  /**
    *  Contextual information for an attribute. Examples include signs, symptoms, diagnosis, and negation. 
    */
  var Traits: js.UndefOr[SNOMEDCTTraitList] = js.undefined
  
  /**
    *  The type of attribute. Possible types include DX_NAME, ACUITY, DIRECTION, SYSTEM_ORGAN_SITE,TEST_NAME, TEST_VALUE, TEST_UNIT, PROCEDURE_NAME, and TREATMENT_NAME. 
    */
  var Type: js.UndefOr[SNOMEDCTAttributeType] = js.undefined
}
object SNOMEDCTAttribute {
  
  inline def apply(): SNOMEDCTAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SNOMEDCTAttribute]
  }
  
  extension [Self <: SNOMEDCTAttribute](x: Self) {
    
    inline def setBeginOffset(value: Integer): Self = StObject.set(x, "BeginOffset", value.asInstanceOf[js.Any])
    
    inline def setBeginOffsetUndefined: Self = StObject.set(x, "BeginOffset", js.undefined)
    
    inline def setCategory(value: SNOMEDCTEntityCategory): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    inline def setEndOffset(value: Integer): Self = StObject.set(x, "EndOffset", value.asInstanceOf[js.Any])
    
    inline def setEndOffsetUndefined: Self = StObject.set(x, "EndOffset", js.undefined)
    
    inline def setId(value: Integer): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setRelationshipScore(value: Float): Self = StObject.set(x, "RelationshipScore", value.asInstanceOf[js.Any])
    
    inline def setRelationshipScoreUndefined: Self = StObject.set(x, "RelationshipScore", js.undefined)
    
    inline def setRelationshipType(value: SNOMEDCTRelationshipType): Self = StObject.set(x, "RelationshipType", value.asInstanceOf[js.Any])
    
    inline def setRelationshipTypeUndefined: Self = StObject.set(x, "RelationshipType", js.undefined)
    
    inline def setSNOMEDCTConcepts(value: SNOMEDCTConceptList): Self = StObject.set(x, "SNOMEDCTConcepts", value.asInstanceOf[js.Any])
    
    inline def setSNOMEDCTConceptsUndefined: Self = StObject.set(x, "SNOMEDCTConcepts", js.undefined)
    
    inline def setSNOMEDCTConceptsVarargs(value: SNOMEDCTConcept*): Self = StObject.set(x, "SNOMEDCTConcepts", js.Array(value*))
    
    inline def setScore(value: Float): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
    
    inline def setTraits(value: SNOMEDCTTraitList): Self = StObject.set(x, "Traits", value.asInstanceOf[js.Any])
    
    inline def setTraitsUndefined: Self = StObject.set(x, "Traits", js.undefined)
    
    inline def setTraitsVarargs(value: SNOMEDCTTrait*): Self = StObject.set(x, "Traits", js.Array(value*))
    
    inline def setType(value: SNOMEDCTAttributeType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
