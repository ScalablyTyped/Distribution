package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.FontSlant
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexReplace
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.BreakType
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.CharacterProperties
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.CharacterPropertiesAsian
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.CharacterPropertiesComplex
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.DropCapFormat
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.GraphicLocation
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.LineSpacing
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.ParagraphAdjust
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.ParagraphProperties
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.TabStop
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.BorderLine
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.BorderLine2
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.ShadowFormat
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.UserDefinedAttributesSupplier
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a cursor in text tables.
  *
  * This cursor can be used to:
  *
  * travel through text table cellsselect text table cellsget property values from the selected cellsset property values in the selected cells
  * @see com.sun.star.text.TextTable
  */
trait TextTableCursor
  extends XTextTableCursor
     with XPropertySet
     with CharacterProperties
     with CharacterPropertiesAsian
     with CharacterPropertiesComplex
     with ParagraphProperties
     with UserDefinedAttributesSupplier

object TextTableCursor {
  @scala.inline
  def apply(
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
    ParaIsConnectBorder: Boolean,
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
    RangeName: String,
    RightBorder: BorderLine,
    RightBorderDistance: Double,
    RubyAdjust: Double,
    RubyCharStyleName: String,
    RubyIsAbove: Boolean,
    RubyText: String,
    TextUserDefinedAttributes: XNameContainer,
    TopBorder: BorderLine,
    TopBorderDistance: Double,
    UnvisitedCharStyleName: String,
    UserDefinedAttributes: XNameContainer,
    VisitedCharStyleName: String,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getRangeName: () => String,
    goDown: (Double, Boolean) => Boolean,
    goLeft: (Double, Boolean) => Boolean,
    goRight: (Double, Boolean) => Boolean,
    goUp: (Double, Boolean) => Boolean,
    gotoCellByName: (String, Boolean) => Boolean,
    gotoEnd: Boolean => Unit,
    gotoStart: Boolean => Unit,
    mergeRange: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    splitRange: (Double, Boolean) => Boolean
  ): TextTableCursor = {
    val __obj = js.Dynamic.literal(BorderDistance = BorderDistance, BottomBorder = BottomBorder, BottomBorderDistance = BottomBorderDistance, BreakType = BreakType, CharAutoKerning = CharAutoKerning, CharBackColor = CharBackColor, CharBackTransparent = CharBackTransparent, CharBorderDistance = CharBorderDistance, CharBottomBorder = CharBottomBorder, CharBottomBorderDistance = CharBottomBorderDistance, CharCaseMap = CharCaseMap, CharColor = CharColor, CharCombineIsOn = CharCombineIsOn, CharCombinePrefix = CharCombinePrefix, CharCombineSuffix = CharCombineSuffix, CharContoured = CharContoured, CharCrossedOut = CharCrossedOut, CharEmphasis = CharEmphasis, CharEscapement = CharEscapement, CharEscapementHeight = CharEscapementHeight, CharFlash = CharFlash, CharFontCharSet = CharFontCharSet, CharFontCharSetAsian = CharFontCharSetAsian, CharFontCharSetComplex = CharFontCharSetComplex, CharFontFamily = CharFontFamily, CharFontFamilyAsian = CharFontFamilyAsian, CharFontFamilyComplex = CharFontFamilyComplex, CharFontName = CharFontName, CharFontNameAsian = CharFontNameAsian, CharFontNameComplex = CharFontNameComplex, CharFontPitch = CharFontPitch, CharFontPitchAsian = CharFontPitchAsian, CharFontPitchComplex = CharFontPitchComplex, CharFontStyleName = CharFontStyleName, CharFontStyleNameAsian = CharFontStyleNameAsian, CharFontStyleNameComplex = CharFontStyleNameComplex, CharFontType = CharFontType, CharHeight = CharHeight, CharHeightAsian = CharHeightAsian, CharHeightComplex = CharHeightComplex, CharHidden = CharHidden, CharHighlight = CharHighlight, CharInteropGrabBag = CharInteropGrabBag, CharKeepTogether = CharKeepTogether, CharKerning = CharKerning, CharLeftBorder = CharLeftBorder, CharLeftBorderDistance = CharLeftBorderDistance, CharLocale = CharLocale, CharLocaleAsian = CharLocaleAsian, CharLocaleComplex = CharLocaleComplex, CharNoHyphenation = CharNoHyphenation, CharNoLineBreak = CharNoLineBreak, CharPosture = CharPosture, CharPostureAsian = CharPostureAsian, CharPostureComplex = CharPostureComplex, CharRelief = CharRelief, CharRightBorder = CharRightBorder, CharRightBorderDistance = CharRightBorderDistance, CharRotation = CharRotation, CharRotationIsFitToLine = CharRotationIsFitToLine, CharScaleWidth = CharScaleWidth, CharShadingValue = CharShadingValue, CharShadowFormat = CharShadowFormat, CharShadowed = CharShadowed, CharStrikeout = CharStrikeout, CharStyleName = CharStyleName, CharStyleNames = CharStyleNames, CharTopBorder = CharTopBorder, CharTopBorderDistance = CharTopBorderDistance, CharUnderline = CharUnderline, CharUnderlineColor = CharUnderlineColor, CharUnderlineHasColor = CharUnderlineHasColor, CharWeight = CharWeight, CharWeightAsian = CharWeightAsian, CharWeightComplex = CharWeightComplex, CharWordMode = CharWordMode, DropCapCharStyleName = DropCapCharStyleName, DropCapFormat = DropCapFormat, DropCapWholeWord = DropCapWholeWord, HyperLinkName = HyperLinkName, HyperLinkTarget = HyperLinkTarget, HyperLinkURL = HyperLinkURL, LeftBorder = LeftBorder, LeftBorderDistance = LeftBorderDistance, ListId = ListId, NumberingIsNumber = NumberingIsNumber, NumberingLevel = NumberingLevel, NumberingRules = NumberingRules, NumberingStartValue = NumberingStartValue, NumberingStyleName = NumberingStyleName, OutlineLevel = OutlineLevel, PageDescName = PageDescName, PageNumberOffset = PageNumberOffset, PageStyleName = PageStyleName, ParaAdjust = ParaAdjust, ParaBackColor = ParaBackColor, ParaBackGraphicFilter = ParaBackGraphicFilter, ParaBackGraphicLocation = ParaBackGraphicLocation, ParaBackGraphicURL = ParaBackGraphicURL, ParaBackTransparent = ParaBackTransparent, ParaBottomMargin = ParaBottomMargin, ParaContextMargin = ParaContextMargin, ParaExpandSingleWord = ParaExpandSingleWord, ParaFirstLineIndent = ParaFirstLineIndent, ParaHyphenationMaxHyphens = ParaHyphenationMaxHyphens, ParaHyphenationMaxLeadingChars = ParaHyphenationMaxLeadingChars, ParaHyphenationMaxTrailingChars = ParaHyphenationMaxTrailingChars, ParaInteropGrabBag = ParaInteropGrabBag, ParaIsAutoFirstLineIndent = ParaIsAutoFirstLineIndent, ParaIsConnectBorder = ParaIsConnectBorder, ParaIsHyphenation = ParaIsHyphenation, ParaIsNumberingRestart = ParaIsNumberingRestart, ParaKeepTogether = ParaKeepTogether, ParaLastLineAdjust = ParaLastLineAdjust, ParaLeftMargin = ParaLeftMargin, ParaLineNumberCount = ParaLineNumberCount, ParaLineNumberStartValue = ParaLineNumberStartValue, ParaLineSpacing = ParaLineSpacing, ParaOrphans = ParaOrphans, ParaRegisterModeActive = ParaRegisterModeActive, ParaRightMargin = ParaRightMargin, ParaShadowFormat = ParaShadowFormat, ParaSplit = ParaSplit, ParaStyleName = ParaStyleName, ParaTabStops = ParaTabStops, ParaTopMargin = ParaTopMargin, ParaUserDefinedAttributes = ParaUserDefinedAttributes, ParaVertAlignment = ParaVertAlignment, ParaWidows = ParaWidows, PropertySetInfo = PropertySetInfo, RangeName = RangeName, RightBorder = RightBorder, RightBorderDistance = RightBorderDistance, RubyAdjust = RubyAdjust, RubyCharStyleName = RubyCharStyleName, RubyIsAbove = RubyIsAbove, RubyText = RubyText, TextUserDefinedAttributes = TextUserDefinedAttributes, TopBorder = TopBorder, TopBorderDistance = TopBorderDistance, UnvisitedCharStyleName = UnvisitedCharStyleName, UserDefinedAttributes = UserDefinedAttributes, VisitedCharStyleName = VisitedCharStyleName, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRangeName = js.Any.fromFunction0(getRangeName), goDown = js.Any.fromFunction2(goDown), goLeft = js.Any.fromFunction2(goLeft), goRight = js.Any.fromFunction2(goRight), goUp = js.Any.fromFunction2(goUp), gotoCellByName = js.Any.fromFunction2(gotoCellByName), gotoEnd = js.Any.fromFunction1(gotoEnd), gotoStart = js.Any.fromFunction1(gotoStart), mergeRange = js.Any.fromFunction0(mergeRange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), splitRange = js.Any.fromFunction2(splitRange))
  
    __obj.asInstanceOf[TextTableCursor]
  }
}

