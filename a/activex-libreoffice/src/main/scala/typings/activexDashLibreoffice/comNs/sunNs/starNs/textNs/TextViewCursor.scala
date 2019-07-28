package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.FontSlant
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyState
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumeration
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexReplace
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.BreakType
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.DropCapFormat
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.GraphicLocation
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.LineSpacing
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.ParagraphAdjust
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.TabStop
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.BorderLine
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.BorderLine2
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.ShadowFormat
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import typings.activexDashLibreoffice.comNs.sunNs.starNs.viewNs.XScreenCursor
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A {@link TextViewCursor} is a {@link TextRange} which can travel within a view of a {@link Text} object.
  * @see TextDocumentView
  */
trait TextViewCursor
  extends TextLayoutCursor
     with XScreenCursor {
  /**
    * @param aPropertyName contains the sequence of property names.
    * @returns a sequence of the states of the properties which are specified by their names.  The order of the states is correlating to the order of the given
    * @throws UnknownPropertyException if one property does not exist.
    */
  /* InferMemberOverrides */
  override def getPropertyStates(aPropertyName: SeqEquiv[String]): SafeArray[PropertyState]
}

object TextViewCursor {
  @scala.inline
  def apply(
    AvailableServiceNames: SafeArray[String],
    BorderDistance: Double,
    BottomBorder: BorderLine,
    BottomBorderDistance: Double,
    BreakType: BreakType,
    CharAutoKerning: Boolean,
    CharBackColor: Color,
    CharBackTransparent: Boolean,
    CharBorderDistance: Double,
    CharBottomBorder: BorderLine2,
    CharBottomBorderDistance: Double,
    CharCaseMap: Double,
    CharColor: Color,
    CharCombineIsOn: Boolean,
    CharCombinePrefix: String,
    CharCombineSuffix: String,
    CharContoured: Boolean,
    CharCrossedOut: Boolean,
    CharEmphasis: Double,
    CharEscapement: Double,
    CharEscapementHeight: Double,
    CharFlash: Boolean,
    CharFontCharSet: Double,
    CharFontCharSetAsian: Double,
    CharFontCharSetComplex: Double,
    CharFontFamily: Double,
    CharFontFamilyAsian: Double,
    CharFontFamilyComplex: Double,
    CharFontName: String,
    CharFontNameAsian: String,
    CharFontNameComplex: String,
    CharFontPitch: Double,
    CharFontPitchAsian: Double,
    CharFontPitchComplex: Double,
    CharFontStyleName: String,
    CharFontStyleNameAsian: String,
    CharFontStyleNameComplex: String,
    CharFontType: Double,
    CharHeight: Double,
    CharHeightAsian: Double,
    CharHeightComplex: Double,
    CharHidden: Boolean,
    CharHighlight: Color,
    CharInteropGrabBag: SafeArray[PropertyValue],
    CharKeepTogether: Boolean,
    CharKerning: Double,
    CharLeftBorder: BorderLine2,
    CharLeftBorderDistance: Double,
    CharLocale: Locale,
    CharLocaleAsian: Locale,
    CharLocaleComplex: Locale,
    CharNoHyphenation: Boolean,
    CharNoLineBreak: Boolean,
    CharPosture: FontSlant,
    CharPostureAsian: FontSlant,
    CharPostureComplex: FontSlant,
    CharRelief: Double,
    CharRightBorder: BorderLine2,
    CharRightBorderDistance: Double,
    CharRotation: Double,
    CharRotationIsFitToLine: Boolean,
    CharScaleWidth: Double,
    CharShadingValue: Double,
    CharShadowFormat: ShadowFormat,
    CharShadowed: Boolean,
    CharStrikeout: Double,
    CharStyleName: String,
    CharStyleNames: SafeArray[String],
    CharTopBorder: BorderLine2,
    CharTopBorderDistance: Double,
    CharUnderline: Double,
    CharUnderlineColor: Color,
    CharUnderlineHasColor: Boolean,
    CharWeight: Double,
    CharWeightAsian: Double,
    CharWeightComplex: Double,
    CharWordMode: Boolean,
    DropCapCharStyleName: String,
    DropCapFormat: DropCapFormat,
    DropCapWholeWord: Boolean,
    End: XTextRange,
    HyperLinkName: String,
    HyperLinkTarget: String,
    HyperLinkURL: String,
    LeftBorder: BorderLine,
    LeftBorderDistance: Double,
    ListId: String,
    NumberingIsNumber: Boolean,
    NumberingLevel: Double,
    NumberingRules: XIndexReplace,
    NumberingStartValue: Double,
    NumberingStyleName: String,
    OutlineLevel: Double,
    Page: Double,
    PageDescName: String,
    PageNumberOffset: Double,
    PageStyleName: String,
    ParaAdjust: ParagraphAdjust,
    ParaBackColor: Color,
    ParaBackGraphicFilter: String,
    ParaBackGraphicLocation: GraphicLocation,
    ParaBackGraphicURL: String,
    ParaBackTransparent: Boolean,
    ParaBottomMargin: Double,
    ParaContextMargin: Boolean,
    ParaExpandSingleWord: Boolean,
    ParaFirstLineIndent: Double,
    ParaHyphenationMaxHyphens: Double,
    ParaHyphenationMaxLeadingChars: Double,
    ParaHyphenationMaxTrailingChars: Double,
    ParaInteropGrabBag: SafeArray[PropertyValue],
    ParaIsAutoFirstLineIndent: Boolean,
    ParaIsCharacterDistance: Boolean,
    ParaIsConnectBorder: Boolean,
    ParaIsForbiddenRules: Boolean,
    ParaIsHangingPunctuation: Boolean,
    ParaIsHyphenation: Boolean,
    ParaIsNumberingRestart: Boolean,
    ParaKeepTogether: Boolean,
    ParaLastLineAdjust: Double,
    ParaLeftMargin: Double,
    ParaLineNumberCount: Boolean,
    ParaLineNumberStartValue: Double,
    ParaLineSpacing: LineSpacing,
    ParaOrphans: Double,
    ParaRegisterModeActive: Boolean,
    ParaRightMargin: Double,
    ParaShadowFormat: ShadowFormat,
    ParaSplit: Boolean,
    ParaStyleName: String,
    ParaTabStops: SafeArray[TabStop],
    ParaTopMargin: Double,
    ParaUserDefinedAttributes: XNameContainer,
    ParaVertAlignment: Double,
    ParaWidows: Double,
    PropertySetInfo: XPropertySetInfo,
    RightBorder: BorderLine,
    RightBorderDistance: Double,
    RubyAdjust: Double,
    RubyCharStyleName: String,
    RubyIsAbove: Boolean,
    RubyText: String,
    Start: XTextRange,
    String: String,
    TextUserDefinedAttributes: XNameContainer,
    TopBorder: BorderLine,
    TopBorderDistance: Double,
    UnvisitedCharStyleName: String,
    VisitedCharStyleName: String,
    WritingMode: Double,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    collapseToEnd: () => Unit,
    collapseToStart: () => Unit,
    createContentEnumeration: String => XEnumeration,
    createSortDescriptor: () => SafeArray[PropertyValue],
    getAvailableServiceNames: () => SafeArray[String],
    getEnd: () => XTextRange,
    getPage: () => Double,
    getPropertyDefault: String => js.Any,
    getPropertyDefaults: SeqEquiv[String] => SafeArray[_],
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyState: String => PropertyState,
    getPropertyStates: SeqEquiv[String] => SafeArray[PropertyState],
    getPropertyValue: String => js.Any,
    getStart: () => XTextRange,
    getString: () => String,
    getText: () => XText,
    goLeft: (Double, Boolean) => Boolean,
    goRight: (Double, Boolean) => Boolean,
    gotoEnd: Boolean => Unit,
    gotoEndOfParagraph: Boolean => Boolean,
    gotoEndOfSentence: Boolean => Boolean,
    gotoEndOfWord: Boolean => Boolean,
    gotoNextParagraph: Boolean => Boolean,
    gotoNextSentence: Boolean => Boolean,
    gotoNextWord: Boolean => Boolean,
    gotoPreviousParagraph: Boolean => Boolean,
    gotoPreviousSentence: Boolean => Boolean,
    gotoPreviousWord: Boolean => Boolean,
    gotoRange: (XTextRange, Boolean) => Unit,
    gotoStart: Boolean => Unit,
    gotoStartOfParagraph: Boolean => Boolean,
    gotoStartOfSentence: Boolean => Boolean,
    gotoStartOfWord: Boolean => Boolean,
    insertDocumentFromURL: (String, SeqEquiv[PropertyValue]) => Unit,
    isCollapsed: () => Boolean,
    isEndOfParagraph: () => Boolean,
    isEndOfSentence: () => Boolean,
    isEndOfWord: () => Boolean,
    isStartOfParagraph: () => Boolean,
    isStartOfSentence: () => Boolean,
    isStartOfWord: () => Boolean,
    jumpToEndOfPage: () => Boolean,
    jumpToFirstPage: () => Boolean,
    jumpToLastPage: () => Boolean,
    jumpToNextPage: () => Boolean,
    jumpToPage: Double => Boolean,
    jumpToPreviousPage: () => Boolean,
    jumpToStartOfPage: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    screenDown: () => Boolean,
    screenUp: () => Boolean,
    setAllPropertiesToDefault: () => Unit,
    setPropertiesToDefault: SeqEquiv[String] => Unit,
    setPropertyToDefault: String => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setString: String => Unit,
    sort: SeqEquiv[PropertyValue] => Unit
  ): TextViewCursor = {
    val __obj = js.Dynamic.literal(AvailableServiceNames = AvailableServiceNames, BorderDistance = BorderDistance, BottomBorder = BottomBorder, BottomBorderDistance = BottomBorderDistance, BreakType = BreakType, CharAutoKerning = CharAutoKerning, CharBackColor = CharBackColor, CharBackTransparent = CharBackTransparent, CharBorderDistance = CharBorderDistance, CharBottomBorder = CharBottomBorder, CharBottomBorderDistance = CharBottomBorderDistance, CharCaseMap = CharCaseMap, CharColor = CharColor, CharCombineIsOn = CharCombineIsOn, CharCombinePrefix = CharCombinePrefix, CharCombineSuffix = CharCombineSuffix, CharContoured = CharContoured, CharCrossedOut = CharCrossedOut, CharEmphasis = CharEmphasis, CharEscapement = CharEscapement, CharEscapementHeight = CharEscapementHeight, CharFlash = CharFlash, CharFontCharSet = CharFontCharSet, CharFontCharSetAsian = CharFontCharSetAsian, CharFontCharSetComplex = CharFontCharSetComplex, CharFontFamily = CharFontFamily, CharFontFamilyAsian = CharFontFamilyAsian, CharFontFamilyComplex = CharFontFamilyComplex, CharFontName = CharFontName, CharFontNameAsian = CharFontNameAsian, CharFontNameComplex = CharFontNameComplex, CharFontPitch = CharFontPitch, CharFontPitchAsian = CharFontPitchAsian, CharFontPitchComplex = CharFontPitchComplex, CharFontStyleName = CharFontStyleName, CharFontStyleNameAsian = CharFontStyleNameAsian, CharFontStyleNameComplex = CharFontStyleNameComplex, CharFontType = CharFontType, CharHeight = CharHeight, CharHeightAsian = CharHeightAsian, CharHeightComplex = CharHeightComplex, CharHidden = CharHidden, CharHighlight = CharHighlight, CharInteropGrabBag = CharInteropGrabBag, CharKeepTogether = CharKeepTogether, CharKerning = CharKerning, CharLeftBorder = CharLeftBorder, CharLeftBorderDistance = CharLeftBorderDistance, CharLocale = CharLocale, CharLocaleAsian = CharLocaleAsian, CharLocaleComplex = CharLocaleComplex, CharNoHyphenation = CharNoHyphenation, CharNoLineBreak = CharNoLineBreak, CharPosture = CharPosture, CharPostureAsian = CharPostureAsian, CharPostureComplex = CharPostureComplex, CharRelief = CharRelief, CharRightBorder = CharRightBorder, CharRightBorderDistance = CharRightBorderDistance, CharRotation = CharRotation, CharRotationIsFitToLine = CharRotationIsFitToLine, CharScaleWidth = CharScaleWidth, CharShadingValue = CharShadingValue, CharShadowFormat = CharShadowFormat, CharShadowed = CharShadowed, CharStrikeout = CharStrikeout, CharStyleName = CharStyleName, CharStyleNames = CharStyleNames, CharTopBorder = CharTopBorder, CharTopBorderDistance = CharTopBorderDistance, CharUnderline = CharUnderline, CharUnderlineColor = CharUnderlineColor, CharUnderlineHasColor = CharUnderlineHasColor, CharWeight = CharWeight, CharWeightAsian = CharWeightAsian, CharWeightComplex = CharWeightComplex, CharWordMode = CharWordMode, DropCapCharStyleName = DropCapCharStyleName, DropCapFormat = DropCapFormat, DropCapWholeWord = DropCapWholeWord, End = End, HyperLinkName = HyperLinkName, HyperLinkTarget = HyperLinkTarget, HyperLinkURL = HyperLinkURL, LeftBorder = LeftBorder, LeftBorderDistance = LeftBorderDistance, ListId = ListId, NumberingIsNumber = NumberingIsNumber, NumberingLevel = NumberingLevel, NumberingRules = NumberingRules, NumberingStartValue = NumberingStartValue, NumberingStyleName = NumberingStyleName, OutlineLevel = OutlineLevel, Page = Page, PageDescName = PageDescName, PageNumberOffset = PageNumberOffset, PageStyleName = PageStyleName, ParaAdjust = ParaAdjust, ParaBackColor = ParaBackColor, ParaBackGraphicFilter = ParaBackGraphicFilter, ParaBackGraphicLocation = ParaBackGraphicLocation, ParaBackGraphicURL = ParaBackGraphicURL, ParaBackTransparent = ParaBackTransparent, ParaBottomMargin = ParaBottomMargin, ParaContextMargin = ParaContextMargin, ParaExpandSingleWord = ParaExpandSingleWord, ParaFirstLineIndent = ParaFirstLineIndent, ParaHyphenationMaxHyphens = ParaHyphenationMaxHyphens, ParaHyphenationMaxLeadingChars = ParaHyphenationMaxLeadingChars, ParaHyphenationMaxTrailingChars = ParaHyphenationMaxTrailingChars, ParaInteropGrabBag = ParaInteropGrabBag, ParaIsAutoFirstLineIndent = ParaIsAutoFirstLineIndent, ParaIsCharacterDistance = ParaIsCharacterDistance, ParaIsConnectBorder = ParaIsConnectBorder, ParaIsForbiddenRules = ParaIsForbiddenRules, ParaIsHangingPunctuation = ParaIsHangingPunctuation, ParaIsHyphenation = ParaIsHyphenation, ParaIsNumberingRestart = ParaIsNumberingRestart, ParaKeepTogether = ParaKeepTogether, ParaLastLineAdjust = ParaLastLineAdjust, ParaLeftMargin = ParaLeftMargin, ParaLineNumberCount = ParaLineNumberCount, ParaLineNumberStartValue = ParaLineNumberStartValue, ParaLineSpacing = ParaLineSpacing, ParaOrphans = ParaOrphans, ParaRegisterModeActive = ParaRegisterModeActive, ParaRightMargin = ParaRightMargin, ParaShadowFormat = ParaShadowFormat, ParaSplit = ParaSplit, ParaStyleName = ParaStyleName, ParaTabStops = ParaTabStops, ParaTopMargin = ParaTopMargin, ParaUserDefinedAttributes = ParaUserDefinedAttributes, ParaVertAlignment = ParaVertAlignment, ParaWidows = ParaWidows, PropertySetInfo = PropertySetInfo, RightBorder = RightBorder, RightBorderDistance = RightBorderDistance, RubyAdjust = RubyAdjust, RubyCharStyleName = RubyCharStyleName, RubyIsAbove = RubyIsAbove, RubyText = RubyText, Start = Start, String = String, TextUserDefinedAttributes = TextUserDefinedAttributes, TopBorder = TopBorder, TopBorderDistance = TopBorderDistance, UnvisitedCharStyleName = UnvisitedCharStyleName, VisitedCharStyleName = VisitedCharStyleName, WritingMode = WritingMode, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), collapseToEnd = js.Any.fromFunction0(collapseToEnd), collapseToStart = js.Any.fromFunction0(collapseToStart), createContentEnumeration = js.Any.fromFunction1(createContentEnumeration), createSortDescriptor = js.Any.fromFunction0(createSortDescriptor), getAvailableServiceNames = js.Any.fromFunction0(getAvailableServiceNames), getEnd = js.Any.fromFunction0(getEnd), getPage = js.Any.fromFunction0(getPage), getPropertyDefault = js.Any.fromFunction1(getPropertyDefault), getPropertyDefaults = js.Any.fromFunction1(getPropertyDefaults), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyState = js.Any.fromFunction1(getPropertyState), getPropertyStates = js.Any.fromFunction1(getPropertyStates), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), goLeft = js.Any.fromFunction2(goLeft), goRight = js.Any.fromFunction2(goRight), gotoEnd = js.Any.fromFunction1(gotoEnd), gotoEndOfParagraph = js.Any.fromFunction1(gotoEndOfParagraph), gotoEndOfSentence = js.Any.fromFunction1(gotoEndOfSentence), gotoEndOfWord = js.Any.fromFunction1(gotoEndOfWord), gotoNextParagraph = js.Any.fromFunction1(gotoNextParagraph), gotoNextSentence = js.Any.fromFunction1(gotoNextSentence), gotoNextWord = js.Any.fromFunction1(gotoNextWord), gotoPreviousParagraph = js.Any.fromFunction1(gotoPreviousParagraph), gotoPreviousSentence = js.Any.fromFunction1(gotoPreviousSentence), gotoPreviousWord = js.Any.fromFunction1(gotoPreviousWord), gotoRange = js.Any.fromFunction2(gotoRange), gotoStart = js.Any.fromFunction1(gotoStart), gotoStartOfParagraph = js.Any.fromFunction1(gotoStartOfParagraph), gotoStartOfSentence = js.Any.fromFunction1(gotoStartOfSentence), gotoStartOfWord = js.Any.fromFunction1(gotoStartOfWord), insertDocumentFromURL = js.Any.fromFunction2(insertDocumentFromURL), isCollapsed = js.Any.fromFunction0(isCollapsed), isEndOfParagraph = js.Any.fromFunction0(isEndOfParagraph), isEndOfSentence = js.Any.fromFunction0(isEndOfSentence), isEndOfWord = js.Any.fromFunction0(isEndOfWord), isStartOfParagraph = js.Any.fromFunction0(isStartOfParagraph), isStartOfSentence = js.Any.fromFunction0(isStartOfSentence), isStartOfWord = js.Any.fromFunction0(isStartOfWord), jumpToEndOfPage = js.Any.fromFunction0(jumpToEndOfPage), jumpToFirstPage = js.Any.fromFunction0(jumpToFirstPage), jumpToLastPage = js.Any.fromFunction0(jumpToLastPage), jumpToNextPage = js.Any.fromFunction0(jumpToNextPage), jumpToPage = js.Any.fromFunction1(jumpToPage), jumpToPreviousPage = js.Any.fromFunction0(jumpToPreviousPage), jumpToStartOfPage = js.Any.fromFunction0(jumpToStartOfPage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), screenDown = js.Any.fromFunction0(screenDown), screenUp = js.Any.fromFunction0(screenUp), setAllPropertiesToDefault = js.Any.fromFunction0(setAllPropertiesToDefault), setPropertiesToDefault = js.Any.fromFunction1(setPropertiesToDefault), setPropertyToDefault = js.Any.fromFunction1(setPropertyToDefault), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setString = js.Any.fromFunction1(setString), sort = js.Any.fromFunction1(sort))
  
    __obj.asInstanceOf[TextViewCursor]
  }
}

