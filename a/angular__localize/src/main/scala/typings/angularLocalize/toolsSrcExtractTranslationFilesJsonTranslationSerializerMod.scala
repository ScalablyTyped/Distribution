package typings.angularLocalize

import typings.angularLocalize.localizeMod.ɵParsedMessage
import typings.angularLocalize.toolsSrcExtractTranslationFilesTranslationSerializerMod.TranslationSerializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcExtractTranslationFilesJsonTranslationSerializerMod {
  
  @JSImport("@angular/localize/tools/src/extract/translation_files/json_translation_serializer", "SimpleJsonTranslationSerializer")
  @js.native
  open class SimpleJsonTranslationSerializer protected ()
    extends StObject
       with TranslationSerializer {
    def this(sourceLocale: String) = this()
    
    /**
      * Serialize the contents of a translation file containing the given `messages`.
      *
      * @param messages The messages to render to the file.
      * @returns The contents of the serialized file.
      */
    /* CompleteClass */
    override def serialize(messages: js.Array[ɵParsedMessage]): String = js.native
    
    /* private */ var sourceLocale: Any = js.native
  }
}
