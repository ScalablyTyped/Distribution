package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicNamedEntity extends StObject {
  
  /**
    * The definition of a named entity.
    */
  var Definition: js.UndefOr[NamedEntityDefinitions] = js.undefined
  
  /**
    * The description of the named entity.
    */
  var EntityDescription: js.UndefOr[LimitedString] = js.undefined
  
  /**
    * The name of the named entity.
    */
  var EntityName: LimitedString
  
  /**
    * The other names or aliases for the named entity.
    */
  var EntitySynonyms: js.UndefOr[Synonyms] = js.undefined
  
  /**
    * The type of named entity that a topic represents.
    */
  var SemanticEntityType: js.UndefOr[typings.awsSdk.clientsQuicksightMod.SemanticEntityType] = js.undefined
}
object TopicNamedEntity {
  
  inline def apply(EntityName: LimitedString): TopicNamedEntity = {
    val __obj = js.Dynamic.literal(EntityName = EntityName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicNamedEntity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopicNamedEntity] (val x: Self) extends AnyVal {
    
    inline def setDefinition(value: NamedEntityDefinitions): Self = StObject.set(x, "Definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "Definition", js.undefined)
    
    inline def setDefinitionVarargs(value: NamedEntityDefinition*): Self = StObject.set(x, "Definition", js.Array(value*))
    
    inline def setEntityDescription(value: LimitedString): Self = StObject.set(x, "EntityDescription", value.asInstanceOf[js.Any])
    
    inline def setEntityDescriptionUndefined: Self = StObject.set(x, "EntityDescription", js.undefined)
    
    inline def setEntityName(value: LimitedString): Self = StObject.set(x, "EntityName", value.asInstanceOf[js.Any])
    
    inline def setEntitySynonyms(value: Synonyms): Self = StObject.set(x, "EntitySynonyms", value.asInstanceOf[js.Any])
    
    inline def setEntitySynonymsUndefined: Self = StObject.set(x, "EntitySynonyms", js.undefined)
    
    inline def setEntitySynonymsVarargs(value: LimitedString*): Self = StObject.set(x, "EntitySynonyms", js.Array(value*))
    
    inline def setSemanticEntityType(value: SemanticEntityType): Self = StObject.set(x, "SemanticEntityType", value.asInstanceOf[js.Any])
    
    inline def setSemanticEntityTypeUndefined: Self = StObject.set(x, "SemanticEntityType", js.undefined)
  }
}
