package typings.angularLocalize

import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathManipulation
import typings.angularLocalize.mod.ɵParsedMessage
import typings.angularLocalize.toolsSrcExtractTranslationFilesTranslationSerializerMod.TranslationSerializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcExtractTranslationFilesArbTranslationSerializerMod {
  
  @JSImport("@angular/localize/tools/src/extract/translation_files/arb_translation_serializer", "ArbTranslationSerializer")
  @js.native
  open class ArbTranslationSerializer protected ()
    extends StObject
       with TranslationSerializer {
    def this(sourceLocale: String, basePath: AbsoluteFsPath, fs: PathManipulation) = this()
    
    /* private */ var basePath: Any = js.native
    
    /* private */ var fs: Any = js.native
    
    /**
      * Serialize the contents of a translation file containing the given `messages`.
      *
      * @param messages The messages to render to the file.
      * @returns The contents of the serialized file.
      */
    /* CompleteClass */
    override def serialize(messages: js.Array[ɵParsedMessage]): String = js.native
    
    /* private */ var serializeLocation: Any = js.native
    
    /* private */ var serializeMessage: Any = js.native
    
    /* private */ var serializeMeta: Any = js.native
    
    /* private */ var sourceLocale: Any = js.native
  }
}
