package typings.angularLocalize

import typings.angularLocalize.mod.ɵParsedMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcExtractTranslationFilesTranslationSerializerMod {
  
  trait TranslationSerializer extends StObject {
    
    /**
      * Serialize the contents of a translation file containing the given `messages`.
      *
      * @param messages The messages to render to the file.
      * @returns The contents of the serialized file.
      */
    def serialize(messages: js.Array[ɵParsedMessage]): String
  }
  object TranslationSerializer {
    
    inline def apply(serialize: js.Array[ɵParsedMessage] => String): TranslationSerializer = {
      val __obj = js.Dynamic.literal(serialize = js.Any.fromFunction1(serialize))
      __obj.asInstanceOf[TranslationSerializer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TranslationSerializer] (val x: Self) extends AnyVal {
      
      inline def setSerialize(value: js.Array[ɵParsedMessage] => String): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
    }
  }
}
