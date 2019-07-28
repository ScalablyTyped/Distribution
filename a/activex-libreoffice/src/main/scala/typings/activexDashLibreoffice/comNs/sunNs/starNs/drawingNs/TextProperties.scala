package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.FontSlant
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
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
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.ParagraphPropertiesAsian
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.ParagraphPropertiesComplex
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.TabStop
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.BorderLine
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.BorderLine2
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.ShadowFormat
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.WritingMode
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This is a set of properties to describe the style for rendering the text area inside a shape. */
trait TextProperties
  extends CharacterProperties
     with CharacterPropertiesAsian
     with CharacterPropertiesComplex
     with ParagraphProperties
     with ParagraphPropertiesAsian
     with ParagraphPropertiesComplex {
  /** If this is `TRUE` , numbering is ON for the text of this {@link Shape} . */
  var IsNumbering: Boolean
  /** This is the number of pixels the text is moved in each animation step. */
  var TextAnimationAmount: Double
  /**
    * This number defines how many times the text animation is repeated.
    *
    * If this is set to zero, the repeat is endless.
    */
  var TextAnimationCount: Double
  /** This is the delay in thousandths of a second between each of the animation steps. */
  var TextAnimationDelay: Double
  /** This enumeration defines the direction in which the text moves. */
  var TextAnimationDirection: typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.TextAnimationDirection
  /** This value defines the type of animation. */
  var TextAnimationKind: typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.TextAnimationKind
  /** If this value is `TRUE` , the text is visible at the start of the animation. */
  var TextAnimationStartInside: Boolean
  /** If this value is `TRUE` , the text is visible at the end of the animation. */
  var TextAnimationStopInside: Boolean
  /** If this value is `TRUE` , the height of the {@link Shape} is automatically expanded/shrunk when text is added to or removed from the {@link Shape} . */
  var TextAutoGrowHeight: Boolean
  /** If this value is `TRUE` , the width of the {@link Shape} is automatically expanded/shrunk when text is added to or removed from the {@link Shape} . */
  var TextAutoGrowWidth: Boolean
  /** If this value is `TRUE` , the left edge of every line of text is aligned with the left edge of this {@link Shape} . */
  var TextContourFrame: Boolean
  /** With this set to `TRUE` , the text inside of the {@link Shape} is stretched to fit into the {@link Shape} . */
  var TextFitToSize: TextFitToSizeType
  /** adjusts the horizontal position of the text inside of the {@link Shape} . */
  var TextHorizontalAdjust: typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.TextHorizontalAdjust
  /**
    * This is the distance from the left edge of the {@link Shape} to the left edge of the text.
    *
    * This is only useful if {@link Text.TextHorizontalAdjust} is BLOCK or STRETCH or if Text::TextFitSize is `TRUE` .
    */
  var TextLeftDistance: Double
  /**
    * This is the distance from the lower edge of the {@link Shape} to the lower edge of the text.
    *
    * This is only useful if {@link Text.TextVerticalAdjust} is BLOCK or if Text::TextFitSize is `TRUE` .
    */
  var TextLowerDistance: Double
  /**
    * with this property you can set the maximum height for a shape with text. On edit, the auto grow feature will not grow the object higher than the value
    * of this property.
    */
  var TextMaximumFrameHeight: Double
  /**
    * with this property you can set the maximum width for a shape with text. On edit, the auto grow feature will not grow the objects wider than the value
    * of this property.
    */
  var TextMaximumFrameWidth: Double
  /**
    * with this property you can set the minimum height for a shape with text. On edit, the auto grow feature will not shrink the objects height smaller
    * than the value of this property.
    */
  var TextMinimumFrameHeight: Double
  /**
    * with this property you can set the minimum width for a shape with text. On edit, the auto grow feature will not shrink the object width smaller than
    * the value of this property.
    */
  var TextMinimumFrameWidth: Double
  /**
    * This is the distance from the right edge of the {@link Shape} to the right edge of the text.
    *
    * This is only useful if {@link Text.TextHorizontalAdjust} is BLOCK or STRETCH or if Text::TextFitSize is `TRUE` .
    */
  var TextRightDistance: Double
  /**
    * This is the distance from the upper edge of the {@link Shape} to the upper edge of the text.
    *
    * This is only useful if {@link Text.TextVerticalAdjust} is BLOCK or if Text::TextFitSize is `TRUE` .
    */
  var TextUpperDistance: Double
  /** adjusts the vertical position of the text inside of the {@link Shape} . */
  var TextVerticalAdjust: typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.TextVerticalAdjust
  /** This value selects the writing mode for the text. */
  var TextWritingMode: WritingMode
}

