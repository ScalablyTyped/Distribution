package typings.angularLocalize

import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathManipulation
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.ReadonlyFileSystem
import typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import typings.angularLocalize.localizeMod.ɵParsedMessage
import typings.angularLocalize.localizeMod.ɵParsedTranslation
import typings.angularLocalize.localizeMod.ɵSourceLocation
import typings.angularLocalize.toolsSrcDiagnosticsMod.DiagnosticHandlingStrategy
import typings.angularLocalize.toolsSrcExtractExtractionMod.ExtractionOptions
import typings.angularLocalize.toolsSrcExtractTranslationFilesFormatOptionsMod.FormatOptions
import typings.angularLocalize.toolsSrcSourceFileUtilsMod.TranslatePluginOptions
import typings.babelCore.mod.PluginObj
import typings.babelCore.mod.PluginPass
import typings.babelTypes.mod.Expression
import typings.std.Record
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsMod {
  
  @JSImport("@angular/localize/tools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/localize/tools", "ArbTranslationParser")
  @js.native
  open class ArbTranslationParser ()
    extends typings.angularLocalize.toolsSrcTranslateTranslationFilesTranslationParsersArbTranslationParserMod.ArbTranslationParser
  
  @JSImport("@angular/localize/tools", "ArbTranslationSerializer")
  @js.native
  open class ArbTranslationSerializer protected ()
    extends typings.angularLocalize.toolsSrcExtractTranslationFilesArbTranslationSerializerMod.ArbTranslationSerializer {
    def this(sourceLocale: String, basePath: AbsoluteFsPath, fs: PathManipulation) = this()
  }
  
  @JSImport("@angular/localize/tools", "Diagnostics")
  @js.native
  open class Diagnostics ()
    extends typings.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics
  
  @JSImport("@angular/localize/tools", "LegacyMessageIdMigrationSerializer")
  @js.native
  open class LegacyMessageIdMigrationSerializer protected ()
    extends typings.angularLocalize.toolsSrcExtractTranslationFilesLegacyMessageIdMigrationSerializerMod.LegacyMessageIdMigrationSerializer {
    def this(_diagnostics: typings.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics) = this()
  }
  
  @JSImport("@angular/localize/tools", "MessageExtractor")
  @js.native
  open class MessageExtractor protected ()
    extends typings.angularLocalize.toolsSrcExtractExtractionMod.MessageExtractor {
    def this(fs: ReadonlyFileSystem, logger: Logger, param2: ExtractionOptions) = this()
  }
  
  @JSImport("@angular/localize/tools", "SimpleJsonTranslationParser")
  @js.native
  open class SimpleJsonTranslationParser ()
    extends typings.angularLocalize.toolsSrcTranslateTranslationFilesTranslationParsersSimpleJsonTranslationParserMod.SimpleJsonTranslationParser
  
  @JSImport("@angular/localize/tools", "SimpleJsonTranslationSerializer")
  @js.native
  open class SimpleJsonTranslationSerializer protected ()
    extends typings.angularLocalize.toolsSrcExtractTranslationFilesJsonTranslationSerializerMod.SimpleJsonTranslationSerializer {
    def this(sourceLocale: String) = this()
  }
  
  @JSImport("@angular/localize/tools", "Xliff1TranslationParser")
  @js.native
  open class Xliff1TranslationParser ()
    extends typings.angularLocalize.toolsSrcTranslateTranslationFilesTranslationParsersXliff1TranslationParserMod.Xliff1TranslationParser
  
  @JSImport("@angular/localize/tools", "Xliff1TranslationSerializer")
  @js.native
  open class Xliff1TranslationSerializer protected ()
    extends typings.angularLocalize.toolsSrcExtractTranslationFilesXliff1TranslationSerializerMod.Xliff1TranslationSerializer {
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
  }
  
  @JSImport("@angular/localize/tools", "Xliff2TranslationParser")
  @js.native
  open class Xliff2TranslationParser ()
    extends typings.angularLocalize.toolsSrcTranslateTranslationFilesTranslationParsersXliff2TranslationParserMod.Xliff2TranslationParser
  
  @JSImport("@angular/localize/tools", "Xliff2TranslationSerializer")
  @js.native
  open class Xliff2TranslationSerializer protected ()
    extends typings.angularLocalize.toolsSrcExtractTranslationFilesXliff2TranslationSerializerMod.Xliff2TranslationSerializer {
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
  }
  
  @JSImport("@angular/localize/tools", "XmbTranslationSerializer")
  @js.native
  open class XmbTranslationSerializer protected ()
    extends typings.angularLocalize.toolsSrcExtractTranslationFilesXmbTranslationSerializerMod.XmbTranslationSerializer {
    def this(basePath: AbsoluteFsPath, useLegacyIds: Boolean) = this()
    def this(basePath: AbsoluteFsPath, useLegacyIds: Boolean, fs: PathManipulation) = this()
  }
  
  @JSImport("@angular/localize/tools", "XtbTranslationParser")
  @js.native
  open class XtbTranslationParser ()
    extends typings.angularLocalize.toolsSrcTranslateTranslationFilesTranslationParsersXtbTranslationParserMod.XtbTranslationParser
  
  inline def buildLocalizeReplacement(messageParts: TemplateStringsArray, substitutions: js.Array[Expression]): Expression = (^.asInstanceOf[js.Dynamic].applyDynamic("buildLocalizeReplacement")(messageParts.asInstanceOf[js.Any], substitutions.asInstanceOf[js.Any])).asInstanceOf[Expression]
  
  inline def checkDuplicateMessages(
    fs: PathManipulation,
    messages: js.Array[ɵParsedMessage],
    duplicateMessageHandling: DiagnosticHandlingStrategy,
    basePath: AbsoluteFsPath
  ): typings.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDuplicateMessages")(fs.asInstanceOf[js.Any], messages.asInstanceOf[js.Any], duplicateMessageHandling.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[typings.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics]
  
  inline def isGlobalIdentifier(
    identifier: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.Identifier> */ Any
  ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGlobalIdentifier")(identifier.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def makeEs2015TranslatePlugin(
    diagnostics: typings.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics,
    translations: Record[String, ɵParsedTranslation]
  ): PluginObj[PluginPass] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEs2015TranslatePlugin")(diagnostics.asInstanceOf[js.Any], translations.asInstanceOf[js.Any])).asInstanceOf[PluginObj[PluginPass]]
  inline def makeEs2015TranslatePlugin(
    diagnostics: typings.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics,
    translations: Record[String, ɵParsedTranslation],
    param2: Unit,
    fs: PathManipulation
  ): PluginObj[PluginPass] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEs2015TranslatePlugin")(diagnostics.asInstanceOf[js.Any], translations.asInstanceOf[js.Any], param2.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[PluginObj[PluginPass]]
  inline def makeEs2015TranslatePlugin(
    diagnostics: typings.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics,
    translations: Record[String, ɵParsedTranslation],
    param2: TranslatePluginOptions
  ): PluginObj[PluginPass] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEs2015TranslatePlugin")(diagnostics.asInstanceOf[js.Any], translations.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[PluginObj[PluginPass]]
  inline def makeEs2015TranslatePlugin(
    diagnostics: typings.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics,
    translations: Record[String, ɵParsedTranslation],
    param2: TranslatePluginOptions,
    fs: PathManipulation
  ): PluginObj[PluginPass] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEs2015TranslatePlugin")(diagnostics.asInstanceOf[js.Any], translations.asInstanceOf[js.Any], param2.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[PluginObj[PluginPass]]
  
  inline def makeEs5TranslatePlugin(
    diagnostics: typings.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics,
    translations: Record[String, ɵParsedTranslation]
  ): PluginObj[PluginPass] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEs5TranslatePlugin")(diagnostics.asInstanceOf[js.Any], translations.asInstanceOf[js.Any])).asInstanceOf[PluginObj[PluginPass]]
  inline def makeEs5TranslatePlugin(
    diagnostics: typings.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics,
    translations: Record[String, ɵParsedTranslation],
    param2: Unit,
    fs: PathManipulation
  ): PluginObj[PluginPass] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEs5TranslatePlugin")(diagnostics.asInstanceOf[js.Any], translations.asInstanceOf[js.Any], param2.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[PluginObj[PluginPass]]
  inline def makeEs5TranslatePlugin(
    diagnostics: typings.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics,
    translations: Record[String, ɵParsedTranslation],
    param2: TranslatePluginOptions
  ): PluginObj[PluginPass] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEs5TranslatePlugin")(diagnostics.asInstanceOf[js.Any], translations.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[PluginObj[PluginPass]]
  inline def makeEs5TranslatePlugin(
    diagnostics: typings.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics,
    translations: Record[String, ɵParsedTranslation],
    param2: TranslatePluginOptions,
    fs: PathManipulation
  ): PluginObj[PluginPass] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEs5TranslatePlugin")(diagnostics.asInstanceOf[js.Any], translations.asInstanceOf[js.Any], param2.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[PluginObj[PluginPass]]
  
  inline def makeLocalePlugin(locale: String): PluginObj[PluginPass] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeLocalePlugin")(locale.asInstanceOf[js.Any]).asInstanceOf[PluginObj[PluginPass]]
  inline def makeLocalePlugin(locale: String, param1: TranslatePluginOptions): PluginObj[PluginPass] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeLocalePlugin")(locale.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[PluginObj[PluginPass]]
  
  inline def translate(
    diagnostics: typings.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics,
    translations: Record[String, ɵParsedTranslation],
    messageParts: TemplateStringsArray,
    substitutions: js.Array[Any],
    missingTranslation: DiagnosticHandlingStrategy
  ): js.Tuple2[TemplateStringsArray, js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(diagnostics.asInstanceOf[js.Any], translations.asInstanceOf[js.Any], messageParts.asInstanceOf[js.Any], substitutions.asInstanceOf[js.Any], missingTranslation.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TemplateStringsArray, js.Array[Any]]]
  
  inline def unwrapExpressionsFromTemplateLiteral(
    quasi: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.TemplateLiteral> */ Any
  ): js.Tuple2[js.Array[Expression], js.Array[js.UndefOr[ɵSourceLocation]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapExpressionsFromTemplateLiteral")(quasi.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Array[Expression], js.Array[js.UndefOr[ɵSourceLocation]]]]
  inline def unwrapExpressionsFromTemplateLiteral(
    quasi: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.TemplateLiteral> */ Any,
    fs: PathManipulation
  ): js.Tuple2[js.Array[Expression], js.Array[js.UndefOr[ɵSourceLocation]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("unwrapExpressionsFromTemplateLiteral")(quasi.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[Expression], js.Array[js.UndefOr[ɵSourceLocation]]]]
  
  inline def unwrapMessagePartsFromLocalizeCall(
    call: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.CallExpression> */ Any
  ): js.Tuple2[TemplateStringsArray, js.Array[js.UndefOr[ɵSourceLocation]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapMessagePartsFromLocalizeCall")(call.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[TemplateStringsArray, js.Array[js.UndefOr[ɵSourceLocation]]]]
  inline def unwrapMessagePartsFromLocalizeCall(
    call: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.CallExpression> */ Any,
    fs: PathManipulation
  ): js.Tuple2[TemplateStringsArray, js.Array[js.UndefOr[ɵSourceLocation]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("unwrapMessagePartsFromLocalizeCall")(call.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TemplateStringsArray, js.Array[js.UndefOr[ɵSourceLocation]]]]
  
  inline def unwrapMessagePartsFromTemplateLiteral(
    elements: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.TemplateElement> */ Any
    ]
  ): js.Tuple2[TemplateStringsArray, js.Array[js.UndefOr[ɵSourceLocation]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapMessagePartsFromTemplateLiteral")(elements.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[TemplateStringsArray, js.Array[js.UndefOr[ɵSourceLocation]]]]
  inline def unwrapMessagePartsFromTemplateLiteral(
    elements: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.TemplateElement> */ Any
    ],
    fs: PathManipulation
  ): js.Tuple2[TemplateStringsArray, js.Array[js.UndefOr[ɵSourceLocation]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("unwrapMessagePartsFromTemplateLiteral")(elements.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TemplateStringsArray, js.Array[js.UndefOr[ɵSourceLocation]]]]
  
  inline def unwrapSubstitutionsFromLocalizeCall(
    call: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.CallExpression> */ Any
  ): js.Tuple2[js.Array[Expression], js.Array[js.UndefOr[ɵSourceLocation]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapSubstitutionsFromLocalizeCall")(call.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Array[Expression], js.Array[js.UndefOr[ɵSourceLocation]]]]
  inline def unwrapSubstitutionsFromLocalizeCall(
    call: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.CallExpression> */ Any,
    fs: PathManipulation
  ): js.Tuple2[js.Array[Expression], js.Array[js.UndefOr[ɵSourceLocation]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("unwrapSubstitutionsFromLocalizeCall")(call.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[Expression], js.Array[js.UndefOr[ɵSourceLocation]]]]
}
