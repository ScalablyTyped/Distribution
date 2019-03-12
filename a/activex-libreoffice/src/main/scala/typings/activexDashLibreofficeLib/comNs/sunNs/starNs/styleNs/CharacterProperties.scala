package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a set of properties to describe the style of characters.
  * @see ParagraphProperties
  */
trait CharacterProperties extends js.Object {
  /**
    * This optional property determines whether the kerning tables from the current font are used.
    *
    * Automatic **kerning** applies a spacing in between certain pairs of characters to make the text look better.
    */
  var CharAutoKerning: scala.Boolean
  /** This optional property contains the text background color. */
  var CharBackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** This property determines if the text background color is set to transparent. */
  var CharBackTransparent: scala.Boolean
  /**
    * This property contains the distance from the border to the object.
    * @since LibreOffice 4.2
    */
  var CharBorderDistance: scala.Double
  /**
    * This property contains the bottom border of the object.
    * @since LibreOffice 4.2
    */
  var CharBottomBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2
  /**
    * This property contains the distance from the bottom border to the object.
    * @since LibreOffice 4.2
    */
  var CharBottomBorderDistance: scala.Double
  /**
    * This optional property contains the value of the case-mapping of the text for formatting and displaying.
    * @see CaseMap
    */
  var CharCaseMap: scala.Double
  /** This property contains the value of the text color. */
  var CharColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * This optional property determines whether text is formatted in two lines.
    *
    * It is linked to the properties CharCombinePrefix and CharCombineSuffix.
    */
  var CharCombineIsOn: scala.Boolean
  /**
    * This optional property contains the prefix (usually parenthesis) before text that is formatted in two lines.
    *
    * It is linked to the properties CharCombineIsOn and CharCombineSuffix.
    */
  var CharCombinePrefix: java.lang.String
  /**
    * This optional property contains the suffix (usually parenthesis) after text that is formatted in two lines.
    *
    * It is linked to the properties CharCombineIsOn and CharCombinePrefix.
    */
  var CharCombineSuffix: java.lang.String
  /** This optional property specifies if the characters are formatted and displayed with a contour effect. */
  var CharContoured: scala.Boolean
  /** This property is `TRUE` if the characters are crossed out. */
  var CharCrossedOut: scala.Boolean
  /**
    * This optional property contains the font emphasis value.
    * @see com.sun.star.text.FontEmphasis
    */
  var CharEmphasis: scala.Double
  /**
    * specifies the percentage by which to raise/lower superscript/subscript characters.
    *
    * Negative values denote subscripts and positive values superscripts.
    * @see CharEscapementHeight
    */
  var CharEscapement: scala.Double
  /**
    * This is the relative height used for subscript or superscript characters in units of percent.
    *
    * The value 100 denotes the original height of the characters.
    * @see CharEscapement
    */
  var CharEscapementHeight: scala.Double
  /** If this optional property is `TRUE` , then the characters are flashing. */
  var CharFlash: scala.Boolean
  /**
    * This property contains the text encoding of the font.
    * @see com.sun.star.awt.CharSet
    */
  var CharFontCharSet: scala.Double
  /**
    * This property contains font family.
    * @see com.sun.star.awt.FontFamily
    */
  var CharFontFamily: scala.Double
  /**
    * This property specifies the name of the font style.
    *
    * It may contain more than one name separated by comma.
    */
  var CharFontName: java.lang.String
  /**
    * This property contains the font pitch.
    * @see com.sun.star.awt.FontPitch
    */
  var CharFontPitch: scala.Double
  /**
    * This property contains the name of the font style.
    *
    * This property may be empty.
    */
  var CharFontStyleName: java.lang.String
  /**
    * This optional property specifies the fundamental technology of the font.
    * @see com.sun.star.awt.FontType
    */
  var CharFontType: scala.Double
  /** This value contains the height of the characters in point. */
  var CharHeight: scala.Double
  /**
    * If this optional property is `TRUE` , then the characters are invisible.
    * @since OOo 2.0
    */
  var CharHidden: scala.Boolean
  /**
    * Determines the color of the highlight.
    * @since LibreOffice 4.2
    */
  var CharHighlight: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * Grab bag of character properties, used as a string-any map for interim interop purposes.
    * @since LibreOffice 4.3  This property is intentionally not handled by the ODF filter. Any member that should be handled there should be first moved out
    */
  var CharInteropGrabBag: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /**
    * This optional property marks a range of characters to prevent it from being broken into two lines.
    *
    * A line break is applied before the range of characters if the layout makes a break necessary within the range.
    */
  var CharKeepTogether: scala.Boolean
  /** This optional property contains the value of the kerning of the characters. */
  var CharKerning: scala.Double
  /**
    * This property contains the left border of the object.
    * @since LibreOffice 4.2
    */
  var CharLeftBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2
  /**
    * This property contains the distance from the left border to the object.
    * @since LibreOffice 4.2
    */
  var CharLeftBorderDistance: scala.Double
  /** This property contains the value of the locale. */
  var CharLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /** This optional property determines if the word can be hyphenated at the character. */
  var CharNoHyphenation: scala.Boolean
  /**
    * This optional property marks a range of characters to ignore a line break in this area.
    *
    * A line break is applied behind the range of characters if the layout makes a break necessary within the range. That means that the text may go through
    * the border.
    */
  var CharNoLineBreak: scala.Boolean
  /**
    * This property contains the value of the posture of the document.
    * @see com.sun.star.awt.FontSlant
    */
  var CharPosture: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontSlant
  /**
    * This optional property contains the relief style of the characters.
    * @see com.sun.star.text.FontRelief
    */
  var CharRelief: scala.Double
  /**
    * This property contains the right border of the object.
    * @since LibreOffice 4.2
    */
  var CharRightBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2
  /**
    * This property contains the distance from the right border to the object.
    * @since LibreOffice 4.2
    */
  var CharRightBorderDistance: scala.Double
  /**
    * This optional property determines the rotation of a character in tenths of a degree.
    *
    * Depending on the implementation only certain values may be allowed.
    */
  var CharRotation: scala.Double
  /** This optional property determines whether the text formatting tries to fit rotated text into the surrounded line height. */
  var CharRotationIsFitToLine: scala.Boolean
  /**
    * This optional property determines the percentage value for scaling the width of characters.
    *
    * The value refers to the original width which is denoted by 100, and it has to be greater than 0.
    */
  var CharScaleWidth: scala.Double
  /** This optional property contains the text shading value. */
  var CharShadingValue: scala.Double
  /**
    * Determines the type, color, and width of the shadow.
    * @since LibreOffice 4.2
    */
  var CharShadowFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ShadowFormat
  /** This optional property specifies if the characters are formatted and displayed with a shadow effect. */
  var CharShadowed: scala.Boolean
  /**
    * This property determines the type of the strike out of the character.
    * @see com.sun.star.awt.FontStrikeout
    */
  var CharStrikeout: scala.Double
  /** This optional property specifies the name of the style of the font. */
  var CharStyleName: java.lang.String
  /**
    * This optional property specifies the names of the all styles applied to the font.
    *
    * It is not guaranteed that the order in the sequence reflects the order of the evaluation of the character style attributes.
    * @since OOo 1.1.2
    */
  var CharStyleNames: stdLib.SafeArray[java.lang.String]
  /**
    * This property contains the top border of the object.
    * @since LibreOffice 4.2
    */
  var CharTopBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2
  /**
    * This property contains the distance from the top border to the object.
    * @since LibreOffice 4.2
    */
  var CharTopBorderDistance: scala.Double
  /**
    * This property contains the value for the character underline.
    * @see com.sun.star.awt.FontUnderline
    */
  var CharUnderline: scala.Double
  /**
    * This property contains the color of the underline for the characters.
    * @see CharUnderlineHasColor
    */
  var CharUnderlineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * This property specifies if the property CharUnderlineColor is used for an underline.
    * @see CharUnderlineColor
    */
  var CharUnderlineHasColor: scala.Boolean
  /**
    * This property contains the value of the font weight.
    * @see com.sun.star.awt.FontWeight
    */
  var CharWeight: scala.Double
  /** If this property is `TRUE` , the underline and strike-through properties are not applied to white spaces. */
  var CharWordMode: scala.Boolean
  /** This optional property contains the name of the hyperlink. */
  var HyperLinkName: java.lang.String
  /** This optional property contains the name of the target for a hyperlink. */
  var HyperLinkTarget: java.lang.String
  /** This optional property contains the URL of a hyperlink. */
  var HyperLinkURL: java.lang.String
  /**
    * This optional property determines the adjustment of the ruby .
    * @see com.sun.star.text.RubyAdjust
    */
  var RubyAdjust: scala.Double
  /** This optional property contains the name of the character style that is applied to RubyText. */
  var RubyCharStyleName: java.lang.String
  /** This optional property determines whether the ruby text is printed above/left or below/right of the text. */
  var RubyIsAbove: scala.Boolean
  /** This optional property contains the text that is set as ruby. */
  var RubyText: java.lang.String
  /**
    * This property stores XML attributes. They will be saved to and restored from automatic styles inside XML files.
    * @see com.sun.star.xml.AttributeContainer
    */
  var TextUserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
  /** This optional property contains the character style name for unvisited hyperlinks. */
  var UnvisitedCharStyleName: java.lang.String
  /** This optional property contains the character style name for visited hyperlinks. */
  var VisitedCharStyleName: java.lang.String
}

