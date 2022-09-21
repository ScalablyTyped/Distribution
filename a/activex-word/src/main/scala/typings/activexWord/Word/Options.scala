package typings.activexWord.Word

import typings.activexOffice.Office.MsoEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var AddBiDirectionalMarksWhenSavingTextFile: Boolean
  
  var AddControlCharacters: Boolean
  
  var AddHebDoubleQuote: Boolean
  
  var AllowAccentedUppercase: Boolean
  
  var AllowClickAndTypeMouse: Boolean
  
  var AllowCombinedAuxiliaryForms: Boolean
  
  var AllowCompoundNounProcessing: Boolean
  
  var AllowDragAndDrop: Boolean
  
  var AllowFastSave: Boolean
  
  var AllowOpenInDraftView: Boolean
  
  var AllowPixelUnits: Boolean
  
  var AllowReadingMode: Boolean
  
  var AlwaysUseClearType: Boolean
  
  var AnimateScreenMovements: Boolean
  
  val Application: typings.activexWord.Word.Application
  
  var ApplyFarEastFontsToAscii: Boolean
  
  var ArabicMode: WdAraSpeller
  
  var ArabicNumeral: WdArabicNumeral
  
  var AutoCreateNewDrawings: Boolean
  
  var AutoFormatApplyBulletedLists: Boolean
  
  var AutoFormatApplyFirstIndents: Boolean
  
  var AutoFormatApplyHeadings: Boolean
  
  var AutoFormatApplyLists: Boolean
  
  var AutoFormatApplyOtherParas: Boolean
  
  var AutoFormatAsYouTypeApplyBorders: Boolean
  
  var AutoFormatAsYouTypeApplyBulletedLists: Boolean
  
  var AutoFormatAsYouTypeApplyClosings: Boolean
  
  var AutoFormatAsYouTypeApplyDates: Boolean
  
  var AutoFormatAsYouTypeApplyFirstIndents: Boolean
  
  var AutoFormatAsYouTypeApplyHeadings: Boolean
  
  var AutoFormatAsYouTypeApplyNumberedLists: Boolean
  
  var AutoFormatAsYouTypeApplyTables: Boolean
  
  var AutoFormatAsYouTypeAutoLetterWizard: Boolean
  
  var AutoFormatAsYouTypeDefineStyles: Boolean
  
  var AutoFormatAsYouTypeDeleteAutoSpaces: Boolean
  
  var AutoFormatAsYouTypeFormatListItemBeginning: Boolean
  
  var AutoFormatAsYouTypeInsertClosings: Boolean
  
  var AutoFormatAsYouTypeInsertOvers: Boolean
  
  var AutoFormatAsYouTypeMatchParentheses: Boolean
  
  var AutoFormatAsYouTypeReplaceFarEastDashes: Boolean
  
  var AutoFormatAsYouTypeReplaceFractions: Boolean
  
  var AutoFormatAsYouTypeReplaceHyperlinks: Boolean
  
  var AutoFormatAsYouTypeReplaceOrdinals: Boolean
  
  var AutoFormatAsYouTypeReplacePlainTextEmphasis: Boolean
  
  var AutoFormatAsYouTypeReplaceQuotes: Boolean
  
  var AutoFormatAsYouTypeReplaceSymbols: Boolean
  
  var AutoFormatDeleteAutoSpaces: Boolean
  
  var AutoFormatMatchParentheses: Boolean
  
  var AutoFormatPlainTextWordMail: Boolean
  
  var AutoFormatPreserveStyles: Boolean
  
  var AutoFormatReplaceFarEastDashes: Boolean
  
  var AutoFormatReplaceFractions: Boolean
  
  var AutoFormatReplaceHyperlinks: Boolean
  
  var AutoFormatReplaceOrdinals: Boolean
  
  var AutoFormatReplacePlainTextEmphasis: Boolean
  
  var AutoFormatReplaceQuotes: Boolean
  
  var AutoFormatReplaceSymbols: Boolean
  
  var AutoKeyboardSwitching: Boolean
  
  var AutoWordSelection: Boolean
  
  var BackgroundOpen: Boolean
  
  var BackgroundSave: Boolean
  
  var BibliographySort: String
  
  var BibliographyStyle: String
  
  var BlueScreen: Boolean
  
  var BrazilReform: WdPortugueseReform
  
  var ButtonFieldClicks: Double
  
  var CheckGrammarAsYouType: Boolean
  
  var CheckGrammarWithSpelling: Boolean
  
  var CheckHangulEndings: Boolean
  
  var CheckSpellingAsYouType: Boolean
  
  var CommentsColor: WdColorIndex
  
  var ConfirmConversions: Boolean
  
  var ContextualSpeller: Boolean
  
  var ConvertHighAnsiToFarEast: Boolean
  
  var CreateBackup: Boolean
  
  val Creator: Double
  
  var CtrlClickHyperlinkToOpen: Boolean
  
  var CursorMovement: WdCursorMovement
  
  var DefaultBorderColor: WdColor
  
  var DefaultBorderColorIndex: WdColorIndex
  
  var DefaultBorderLineStyle: WdLineStyle
  
  var DefaultBorderLineWidth: WdLineWidth
  
  var DefaultEPostageApp: String
  
  def DefaultFilePath(Path: WdDefaultFilePath): String
  
  var DefaultHighlightColorIndex: WdColorIndex
  
  var DefaultOpenFormat: WdOpenFormat
  
  var DefaultTextEncoding: MsoEncoding
  
  var DefaultTray: String
  
  var DefaultTrayID: Double
  
  var DeletedCellColor: WdCellColor
  
  var DeletedTextColor: WdColorIndex
  
  var DeletedTextMark: WdDeletedTextMark
  
  var DiacriticColorVal: WdColor
  
  var DisableFeaturesIntroducedAfterbyDefault: WdDisableFeaturesIntroducedAfter
  
  var DisableFeaturesbyDefault: Boolean
  
  var DisplayGridLines: Boolean
  
  var DisplayPasteOptions: Boolean
  
  var DisplaySmartTagButtons: Boolean
  
  var DoNotPromptForConvert: Boolean
  
  var DocumentViewDirection: WdDocumentViewDirection
  
  var EnableHangulHanjaRecentOrdering: Boolean
  
  var EnableLegacyIMEMode: Boolean
  
  var EnableLivePreview: Boolean
  
  var EnableMisusedWordsDictionary: Boolean
  
  var EnableSound: Boolean
  
  val EnvelopeFeederInstalled: Boolean
  
  var FormatScanning: Boolean
  
  var FrenchReform: WdFrenchSpeller
  
  var GridDistanceHorizontal: Double
  
  var GridDistanceVertical: Double
  
  var GridOriginHorizontal: Double
  
  var GridOriginVertical: Double
  
  var HangulHanjaFastConversion: Boolean
  
  var HebrewMode: WdHebSpellStart
  
  var IMEAutomaticControl: Boolean
  
  var INSKeyForOvertype: Boolean
  
  var INSKeyForPaste: Boolean
  
  var IgnoreInternetAndFileAddresses: Boolean
  
  var IgnoreMixedDigits: Boolean
  
  var IgnoreUppercase: Boolean
  
  var InlineConversion: Boolean
  
  var InsertedCellColor: WdCellColor
  
  var InsertedTextColor: WdColorIndex
  
  var InsertedTextMark: WdInsertedTextMark
  
  var InterpretHighAnsi: WdHighAnsiText
  
  var LabelSmartTags: Boolean
  
  var LocalNetworkFile: Boolean
  
  var MapPaperSize: Boolean
  
  var MatchFuzzyAY: Boolean
  
  var MatchFuzzyBV: Boolean
  
  var MatchFuzzyByte: Boolean
  
  var MatchFuzzyCase: Boolean
  
  var MatchFuzzyDZ: Boolean
  
  var MatchFuzzyDash: Boolean
  
  var MatchFuzzyHF: Boolean
  
  var MatchFuzzyHiragana: Boolean
  
  var MatchFuzzyIterationMark: Boolean
  
  var MatchFuzzyKanji: Boolean
  
  var MatchFuzzyKiKu: Boolean
  
  var MatchFuzzyOldKana: Boolean
  
  var MatchFuzzyProlongedSoundMark: Boolean
  
  var MatchFuzzyPunctuation: Boolean
  
  var MatchFuzzySmallKana: Boolean
  
  var MatchFuzzySpace: Boolean
  
  var MatchFuzzyTC: Boolean
  
  var MatchFuzzyZJ: Boolean
  
  var MeasurementUnit: WdMeasurementUnits
  
  var MergedCellColor: WdCellColor
  
  var MonthNames: WdMonthNames
  
  var MoveFromTextColor: WdColorIndex
  
  var MoveFromTextMark: WdMoveFromTextMark
  
  var MoveToTextColor: WdColorIndex
  
  var MoveToTextMark: WdMoveToTextMark
  
  var MultipleWordConversionsMode: WdMultipleWordConversionsMode
  
  var OMathAutoBuildUp: Boolean
  
  var OMathCopyLF: Boolean
  
  var OptimizeForWord97byDefault: Boolean
  
  var Overtype: Boolean
  
  var Pagination: Boolean
  
  val Parent: Any
  
  var PasteAdjustParagraphSpacing: Boolean
  
  var PasteAdjustTableFormatting: Boolean
  
  var PasteAdjustWordSpacing: Boolean
  
  var PasteFormatBetweenDocuments: WdPasteOptions
  
  var PasteFormatBetweenStyledDocuments: WdPasteOptions
  
  var PasteFormatFromExternalSource: WdPasteOptions
  
  var PasteFormatWithinDocument: WdPasteOptions
  
  var PasteMergeFromPPT: Boolean
  
  var PasteMergeFromXL: Boolean
  
  var PasteMergeLists: Boolean
  
  var PasteOptionKeepBulletsAndNumbers: Boolean
  
  var PasteSmartCutPaste: Boolean
  
  var PasteSmartStyleBehavior: Boolean
  
  var PictureEditor: String
  
  var PictureWrapType: WdWrapTypeMerged
  
  var PortugalReform: WdPortugueseReform
  
  var PrecisePositioning: Boolean
  
  var PrintBackground: Boolean
  
  var PrintBackgrounds: Boolean
  
  var PrintComments: Boolean
  
  var PrintDraft: Boolean
  
  var PrintDrawingObjects: Boolean
  
  var PrintEvenPagesInAscendingOrder: Boolean
  
  var PrintFieldCodes: Boolean
  
  var PrintHiddenText: Boolean
  
  var PrintOddPagesInAscendingOrder: Boolean
  
  var PrintProperties: Boolean
  
  var PrintReverse: Boolean
  
  var PrintXMLTag: Boolean
  
  var PromptUpdateStyle: Boolean
  
  var RTFInClipboard: Boolean
  
  var RepeatWord: Boolean
  
  var ReplaceSelection: Boolean
  
  var RevisedLinesColor: WdColorIndex
  
  var RevisedLinesMark: WdRevisedLinesMark
  
  var RevisedPropertiesColor: WdColorIndex
  
  var RevisedPropertiesMark: WdRevisedPropertiesMark
  
  var RevisionsBalloonPrintOrientation: WdRevisionsBalloonPrintOrientation
  
  var SaveInterval: Double
  
  var SaveNormalPrompt: Boolean
  
  var SavePropertiesPrompt: Boolean
  
  var SendMailAttach: Boolean
  
  var SequenceCheck: Boolean
  
  def SetWPHelpOptions(
    CommandKeyHelp: js.UndefOr[Any],
    DocNavigationKeys: js.UndefOr[Any],
    MouseSimulation: js.UndefOr[Any],
    DemoGuidance: js.UndefOr[Any],
    DemoSpeed: js.UndefOr[Any],
    HelpType: js.UndefOr[Any]
  ): Unit
  
  var ShortMenuNames: Boolean
  
  var ShowControlCharacters: Boolean
  
  var ShowDevTools: Boolean
  
  var ShowDiacritics: Boolean
  
  var ShowFormatError: Boolean
  
  var ShowMarkupOpenSave: Boolean
  
  var ShowMenuFloaties: Boolean
  
  var ShowReadabilityStatistics: Boolean
  
  var ShowSelectionFloaties: Boolean
  
  var SmartCursoring: Boolean
  
  var SmartCutPaste: Boolean
  
  var SmartParaSelection: Boolean
  
  var SnapToGrid: Boolean
  
  var SnapToShapes: Boolean
  
  var SpanishMode: WdSpanishSpeller
  
  var SplitCellColor: WdCellColor
  
  var StoreRSIDOnSave: Boolean
  
  var StrictFinalYaa: Boolean
  
  var StrictInitialAlefHamza: Boolean
  
  var StrictRussianE: Boolean
  
  var StrictTaaMarboota: Boolean
  
  var SuggestFromMainDictionaryOnly: Boolean
  
  var SuggestSpellingCorrections: Boolean
  
  var TabIndentKey: Boolean
  
  var TypeNReplace: Boolean
  
  var UpdateFieldsAtPrint: Boolean
  
  var UpdateFieldsWithTrackedChangesAtPrint: Boolean
  
  var UpdateLinksAtOpen: Boolean
  
  var UpdateLinksAtPrint: Boolean
  
  var UpdateStyleListBehavior: WdUpdateStyleListBehavior
  
  var UseCharacterUnit: Boolean
  
  var UseDiffDiacColor: Boolean
  
  var UseGermanSpellingReform: Boolean
  
  var UseNormalStyleForList: Boolean
  
  var VirusProtection: Boolean
  
  var VisualSelection: WdVisualSelection
  
  var WPDocNavKeys: Boolean
  
  var WPHelp: Boolean
  
  var WarnBeforeSavingPrintingSendingMarkup: Boolean
  
  /* private */ @JSName("Word.Options_typekey")
  var WordDotOptions_typekey: Options
}
object Options {
  