object TextProperties {
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
    IsNumbering: Boolean,
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
    RightBorder: BorderLine,
    RightBorderDistance: Double,
    RubyAdjust: Double,
    RubyCharStyleName: String,
    RubyIsAbove: Boolean,
    RubyText: String,
    TextAnimationAmount: Double,
    TextAnimationCount: Double,
    TextAnimationDelay: Double,
    TextAnimationDirection: TextAnimationDirection,
    TextAnimationKind: TextAnimationKind,
    TextAnimationStartInside: Boolean,
    TextAnimationStopInside: Boolean,
    TextAutoGrowHeight: Boolean,
    TextAutoGrowWidth: Boolean,
    TextContourFrame: Boolean,
    TextFitToSize: TextFitToSizeType,
    TextHorizontalAdjust: TextHorizontalAdjust,
    TextLeftDistance: Double,
    TextLowerDistance: Double,
    TextMaximumFrameHeight: Double,
    TextMaximumFrameWidth: Double,
    TextMinimumFrameHeight: Double,
    TextMinimumFrameWidth: Double,
    TextRightDistance: Double,
    TextUpperDistance: Double,
    TextUserDefinedAttributes: XNameContainer,
    TextVerticalAdjust: TextVerticalAdjust,
    TextWritingMode: WritingMode,
    TopBorder: BorderLine,
    TopBorderDistance: Double,
    UnvisitedCharStyleName: String,
    VisitedCharStyleName: String,
    WritingMode: Double
  ): TextProperties = {
    val __obj = js.Dynamic.literal(BorderDistance = BorderDistance, BottomBorder = BottomBorder, BottomBorderDistance = BottomBorderDistance, BreakType = BreakType, CharAutoKerning = CharAutoKerning, CharBackColor = CharBackColor, CharBackTransparent = CharBackTransparent, CharBorderDistance = CharBorderDistance, CharBottomBorder = CharBottomBorder, CharBottomBorderDistance = CharBottomBorderDistance, CharCaseMap = CharCaseMap, CharColor = CharColor, CharCombineIsOn = CharCombineIsOn, CharCombinePrefix = CharCombinePrefix, CharCombineSuffix = CharCombineSuffix, CharContoured = CharContoured, CharCrossedOut = CharCrossedOut, CharEmphasis = CharEmphasis, CharEscapement = CharEscapement, CharEscapementHeight = CharEscapementHeight, CharFlash = CharFlash, CharFontCharSet = CharFontCharSet, CharFontCharSetAsian = CharFontCharSetAsian, CharFontCharSetComplex = CharFontCharSetComplex, CharFontFamily = CharFontFamily, CharFontFamilyAsian = CharFontFamilyAsian, CharFontFamilyComplex = CharFontFamilyComplex, CharFontName = CharFontName, CharFontNameAsian = CharFontNameAsian, CharFontNameComplex = CharFontNameComplex, CharFontPitch = CharFontPitch, CharFontPitchAsian = CharFontPitchAsian, CharFontPitchComplex = CharFontPitchComplex, CharFontStyleName = CharFontStyleName, CharFontStyleNameAsian = CharFontStyleNameAsian, CharFontStyleNameComplex = CharFontStyleNameComplex, CharFontType = CharFontType, CharHeight = CharHeight, CharHeightAsian = CharHeightAsian, CharHeightComplex = CharHeightComplex, CharHidden = CharHidden, CharHighlight = CharHighlight, CharInteropGrabBag = CharInteropGrabBag, CharKeepTogether = CharKeepTogether, CharKerning = CharKerning, CharLeftBorder = CharLeftBorder, CharLeftBorderDistance = CharLeftBorderDistance, CharLocale = CharLocale, CharLocaleAsian = CharLocaleAsian, CharLocaleComplex = CharLocaleComplex, CharNoHyphenation = CharNoHyphenation, CharNoLineBreak = CharNoLineBreak, CharPosture = CharPosture, CharPostureAsian = CharPostureAsian, CharPostureComplex = CharPostureComplex, CharRelief = CharRelief, CharRightBorder = CharRightBorder, CharRightBorderDistance = CharRightBorderDistance, CharRotation = CharRotation, CharRotationIsFitToLine = CharRotationIsFitToLine, CharScaleWidth = CharScaleWidth, CharShadingValue = CharShadingValue, CharShadowFormat = CharShadowFormat, CharShadowed = CharShadowed, CharStrikeout = CharStrikeout, CharStyleName = CharStyleName, CharStyleNames = CharStyleNames, CharTopBorder = CharTopBorder, CharTopBorderDistance = CharTopBorderDistance, CharUnderline = CharUnderline, CharUnderlineColor = CharUnderlineColor, CharUnderlineHasColor = CharUnderlineHasColor, CharWeight = CharWeight, CharWeightAsian = CharWeightAsian, CharWeightComplex = CharWeightComplex, CharWordMode = CharWordMode, DropCapCharStyleName = DropCapCharStyleName, DropCapFormat = DropCapFormat, DropCapWholeWord = DropCapWholeWord, HyperLinkName = HyperLinkName, HyperLinkTarget = HyperLinkTarget, HyperLinkURL = HyperLinkURL, IsNumbering = IsNumbering, LeftBorder = LeftBorder, LeftBorderDistance = LeftBorderDistance, ListId = ListId, NumberingIsNumber = NumberingIsNumber, NumberingLevel = NumberingLevel, NumberingRules = NumberingRules, NumberingStartValue = NumberingStartValue, NumberingStyleName = NumberingStyleName, OutlineLevel = OutlineLevel, PageDescName = PageDescName, PageNumberOffset = PageNumberOffset, PageStyleName = PageStyleName, ParaAdjust = ParaAdjust, ParaBackColor = ParaBackColor, ParaBackGraphicFilter = ParaBackGraphicFilter, ParaBackGraphicLocation = ParaBackGraphicLocation, ParaBackGraphicURL = ParaBackGraphicURL, ParaBackTransparent = ParaBackTransparent, ParaBottomMargin = ParaBottomMargin, ParaContextMargin = ParaContextMargin, ParaExpandSingleWord = ParaExpandSingleWord, ParaFirstLineIndent = ParaFirstLineIndent, ParaHyphenationMaxHyphens = ParaHyphenationMaxHyphens, ParaHyphenationMaxLeadingChars = ParaHyphenationMaxLeadingChars, ParaHyphenationMaxTrailingChars = ParaHyphenationMaxTrailingChars, ParaInteropGrabBag = ParaInteropGrabBag, ParaIsAutoFirstLineIndent = ParaIsAutoFirstLineIndent, ParaIsCharacterDistance = ParaIsCharacterDistance, ParaIsConnectBorder = ParaIsConnectBorder, ParaIsForbiddenRules = ParaIsForbiddenRules, ParaIsHangingPunctuation = ParaIsHangingPunctuation, ParaIsHyphenation = ParaIsHyphenation, ParaIsNumberingRestart = ParaIsNumberingRestart, ParaKeepTogether = ParaKeepTogether, ParaLastLineAdjust = ParaLastLineAdjust, ParaLeftMargin = ParaLeftMargin, ParaLineNumberCount = ParaLineNumberCount, ParaLineNumberStartValue = ParaLineNumberStartValue, ParaLineSpacing = ParaLineSpacing, ParaOrphans = ParaOrphans, ParaRegisterModeActive = ParaRegisterModeActive, ParaRightMargin = ParaRightMargin, ParaShadowFormat = ParaShadowFormat, ParaSplit = ParaSplit, ParaStyleName = ParaStyleName, ParaTabStops = ParaTabStops, ParaTopMargin = ParaTopMargin, ParaUserDefinedAttributes = ParaUserDefinedAttributes, ParaVertAlignment = ParaVertAlignment, ParaWidows = ParaWidows, RightBorder = RightBorder, RightBorderDistance = RightBorderDistance, RubyAdjust = RubyAdjust, RubyCharStyleName = RubyCharStyleName, RubyIsAbove = RubyIsAbove, RubyText = RubyText, TextAnimationAmount = TextAnimationAmount, TextAnimationCount = TextAnimationCount, TextAnimationDelay = TextAnimationDelay, TextAnimationDirection = TextAnimationDirection, TextAnimationKind = TextAnimationKind, TextAnimationStartInside = TextAnimationStartInside, TextAnimationStopInside = TextAnimationStopInside, TextAutoGrowHeight = TextAutoGrowHeight, TextAutoGrowWidth = TextAutoGrowWidth, TextContourFrame = TextContourFrame, TextFitToSize = TextFitToSize, TextHorizontalAdjust = TextHorizontalAdjust, TextLeftDistance = TextLeftDistance, TextLowerDistance = TextLowerDistance, TextMaximumFrameHeight = TextMaximumFrameHeight, TextMaximumFrameWidth = TextMaximumFrameWidth, TextMinimumFrameHeight = TextMinimumFrameHeight, TextMinimumFrameWidth = TextMinimumFrameWidth, TextRightDistance = TextRightDistance, TextUpperDistance = TextUpperDistance, TextUserDefinedAttributes = TextUserDefinedAttributes, TextVerticalAdjust = TextVerticalAdjust, TextWritingMode = TextWritingMode, TopBorder = TopBorder, TopBorderDistance = TopBorderDistance, UnvisitedCharStyleName = UnvisitedCharStyleName, VisitedCharStyleName = VisitedCharStyleName, WritingMode = WritingMode)
  
    __obj.asInstanceOf[TextProperties]
  }
}