object CharacterProperties {
  @scala.inline
  def apply(
    CharAutoKerning: scala.Boolean,
    CharBackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    CharBackTransparent: scala.Boolean,
    CharBorderDistance: scala.Double,
    CharBottomBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2,
    CharBottomBorderDistance: scala.Double,
    CharCaseMap: scala.Double,
    CharColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    CharCombineIsOn: scala.Boolean,
    CharCombinePrefix: java.lang.String,
    CharCombineSuffix: java.lang.String,
    CharContoured: scala.Boolean,
    CharCrossedOut: scala.Boolean,
    CharEmphasis: scala.Double,
    CharEscapement: scala.Double,
    CharEscapementHeight: scala.Double,
    CharFlash: scala.Boolean,
    CharFontCharSet: scala.Double,
    CharFontFamily: scala.Double,
    CharFontName: java.lang.String,
    CharFontPitch: scala.Double,
    CharFontStyleName: java.lang.String,
    CharFontType: scala.Double,
    CharHeight: scala.Double,
    CharHidden: scala.Boolean,
    CharHighlight: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    CharInteropGrabBag: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    CharKeepTogether: scala.Boolean,
    CharKerning: scala.Double,
    CharLeftBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2,
    CharLeftBorderDistance: scala.Double,
    CharLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    CharNoHyphenation: scala.Boolean,
    CharNoLineBreak: scala.Boolean,
    CharPosture: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontSlant,
    CharRelief: scala.Double,
    CharRightBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2,
    CharRightBorderDistance: scala.Double,
    CharRotation: scala.Double,
    CharRotationIsFitToLine: scala.Boolean,
    CharScaleWidth: scala.Double,
    CharShadingValue: scala.Double,
    CharShadowFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ShadowFormat,
    CharShadowed: scala.Boolean,
    CharStrikeout: scala.Double,
    CharStyleName: java.lang.String,
    CharStyleNames: stdLib.SafeArray[java.lang.String],
    CharTopBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2,
    CharTopBorderDistance: scala.Double,
    CharUnderline: scala.Double,
    CharUnderlineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    CharUnderlineHasColor: scala.Boolean,
    CharWeight: scala.Double,
    CharWordMode: scala.Boolean,
    HyperLinkName: java.lang.String,
    HyperLinkTarget: java.lang.String,
    HyperLinkURL: java.lang.String,
    RubyAdjust: scala.Double,
    RubyCharStyleName: java.lang.String,
    RubyIsAbove: scala.Boolean,
    RubyText: java.lang.String,
    TextUserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    UnvisitedCharStyleName: java.lang.String,
    VisitedCharStyleName: java.lang.String
  ): CharacterProperties = {
    val __obj = js.Dynamic.literal(CharAutoKerning = CharAutoKerning, CharBackColor = CharBackColor, CharBackTransparent = CharBackTransparent, CharBorderDistance = CharBorderDistance, CharBottomBorder = CharBottomBorder, CharBottomBorderDistance = CharBottomBorderDistance, CharCaseMap = CharCaseMap, CharColor = CharColor, CharCombineIsOn = CharCombineIsOn, CharCombinePrefix = CharCombinePrefix, CharCombineSuffix = CharCombineSuffix, CharContoured = CharContoured, CharCrossedOut = CharCrossedOut, CharEmphasis = CharEmphasis, CharEscapement = CharEscapement, CharEscapementHeight = CharEscapementHeight, CharFlash = CharFlash, CharFontCharSet = CharFontCharSet, CharFontFamily = CharFontFamily, CharFontName = CharFontName, CharFontPitch = CharFontPitch, CharFontStyleName = CharFontStyleName, CharFontType = CharFontType, CharHeight = CharHeight, CharHidden = CharHidden, CharHighlight = CharHighlight, CharInteropGrabBag = CharInteropGrabBag, CharKeepTogether = CharKeepTogether, CharKerning = CharKerning, CharLeftBorder = CharLeftBorder, CharLeftBorderDistance = CharLeftBorderDistance, CharLocale = CharLocale, CharNoHyphenation = CharNoHyphenation, CharNoLineBreak = CharNoLineBreak, CharPosture = CharPosture, CharRelief = CharRelief, CharRightBorder = CharRightBorder, CharRightBorderDistance = CharRightBorderDistance, CharRotation = CharRotation, CharRotationIsFitToLine = CharRotationIsFitToLine, CharScaleWidth = CharScaleWidth, CharShadingValue = CharShadingValue, CharShadowFormat = CharShadowFormat, CharShadowed = CharShadowed, CharStrikeout = CharStrikeout, CharStyleName = CharStyleName, CharStyleNames = CharStyleNames, CharTopBorder = CharTopBorder, CharTopBorderDistance = CharTopBorderDistance, CharUnderline = CharUnderline, CharUnderlineColor = CharUnderlineColor, CharUnderlineHasColor = CharUnderlineHasColor, CharWeight = CharWeight, CharWordMode = CharWordMode, HyperLinkName = HyperLinkName, HyperLinkTarget = HyperLinkTarget, HyperLinkURL = HyperLinkURL, RubyAdjust = RubyAdjust, RubyCharStyleName = RubyCharStyleName, RubyIsAbove = RubyIsAbove, RubyText = RubyText, TextUserDefinedAttributes = TextUserDefinedAttributes, UnvisitedCharStyleName = UnvisitedCharStyleName, VisitedCharStyleName = VisitedCharStyleName)
  
    __obj.asInstanceOf[CharacterProperties]
  }
}