  inline def apply(
    AddBiDirectionalMarksWhenSavingTextFile: Boolean,
    AddControlCharacters: Boolean,
    AddHebDoubleQuote: Boolean,
    AllowAccentedUppercase: Boolean,
    AllowClickAndTypeMouse: Boolean,
    AllowCombinedAuxiliaryForms: Boolean,
    AllowCompoundNounProcessing: Boolean,
    AllowDragAndDrop: Boolean,
    AllowFastSave: Boolean,
    AllowOpenInDraftView: Boolean,
    AllowPixelUnits: Boolean,
    AllowReadingMode: Boolean,
    AlwaysUseClearType: Boolean,
    AnimateScreenMovements: Boolean,
    Application: Application,
    ApplyFarEastFontsToAscii: Boolean,
    ArabicMode: WdAraSpeller,
    ArabicNumeral: WdArabicNumeral,
    AutoCreateNewDrawings: Boolean,
    AutoFormatApplyBulletedLists: Boolean,
    AutoFormatApplyFirstIndents: Boolean,
    AutoFormatApplyHeadings: Boolean,
    AutoFormatApplyLists: Boolean,
    AutoFormatApplyOtherParas: Boolean,
    AutoFormatAsYouTypeApplyBorders: Boolean,
    AutoFormatAsYouTypeApplyBulletedLists: Boolean,
    AutoFormatAsYouTypeApplyClosings: Boolean,
    AutoFormatAsYouTypeApplyDates: Boolean,
    AutoFormatAsYouTypeApplyFirstIndents: Boolean,
    AutoFormatAsYouTypeApplyHeadings: Boolean,
    AutoFormatAsYouTypeApplyNumberedLists: Boolean,
    AutoFormatAsYouTypeApplyTables: Boolean,
    AutoFormatAsYouTypeAutoLetterWizard: Boolean,
    AutoFormatAsYouTypeDefineStyles: Boolean,
    AutoFormatAsYouTypeDeleteAutoSpaces: Boolean,
    AutoFormatAsYouTypeFormatListItemBeginning: Boolean,
    AutoFormatAsYouTypeInsertClosings: Boolean,
    AutoFormatAsYouTypeInsertOvers: Boolean,
    AutoFormatAsYouTypeMatchParentheses: Boolean,
    AutoFormatAsYouTypeReplaceFarEastDashes: Boolean,
    AutoFormatAsYouTypeReplaceFractions: Boolean,
    AutoFormatAsYouTypeReplaceHyperlinks: Boolean,
    AutoFormatAsYouTypeReplaceOrdinals: Boolean,
    AutoFormatAsYouTypeReplacePlainTextEmphasis: Boolean,
    AutoFormatAsYouTypeReplaceQuotes: Boolean,
    AutoFormatAsYouTypeReplaceSymbols: Boolean,
    AutoFormatDeleteAutoSpaces: Boolean,
    AutoFormatMatchParentheses: Boolean,
    AutoFormatPlainTextWordMail: Boolean,
    AutoFormatPreserveStyles: Boolean,
    AutoFormatReplaceFarEastDashes: Boolean,
    AutoFormatReplaceFractions: Boolean,
    AutoFormatReplaceHyperlinks: Boolean,
    AutoFormatReplaceOrdinals: Boolean,
    AutoFormatReplacePlainTextEmphasis: Boolean,
    AutoFormatReplaceQuotes: Boolean,
    AutoFormatReplaceSymbols: Boolean,
    AutoKeyboardSwitching: Boolean,
    AutoWordSelection: Boolean,
    BackgroundOpen: Boolean,
    BackgroundSave: Boolean,
    BibliographySort: String,
    BibliographyStyle: String,
    BlueScreen: Boolean,
    BrazilReform: WdPortugueseReform,
    ButtonFieldClicks: Double,
    CheckGrammarAsYouType: Boolean,
    CheckGrammarWithSpelling: Boolean,
    CheckHangulEndings: Boolean,
    CheckSpellingAsYouType: Boolean,
    CommentsColor: WdColorIndex,
    ConfirmConversions: Boolean,
    ContextualSpeller: Boolean,
    ConvertHighAnsiToFarEast: Boolean,
    CreateBackup: Boolean,
    Creator: Double,
    CtrlClickHyperlinkToOpen: Boolean,
    CursorMovement: WdCursorMovement,
    DefaultBorderColor: WdColor,
    DefaultBorderColorIndex: WdColorIndex,
    DefaultBorderLineStyle: WdLineStyle,
    DefaultBorderLineWidth: WdLineWidth,
    DefaultEPostageApp: String,
    DefaultFilePath: WdDefaultFilePath => String,
    DefaultHighlightColorIndex: WdColorIndex,
    DefaultOpenFormat: WdOpenFormat,
    DefaultTextEncoding: MsoEncoding,
    DefaultTray: String,
    DefaultTrayID: Double,
    DeletedCellColor: WdCellColor,
    DeletedTextColor: WdColorIndex,
    DeletedTextMark: WdDeletedTextMark,
    DiacriticColorVal: WdColor,
    DisableFeaturesIntroducedAfterbyDefault: WdDisableFeaturesIntroducedAfter,
    DisableFeaturesbyDefault: Boolean,
    DisplayGridLines: Boolean,
    DisplayPasteOptions: Boolean,
    DisplaySmartTagButtons: Boolean,
    DoNotPromptForConvert: Boolean,
    DocumentViewDirection: WdDocumentViewDirection,
    EnableHangulHanjaRecentOrdering: Boolean,
    EnableLegacyIMEMode: Boolean,
    EnableLivePreview: Boolean,
    EnableMisusedWordsDictionary: Boolean,
    EnableSound: Boolean,
    EnvelopeFeederInstalled: Boolean,
    FormatScanning: Boolean,
    FrenchReform: WdFrenchSpeller,
    GridDistanceHorizontal: Double,
    GridDistanceVertical: Double,
    GridOriginHorizontal: Double,
    GridOriginVertical: Double,
    HangulHanjaFastConversion: Boolean,
    HebrewMode: WdHebSpellStart,
    IMEAutomaticControl: Boolean,
    INSKeyForOvertype: Boolean,
    INSKeyForPaste: Boolean,
    IgnoreInternetAndFileAddresses: Boolean,
    IgnoreMixedDigits: Boolean,
    IgnoreUppercase: Boolean,
    InlineConversion: Boolean,
    InsertedCellColor: WdCellColor,
    InsertedTextColor: WdColorIndex,
    InsertedTextMark: WdInsertedTextMark,
    InterpretHighAnsi: WdHighAnsiText,
    LabelSmartTags: Boolean,
    LocalNetworkFile: Boolean,
    MapPaperSize: Boolean,
    MatchFuzzyAY: Boolean,
    MatchFuzzyBV: Boolean,
    MatchFuzzyByte: Boolean,
    MatchFuzzyCase: Boolean,
    MatchFuzzyDZ: Boolean,
    MatchFuzzyDash: Boolean,
    MatchFuzzyHF: Boolean,
    MatchFuzzyHiragana: Boolean,
    MatchFuzzyIterationMark: Boolean,
    MatchFuzzyKanji: Boolean,
    MatchFuzzyKiKu: Boolean,
    MatchFuzzyOldKana: Boolean,
    MatchFuzzyProlongedSoundMark: Boolean,
    MatchFuzzyPunctuation: Boolean,
    MatchFuzzySmallKana: Boolean,
    MatchFuzzySpace: Boolean,
    MatchFuzzyTC: Boolean,
    MatchFuzzyZJ: Boolean,
    MeasurementUnit: WdMeasurementUnits,
    MergedCellColor: WdCellColor,
    MonthNames: WdMonthNames,
    MoveFromTextColor: WdColorIndex,
    MoveFromTextMark: WdMoveFromTextMark,
    MoveToTextColor: WdColorIndex,
    MoveToTextMark: WdMoveToTextMark,
    MultipleWordConversionsMode: WdMultipleWordConversionsMode,
    OMathAutoBuildUp: Boolean,
    OMathCopyLF: Boolean,
    OptimizeForWord97byDefault: Boolean,
    Overtype: Boolean,
    Pagination: Boolean,
    Parent: Any,
    PasteAdjustParagraphSpacing: Boolean,
    PasteAdjustTableFormatting: Boolean,
    PasteAdjustWordSpacing: Boolean,
    PasteFormatBetweenDocuments: WdPasteOptions,
    PasteFormatBetweenStyledDocuments: WdPasteOptions,
    PasteFormatFromExternalSource: WdPasteOptions,
    PasteFormatWithinDocument: WdPasteOptions,
    PasteMergeFromPPT: Boolean,
    PasteMergeFromXL: Boolean,
    PasteMergeLists: Boolean,
    PasteOptionKeepBulletsAndNumbers: Boolean,
    PasteSmartCutPaste: Boolean,
    PasteSmartStyleBehavior: Boolean,
    PictureEditor: String,
    PictureWrapType: WdWrapTypeMerged,
    PortugalReform: WdPortugueseReform,
    PrecisePositioning: Boolean,
    PrintBackground: Boolean,
    PrintBackgrounds: Boolean,
    PrintComments: Boolean,
    PrintDraft: Boolean,
    PrintDrawingObjects: Boolean,
    PrintEvenPagesInAscendingOrder: Boolean,
    PrintFieldCodes: Boolean,
    PrintHiddenText: Boolean,
    PrintOddPagesInAscendingOrder: Boolean,
    PrintProperties: Boolean,
    PrintReverse: Boolean,
    PrintXMLTag: Boolean,
    PromptUpdateStyle: Boolean,
    RTFInClipboard: Boolean,
    RepeatWord: Boolean,
    ReplaceSelection: Boolean,
    RevisedLinesColor: WdColorIndex,
    RevisedLinesMark: WdRevisedLinesMark,
    RevisedPropertiesColor: WdColorIndex,
    RevisedPropertiesMark: WdRevisedPropertiesMark,
    RevisionsBalloonPrintOrientation: WdRevisionsBalloonPrintOrientation,
    SaveInterval: Double,
    SaveNormalPrompt: Boolean,
    SavePropertiesPrompt: Boolean,
    SendMailAttach: Boolean,
    SequenceCheck: Boolean,
    SetWPHelpOptions: (js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any]) => Unit,
    ShortMenuNames: Boolean,
    ShowControlCharacters: Boolean,
    ShowDevTools: Boolean,
    ShowDiacritics: Boolean,
    ShowFormatError: Boolean,
    ShowMarkupOpenSave: Boolean,
    ShowMenuFloaties: Boolean,
    ShowReadabilityStatistics: Boolean,
    ShowSelectionFloaties: Boolean,
    SmartCursoring: Boolean,
    SmartCutPaste: Boolean,
    SmartParaSelection: Boolean,
    SnapToGrid: Boolean,
    SnapToShapes: Boolean,
    SpanishMode: WdSpanishSpeller,
    SplitCellColor: WdCellColor,
    StoreRSIDOnSave: Boolean,
    StrictFinalYaa: Boolean,
    StrictInitialAlefHamza: Boolean,
    StrictRussianE: Boolean,
    StrictTaaMarboota: Boolean,
    SuggestFromMainDictionaryOnly: Boolean,
    SuggestSpellingCorrections: Boolean,
    TabIndentKey: Boolean,
    TypeNReplace: Boolean,
    UpdateFieldsAtPrint: Boolean,
    UpdateFieldsWithTrackedChangesAtPrint: Boolean,
    UpdateLinksAtOpen: Boolean,
    UpdateLinksAtPrint: Boolean,
    UpdateStyleListBehavior: WdUpdateStyleListBehavior,
    UseCharacterUnit: Boolean,
    UseDiffDiacColor: Boolean,
    UseGermanSpellingReform: Boolean,
    UseNormalStyleForList: Boolean,
    VirusProtection: Boolean,
    VisualSelection: WdVisualSelection,
    WPDocNavKeys: Boolean,
    WPHelp: Boolean,
    WarnBeforeSavingPrintingSendingMarkup: Boolean,
    WordDotOptions_typekey: Options
  ): Options = {
    val __obj = js.Dynamic.literal(AddBiDirectionalMarksWhenSavingTextFile = AddBiDirectionalMarksWhenSavingTextFile.asInstanceOf[js.Any], AddControlCharacters = AddControlCharacters.asInstanceOf[js.Any], AddHebDoubleQuote = AddHebDoubleQuote.asInstanceOf[js.Any], AllowAccentedUppercase = AllowAccentedUppercase.asInstanceOf[js.Any], AllowClickAndTypeMouse = AllowClickAndTypeMouse.asInstanceOf[js.Any], AllowCombinedAuxiliaryForms = AllowCombinedAuxiliaryForms.asInstanceOf[js.Any], AllowCompoundNounProcessing = AllowCompoundNounProcessing.asInstanceOf[js.Any], AllowDragAndDrop = AllowDragAndDrop.asInstanceOf[js.Any], AllowFastSave = AllowFastSave.asInstanceOf[js.Any], AllowOpenInDraftView = AllowOpenInDraftView.asInstanceOf[js.Any], AllowPixelUnits = AllowPixelUnits.asInstanceOf[js.Any], AllowReadingMode = AllowReadingMode.asInstanceOf[js.Any], AlwaysUseClearType = AlwaysUseClearType.asInstanceOf[js.Any], AnimateScreenMovements = AnimateScreenMovements.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], ApplyFarEastFontsToAscii = ApplyFarEastFontsToAscii.asInstanceOf[js.Any], ArabicMode = ArabicMode.asInstanceOf[js.Any], ArabicNumeral = ArabicNumeral.asInstanceOf[js.Any], AutoCreateNewDrawings = AutoCreateNewDrawings.asInstanceOf[js.Any], AutoFormatApplyBulletedLists = AutoFormatApplyBulletedLists.asInstanceOf[js.Any], AutoFormatApplyFirstIndents = AutoFormatApplyFirstIndents.asInstanceOf[js.Any], AutoFormatApplyHeadings = AutoFormatApplyHeadings.asInstanceOf[js.Any], AutoFormatApplyLists = AutoFormatApplyLists.asInstanceOf[js.Any], AutoFormatApplyOtherParas = AutoFormatApplyOtherParas.asInstanceOf[js.Any], AutoFormatAsYouTypeApplyBorders = AutoFormatAsYouTypeApplyBorders.asInstanceOf[js.Any], AutoFormatAsYouTypeApplyBulletedLists = AutoFormatAsYouTypeApplyBulletedLists.asInstanceOf[js.Any], AutoFormatAsYouTypeApplyClosings = AutoFormatAsYouTypeApplyClosings.asInstanceOf[js.Any], AutoFormatAsYouTypeApplyDates = AutoFormatAsYouTypeApplyDates.asInstanceOf[js.Any], AutoFormatAsYouTypeApplyFirstIndents = AutoFormatAsYouTypeApplyFirstIndents.asInstanceOf[js.Any], AutoFormatAsYouTypeApplyHeadings = AutoFormatAsYouTypeApplyHeadings.asInstanceOf[js.Any], AutoFormatAsYouTypeApplyNumberedLists = AutoFormatAsYouTypeApplyNumberedLists.asInstanceOf[js.Any], AutoFormatAsYouTypeApplyTables = AutoFormatAsYouTypeApplyTables.asInstanceOf[js.Any], AutoFormatAsYouTypeAutoLetterWizard = AutoFormatAsYouTypeAutoLetterWizard.asInstanceOf[js.Any], AutoFormatAsYouTypeDefineStyles = AutoFormatAsYouTypeDefineStyles.asInstanceOf[js.Any], AutoFormatAsYouTypeDeleteAutoSpaces = AutoFormatAsYouTypeDeleteAutoSpaces.asInstanceOf[js.Any], AutoFormatAsYouTypeFormatListItemBeginning = AutoFormatAsYouTypeFormatListItemBeginning.asInstanceOf[js.Any], AutoFormatAsYouTypeInsertClosings = AutoFormatAsYouTypeInsertClosings.asInstanceOf[js.Any], AutoFormatAsYouTypeInsertOvers = AutoFormatAsYouTypeInsertOvers.asInstanceOf[js.Any], AutoFormatAsYouTypeMatchParentheses = AutoFormatAsYouTypeMatchParentheses.asInstanceOf[js.Any], AutoFormatAsYouTypeReplaceFarEastDashes = AutoFormatAsYouTypeReplaceFarEastDashes.asInstanceOf[js.Any], AutoFormatAsYouTypeReplaceFractions = AutoFormatAsYouTypeReplaceFractions.asInstanceOf[js.Any], AutoFormatAsYouTypeReplaceHyperlinks = AutoFormatAsYouTypeReplaceHyperlinks.asInstanceOf[js.Any], AutoFormatAsYouTypeReplaceOrdinals = AutoFormatAsYouTypeReplaceOrdinals.asInstanceOf[js.Any], AutoFormatAsYouTypeReplacePlainTextEmphasis = AutoFormatAsYouTypeReplacePlainTextEmphasis.asInstanceOf[js.Any], AutoFormatAsYouTypeReplaceQuotes = AutoFormatAsYouTypeReplaceQuotes.asInstanceOf[js.Any], AutoFormatAsYouTypeReplaceSymbols = AutoFormatAsYouTypeReplaceSymbols.asInstanceOf[js.Any], AutoFormatDeleteAutoSpaces = AutoFormatDeleteAutoSpaces.asInstanceOf[js.Any], AutoFormatMatchParentheses = AutoFormatMatchParentheses.asInstanceOf[js.Any], AutoFormatPlainTextWordMail = AutoFormatPlainTextWordMail.asInstanceOf[js.Any], AutoFormatPreserveStyles = AutoFormatPreserveStyles.asInstanceOf[js.Any], AutoFormatReplaceFarEastDashes = AutoFormatReplaceFarEastDashes.asInstanceOf[js.Any], AutoFormatReplaceFractions = AutoFormatReplaceFractions.asInstanceOf[js.Any], AutoFormatReplaceHyperlinks = AutoFormatReplaceHyperlinks.asInstanceOf[js.Any], AutoFormatReplaceOrdinals = AutoFormatReplaceOrdinals.asInstanceOf[js.Any], AutoFormatReplacePlainTextEmphasis = AutoFormatReplacePlainTextEmphasis.asInstanceOf[js.Any], AutoFormatReplaceQuotes = AutoFormatReplaceQuotes.asInstanceOf[js.Any], AutoFormatReplaceSymbols = AutoFormatReplaceSymbols.asInstanceOf[js.Any], AutoKeyboardSwitching = AutoKeyboardSwitching.asInstanceOf[js.Any], AutoWordSelection = AutoWordSelection.asInstanceOf[js.Any], BackgroundOpen = BackgroundOpen.asInstanceOf[js.Any], BackgroundSave = BackgroundSave.asInstanceOf[js.Any], BibliographySort = BibliographySort.asInstanceOf[js.Any], BibliographyStyle = BibliographyStyle.asInstanceOf[js.Any], BlueScreen = BlueScreen.asInstanceOf[js.Any], BrazilReform = BrazilReform.asInstanceOf[js.Any], ButtonFieldClicks = ButtonFieldClicks.asInstanceOf[js.Any], CheckGrammarAsYouType = CheckGrammarAsYouType.asInstanceOf[js.Any], CheckGrammarWithSpelling = CheckGrammarWithSpelling.asInstanceOf[js.Any], CheckHangulEndings = CheckHangulEndings.asInstanceOf[js.Any], CheckSpellingAsYouType = CheckSpellingAsYouType.asInstanceOf[js.Any], CommentsColor = CommentsColor.asInstanceOf[js.Any], ConfirmConversions = ConfirmConversions.asInstanceOf[js.Any], ContextualSpeller = ContextualSpeller.asInstanceOf[js.Any], ConvertHighAnsiToFarEast = ConvertHighAnsiToFarEast.asInstanceOf[js.Any], CreateBackup = CreateBackup.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], CtrlClickHyperlinkToOpen = CtrlClickHyperlinkToOpen.asInstanceOf[js.Any], CursorMovement = CursorMovement.asInstanceOf[js.Any], DefaultBorderColor = DefaultBorderColor.asInstanceOf[js.Any], DefaultBorderColorIndex = DefaultBorderColorIndex.asInstanceOf[js.Any], DefaultBorderLineStyle = DefaultBorderLineStyle.asInstanceOf[js.Any], DefaultBorderLineWidth = DefaultBorderLineWidth.asInstanceOf[js.Any], DefaultEPostageApp = DefaultEPostageApp.asInstanceOf[js.Any], DefaultFilePath = js.Any.fromFunction1(DefaultFilePath), DefaultHighlightColorIndex = DefaultHighlightColorIndex.asInstanceOf[js.Any], DefaultOpenFormat = DefaultOpenFormat.asInstanceOf[js.Any], DefaultTextEncoding = DefaultTextEncoding.asInstanceOf[js.Any], DefaultTray = DefaultTray.asInstanceOf[js.Any], DefaultTrayID = DefaultTrayID.asInstanceOf[js.Any], DeletedCellColor = DeletedCellColor.asInstanceOf[js.Any], DeletedTextColor = DeletedTextColor.asInstanceOf[js.Any], DeletedTextMark = DeletedTextMark.asInstanceOf[js.Any], DiacriticColorVal = DiacriticColorVal.asInstanceOf[js.Any], DisableFeaturesIntroducedAfterbyDefault = DisableFeaturesIntroducedAfterbyDefault.asInstanceOf[js.Any], DisableFeaturesbyDefault = DisableFeaturesbyDefault.asInstanceOf[js.Any], DisplayGridLines = DisplayGridLines.asInstanceOf[js.Any], DisplayPasteOptions = DisplayPasteOptions.asInstanceOf[js.Any], DisplaySmartTagButtons = DisplaySmartTagButtons.asInstanceOf[js.Any], DoNotPromptForConvert = DoNotPromptForConvert.asInstanceOf[js.Any], DocumentViewDirection = DocumentViewDirection.asInstanceOf[js.Any], EnableHangulHanjaRecentOrdering = EnableHangulHanjaRecentOrdering.asInstanceOf[js.Any], EnableLegacyIMEMode = EnableLegacyIMEMode.asInstanceOf[js.Any], EnableLivePreview = EnableLivePreview.asInstanceOf[js.Any], EnableMisusedWordsDictionary = EnableMisusedWordsDictionary.asInstanceOf[js.Any], EnableSound = EnableSound.asInstanceOf[js.Any], EnvelopeFeederInstalled = EnvelopeFeederInstalled.asInstanceOf[js.Any], FormatScanning = FormatScanning.asInstanceOf[js.Any], FrenchReform = FrenchReform.asInstanceOf[js.Any], GridDistanceHorizontal = GridDistanceHorizontal.asInstanceOf[js.Any], GridDistanceVertical = GridDistanceVertical.asInstanceOf[js.Any], GridOriginHorizontal = GridOriginHorizontal.asInstanceOf[js.Any], GridOriginVertical = GridOriginVertical.asInstanceOf[js.Any], HangulHanjaFastConversion = HangulHanjaFastConversion.asInstanceOf[js.Any], HebrewMode = HebrewMode.asInstanceOf[js.Any], IMEAutomaticControl = IMEAutomaticControl.asInstanceOf[js.Any], INSKeyForOvertype = INSKeyForOvertype.asInstanceOf[js.Any], INSKeyForPaste = INSKeyForPaste.asInstanceOf[js.Any], IgnoreInternetAndFileAddresses = IgnoreInternetAndFileAddresses.asInstanceOf[js.Any], IgnoreMixedDigits = IgnoreMixedDigits.asInstanceOf[js.Any], IgnoreUppercase = IgnoreUppercase.asInstanceOf[js.Any], InlineConversion = InlineConversion.asInstanceOf[js.Any], InsertedCellColor = InsertedCellColor.asInstanceOf[js.Any], InsertedTextColor = InsertedTextColor.asInstanceOf[js.Any], InsertedTextMark = InsertedTextMark.asInstanceOf[js.Any], InterpretHighAnsi = InterpretHighAnsi.asInstanceOf[js.Any], LabelSmartTags = LabelSmartTags.asInstanceOf[js.Any], LocalNetworkFile = LocalNetworkFile.asInstanceOf[js.Any], MapPaperSize = MapPaperSize.asInstanceOf[js.Any], MatchFuzzyAY = MatchFuzzyAY.asInstanceOf[js.Any], MatchFuzzyBV = MatchFuzzyBV.asInstanceOf[js.Any], MatchFuzzyByte = MatchFuzzyByte.asInstanceOf[js.Any], MatchFuzzyCase = MatchFuzzyCase.asInstanceOf[js.Any], MatchFuzzyDZ = MatchFuzzyDZ.asInstanceOf[js.Any], MatchFuzzyDash = MatchFuzzyDash.asInstanceOf[js.Any], MatchFuzzyHF = MatchFuzzyHF.asInstanceOf[js.Any], MatchFuzzyHiragana = MatchFuzzyHiragana.asInstanceOf[js.Any], MatchFuzzyIterationMark = MatchFuzzyIterationMark.asInstanceOf[js.Any], MatchFuzzyKanji = MatchFuzzyKanji.asInstanceOf[js.Any], MatchFuzzyKiKu = MatchFuzzyKiKu.asInstanceOf[js.Any], MatchFuzzyOldKana = MatchFuzzyOldKana.asInstanceOf[js.Any], MatchFuzzyProlongedSoundMark = MatchFuzzyProlongedSoundMark.asInstanceOf[js.Any], MatchFuzzyPunctuation = MatchFuzzyPunctuation.asInstanceOf[js.Any], MatchFuzzySmallKana = MatchFuzzySmallKana.asInstanceOf[js.Any], MatchFuzzySpace = MatchFuzzySpace.asInstanceOf[js.Any], MatchFuzzyTC = MatchFuzzyTC.asInstanceOf[js.Any], MatchFuzzyZJ = MatchFuzzyZJ.asInstanceOf[js.Any], MeasurementUnit = MeasurementUnit.asInstanceOf[js.Any], MergedCellColor = MergedCellColor.asInstanceOf[js.Any], MonthNames = MonthNames.asInstanceOf[js.Any], MoveFromTextColor = MoveFromTextColor.asInstanceOf[js.Any], MoveFromTextMark = MoveFromTextMark.asInstanceOf[js.Any], MoveToTextColor = MoveToTextColor.asInstanceOf[js.Any], MoveToTextMark = MoveToTextMark.asInstanceOf[js.Any], MultipleWordConversionsMode = MultipleWordConversionsMode.asInstanceOf[js.Any], OMathAutoBuildUp = OMathAutoBuildUp.asInstanceOf[js.Any], OMathCopyLF = OMathCopyLF.asInstanceOf[js.Any], OptimizeForWord97byDefault = OptimizeForWord97byDefault.asInstanceOf[js.Any], Overtype = Overtype.asInstanceOf[js.Any], Pagination = Pagination.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PasteAdjustParagraphSpacing = PasteAdjustParagraphSpacing.asInstanceOf[js.Any], PasteAdjustTableFormatting = PasteAdjustTableFormatting.asInstanceOf[js.Any], PasteAdjustWordSpacing = PasteAdjustWordSpacing.asInstanceOf[js.Any], PasteFormatBetweenDocuments = PasteFormatBetweenDocuments.asInstanceOf[js.Any], PasteFormatBetweenStyledDocuments = PasteFormatBetweenStyledDocuments.asInstanceOf[js.Any], PasteFormatFromExternalSource = PasteFormatFromExternalSource.asInstanceOf[js.Any], PasteFormatWithinDocument = PasteFormatWithinDocument.asInstanceOf[js.Any], PasteMergeFromPPT = PasteMergeFromPPT.asInstanceOf[js.Any], PasteMergeFromXL = PasteMergeFromXL.asInstanceOf[js.Any], PasteMergeLists = PasteMergeLists.asInstanceOf[js.Any], PasteOptionKeepBulletsAndNumbers = PasteOptionKeepBulletsAndNumbers.asInstanceOf[js.Any], PasteSmartCutPaste = PasteSmartCutPaste.asInstanceOf[js.Any], PasteSmartStyleBehavior = PasteSmartStyleBehavior.asInstanceOf[js.Any], PictureEditor = PictureEditor.asInstanceOf[js.Any], PictureWrapType = PictureWrapType.asInstanceOf[js.Any], PortugalReform = PortugalReform.asInstanceOf[js.Any], PrecisePositioning = PrecisePositioning.asInstanceOf[js.Any], PrintBackground = PrintBackground.asInstanceOf[js.Any], PrintBackgrounds = PrintBackgrounds.asInstanceOf[js.Any], PrintComments = PrintComments.asInstanceOf[js.Any], PrintDraft = PrintDraft.asInstanceOf[js.Any], PrintDrawingObjects = PrintDrawingObjects.asInstanceOf[js.Any], PrintEvenPagesInAscendingOrder = PrintEvenPagesInAscendingOrder.asInstanceOf[js.Any], PrintFieldCodes = PrintFieldCodes.asInstanceOf[js.Any], PrintHiddenText = PrintHiddenText.asInstanceOf[js.Any], PrintOddPagesInAscendingOrder = PrintOddPagesInAscendingOrder.asInstanceOf[js.Any], PrintProperties = PrintProperties.asInstanceOf[js.Any], PrintReverse = PrintReverse.asInstanceOf[js.Any], PrintXMLTag = PrintXMLTag.asInstanceOf[js.Any], PromptUpdateStyle = PromptUpdateStyle.asInstanceOf[js.Any], RTFInClipboard = RTFInClipboard.asInstanceOf[js.Any], RepeatWord = RepeatWord.asInstanceOf[js.Any], ReplaceSelection = ReplaceSelection.asInstanceOf[js.Any], RevisedLinesColor = RevisedLinesColor.asInstanceOf[js.Any], RevisedLinesMark = RevisedLinesMark.asInstanceOf[js.Any], RevisedPropertiesColor = RevisedPropertiesColor.asInstanceOf[js.Any], RevisedPropertiesMark = RevisedPropertiesMark.asInstanceOf[js.Any], RevisionsBalloonPrintOrientation = RevisionsBalloonPrintOrientation.asInstanceOf[js.Any], SaveInterval = SaveInterval.asInstanceOf[js.Any], SaveNormalPrompt = SaveNormalPrompt.asInstanceOf[js.Any], SavePropertiesPrompt = SavePropertiesPrompt.asInstanceOf[js.Any], SendMailAttach = SendMailAttach.asInstanceOf[js.Any], SequenceCheck = SequenceCheck.asInstanceOf[js.Any], SetWPHelpOptions = js.Any.fromFunction6(SetWPHelpOptions), ShortMenuNames = ShortMenuNames.asInstanceOf[js.Any], ShowControlCharacters = ShowControlCharacters.asInstanceOf[js.Any], ShowDevTools = ShowDevTools.asInstanceOf[js.Any], ShowDiacritics = ShowDiacritics.asInstanceOf[js.Any], ShowFormatError = ShowFormatError.asInstanceOf[js.Any], ShowMarkupOpenSave = ShowMarkupOpenSave.asInstanceOf[js.Any], ShowMenuFloaties = ShowMenuFloaties.asInstanceOf[js.Any], ShowReadabilityStatistics = ShowReadabilityStatistics.asInstanceOf[js.Any], ShowSelectionFloaties = ShowSelectionFloaties.asInstanceOf[js.Any], SmartCursoring = SmartCursoring.asInstanceOf[js.Any], SmartCutPaste = SmartCutPaste.asInstanceOf[js.Any], SmartParaSelection = SmartParaSelection.asInstanceOf[js.Any], SnapToGrid = SnapToGrid.asInstanceOf[js.Any], SnapToShapes = SnapToShapes.asInstanceOf[js.Any], SpanishMode = SpanishMode.asInstanceOf[js.Any], SplitCellColor = SplitCellColor.asInstanceOf[js.Any], StoreRSIDOnSave = StoreRSIDOnSave.asInstanceOf[js.Any], StrictFinalYaa = StrictFinalYaa.asInstanceOf[js.Any], StrictInitialAlefHamza = StrictInitialAlefHamza.asInstanceOf[js.Any], StrictRussianE = StrictRussianE.asInstanceOf[js.Any], StrictTaaMarboota = StrictTaaMarboota.asInstanceOf[js.Any], SuggestFromMainDictionaryOnly = SuggestFromMainDictionaryOnly.asInstanceOf[js.Any], SuggestSpellingCorrections = SuggestSpellingCorrections.asInstanceOf[js.Any], TabIndentKey = TabIndentKey.asInstanceOf[js.Any], TypeNReplace = TypeNReplace.asInstanceOf[js.Any], UpdateFieldsAtPrint = UpdateFieldsAtPrint.asInstanceOf[js.Any], UpdateFieldsWithTrackedChangesAtPrint = UpdateFieldsWithTrackedChangesAtPrint.asInstanceOf[js.Any], UpdateLinksAtOpen = UpdateLinksAtOpen.asInstanceOf[js.Any], UpdateLinksAtPrint = UpdateLinksAtPrint.asInstanceOf[js.Any], UpdateStyleListBehavior = UpdateStyleListBehavior.asInstanceOf[js.Any], UseCharacterUnit = UseCharacterUnit.asInstanceOf[js.Any], UseDiffDiacColor = UseDiffDiacColor.asInstanceOf[js.Any], UseGermanSpellingReform = UseGermanSpellingReform.asInstanceOf[js.Any], UseNormalStyleForList = UseNormalStyleForList.asInstanceOf[js.Any], VirusProtection = VirusProtection.asInstanceOf[js.Any], VisualSelection = VisualSelection.asInstanceOf[js.Any], WPDocNavKeys = WPDocNavKeys.asInstanceOf[js.Any], WPHelp = WPHelp.asInstanceOf[js.Any], WarnBeforeSavingPrintingSendingMarkup = WarnBeforeSavingPrintingSendingMarkup.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Options_typekey")(WordDotOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setAddBiDirectionalMarksWhenSavingTextFile(value: Boolean): Self = StObject.set(x, "AddBiDirectionalMarksWhenSavingTextFile", value.asInstanceOf[js.Any])
    
    inline def setAddControlCharacters(value: Boolean): Self = StObject.set(x, "AddControlCharacters", value.asInstanceOf[js.Any])
    
    inline def setAddHebDoubleQuote(value: Boolean): Self = StObject.set(x, "AddHebDoubleQuote", value.asInstanceOf[js.Any])
    
    inline def setAllowAccentedUppercase(value: Boolean): Self = StObject.set(x, "AllowAccentedUppercase", value.asInstanceOf[js.Any])
    
    inline def setAllowClickAndTypeMouse(value: Boolean): Self = StObject.set(x, "AllowClickAndTypeMouse", value.asInstanceOf[js.Any])
    
    inline def setAllowCombinedAuxiliaryForms(value: Boolean): Self = StObject.set(x, "AllowCombinedAuxiliaryForms", value.asInstanceOf[js.Any])
    
    inline def setAllowCompoundNounProcessing(value: Boolean): Self = StObject.set(x, "AllowCompoundNounProcessing", value.asInstanceOf[js.Any])
    
    inline def setAllowDragAndDrop(value: Boolean): Self = StObject.set(x, "AllowDragAndDrop", value.asInstanceOf[js.Any])
    
    inline def setAllowFastSave(value: Boolean): Self = StObject.set(x, "AllowFastSave", value.asInstanceOf[js.Any])
    
    inline def setAllowOpenInDraftView(value: Boolean): Self = StObject.set(x, "AllowOpenInDraftView", value.asInstanceOf[js.Any])
    
    inline def setAllowPixelUnits(value: Boolean): Self = StObject.set(x, "AllowPixelUnits", value.asInstanceOf[js.Any])
    
    inline def setAllowReadingMode(value: Boolean): Self = StObject.set(x, "AllowReadingMode", value.asInstanceOf[js.Any])
    
    inline def setAlwaysUseClearType(value: Boolean): Self = StObject.set(x, "AlwaysUseClearType", value.asInstanceOf[js.Any])
    
    inline def setAnimateScreenMovements(value: Boolean): Self = StObject.set(x, "AnimateScreenMovements", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setApplyFarEastFontsToAscii(value: Boolean): Self = StObject.set(x, "ApplyFarEastFontsToAscii", value.asInstanceOf[js.Any])
    
    inline def setArabicMode(value: WdAraSpeller): Self = StObject.set(x, "ArabicMode", value.asInstanceOf[js.Any])
    
    inline def setArabicNumeral(value: WdArabicNumeral): Self = StObject.set(x, "ArabicNumeral", value.asInstanceOf[js.Any])
    
    inline def setAutoCreateNewDrawings(value: Boolean): Self = StObject.set(x, "AutoCreateNewDrawings", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatApplyBulletedLists(value: Boolean): Self = StObject.set(x, "AutoFormatApplyBulletedLists", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatApplyFirstIndents(value: Boolean): Self = StObject.set(x, "AutoFormatApplyFirstIndents", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatApplyHeadings(value: Boolean): Self = StObject.set(x, "AutoFormatApplyHeadings", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatApplyLists(value: Boolean): Self = StObject.set(x, "AutoFormatApplyLists", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatApplyOtherParas(value: Boolean): Self = StObject.set(x, "AutoFormatApplyOtherParas", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatAsYouTypeApplyBorders(value: Boolean): Self = StObject.set(x, "AutoFormatAsYouTypeApplyBorders", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatAsYouTypeApplyBulletedLists(value: Boolean): Self = StObject.set(x, "AutoFormatAsYouTypeApplyBulletedLists", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatAsYouTypeApplyClosings(value: Boolean): Self = StObject.set(x, "AutoFormatAsYouTypeApplyClosings", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatAsYouTypeApplyDates(value: Boolean): Self = StObject.set(x, "AutoFormatAsYouTypeApplyDates", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatAsYouTypeApplyFirstIndents(value: Boolean): Self = StObject.set(x, "AutoFormatAsYouTypeApplyFirstIndents", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatAsYouTypeApplyHeadings(value: Boolean): Self = StObject.set(x, "AutoFormatAsYouTypeApplyHeadings", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatAsYouTypeApplyNumberedLists(value: Boolean): Self = StObject.set(x, "AutoFormatAsYouTypeApplyNumberedLists", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatAsYouTypeApplyTables(value: Boolean): Self = StObject.set(x, "AutoFormatAsYouTypeApplyTables", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatAsYouTypeAutoLetterWizard(value: Boolean): Self = StObject.set(x, "AutoFormatAsYouTypeAutoLetterWizard", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatAsYouTypeDefineStyles(value: Boolean): Self = StObject.set(x, "AutoFormatAsYouTypeDefineStyles", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatAsYouTypeDeleteAutoSpaces(value: Boolean): Self = StObject.set(x, "AutoFormatAsYouTypeDeleteAutoSpaces", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatAsYouTypeFormatListItemBeginning(value: Boolean): Self = StObject.set(x, "AutoFormatAsYouTypeFormatListItemBeginning", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatAsYouTypeInsertClosings(value: Boolean): Self = StObject.set(x, "AutoFormatAsYouTypeInsertClosings", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatAsYouTypeInsertOvers(value: Boolean): Self = StObject.set(x, "AutoFormatAsYouTypeInsertOvers", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatAsYouTypeMatchParentheses(value: Boolean): Self = StObject.set(x, "AutoFormatAsYouTypeMatchParentheses", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatAsYouTypeReplaceFarEastDashes(value: Boolean): Self = StObject.set(x, "AutoFormatAsYouTypeReplaceFarEastDashes", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatAsYouTypeReplaceFractions(value: Boolean): Self = StObject.set(x, "AutoFormatAsYouTypeReplaceFractions", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatAsYouTypeReplaceHyperlinks(value: Boolean): Self = StObject.set(x, "AutoFormatAsYouTypeReplaceHyperlinks", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatAsYouTypeReplaceOrdinals(value: Boolean): Self = StObject.set(x, "AutoFormatAsYouTypeReplaceOrdinals", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatAsYouTypeReplacePlainTextEmphasis(value: Boolean): Self = StObject.set(x, "AutoFormatAsYouTypeReplacePlainTextEmphasis", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatAsYouTypeReplaceQuotes(value: Boolean): Self = StObject.set(x, "AutoFormatAsYouTypeReplaceQuotes", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatAsYouTypeReplaceSymbols(value: Boolean): Self = StObject.set(x, "AutoFormatAsYouTypeReplaceSymbols", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatDeleteAutoSpaces(value: Boolean): Self = StObject.set(x, "AutoFormatDeleteAutoSpaces", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatMatchParentheses(value: Boolean): Self = StObject.set(x, "AutoFormatMatchParentheses", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatPlainTextWordMail(value: Boolean): Self = StObject.set(x, "AutoFormatPlainTextWordMail", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatPreserveStyles(value: Boolean): Self = StObject.set(x, "AutoFormatPreserveStyles", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatReplaceFarEastDashes(value: Boolean): Self = StObject.set(x, "AutoFormatReplaceFarEastDashes", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatReplaceFractions(value: Boolean): Self = StObject.set(x, "AutoFormatReplaceFractions", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatReplaceHyperlinks(value: Boolean): Self = StObject.set(x, "AutoFormatReplaceHyperlinks", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatReplaceOrdinals(value: Boolean): Self = StObject.set(x, "AutoFormatReplaceOrdinals", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatReplacePlainTextEmphasis(value: Boolean): Self = StObject.set(x, "AutoFormatReplacePlainTextEmphasis", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatReplaceQuotes(value: Boolean): Self = StObject.set(x, "AutoFormatReplaceQuotes", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatReplaceSymbols(value: Boolean): Self = StObject.set(x, "AutoFormatReplaceSymbols", value.asInstanceOf[js.Any])
    
    inline def setAutoKeyboardSwitching(value: Boolean): Self = StObject.set(x, "AutoKeyboardSwitching", value.asInstanceOf[js.Any])
    
    inline def setAutoWordSelection(value: Boolean): Self = StObject.set(x, "AutoWordSelection", value.asInstanceOf[js.Any])
    
    inline def setBackgroundOpen(value: Boolean): Self = StObject.set(x, "BackgroundOpen", value.asInstanceOf[js.Any])
    
    inline def setBackgroundSave(value: Boolean): Self = StObject.set(x, "BackgroundSave", value.asInstanceOf[js.Any])
    
    inline def setBibliographySort(value: String): Self = StObject.set(x, "BibliographySort", value.asInstanceOf[js.Any])
    
    inline def setBibliographyStyle(value: String): Self = StObject.set(x, "BibliographyStyle", value.asInstanceOf[js.Any])
    
    inline def setBlueScreen(value: Boolean): Self = StObject.set(x, "BlueScreen", value.asInstanceOf[js.Any])
    
    inline def setBrazilReform(value: WdPortugueseReform): Self = StObject.set(x, "BrazilReform", value.asInstanceOf[js.Any])
    
    inline def setButtonFieldClicks(value: Double): Self = StObject.set(x, "ButtonFieldClicks", value.asInstanceOf[js.Any])
    
    inline def setCheckGrammarAsYouType(value: Boolean): Self = StObject.set(x, "CheckGrammarAsYouType", value.asInstanceOf[js.Any])
    
    inline def setCheckGrammarWithSpelling(value: Boolean): Self = StObject.set(x, "CheckGrammarWithSpelling", value.asInstanceOf[js.Any])
    
    inline def setCheckHangulEndings(value: Boolean): Self = StObject.set(x, "CheckHangulEndings", value.asInstanceOf[js.Any])
    
    inline def setCheckSpellingAsYouType(value: Boolean): Self = StObject.set(x, "CheckSpellingAsYouType", value.asInstanceOf[js.Any])
    
    inline def setCommentsColor(value: WdColorIndex): Self = StObject.set(x, "CommentsColor", value.asInstanceOf[js.Any])
    
    inline def setConfirmConversions(value: Boolean): Self = StObject.set(x, "ConfirmConversions", value.asInstanceOf[js.Any])
    
    inline def setContextualSpeller(value: Boolean): Self = StObject.set(x, "ContextualSpeller", value.asInstanceOf[js.Any])
    
    inline def setConvertHighAnsiToFarEast(value: Boolean): Self = StObject.set(x, "ConvertHighAnsiToFarEast", value.asInstanceOf[js.Any])
    
    inline def setCreateBackup(value: Boolean): Self = StObject.set(x, "CreateBackup", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setCtrlClickHyperlinkToOpen(value: Boolean): Self = StObject.set(x, "CtrlClickHyperlinkToOpen", value.asInstanceOf[js.Any])
    
    inline def setCursorMovement(value: WdCursorMovement): Self = StObject.set(x, "CursorMovement", value.asInstanceOf[js.Any])
    
    inline def setDefaultBorderColor(value: WdColor): Self = StObject.set(x, "DefaultBorderColor", value.asInstanceOf[js.Any])
    
    inline def setDefaultBorderColorIndex(value: WdColorIndex): Self = StObject.set(x, "DefaultBorderColorIndex", value.asInstanceOf[js.Any])
    
    inline def setDefaultBorderLineStyle(value: WdLineStyle): Self = StObject.set(x, "DefaultBorderLineStyle", value.asInstanceOf[js.Any])
    
    inline def setDefaultBorderLineWidth(value: WdLineWidth): Self = StObject.set(x, "DefaultBorderLineWidth", value.asInstanceOf[js.Any])
    
    inline def setDefaultEPostageApp(value: String): Self = StObject.set(x, "DefaultEPostageApp", value.asInstanceOf[js.Any])
    
    inline def setDefaultFilePath(value: WdDefaultFilePath => String): Self = StObject.set(x, "DefaultFilePath", js.Any.fromFunction1(value))
    
    inline def setDefaultHighlightColorIndex(value: WdColorIndex): Self = StObject.set(x, "DefaultHighlightColorIndex", value.asInstanceOf[js.Any])
    
    inline def setDefaultOpenFormat(value: WdOpenFormat): Self = StObject.set(x, "DefaultOpenFormat", value.asInstanceOf[js.Any])
    
    inline def setDefaultTextEncoding(value: MsoEncoding): Self = StObject.set(x, "DefaultTextEncoding", value.asInstanceOf[js.Any])
    
    inline def setDefaultTray(value: String): Self = StObject.set(x, "DefaultTray", value.asInstanceOf[js.Any])
    
    inline def setDefaultTrayID(value: Double): Self = StObject.set(x, "DefaultTrayID", value.asInstanceOf[js.Any])
    
    inline def setDeletedCellColor(value: WdCellColor): Self = StObject.set(x, "DeletedCellColor", value.asInstanceOf[js.Any])
    
    inline def setDeletedTextColor(value: WdColorIndex): Self = StObject.set(x, "DeletedTextColor", value.asInstanceOf[js.Any])
    
    inline def setDeletedTextMark(value: WdDeletedTextMark): Self = StObject.set(x, "DeletedTextMark", value.asInstanceOf[js.Any])
    
    inline def setDiacriticColorVal(value: WdColor): Self = StObject.set(x, "DiacriticColorVal", value.asInstanceOf[js.Any])
    
    inline def setDisableFeaturesIntroducedAfterbyDefault(value: WdDisableFeaturesIntroducedAfter): Self = StObject.set(x, "DisableFeaturesIntroducedAfterbyDefault", value.asInstanceOf[js.Any])
    
    inline def setDisableFeaturesbyDefault(value: Boolean): Self = StObject.set(x, "DisableFeaturesbyDefault", value.asInstanceOf[js.Any])
    
    inline def setDisplayGridLines(value: Boolean): Self = StObject.set(x, "DisplayGridLines", value.asInstanceOf[js.Any])
    
    inline def setDisplayPasteOptions(value: Boolean): Self = StObject.set(x, "DisplayPasteOptions", value.asInstanceOf[js.Any])
    
    inline def setDisplaySmartTagButtons(value: Boolean): Self = StObject.set(x, "DisplaySmartTagButtons", value.asInstanceOf[js.Any])
    
    inline def setDoNotPromptForConvert(value: Boolean): Self = StObject.set(x, "DoNotPromptForConvert", value.asInstanceOf[js.Any])
    
    inline def setDocumentViewDirection(value: WdDocumentViewDirection): Self = StObject.set(x, "DocumentViewDirection", value.asInstanceOf[js.Any])
    
    inline def setEnableHangulHanjaRecentOrdering(value: Boolean): Self = StObject.set(x, "EnableHangulHanjaRecentOrdering", value.asInstanceOf[js.Any])
    
    inline def setEnableLegacyIMEMode(value: Boolean): Self = StObject.set(x, "EnableLegacyIMEMode", value.asInstanceOf[js.Any])
    
    inline def setEnableLivePreview(value: Boolean): Self = StObject.set(x, "EnableLivePreview", value.asInstanceOf[js.Any])
    
    inline def setEnableMisusedWordsDictionary(value: Boolean): Self = StObject.set(x, "EnableMisusedWordsDictionary", value.asInstanceOf[js.Any])
    
    inline def setEnableSound(value: Boolean): Self = StObject.set(x, "EnableSound", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeFeederInstalled(value: Boolean): Self = StObject.set(x, "EnvelopeFeederInstalled", value.asInstanceOf[js.Any])
    
    inline def setFormatScanning(value: Boolean): Self = StObject.set(x, "FormatScanning", value.asInstanceOf[js.Any])
    
    inline def setFrenchReform(value: WdFrenchSpeller): Self = StObject.set(x, "FrenchReform", value.asInstanceOf[js.Any])
    
    inline def setGridDistanceHorizontal(value: Double): Self = StObject.set(x, "GridDistanceHorizontal", value.asInstanceOf[js.Any])
    
    inline def setGridDistanceVertical(value: Double): Self = StObject.set(x, "GridDistanceVertical", value.asInstanceOf[js.Any])
    
    inline def setGridOriginHorizontal(value: Double): Self = StObject.set(x, "GridOriginHorizontal", value.asInstanceOf[js.Any])
    
    inline def setGridOriginVertical(value: Double): Self = StObject.set(x, "GridOriginVertical", value.asInstanceOf[js.Any])
    
    inline def setHangulHanjaFastConversion(value: Boolean): Self = StObject.set(x, "HangulHanjaFastConversion", value.asInstanceOf[js.Any])
    
    inline def setHebrewMode(value: WdHebSpellStart): Self = StObject.set(x, "HebrewMode", value.asInstanceOf[js.Any])
    
    inline def setIMEAutomaticControl(value: Boolean): Self = StObject.set(x, "IMEAutomaticControl", value.asInstanceOf[js.Any])
    
    inline def setINSKeyForOvertype(value: Boolean): Self = StObject.set(x, "INSKeyForOvertype", value.asInstanceOf[js.Any])
    
    inline def setINSKeyForPaste(value: Boolean): Self = StObject.set(x, "INSKeyForPaste", value.asInstanceOf[js.Any])
    
    inline def setIgnoreInternetAndFileAddresses(value: Boolean): Self = StObject.set(x, "IgnoreInternetAndFileAddresses", value.asInstanceOf[js.Any])
    
    inline def setIgnoreMixedDigits(value: Boolean): Self = StObject.set(x, "IgnoreMixedDigits", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUppercase(value: Boolean): Self = StObject.set(x, "IgnoreUppercase", value.asInstanceOf[js.Any])
    
    inline def setInlineConversion(value: Boolean): Self = StObject.set(x, "InlineConversion", value.asInstanceOf[js.Any])
    
    inline def setInsertedCellColor(value: WdCellColor): Self = StObject.set(x, "InsertedCellColor", value.asInstanceOf[js.Any])
    
    inline def setInsertedTextColor(value: WdColorIndex): Self = StObject.set(x, "InsertedTextColor", value.asInstanceOf[js.Any])
    
    inline def setInsertedTextMark(value: WdInsertedTextMark): Self = StObject.set(x, "InsertedTextMark", value.asInstanceOf[js.Any])
    
    inline def setInterpretHighAnsi(value: WdHighAnsiText): Self = StObject.set(x, "InterpretHighAnsi", value.asInstanceOf[js.Any])
    
    inline def setLabelSmartTags(value: Boolean): Self = StObject.set(x, "LabelSmartTags", value.asInstanceOf[js.Any])
    
    inline def setLocalNetworkFile(value: Boolean): Self = StObject.set(x, "LocalNetworkFile", value.asInstanceOf[js.Any])
    
    inline def setMapPaperSize(value: Boolean): Self = StObject.set(x, "MapPaperSize", value.asInstanceOf[js.Any])
    
    inline def setMatchFuzzyAY(value: Boolean): Self = StObject.set(x, "MatchFuzzyAY", value.asInstanceOf[js.Any])
    
    inline def setMatchFuzzyBV(value: Boolean): Self = StObject.set(x, "MatchFuzzyBV", value.asInstanceOf[js.Any])
    
    inline def setMatchFuzzyByte(value: Boolean): Self = StObject.set(x, "MatchFuzzyByte", value.asInstanceOf[js.Any])
    
    inline def setMatchFuzzyCase(value: Boolean): Self = StObject.set(x, "MatchFuzzyCase", value.asInstanceOf[js.Any])
    
    inline def setMatchFuzzyDZ(value: Boolean): Self = StObject.set(x, "MatchFuzzyDZ", value.asInstanceOf[js.Any])
    
    inline def setMatchFuzzyDash(value: Boolean): Self = StObject.set(x, "MatchFuzzyDash", value.asInstanceOf[js.Any])
    
    inline def setMatchFuzzyHF(value: Boolean): Self = StObject.set(x, "MatchFuzzyHF", value.asInstanceOf[js.Any])
    
    inline def setMatchFuzzyHiragana(value: Boolean): Self = StObject.set(x, "MatchFuzzyHiragana", value.asInstanceOf[js.Any])
    
    inline def setMatchFuzzyIterationMark(value: Boolean): Self = StObject.set(x, "MatchFuzzyIterationMark", value.asInstanceOf[js.Any])
    
    inline def setMatchFuzzyKanji(value: Boolean): Self = StObject.set(x, "MatchFuzzyKanji", value.asInstanceOf[js.Any])
    
    inline def setMatchFuzzyKiKu(value: Boolean): Self = StObject.set(x, "MatchFuzzyKiKu", value.asInstanceOf[js.Any])
    
    inline def setMatchFuzzyOldKana(value: Boolean): Self = StObject.set(x, "MatchFuzzyOldKana", value.asInstanceOf[js.Any])
    
    inline def setMatchFuzzyProlongedSoundMark(value: Boolean): Self = StObject.set(x, "MatchFuzzyProlongedSoundMark", value.asInstanceOf[js.Any])
    
    inline def setMatchFuzzyPunctuation(value: Boolean): Self = StObject.set(x, "MatchFuzzyPunctuation", value.asInstanceOf[js.Any])
    
    inline def setMatchFuzzySmallKana(value: Boolean): Self = StObject.set(x, "MatchFuzzySmallKana", value.asInstanceOf[js.Any])
    
    inline def setMatchFuzzySpace(value: Boolean): Self = StObject.set(x, "MatchFuzzySpace", value.asInstanceOf[js.Any])
    
    inline def setMatchFuzzyTC(value: Boolean): Self = StObject.set(x, "MatchFuzzyTC", value.asInstanceOf[js.Any])
    
    inline def setMatchFuzzyZJ(value: Boolean): Self = StObject.set(x, "MatchFuzzyZJ", value.asInstanceOf[js.Any])
    
    inline def setMeasurementUnit(value: WdMeasurementUnits): Self = StObject.set(x, "MeasurementUnit", value.asInstanceOf[js.Any])
    
    inline def setMergedCellColor(value: WdCellColor): Self = StObject.set(x, "MergedCellColor", value.asInstanceOf[js.Any])
    
    inline def setMonthNames(value: WdMonthNames): Self = StObject.set(x, "MonthNames", value.asInstanceOf[js.Any])
    
    inline def setMoveFromTextColor(value: WdColorIndex): Self = StObject.set(x, "MoveFromTextColor", value.asInstanceOf[js.Any])
    
    inline def setMoveFromTextMark(value: WdMoveFromTextMark): Self = StObject.set(x, "MoveFromTextMark", value.asInstanceOf[js.Any])
    
    inline def setMoveToTextColor(value: WdColorIndex): Self = StObject.set(x, "MoveToTextColor", value.asInstanceOf[js.Any])
    
    inline def setMoveToTextMark(value: WdMoveToTextMark): Self = StObject.set(x, "MoveToTextMark", value.asInstanceOf[js.Any])
    
    inline def setMultipleWordConversionsMode(value: WdMultipleWordConversionsMode): Self = StObject.set(x, "MultipleWordConversionsMode", value.asInstanceOf[js.Any])
    
    inline def setOMathAutoBuildUp(value: Boolean): Self = StObject.set(x, "OMathAutoBuildUp", value.asInstanceOf[js.Any])
    
    inline def setOMathCopyLF(value: Boolean): Self = StObject.set(x, "OMathCopyLF", value.asInstanceOf[js.Any])
    
    inline def setOptimizeForWord97byDefault(value: Boolean): Self = StObject.set(x, "OptimizeForWord97byDefault", value.asInstanceOf[js.Any])
    
    inline def setOvertype(value: Boolean): Self = StObject.set(x, "Overtype", value.asInstanceOf[js.Any])
    
    inline def setPagination(value: Boolean): Self = StObject.set(x, "Pagination", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPasteAdjustParagraphSpacing(value: Boolean): Self = StObject.set(x, "PasteAdjustParagraphSpacing", value.asInstanceOf[js.Any])
    
    inline def setPasteAdjustTableFormatting(value: Boolean): Self = StObject.set(x, "PasteAdjustTableFormatting", value.asInstanceOf[js.Any])
    
    inline def setPasteAdjustWordSpacing(value: Boolean): Self = StObject.set(x, "PasteAdjustWordSpacing", value.asInstanceOf[js.Any])
    
    inline def setPasteFormatBetweenDocuments(value: WdPasteOptions): Self = StObject.set(x, "PasteFormatBetweenDocuments", value.asInstanceOf[js.Any])
    
    inline def setPasteFormatBetweenStyledDocuments(value: WdPasteOptions): Self = StObject.set(x, "PasteFormatBetweenStyledDocuments", value.asInstanceOf[js.Any])
    
    inline def setPasteFormatFromExternalSource(value: WdPasteOptions): Self = StObject.set(x, "PasteFormatFromExternalSource", value.asInstanceOf[js.Any])
    
    inline def setPasteFormatWithinDocument(value: WdPasteOptions): Self = StObject.set(x, "PasteFormatWithinDocument", value.asInstanceOf[js.Any])
    
    inline def setPasteMergeFromPPT(value: Boolean): Self = StObject.set(x, "PasteMergeFromPPT", value.asInstanceOf[js.Any])
    
    inline def setPasteMergeFromXL(value: Boolean): Self = StObject.set(x, "PasteMergeFromXL", value.asInstanceOf[js.Any])
    
    inline def setPasteMergeLists(value: Boolean): Self = StObject.set(x, "PasteMergeLists", value.asInstanceOf[js.Any])
    
    inline def setPasteOptionKeepBulletsAndNumbers(value: Boolean): Self = StObject.set(x, "PasteOptionKeepBulletsAndNumbers", value.asInstanceOf[js.Any])
    
    inline def setPasteSmartCutPaste(value: Boolean): Self = StObject.set(x, "PasteSmartCutPaste", value.asInstanceOf[js.Any])
    
    inline def setPasteSmartStyleBehavior(value: Boolean): Self = StObject.set(x, "PasteSmartStyleBehavior", value.asInstanceOf[js.Any])
    
    inline def setPictureEditor(value: String): Self = StObject.set(x, "PictureEditor", value.asInstanceOf[js.Any])
    
    inline def setPictureWrapType(value: WdWrapTypeMerged): Self = StObject.set(x, "PictureWrapType", value.asInstanceOf[js.Any])
    
    inline def setPortugalReform(value: WdPortugueseReform): Self = StObject.set(x, "PortugalReform", value.asInstanceOf[js.Any])
    
    inline def setPrecisePositioning(value: Boolean): Self = StObject.set(x, "PrecisePositioning", value.asInstanceOf[js.Any])
    
    inline def setPrintBackground(value: Boolean): Self = StObject.set(x, "PrintBackground", value.asInstanceOf[js.Any])
    
    inline def setPrintBackgrounds(value: Boolean): Self = StObject.set(x, "PrintBackgrounds", value.asInstanceOf[js.Any])
    
    inline def setPrintComments(value: Boolean): Self = StObject.set(x, "PrintComments", value.asInstanceOf[js.Any])
    
    inline def setPrintDraft(value: Boolean): Self = StObject.set(x, "PrintDraft", value.asInstanceOf[js.Any])
    
    inline def setPrintDrawingObjects(value: Boolean): Self = StObject.set(x, "PrintDrawingObjects", value.asInstanceOf[js.Any])
    
    inline def setPrintEvenPagesInAscendingOrder(value: Boolean): Self = StObject.set(x, "PrintEvenPagesInAscendingOrder", value.asInstanceOf[js.Any])
    
    inline def setPrintFieldCodes(value: Boolean): Self = StObject.set(x, "PrintFieldCodes", value.asInstanceOf[js.Any])
    
    inline def setPrintHiddenText(value: Boolean): Self = StObject.set(x, "PrintHiddenText", value.asInstanceOf[js.Any])
    
    inline def setPrintOddPagesInAscendingOrder(value: Boolean): Self = StObject.set(x, "PrintOddPagesInAscendingOrder", value.asInstanceOf[js.Any])
    
    inline def setPrintProperties(value: Boolean): Self = StObject.set(x, "PrintProperties", value.asInstanceOf[js.Any])
    
    inline def setPrintReverse(value: Boolean): Self = StObject.set(x, "PrintReverse", value.asInstanceOf[js.Any])
    
    inline def setPrintXMLTag(value: Boolean): Self = StObject.set(x, "PrintXMLTag", value.asInstanceOf[js.Any])
    
    inline def setPromptUpdateStyle(value: Boolean): Self = StObject.set(x, "PromptUpdateStyle", value.asInstanceOf[js.Any])
    
    inline def setRTFInClipboard(value: Boolean): Self = StObject.set(x, "RTFInClipboard", value.asInstanceOf[js.Any])
    
    inline def setRepeatWord(value: Boolean): Self = StObject.set(x, "RepeatWord", value.asInstanceOf[js.Any])
    
    inline def setReplaceSelection(value: Boolean): Self = StObject.set(x, "ReplaceSelection", value.asInstanceOf[js.Any])
    
    inline def setRevisedLinesColor(value: WdColorIndex): Self = StObject.set(x, "RevisedLinesColor", value.asInstanceOf[js.Any])
    
    inline def setRevisedLinesMark(value: WdRevisedLinesMark): Self = StObject.set(x, "RevisedLinesMark", value.asInstanceOf[js.Any])
    
    inline def setRevisedPropertiesColor(value: WdColorIndex): Self = StObject.set(x, "RevisedPropertiesColor", value.asInstanceOf[js.Any])
    
    inline def setRevisedPropertiesMark(value: WdRevisedPropertiesMark): Self = StObject.set(x, "RevisedPropertiesMark", value.asInstanceOf[js.Any])
    
    inline def setRevisionsBalloonPrintOrientation(value: WdRevisionsBalloonPrintOrientation): Self = StObject.set(x, "RevisionsBalloonPrintOrientation", value.asInstanceOf[js.Any])
    
    inline def setSaveInterval(value: Double): Self = StObject.set(x, "SaveInterval", value.asInstanceOf[js.Any])
    
    inline def setSaveNormalPrompt(value: Boolean): Self = StObject.set(x, "SaveNormalPrompt", value.asInstanceOf[js.Any])
    
    inline def setSavePropertiesPrompt(value: Boolean): Self = StObject.set(x, "SavePropertiesPrompt", value.asInstanceOf[js.Any])
    
    inline def setSendMailAttach(value: Boolean): Self = StObject.set(x, "SendMailAttach", value.asInstanceOf[js.Any])
    
    inline def setSequenceCheck(value: Boolean): Self = StObject.set(x, "SequenceCheck", value.asInstanceOf[js.Any])
    
    inline def setSetWPHelpOptions(
      value: (js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any]) => Unit
    ): Self = StObject.set(x, "SetWPHelpOptions", js.Any.fromFunction6(value))
    
    inline def setShortMenuNames(value: Boolean): Self = StObject.set(x, "ShortMenuNames", value.asInstanceOf[js.Any])
    
    inline def setShowControlCharacters(value: Boolean): Self = StObject.set(x, "ShowControlCharacters", value.asInstanceOf[js.Any])
    
    inline def setShowDevTools(value: Boolean): Self = StObject.set(x, "ShowDevTools", value.asInstanceOf[js.Any])
    
    inline def setShowDiacritics(value: Boolean): Self = StObject.set(x, "ShowDiacritics", value.asInstanceOf[js.Any])
    
    inline def setShowFormatError(value: Boolean): Self = StObject.set(x, "ShowFormatError", value.asInstanceOf[js.Any])
    
    inline def setShowMarkupOpenSave(value: Boolean): Self = StObject.set(x, "ShowMarkupOpenSave", value.asInstanceOf[js.Any])
    
    inline def setShowMenuFloaties(value: Boolean): Self = StObject.set(x, "ShowMenuFloaties", value.asInstanceOf[js.Any])
    
    inline def setShowReadabilityStatistics(value: Boolean): Self = StObject.set(x, "ShowReadabilityStatistics", value.asInstanceOf[js.Any])
    
    inline def setShowSelectionFloaties(value: Boolean): Self = StObject.set(x, "ShowSelectionFloaties", value.asInstanceOf[js.Any])
    
    inline def setSmartCursoring(value: Boolean): Self = StObject.set(x, "SmartCursoring", value.asInstanceOf[js.Any])
    
    inline def setSmartCutPaste(value: Boolean): Self = StObject.set(x, "SmartCutPaste", value.asInstanceOf[js.Any])
    
    inline def setSmartParaSelection(value: Boolean): Self = StObject.set(x, "SmartParaSelection", value.asInstanceOf[js.Any])
    
    inline def setSnapToGrid(value: Boolean): Self = StObject.set(x, "SnapToGrid", value.asInstanceOf[js.Any])
    
    inline def setSnapToShapes(value: Boolean): Self = StObject.set(x, "SnapToShapes", value.asInstanceOf[js.Any])
    
    inline def setSpanishMode(value: WdSpanishSpeller): Self = StObject.set(x, "SpanishMode", value.asInstanceOf[js.Any])
    
    inline def setSplitCellColor(value: WdCellColor): Self = StObject.set(x, "SplitCellColor", value.asInstanceOf[js.Any])
    
    inline def setStoreRSIDOnSave(value: Boolean): Self = StObject.set(x, "StoreRSIDOnSave", value.asInstanceOf[js.Any])
    
    inline def setStrictFinalYaa(value: Boolean): Self = StObject.set(x, "StrictFinalYaa", value.asInstanceOf[js.Any])
    
    inline def setStrictInitialAlefHamza(value: Boolean): Self = StObject.set(x, "StrictInitialAlefHamza", value.asInstanceOf[js.Any])
    
    inline def setStrictRussianE(value: Boolean): Self = StObject.set(x, "StrictRussianE", value.asInstanceOf[js.Any])
    
    inline def setStrictTaaMarboota(value: Boolean): Self = StObject.set(x, "StrictTaaMarboota", value.asInstanceOf[js.Any])
    
    inline def setSuggestFromMainDictionaryOnly(value: Boolean): Self = StObject.set(x, "SuggestFromMainDictionaryOnly", value.asInstanceOf[js.Any])
    
    inline def setSuggestSpellingCorrections(value: Boolean): Self = StObject.set(x, "SuggestSpellingCorrections", value.asInstanceOf[js.Any])
    
    inline def setTabIndentKey(value: Boolean): Self = StObject.set(x, "TabIndentKey", value.asInstanceOf[js.Any])
    
    inline def setTypeNReplace(value: Boolean): Self = StObject.set(x, "TypeNReplace", value.asInstanceOf[js.Any])
    
    inline def setUpdateFieldsAtPrint(value: Boolean): Self = StObject.set(x, "UpdateFieldsAtPrint", value.asInstanceOf[js.Any])
    
    inline def setUpdateFieldsWithTrackedChangesAtPrint(value: Boolean): Self = StObject.set(x, "UpdateFieldsWithTrackedChangesAtPrint", value.asInstanceOf[js.Any])
    
    inline def setUpdateLinksAtOpen(value: Boolean): Self = StObject.set(x, "UpdateLinksAtOpen", value.asInstanceOf[js.Any])
    
    inline def setUpdateLinksAtPrint(value: Boolean): Self = StObject.set(x, "UpdateLinksAtPrint", value.asInstanceOf[js.Any])
    
    inline def setUpdateStyleListBehavior(value: WdUpdateStyleListBehavior): Self = StObject.set(x, "UpdateStyleListBehavior", value.asInstanceOf[js.Any])
    
    inline def setUseCharacterUnit(value: Boolean): Self = StObject.set(x, "UseCharacterUnit", value.asInstanceOf[js.Any])
    
    inline def setUseDiffDiacColor(value: Boolean): Self = StObject.set(x, "UseDiffDiacColor", value.asInstanceOf[js.Any])
    
    inline def setUseGermanSpellingReform(value: Boolean): Self = StObject.set(x, "UseGermanSpellingReform", value.asInstanceOf[js.Any])
    
    inline def setUseNormalStyleForList(value: Boolean): Self = StObject.set(x, "UseNormalStyleForList", value.asInstanceOf[js.Any])
    
    inline def setVirusProtection(value: Boolean): Self = StObject.set(x, "VirusProtection", value.asInstanceOf[js.Any])
    
    inline def setVisualSelection(value: WdVisualSelection): Self = StObject.set(x, "VisualSelection", value.asInstanceOf[js.Any])
    
    inline def setWPDocNavKeys(value: Boolean): Self = StObject.set(x, "WPDocNavKeys", value.asInstanceOf[js.Any])
    
    inline def setWPHelp(value: Boolean): Self = StObject.set(x, "WPHelp", value.asInstanceOf[js.Any])
    
    inline def setWarnBeforeSavingPrintingSendingMarkup(value: Boolean): Self = StObject.set(x, "WarnBeforeSavingPrintingSendingMarkup", value.asInstanceOf[js.Any])
    
    inline def setWordDotOptions_typekey(value: Options): Self = StObject.set(x, "Word.Options_typekey", value.asInstanceOf[js.Any])
  }
}
