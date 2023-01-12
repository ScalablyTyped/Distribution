package typings.angularLocalize

import typings.angularCompiler.mod.ParseError
import typings.angularLocalize.angularLocalizeStrings.error
import typings.angularLocalize.angularLocalizeStrings.warning
import typings.angularLocalize.mod.MessageId
import typings.angularLocalize.mod.ɵParsedTranslation
import typings.angularLocalize.mod.ɵSourceLocation
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Block extends StObject {
    
    var block: js.UndefOr[String] = js.undefined
    
    var text: String
  }
  object Block {
    
    inline def apply(text: String): Block = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Block]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Block] (val x: Self) extends AnyVal {
      
      inline def setBlock(value: String): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait BodyAttribute extends StObject {
    
    var bodyAttribute: js.UndefOr[String] = js.undefined
    
    var elementName: String
    
    var nameAttribute: String
  }
  object BodyAttribute {
    
    inline def apply(elementName: String, nameAttribute: String): BodyAttribute = {
      val __obj = js.Dynamic.literal(elementName = elementName.asInstanceOf[js.Any], nameAttribute = nameAttribute.asInstanceOf[js.Any])
      __obj.asInstanceOf[BodyAttribute]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BodyAttribute] (val x: Self) extends AnyVal {
      
      inline def setBodyAttribute(value: String): Self = StObject.set(x, "bodyAttribute", value.asInstanceOf[js.Any])
      
      inline def setBodyAttributeUndefined: Self = StObject.set(x, "bodyAttribute", js.undefined)
      
      inline def setElementName(value: String): Self = StObject.set(x, "elementName", value.asInstanceOf[js.Any])
      
      inline def setNameAttribute(value: String): Self = StObject.set(x, "nameAttribute", value.asInstanceOf[js.Any])
    }
  }
  
  trait Column extends StObject {
    
    var column: Double
    
    var line: Double
  }
  object Column {
    
    inline def apply(column: Double, line: Double): Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  trait ElementName extends StObject {
    
    var elementName: String
    
    var endAttribute: String
    
    var startAttribute: String
  }
  object ElementName {
    
    inline def apply(elementName: String, endAttribute: String, startAttribute: String): ElementName = {
      val __obj = js.Dynamic.literal(elementName = elementName.asInstanceOf[js.Any], endAttribute = endAttribute.asInstanceOf[js.Any], startAttribute = startAttribute.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ElementName] (val x: Self) extends AnyVal {
      
      inline def setElementName(value: String): Self = StObject.set(x, "elementName", value.asInstanceOf[js.Any])
      
      inline def setEndAttribute(value: String): Self = StObject.set(x, "endAttribute", value.asInstanceOf[js.Any])
      
      inline def setStartAttribute(value: String): Self = StObject.set(x, "startAttribute", value.asInstanceOf[js.Any])
    }
  }
  
  trait Elements extends StObject {
    
    var elements: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify t.StringLiteral */ Any
      ]
  }
  object Elements {
    
    inline def apply(
      elements: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify t.StringLiteral */ Any
        ]
    ): Elements = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
      __obj.asInstanceOf[Elements]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Elements] (val x: Self) extends AnyVal {
      
      inline def setElements(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify t.StringLiteral */ Any
            ]
      ): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify t.StringLiteral */ Any)*
      ): Self = StObject.set(x, "elements", js.Array(value*))
    }
  }
  
  trait Message extends StObject {
    
    var message: String
    
    var `type`: warning | error
  }
  object Message {
    
    inline def apply(message: String, `type`: warning | error): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setType(value: warning | error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParseErrors extends StObject {
    
    var parseErrors: js.Array[ParseError]
    
    var serializeErrors: js.Array[ParseError]
    
    var translation: ɵParsedTranslation | Null
  }
  object ParseErrors {
    
    inline def apply(parseErrors: js.Array[ParseError], serializeErrors: js.Array[ParseError]): ParseErrors = {
      val __obj = js.Dynamic.literal(parseErrors = parseErrors.asInstanceOf[js.Any], serializeErrors = serializeErrors.asInstanceOf[js.Any], translation = null)
      __obj.asInstanceOf[ParseErrors]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseErrors] (val x: Self) extends AnyVal {
      
      inline def setParseErrors(value: js.Array[ParseError]): Self = StObject.set(x, "parseErrors", value.asInstanceOf[js.Any])
      
      inline def setParseErrorsVarargs(value: ParseError*): Self = StObject.set(x, "parseErrors", js.Array(value*))
      
      inline def setSerializeErrors(value: js.Array[ParseError]): Self = StObject.set(x, "serializeErrors", value.asInstanceOf[js.Any])
      
      inline def setSerializeErrorsVarargs(value: ParseError*): Self = StObject.set(x, "serializeErrors", js.Array(value*))
      
      inline def setTranslation(value: ɵParsedTranslation): Self = StObject.set(x, "translation", value.asInstanceOf[js.Any])
      
      inline def setTranslationNull: Self = StObject.set(x, "translation", null)
    }
  }
  
  /* Inlined @angular/localize.@angular/localize.ɵParsedMessage & {  location :@angular/localize.@angular/localize.ɵSourceLocation} */
  trait ɵParsedMessagelocationɵSo extends StObject {
    
    /**
      * An optional mapping of placeholder names to associated MessageIds.
      * This can be used to match ICU placeholders to the message that contains the ICU.
      */
    var associatedMessageIds: js.UndefOr[Record[String, MessageId]] = js.undefined
    
    /**
      * The id of the `message` if a custom one was specified explicitly.
      *
      * This id overrides any computed or legacy ids.
      */
    var customId: js.UndefOr[String] = js.undefined
    
    /**
      * The description of the `message`, used to aid translation.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * The key used to look up the appropriate translation target.
      */
    var id: MessageId
    
    /**
      * Legacy message ids, if provided.
      *
      * In legacy message formats the message id can only be computed directly from the original
      * template source.
      *
      * Since this information is not available in `$localize` calls, the legacy message ids may be
      * attached by the compiler to the `$localize` metablock so it can be used if needed at the point
      * of translation if the translations are encoded using the legacy message id.
      */
    var legacyIds: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The location of the message in the source.
      */
    var location: js.UndefOr[ɵSourceLocation] = js.undefined
    
    /**
      * The meaning of the `message`, used to distinguish identical `messageString`s.
      */
    var meaning: js.UndefOr[String] = js.undefined
    
    /**
      * An optional mapping of message parts to source locations
      */
    var messagePartLocations: js.UndefOr[js.Array[js.UndefOr[ɵSourceLocation]]] = js.undefined
    
    /**
      * The static parts of the message.
      */
    var messageParts: js.Array[String]
    
    /**
      * The names of the placeholders that will be replaced with substitutions.
      */
    var placeholderNames: js.Array[String]
    
    /**
      * An optional mapping of placeholder names to source locations
      */
    var substitutionLocations: js.UndefOr[Record[String, js.UndefOr[ɵSourceLocation]]] = js.undefined
    
    /**
      * A mapping of placeholder names to substitution values.
      */
    var substitutions: Record[String, Any]
    
    /**
      * A human readable rendering of the message
      */
    var text: String
  }
  object ɵParsedMessagelocationɵSo {
    
    inline def apply(
      id: MessageId,
      messageParts: js.Array[String],
      placeholderNames: js.Array[String],
      substitutions: Record[String, Any],
      text: String
    ): ɵParsedMessagelocationɵSo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], messageParts = messageParts.asInstanceOf[js.Any], placeholderNames = placeholderNames.asInstanceOf[js.Any], substitutions = substitutions.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ɵParsedMessagelocationɵSo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ɵParsedMessagelocationɵSo] (val x: Self) extends AnyVal {
      
      inline def setAssociatedMessageIds(value: Record[String, MessageId]): Self = StObject.set(x, "associatedMessageIds", value.asInstanceOf[js.Any])
      
      inline def setAssociatedMessageIdsUndefined: Self = StObject.set(x, "associatedMessageIds", js.undefined)
      
      inline def setCustomId(value: String): Self = StObject.set(x, "customId", value.asInstanceOf[js.Any])
      
      inline def setCustomIdUndefined: Self = StObject.set(x, "customId", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setId(value: MessageId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLegacyIds(value: js.Array[String]): Self = StObject.set(x, "legacyIds", value.asInstanceOf[js.Any])
      
      inline def setLegacyIdsUndefined: Self = StObject.set(x, "legacyIds", js.undefined)
      
      inline def setLegacyIdsVarargs(value: String*): Self = StObject.set(x, "legacyIds", js.Array(value*))
      
      inline def setLocation(value: ɵSourceLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setMeaning(value: String): Self = StObject.set(x, "meaning", value.asInstanceOf[js.Any])
      
      inline def setMeaningUndefined: Self = StObject.set(x, "meaning", js.undefined)
      
      inline def setMessagePartLocations(value: js.Array[js.UndefOr[ɵSourceLocation]]): Self = StObject.set(x, "messagePartLocations", value.asInstanceOf[js.Any])
      
      inline def setMessagePartLocationsUndefined: Self = StObject.set(x, "messagePartLocations", js.undefined)
      
      inline def setMessagePartLocationsVarargs(value: js.UndefOr[ɵSourceLocation]*): Self = StObject.set(x, "messagePartLocations", js.Array(value*))
      
      inline def setMessageParts(value: js.Array[String]): Self = StObject.set(x, "messageParts", value.asInstanceOf[js.Any])
      
      inline def setMessagePartsVarargs(value: String*): Self = StObject.set(x, "messageParts", js.Array(value*))
      
      inline def setPlaceholderNames(value: js.Array[String]): Self = StObject.set(x, "placeholderNames", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderNamesVarargs(value: String*): Self = StObject.set(x, "placeholderNames", js.Array(value*))
      
      inline def setSubstitutionLocations(value: Record[String, js.UndefOr[ɵSourceLocation]]): Self = StObject.set(x, "substitutionLocations", value.asInstanceOf[js.Any])
      
      inline def setSubstitutionLocationsUndefined: Self = StObject.set(x, "substitutionLocations", js.undefined)
      
      inline def setSubstitutions(value: Record[String, Any]): Self = StObject.set(x, "substitutions", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
