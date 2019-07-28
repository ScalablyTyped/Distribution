package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.FontSlant
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.GetDirectPropertyTolerantResult
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.GetPropertyTolerantResult
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyState
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.SetPropertyTolerantFailed
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XTolerantMultiPropertySet
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
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A {@link TextPortion} is a piece of text within a paragraph that does not contain changes of its attributes inside.
  *
  * It is created by an enumeration implemented in a paragraph service. It may be used to export the content of the paragraph to an external document
  * format.
  * @see com.sun.star.text.TextPortionEnumeration
  * @see com.sun.star.text.XTextPortionEnumeration
  */
trait TextPortion
  extends TextRange
     with XTolerantMultiPropertySet {
  /** contains the bookmark of a text portion of type {@link Bookmark} . */
  var Bookmark: XTextContent
  /**
    * contains the control character of a text portion of type {@link ControlCharacter} .
    * @deprecated Deprecatedtype ControlCharacter no longer implemented
    */
  var ControlCharacter: Double
  /** contains the document index mark of a text portion of type {@link DocumentIndexMark} . */
  var DocumentIndexMark: XTextContent
  /** contains the footnote of a text portion of type {@link Footnote} . */
  var Footnote: XFootnote
  /**
    * contains the text range of a text portion of type {@link InContentMetadata} .
    * @since OOo 3.2
    */
  var InContentMetadata: XTextContent
  /** contains whether the portion is a point only. */
  var IsCollapsed: Boolean
  /**
    * contains whether the portion is the start of the portion.
    *
    * This is used for portions which are represented by 2 {@link TextPortion} objects (e.g., DocmentIndexMark).
    */
  var IsStart: Boolean
  /** contains the bookmark of a text portion of type {@link ReferenceMark} . */
  var ReferenceMark: XTextContent
  /** contains the text field of a text portion of type {@link TextField} . */
  var TextField: XTextField
  /**
    * contains the type of the text portion.
    *
    * Valid content type names are:
    *
    * **Text**: string content
    *
    * **TextField**: a text field
    *
    * **TextContent**: text content - supplied via the interface {@link com.sun.star.container.XContentEnumerationAccess}
    *
    * **ControlCharacter**: a control character
    *
    * **Footnote**: a footnote or an endnote
    *
    * **ReferenceMark**: a reference mark
    *
    * **DocumentIndexMark**: a document index mark
    *
    * **Bookmark**: a bookmark
    *
    * **Redline**: a redline portion which is a result of the change tracking feature
    *
    * **Ruby**: a ruby attribute which is used in Asian text
    *
    * **Frame**: a frame
    *
    * **SoftPageBreak**: a soft page break
    *
    * **InContentMetadata**: a text range with attached metadata
    *
    *
    *
    * For Reference marks, document index marks, etc., 2 text portions will be generated, one for the start position and one for the end position.
    */
  var TextPortionType: String
}

