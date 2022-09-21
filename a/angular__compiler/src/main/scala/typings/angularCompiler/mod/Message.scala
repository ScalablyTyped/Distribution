package typings.angularCompiler.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message
  extends StObject
     with I18nMeta2 {
  
  var customId: String
  
  var description: String
  
  var id: String
  
  /** The ids to use if there are no custom id and if `i18nLegacyMessageIdFormat` is not empty */
  var legacyIds: js.Array[String]
  
  var meaning: String
  
  var messageString: String
  
  var nodes: js.Array[Node3]
  
  var placeholderToMessage: StringDictionary[Message]
  
  var placeholders: StringDictionary[MessagePlaceholder]
  
  var sources: js.Array[MessageSpan]
}
object Message {
  
  inline def apply(
    customId: String,
    description: String,
    id: String,
    legacyIds: js.Array[String],
    meaning: String,
    messageString: String,
    nodes: js.Array[Node3],
    placeholderToMessage: StringDictionary[Message],
    placeholders: StringDictionary[MessagePlaceholder],
    sources: js.Array[MessageSpan]
  ): Message = {
    val __obj = js.Dynamic.literal(customId = customId.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], legacyIds = legacyIds.asInstanceOf[js.Any], meaning = meaning.asInstanceOf[js.Any], messageString = messageString.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], placeholderToMessage = placeholderToMessage.asInstanceOf[js.Any], placeholders = placeholders.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  extension [Self <: Message](x: Self) {
    
    inline def setCustomId(value: String): Self = StObject.set(x, "customId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLegacyIds(value: js.Array[String]): Self = StObject.set(x, "legacyIds", value.asInstanceOf[js.Any])
    
    inline def setLegacyIdsVarargs(value: String*): Self = StObject.set(x, "legacyIds", js.Array(value*))
    
    inline def setMeaning(value: String): Self = StObject.set(x, "meaning", value.asInstanceOf[js.Any])
    
    inline def setMessageString(value: String): Self = StObject.set(x, "messageString", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: js.Array[Node3]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: Node3*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setPlaceholderToMessage(value: StringDictionary[Message]): Self = StObject.set(x, "placeholderToMessage", value.asInstanceOf[js.Any])
    
    inline def setPlaceholders(value: StringDictionary[MessagePlaceholder]): Self = StObject.set(x, "placeholders", value.asInstanceOf[js.Any])
    
    inline def setSources(value: js.Array[MessageSpan]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesVarargs(value: MessageSpan*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
