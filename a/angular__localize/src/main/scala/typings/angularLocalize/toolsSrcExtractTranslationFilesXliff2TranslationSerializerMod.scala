package typings.angularLocalize

import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathManipulation
import typings.angularLocalize.mod.ɵParsedMessage
import typings.angularLocalize.toolsSrcExtractTranslationFilesFormatOptionsMod.FormatOptions
import typings.angularLocalize.toolsSrcExtractTranslationFilesTranslationSerializerMod.TranslationSerializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcExtractTranslationFilesXliff2TranslationSerializerMod {
  
  @JSImport("@angular/localize/tools/src/extract/translation_files/xliff2_translation_serializer", "Xliff2TranslationSerializer")
  @js.native
  open class Xliff2TranslationSerializer protected ()
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
    
    /* private */ var currentPlaceholderId: Any = js.native
    
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
      * An Xliff 2.0 legacy message id is a 64 bit number encoded as a decimal string, which will have
      * at most 20 digits, since 2^65-1 = 36,893,488,147,419,103,231. This digest is based on:
      * https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/GoogleJsMessageIdGenerator.java
      */
    /* private */ var getMessageId: Any = js.native
    
    /**
      * Serialize the contents of a translation file containing the given `messages`.
      *
      * @param messages The messages to render to the file.
      * @returns The contents of the serialized file.
      */
    /* CompleteClass */
    override def serialize(messages: js.Array[ɵParsedMessage]): String = js.native
    
    /* private */ var serializeMessage: Any = js.native
    
    /* private */ var serializeNote: Any = js.native
    
    /* private */ var serializePlaceholder: Any = js.native
    
    /* private */ var serializeTextPart: Any = js.native
    
    /* private */ var sourceLocale: Any = js.native
    
    /* private */ var useLegacyIds: Any = js.native
  }
}