object TextPortion {
  @scala.inline
  def apply(
    AvailableServiceNames: SafeArray[String],
    Bookmark: XTextContent,
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
    ControlCharacter: Double,
    DocumentIndexMark: XTextContent,
    DropCapCharStyleName: String,
    DropCapFormat: DropCapFormat,
    DropCapWholeWord: Boolean,
    End: XTextRange,
    Footnote: XFootnote,
    HyperLinkName: String,
    HyperLinkTarget: String,
    HyperLinkURL: String,
    InContentMetadata: XTextContent,
    IsCollapsed: Boolean,
    IsStart: Boolean,
    LeftBorder: BorderLine,
    LeftBorderDistance: Double,
    ListId: String,
    NumberingIsNumber: Boolean,
    NumberingLevel: Double,
    NumberingRules: XIndexReplace,
    NumberingStartValue: Double,
    NumberingStyleName: String,
    OutlineLevel: Double,
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
    ReferenceMark: XTextContent,
    RightBorder: BorderLine,
    RightBorderDistance: Double,
    RubyAdjust: Double,
    RubyCharStyleName: String,
    RubyIsAbove: Boolean,
    RubyText: String,
    Start: XTextRange,
    String: String,
    TextField: XTextField,
    TextPortionType: String,
    TextUserDefinedAttributes: XNameContainer,
    TopBorder: BorderLine,
    TopBorderDistance: Double,
    UnvisitedCharStyleName: String,
    VisitedCharStyleName: String,
    WritingMode: Double,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createContentEnumeration: String => XEnumeration,
    getAvailableServiceNames: () => SafeArray[String],
    getDirectPropertyValuesTolerant: SeqEquiv[String] => SafeArray[GetDirectPropertyTolerantResult],
    getEnd: () => XTextRange,
    getPropertyDefault: String => js.Any,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyState: String => PropertyState,
    getPropertyStates: SeqEquiv[String] => SafeArray[PropertyState],
    getPropertyValue: String => js.Any,
    getPropertyValuesTolerant: SeqEquiv[String] => SafeArray[GetPropertyTolerantResult],
    getStart: () => XTextRange,
    getString: () => String,
    getText: () => XText,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyToDefault: String => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setPropertyValuesTolerant: (SeqEquiv[String], SeqEquiv[_]) => SafeArray[SetPropertyTolerantFailed],
    setString: String => Unit
  ): TextPortion = {
    val __obj = js.Dynamic.literal(AvailableServiceNames = AvailableServiceNames, Bookmark = Bookmark, BorderDistance = BorderDistance, BottomBorder = BottomBorder, BottomBorderDistance = BottomBorderDistance, BreakType = BreakType, CharAutoKerning = CharAutoKerning, CharBackColor = CharBackColor, CharBackTransparent = CharBackTransparent, CharBorderDistance = CharBorderDistance, CharBottomBorder = CharBottomBorder, CharBottomBorderDistance = CharBottomBorderDistance, CharCaseMap = CharCaseMap, CharColor = CharColor, CharCombineIsOn = CharCombineIsOn, CharCombinePrefix = CharCombinePrefix, CharCombineSuffix = CharCombineSuffix, CharContoured = CharContoured, CharCrossedOut = CharCrossedOut, CharEmphasis = CharEmphasis, CharEscapement = CharEscapement, CharEscapementHeight = CharEscapementHeight, CharFlash = CharFlash, CharFontCharSet = CharFontCharSet, CharFontCharSetAsian = CharFontCharSetAsian, CharFontCharSetComplex = CharFontCharSetComplex, CharFontFamily = CharFontFamily, CharFontFamilyAsian = CharFontFamilyAsian, CharFontFamilyComplex = CharFontFamilyComplex, CharFontName = CharFontName, CharFontNameAsian = CharFontNameAsian, CharFontNameComplex = CharFontNameComplex, CharFontPitch = CharFontPitch, CharFontPitchAsian = CharFontPitchAsian, CharFontPitchComplex = CharFontPitchComplex, CharFontStyleName = CharFontStyleName, CharFontStyleNameAsian = CharFontStyleNameAsian, CharFontStyleNameComplex = CharFontStyleNameComplex, CharFontType = CharFontType, CharHeight = CharHeight, CharHeightAsian = CharHeightAsian, CharHeightComplex = CharHeightComplex, CharHidden = CharHidden, CharHighlight = CharHighlight, CharInteropGrabBag = CharInteropGrabBag, CharKeepTogether = CharKeepTogether, CharKerning = CharKerning, CharLeftBorder = CharLeftBorder, CharLeftBorderDistance = CharLeftBorderDistance, CharLocale = CharLocale, CharLocaleAsian = CharLocaleAsian, CharLocaleComplex = CharLocaleComplex, CharNoHyphenation = CharNoHyphenation, CharNoLineBreak = CharNoLineBreak, CharPosture = CharPosture, CharPostureAsian = CharPostureAsian, CharPostureComplex = CharPostureComplex, CharRelief = CharRelief, CharRightBorder = CharRightBorder, CharRightBorderDistance = CharRightBorderDistance, CharRotation = CharRotation, CharRotationIsFitToLine = CharRotationIsFitToLine, CharScaleWidth = CharScaleWidth, CharShadingValue = CharShadingValue, CharShadowFormat = CharShadowFormat, CharShadowed = CharShadowed, CharStrikeout = CharStrikeout, CharStyleName = CharStyleName, CharStyleNames = CharStyleNames, CharTopBorder = CharTopBorder, CharTopBorderDistance = CharTopBorderDistance, CharUnderline = CharUnderline, CharUnderlineColor = CharUnderlineColor, CharUnderlineHasColor = CharUnderlineHasColor, CharWeight = CharWeight, CharWeightAsian = CharWeightAsian, CharWeightComplex = CharWeightComplex, CharWordMode = CharWordMode, ControlCharacter = ControlCharacter, DocumentIndexMark = DocumentIndexMark, DropCapCharStyleName = DropCapCharStyleName, DropCapFormat = DropCapFormat, DropCapWholeWord = DropCapWholeWord, End = End, Footnote = Footnote, HyperLinkName = HyperLinkName, HyperLinkTarget = HyperLinkTarget, HyperLinkURL = HyperLinkURL, InContentMetadata = InContentMetadata, IsCollapsed = IsCollapsed, IsStart = IsStart, LeftBorder = LeftBorder, LeftBorderDistance = LeftBorderDistance, ListId = ListId, NumberingIsNumber = NumberingIsNumber, NumberingLevel = NumberingLevel, NumberingRules = NumberingRules, NumberingStartValue = NumberingStartValue, NumberingStyleName = NumberingStyleName, OutlineLevel = OutlineLevel, PageDescName = PageDescName, PageNumberOffset = PageNumberOffset, PageStyleName = PageStyleName, ParaAdjust = ParaAdjust, ParaBackColor = ParaBackColor, ParaBackGraphicFilter = ParaBackGraphicFilter, ParaBackGraphicLocation = ParaBackGraphicLocation, ParaBackGraphicURL = ParaBackGraphicURL, ParaBackTransparent = ParaBackTransparent, ParaBottomMargin = ParaBottomMargin, ParaContextMargin = ParaContextMargin, ParaExpandSingleWord = ParaExpandSingleWord, ParaFirstLineIndent = ParaFirstLineIndent, ParaHyphenationMaxHyphens = ParaHyphenationMaxHyphens, ParaHyphenationMaxLeadingChars = ParaHyphenationMaxLeadingChars, ParaHyphenationMaxTrailingChars = ParaHyphenationMaxTrailingChars, ParaInteropGrabBag = ParaInteropGrabBag, ParaIsAutoFirstLineIndent = ParaIsAutoFirstLineIndent, ParaIsCharacterDistance = ParaIsCharacterDistance, ParaIsConnectBorder = ParaIsConnectBorder, ParaIsForbiddenRules = ParaIsForbiddenRules, ParaIsHangingPunctuation = ParaIsHangingPunctuation, ParaIsHyphenation = ParaIsHyphenation, ParaIsNumberingRestart = ParaIsNumberingRestart, ParaKeepTogether = ParaKeepTogether, ParaLastLineAdjust = ParaLastLineAdjust, ParaLeftMargin = ParaLeftMargin, ParaLineNumberCount = ParaLineNumberCount, ParaLineNumberStartValue = ParaLineNumberStartValue, ParaLineSpacing = ParaLineSpacing, ParaOrphans = ParaOrphans, ParaRegisterModeActive = ParaRegisterModeActive, ParaRightMargin = ParaRightMargin, ParaShadowFormat = ParaShadowFormat, ParaSplit = ParaSplit, ParaStyleName = ParaStyleName, ParaTabStops = ParaTabStops, ParaTopMargin = ParaTopMargin, ParaUserDefinedAttributes = ParaUserDefinedAttributes, ParaVertAlignment = ParaVertAlignment, ParaWidows = ParaWidows, PropertySetInfo = PropertySetInfo, ReferenceMark = ReferenceMark, RightBorder = RightBorder, RightBorderDistance = RightBorderDistance, RubyAdjust = RubyAdjust, RubyCharStyleName = RubyCharStyleName, RubyIsAbove = RubyIsAbove, RubyText = RubyText, Start = Start, String = String, TextField = TextField, TextPortionType = TextPortionType, TextUserDefinedAttributes = TextUserDefinedAttributes, TopBorder = TopBorder, TopBorderDistance = TopBorderDistance, UnvisitedCharStyleName = UnvisitedCharStyleName, VisitedCharStyleName = VisitedCharStyleName, WritingMode = WritingMode, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createContentEnumeration = js.Any.fromFunction1(createContentEnumeration), getAvailableServiceNames = js.Any.fromFunction0(getAvailableServiceNames), getDirectPropertyValuesTolerant = js.Any.fromFunction1(getDirectPropertyValuesTolerant), getEnd = js.Any.fromFunction0(getEnd), getPropertyDefault = js.Any.fromFunction1(getPropertyDefault), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyState = js.Any.fromFunction1(getPropertyState), getPropertyStates = js.Any.fromFunction1(getPropertyStates), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValuesTolerant = js.Any.fromFunction1(getPropertyValuesTolerant), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyToDefault = js.Any.fromFunction1(setPropertyToDefault), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValuesTolerant = js.Any.fromFunction2(setPropertyValuesTolerant), setString = js.Any.fromFunction1(setString))
  
    __obj.asInstanceOf[TextPortion]
  }
}

