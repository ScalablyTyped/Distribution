package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.com_.sun.star.awt.FontSlant
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.container.XIndexReplace
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.style.BreakType
import typings.activexLibreoffice.com_.sun.star.style.CharacterProperties
import typings.activexLibreoffice.com_.sun.star.style.CharacterPropertiesAsian
import typings.activexLibreoffice.com_.sun.star.style.CharacterPropertiesComplex
import typings.activexLibreoffice.com_.sun.star.style.DropCapFormat
import typings.activexLibreoffice.com_.sun.star.style.GraphicLocation
import typings.activexLibreoffice.com_.sun.star.style.LineSpacing
import typings.activexLibreoffice.com_.sun.star.style.ParagraphAdjust
import typings.activexLibreoffice.com_.sun.star.style.ParagraphProperties
import typings.activexLibreoffice.com_.sun.star.style.ParagraphPropertiesAsian
import typings.activexLibreoffice.com_.sun.star.style.ParagraphPropertiesComplex
import typings.activexLibreoffice.com_.sun.star.style.TabStop
import typings.activexLibreoffice.com_.sun.star.table.BorderLine
import typings.activexLibreoffice.com_.sun.star.table.BorderLine2
import typings.activexLibreoffice.com_.sun.star.table.ShadowFormat
import typings.activexLibreoffice.com_.sun.star.text.WritingMode
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This is a set of properties to describe the style for rendering the text area inside a shape. */
trait TextProperties
  extends StObject
     with CharacterProperties
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
  var TextAnimationDirection: typings.activexLibreoffice.com_.sun.star.drawing.TextAnimationDirection
  
  /** This value defines the type of animation. */
  var TextAnimationKind: typings.activexLibreoffice.com_.sun.star.drawing.TextAnimationKind
  
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
  var TextHorizontalAdjust: typings.activexLibreoffice.com_.sun.star.drawing.TextHorizontalAdjust
  
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
  var TextVerticalAdjust: typings.activexLibreoffice.com_.sun.star.drawing.TextVerticalAdjust
  
  /** This value selects the writing mode for the text. */
  var TextWritingMode: WritingMode
}
object TextProperties {
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(BorderDistance = BorderDistance.asInstanceOf[js.Any], BottomBorder = BottomBorder.asInstanceOf[js.Any], BottomBorderDistance = BottomBorderDistance.asInstanceOf[js.Any], BreakType = BreakType.asInstanceOf[js.Any], CharAutoKerning = CharAutoKerning.asInstanceOf[js.Any], CharBackColor = CharBackColor.asInstanceOf[js.Any], CharBackTransparent = CharBackTransparent.asInstanceOf[js.Any], CharBorderDistance = CharBorderDistance.asInstanceOf[js.Any], CharBottomBorder = CharBottomBorder.asInstanceOf[js.Any], CharBottomBorderDistance = CharBottomBorderDistance.asInstanceOf[js.Any], CharCaseMap = CharCaseMap.asInstanceOf[js.Any], CharColor = CharColor.asInstanceOf[js.Any], CharCombineIsOn = CharCombineIsOn.asInstanceOf[js.Any], CharCombinePrefix = CharCombinePrefix.asInstanceOf[js.Any], CharCombineSuffix = CharCombineSuffix.asInstanceOf[js.Any], CharContoured = CharContoured.asInstanceOf[js.Any], CharCrossedOut = CharCrossedOut.asInstanceOf[js.Any], CharEmphasis = CharEmphasis.asInstanceOf[js.Any], CharEscapement = CharEscapement.asInstanceOf[js.Any], CharEscapementHeight = CharEscapementHeight.asInstanceOf[js.Any], CharFlash = CharFlash.asInstanceOf[js.Any], CharFontCharSet = CharFontCharSet.asInstanceOf[js.Any], CharFontCharSetAsian = CharFontCharSetAsian.asInstanceOf[js.Any], CharFontCharSetComplex = CharFontCharSetComplex.asInstanceOf[js.Any], CharFontFamily = CharFontFamily.asInstanceOf[js.Any], CharFontFamilyAsian = CharFontFamilyAsian.asInstanceOf[js.Any], CharFontFamilyComplex = CharFontFamilyComplex.asInstanceOf[js.Any], CharFontName = CharFontName.asInstanceOf[js.Any], CharFontNameAsian = CharFontNameAsian.asInstanceOf[js.Any], CharFontNameComplex = CharFontNameComplex.asInstanceOf[js.Any], CharFontPitch = CharFontPitch.asInstanceOf[js.Any], CharFontPitchAsian = CharFontPitchAsian.asInstanceOf[js.Any], CharFontPitchComplex = CharFontPitchComplex.asInstanceOf[js.Any], CharFontStyleName = CharFontStyleName.asInstanceOf[js.Any], CharFontStyleNameAsian = CharFontStyleNameAsian.asInstanceOf[js.Any], CharFontStyleNameComplex = CharFontStyleNameComplex.asInstanceOf[js.Any], CharFontType = CharFontType.asInstanceOf[js.Any], CharHeight = CharHeight.asInstanceOf[js.Any], CharHeightAsian = CharHeightAsian.asInstanceOf[js.Any], CharHeightComplex = CharHeightComplex.asInstanceOf[js.Any], CharHidden = CharHidden.asInstanceOf[js.Any], CharHighlight = CharHighlight.asInstanceOf[js.Any], CharInteropGrabBag = CharInteropGrabBag.asInstanceOf[js.Any], CharKeepTogether = CharKeepTogether.asInstanceOf[js.Any], CharKerning = CharKerning.asInstanceOf[js.Any], CharLeftBorder = CharLeftBorder.asInstanceOf[js.Any], CharLeftBorderDistance = CharLeftBorderDistance.asInstanceOf[js.Any], CharLocale = CharLocale.asInstanceOf[js.Any], CharLocaleAsian = CharLocaleAsian.asInstanceOf[js.Any], CharLocaleComplex = CharLocaleComplex.asInstanceOf[js.Any], CharNoHyphenation = CharNoHyphenation.asInstanceOf[js.Any], CharNoLineBreak = CharNoLineBreak.asInstanceOf[js.Any], CharPosture = CharPosture.asInstanceOf[js.Any], CharPostureAsian = CharPostureAsian.asInstanceOf[js.Any], CharPostureComplex = CharPostureComplex.asInstanceOf[js.Any], CharRelief = CharRelief.asInstanceOf[js.Any], CharRightBorder = CharRightBorder.asInstanceOf[js.Any], CharRightBorderDistance = CharRightBorderDistance.asInstanceOf[js.Any], CharRotation = CharRotation.asInstanceOf[js.Any], CharRotationIsFitToLine = CharRotationIsFitToLine.asInstanceOf[js.Any], CharScaleWidth = CharScaleWidth.asInstanceOf[js.Any], CharShadingValue = CharShadingValue.asInstanceOf[js.Any], CharShadowFormat = CharShadowFormat.asInstanceOf[js.Any], CharShadowed = CharShadowed.asInstanceOf[js.Any], CharStrikeout = CharStrikeout.asInstanceOf[js.Any], CharStyleName = CharStyleName.asInstanceOf[js.Any], CharStyleNames = CharStyleNames.asInstanceOf[js.Any], CharTopBorder = CharTopBorder.asInstanceOf[js.Any], CharTopBorderDistance = CharTopBorderDistance.asInstanceOf[js.Any], CharUnderline = CharUnderline.asInstanceOf[js.Any], CharUnderlineColor = CharUnderlineColor.asInstanceOf[js.Any], CharUnderlineHasColor = CharUnderlineHasColor.asInstanceOf[js.Any], CharWeight = CharWeight.asInstanceOf[js.Any], CharWeightAsian = CharWeightAsian.asInstanceOf[js.Any], CharWeightComplex = CharWeightComplex.asInstanceOf[js.Any], CharWordMode = CharWordMode.asInstanceOf[js.Any], DropCapCharStyleName = DropCapCharStyleName.asInstanceOf[js.Any], DropCapFormat = DropCapFormat.asInstanceOf[js.Any], DropCapWholeWord = DropCapWholeWord.asInstanceOf[js.Any], HyperLinkName = HyperLinkName.asInstanceOf[js.Any], HyperLinkTarget = HyperLinkTarget.asInstanceOf[js.Any], HyperLinkURL = HyperLinkURL.asInstanceOf[js.Any], IsNumbering = IsNumbering.asInstanceOf[js.Any], LeftBorder = LeftBorder.asInstanceOf[js.Any], LeftBorderDistance = LeftBorderDistance.asInstanceOf[js.Any], ListId = ListId.asInstanceOf[js.Any], NumberingIsNumber = NumberingIsNumber.asInstanceOf[js.Any], NumberingLevel = NumberingLevel.asInstanceOf[js.Any], NumberingRules = NumberingRules.asInstanceOf[js.Any], NumberingStartValue = NumberingStartValue.asInstanceOf[js.Any], NumberingStyleName = NumberingStyleName.asInstanceOf[js.Any], OutlineLevel = OutlineLevel.asInstanceOf[js.Any], PageDescName = PageDescName.asInstanceOf[js.Any], PageNumberOffset = PageNumberOffset.asInstanceOf[js.Any], PageStyleName = PageStyleName.asInstanceOf[js.Any], ParaAdjust = ParaAdjust.asInstanceOf[js.Any], ParaBackColor = ParaBackColor.asInstanceOf[js.Any], ParaBackGraphicFilter = ParaBackGraphicFilter.asInstanceOf[js.Any], ParaBackGraphicLocation = ParaBackGraphicLocation.asInstanceOf[js.Any], ParaBackGraphicURL = ParaBackGraphicURL.asInstanceOf[js.Any], ParaBackTransparent = ParaBackTransparent.asInstanceOf[js.Any], ParaBottomMargin = ParaBottomMargin.asInstanceOf[js.Any], ParaContextMargin = ParaContextMargin.asInstanceOf[js.Any], ParaExpandSingleWord = ParaExpandSingleWord.asInstanceOf[js.Any], ParaFirstLineIndent = ParaFirstLineIndent.asInstanceOf[js.Any], ParaHyphenationMaxHyphens = ParaHyphenationMaxHyphens.asInstanceOf[js.Any], ParaHyphenationMaxLeadingChars = ParaHyphenationMaxLeadingChars.asInstanceOf[js.Any], ParaHyphenationMaxTrailingChars = ParaHyphenationMaxTrailingChars.asInstanceOf[js.Any], ParaInteropGrabBag = ParaInteropGrabBag.asInstanceOf[js.Any], ParaIsAutoFirstLineIndent = ParaIsAutoFirstLineIndent.asInstanceOf[js.Any], ParaIsCharacterDistance = ParaIsCharacterDistance.asInstanceOf[js.Any], ParaIsConnectBorder = ParaIsConnectBorder.asInstanceOf[js.Any], ParaIsForbiddenRules = ParaIsForbiddenRules.asInstanceOf[js.Any], ParaIsHangingPunctuation = ParaIsHangingPunctuation.asInstanceOf[js.Any], ParaIsHyphenation = ParaIsHyphenation.asInstanceOf[js.Any], ParaIsNumberingRestart = ParaIsNumberingRestart.asInstanceOf[js.Any], ParaKeepTogether = ParaKeepTogether.asInstanceOf[js.Any], ParaLastLineAdjust = ParaLastLineAdjust.asInstanceOf[js.Any], ParaLeftMargin = ParaLeftMargin.asInstanceOf[js.Any], ParaLineNumberCount = ParaLineNumberCount.asInstanceOf[js.Any], ParaLineNumberStartValue = ParaLineNumberStartValue.asInstanceOf[js.Any], ParaLineSpacing = ParaLineSpacing.asInstanceOf[js.Any], ParaOrphans = ParaOrphans.asInstanceOf[js.Any], ParaRegisterModeActive = ParaRegisterModeActive.asInstanceOf[js.Any], ParaRightMargin = ParaRightMargin.asInstanceOf[js.Any], ParaShadowFormat = ParaShadowFormat.asInstanceOf[js.Any], ParaSplit = ParaSplit.asInstanceOf[js.Any], ParaStyleName = ParaStyleName.asInstanceOf[js.Any], ParaTabStops = ParaTabStops.asInstanceOf[js.Any], ParaTopMargin = ParaTopMargin.asInstanceOf[js.Any], ParaUserDefinedAttributes = ParaUserDefinedAttributes.asInstanceOf[js.Any], ParaVertAlignment = ParaVertAlignment.asInstanceOf[js.Any], ParaWidows = ParaWidows.asInstanceOf[js.Any], RightBorder = RightBorder.asInstanceOf[js.Any], RightBorderDistance = RightBorderDistance.asInstanceOf[js.Any], RubyAdjust = RubyAdjust.asInstanceOf[js.Any], RubyCharStyleName = RubyCharStyleName.asInstanceOf[js.Any], RubyIsAbove = RubyIsAbove.asInstanceOf[js.Any], RubyText = RubyText.asInstanceOf[js.Any], TextAnimationAmount = TextAnimationAmount.asInstanceOf[js.Any], TextAnimationCount = TextAnimationCount.asInstanceOf[js.Any], TextAnimationDelay = TextAnimationDelay.asInstanceOf[js.Any], TextAnimationDirection = TextAnimationDirection.asInstanceOf[js.Any], TextAnimationKind = TextAnimationKind.asInstanceOf[js.Any], TextAnimationStartInside = TextAnimationStartInside.asInstanceOf[js.Any], TextAnimationStopInside = TextAnimationStopInside.asInstanceOf[js.Any], TextAutoGrowHeight = TextAutoGrowHeight.asInstanceOf[js.Any], TextAutoGrowWidth = TextAutoGrowWidth.asInstanceOf[js.Any], TextContourFrame = TextContourFrame.asInstanceOf[js.Any], TextFitToSize = TextFitToSize.asInstanceOf[js.Any], TextHorizontalAdjust = TextHorizontalAdjust.asInstanceOf[js.Any], TextLeftDistance = TextLeftDistance.asInstanceOf[js.Any], TextLowerDistance = TextLowerDistance.asInstanceOf[js.Any], TextMaximumFrameHeight = TextMaximumFrameHeight.asInstanceOf[js.Any], TextMaximumFrameWidth = TextMaximumFrameWidth.asInstanceOf[js.Any], TextMinimumFrameHeight = TextMinimumFrameHeight.asInstanceOf[js.Any], TextMinimumFrameWidth = TextMinimumFrameWidth.asInstanceOf[js.Any], TextRightDistance = TextRightDistance.asInstanceOf[js.Any], TextUpperDistance = TextUpperDistance.asInstanceOf[js.Any], TextUserDefinedAttributes = TextUserDefinedAttributes.asInstanceOf[js.Any], TextVerticalAdjust = TextVerticalAdjust.asInstanceOf[js.Any], TextWritingMode = TextWritingMode.asInstanceOf[js.Any], TopBorder = TopBorder.asInstanceOf[js.Any], TopBorderDistance = TopBorderDistance.asInstanceOf[js.Any], UnvisitedCharStyleName = UnvisitedCharStyleName.asInstanceOf[js.Any], VisitedCharStyleName = VisitedCharStyleName.asInstanceOf[js.Any], WritingMode = WritingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextProperties]
  }
  
  extension [Self <: TextProperties](x: Self) {
    
    inline def setIsNumbering(value: Boolean): Self = StObject.set(x, "IsNumbering", value.asInstanceOf[js.Any])
    
    inline def setTextAnimationAmount(value: Double): Self = StObject.set(x, "TextAnimationAmount", value.asInstanceOf[js.Any])
    
    inline def setTextAnimationCount(value: Double): Self = StObject.set(x, "TextAnimationCount", value.asInstanceOf[js.Any])
    
    inline def setTextAnimationDelay(value: Double): Self = StObject.set(x, "TextAnimationDelay", value.asInstanceOf[js.Any])
    
    inline def setTextAnimationDirection(value: TextAnimationDirection): Self = StObject.set(x, "TextAnimationDirection", value.asInstanceOf[js.Any])
    
    inline def setTextAnimationKind(value: TextAnimationKind): Self = StObject.set(x, "TextAnimationKind", value.asInstanceOf[js.Any])
    
    inline def setTextAnimationStartInside(value: Boolean): Self = StObject.set(x, "TextAnimationStartInside", value.asInstanceOf[js.Any])
    
    inline def setTextAnimationStopInside(value: Boolean): Self = StObject.set(x, "TextAnimationStopInside", value.asInstanceOf[js.Any])
    
    inline def setTextAutoGrowHeight(value: Boolean): Self = StObject.set(x, "TextAutoGrowHeight", value.asInstanceOf[js.Any])
    
    inline def setTextAutoGrowWidth(value: Boolean): Self = StObject.set(x, "TextAutoGrowWidth", value.asInstanceOf[js.Any])
    
    inline def setTextContourFrame(value: Boolean): Self = StObject.set(x, "TextContourFrame", value.asInstanceOf[js.Any])
    
    inline def setTextFitToSize(value: TextFitToSizeType): Self = StObject.set(x, "TextFitToSize", value.asInstanceOf[js.Any])
    
    inline def setTextHorizontalAdjust(value: TextHorizontalAdjust): Self = StObject.set(x, "TextHorizontalAdjust", value.asInstanceOf[js.Any])
    
    inline def setTextLeftDistance(value: Double): Self = StObject.set(x, "TextLeftDistance", value.asInstanceOf[js.Any])
    
    inline def setTextLowerDistance(value: Double): Self = StObject.set(x, "TextLowerDistance", value.asInstanceOf[js.Any])
    
    inline def setTextMaximumFrameHeight(value: Double): Self = StObject.set(x, "TextMaximumFrameHeight", value.asInstanceOf[js.Any])
    
    inline def setTextMaximumFrameWidth(value: Double): Self = StObject.set(x, "TextMaximumFrameWidth", value.asInstanceOf[js.Any])
    
    inline def setTextMinimumFrameHeight(value: Double): Self = StObject.set(x, "TextMinimumFrameHeight", value.asInstanceOf[js.Any])
    
    inline def setTextMinimumFrameWidth(value: Double): Self = StObject.set(x, "TextMinimumFrameWidth", value.asInstanceOf[js.Any])
    
    inline def setTextRightDistance(value: Double): Self = StObject.set(x, "TextRightDistance", value.asInstanceOf[js.Any])
    
    inline def setTextUpperDistance(value: Double): Self = StObject.set(x, "TextUpperDistance", value.asInstanceOf[js.Any])
    
    inline def setTextVerticalAdjust(value: TextVerticalAdjust): Self = StObject.set(x, "TextVerticalAdjust", value.asInstanceOf[js.Any])
    
    inline def setTextWritingMode(value: WritingMode): Self = StObject.set(x, "TextWritingMode", value.asInstanceOf[js.Any])
  }
}
