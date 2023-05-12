package typings.angularLocalize

import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathManipulation
import typings.angularLocalize.localizeMod.ɵParsedMessage
import typings.angularLocalize.toolsSrcExtractTranslationFilesFormatOptionsMod.FormatOptions
import typings.angularLocalize.toolsSrcExtractTranslationFilesTranslationSerializerMod.TranslationSerializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcExtractTranslationFilesXliff1TranslationSerializerMod {
  
  @JSImport("@angular/localize/tools/src/extract/translation_files/xliff1_translation_serializer", "Xliff1TranslationSerializer")
  @js.native
  open class Xliff1TranslationSerializer protected ()
    extends StObject
       with TranslationSerializer {
    def this(sourceLocale: String, basePath: AbsoluteFsPath, useLegacyIds: Boolean) = this()
    def this(
      sourceLocale: String,
      basePath: AbsoluteFsPath,
      useLegacyIds: Boolean,
      formatOptions: FormatOptions
    ) = this()
    def this(
      sourceLocale: String,
      basePath: AbsoluteFsPath,
      useLegacyIds: Boolean,
      formatOptions: Unit,
      fs: PathManipulation
    ) = this()
    def this(
      sourceLocale: String,
      basePath: AbsoluteFsPath,
      useLegacyIds: Boolean,
      formatOptions: FormatOptions,
      fs: PathManipulation
    ) = this()
    
    /* private */ var basePath: Any = js.native
    
    /* private */ var formatOptions: Any = js.native
    
    /* private */ var fs: Any = js.native
    
    /**
      * Get the id for the given `message`.
      *
      * If there was a custom id provided, use that.
      *
      * If we have requested legacy message ids, then try to return the appropriate id
      * from the list of legacy ids that were extracted.
      *
      * Otherwise return the canonical message id.
      *
      * An Xliff 1.2 legacy message id is a hex encoded SHA-1 string, which is 40 characters long. See
      * https://csrc.nist.gov/csrc/media/publications/fips/180/4/final/documents/fips180-4-draft-aug2014.pdf
      */
    /* private */ var getMessageId: Any = js.native
    
    /* private */ var renderContext: Any = js.native
    
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
    
    /* private */ var serializeNote: Any = js.native
    
    /* private */ var serializePlaceholder: Any = js.native
    
    /* private */ var serializeTextPart: Any = js.native
    
    /* private */ var sourceLocale: Any = js.native
    
    /* private */ var useLegacyIds: Any = js.native
  }
}
