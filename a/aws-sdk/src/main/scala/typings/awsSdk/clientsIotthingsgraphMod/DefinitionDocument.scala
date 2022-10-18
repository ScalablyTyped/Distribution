package typings.awsSdk.clientsIotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefinitionDocument extends StObject {
  
  /**
    * The language used to define the entity. GRAPHQL is the only valid value.
    */
  var language: DefinitionLanguage
  
  /**
    * The GraphQL text that defines the entity.
    */
  var text: DefinitionText
}
object DefinitionDocument {
  
  inline def apply(language: DefinitionLanguage, text: DefinitionText): DefinitionDocument = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionDocument]
  }
  
  extension [Self <: DefinitionDocument](x: Self) {
    
    inline def setLanguage(value: DefinitionLanguage): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setText(value: DefinitionText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
