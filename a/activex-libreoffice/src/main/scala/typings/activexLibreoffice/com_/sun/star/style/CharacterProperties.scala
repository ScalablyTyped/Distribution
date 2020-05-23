package typings.activexLibreoffice.com_.sun.star.style

import typings.activexLibreoffice.com_.sun.star.awt.FontSlant
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.table.BorderLine2
import typings.activexLibreoffice.com_.sun.star.table.ShadowFormat
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.std.SafeArray
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
  var CharAutoKerning: Boolean
  /** This optional property contains the text background color. */
  var CharBackColor: Color
  /** This property determines if the text background color is set to transparent. */
  var CharBackTransparent: Boolean
  /**
    * This property contains the distance from the border to the object.
    * @since LibreOffice 4.2
    */
  var CharBorderDistance: Double
  /**
    * This property contains the bottom border of the object.
    * @since LibreOffice 4.2
    */
  var CharBottomBorder: BorderLine2
  /**
    * This property contains the distance from the bottom border to the object.
    * @since LibreOffice 4.2
    */
  var CharBottomBorderDistance: Double
  /**
    * This optional property contains the value of the case-mapping of the text for formatting and displaying.
    * @see CaseMap
    */
  var CharCaseMap: Double
  /** This property contains the value of the text color. */
  var CharColor: Color
  /**
    * This optional property determines whether text is formatted in two lines.
    *
    * It is linked to the properties CharCombinePrefix and CharCombineSuffix.
    */
  var CharCombineIsOn: Boolean
  /**
    * This optional property contains the prefix (usually parenthesis) before text that is formatted in two lines.
    *
    * It is linked to the properties CharCombineIsOn and CharCombineSuffix.
    */
  var CharCombinePrefix: String
  /**
    * This optional property contains the suffix (usually parenthesis) after text that is formatted in two lines.
    *
    * It is linked to the properties CharCombineIsOn and CharCombinePrefix.
    */
  var CharCombineSuffix: String
  /** This optional property specifies if the characters are formatted and displayed with a contour effect. */
  var CharContoured: Boolean
  /** This property is `TRUE` if the characters are crossed out. */
  var CharCrossedOut: Boolean
  /**
    * This optional property contains the font emphasis value.
    * @see com.sun.star.text.FontEmphasis
    */
  var CharEmphasis: Double
  /**
    * specifies the percentage by which to raise/lower superscript/subscript characters.
    *
    * Negative values denote subscripts and positive values superscripts.
    * @see CharEscapementHeight
    */
  var CharEscapement: Double
  /**
    * This is the relative height used for subscript or superscript characters in units of percent.
    *
    * The value 100 denotes the original height of the characters.
    * @see CharEscapement
    */
  var CharEscapementHeight: Double
  /** If this optional property is `TRUE` , then the characters are flashing. */
  var CharFlash: Boolean
  /**
    * This property contains the text encoding of the font.
    * @see com.sun.star.awt.CharSet
    */
  var CharFontCharSet: Double
  /**
    * This property contains font family.
    * @see com.sun.star.awt.FontFamily
    */
  var CharFontFamily: Double
  /**
    * This property specifies the name of the font style.
    *
    * It may contain more than one name separated by comma.
    */
  var CharFontName: String
  /**
    * This property contains the font pitch.
    * @see com.sun.star.awt.FontPitch
    */
  var CharFontPitch: Double
  /**
    * This property contains the name of the font style.
    *
    * This property may be empty.
    */
  var CharFontStyleName: String
  /**
    * This optional property specifies the fundamental technology of the font.
    * @see com.sun.star.awt.FontType
    */
  var CharFontType: Double
  /** This value contains the height of the characters in point. */
  var CharHeight: Double
  /**
    * If this optional property is `TRUE` , then the characters are invisible.
    * @since OOo 2.0
    */
  var CharHidden: Boolean
  /**
    * Determines the color of the highlight.
    * @since LibreOffice 4.2
    */
  var CharHighlight: Color
  /**
    * Grab bag of character properties, used as a string-any map for interim interop purposes.
    * @since LibreOffice 4.3  This property is intentionally not handled by the ODF filter. Any member that should be handled there should be first moved out
    */
  var CharInteropGrabBag: SafeArray[PropertyValue]
  /**
    * This optional property marks a range of characters to prevent it from being broken into two lines.
    *
    * A line break is applied before the range of characters if the layout makes a break necessary within the range.
    */
  var CharKeepTogether: Boolean
  /** This optional property contains the value of the kerning of the characters. */
  var CharKerning: Double
  /**
    * This property contains the left border of the object.
    * @since LibreOffice 4.2
    */
  var CharLeftBorder: BorderLine2
  /**
    * This property contains the distance from the left border to the object.
    * @since LibreOffice 4.2
    */
  var CharLeftBorderDistance: Double
  /** This property contains the value of the locale. */
  var CharLocale: Locale
  /** This optional property determines if the word can be hyphenated at the character. */
  var CharNoHyphenation: Boolean
  /**
    * This optional property marks a range of characters to ignore a line break in this area.
    *
    * A line break is applied behind the range of characters if the layout makes a break necessary within the range. That means that the text may go through
    * the border.
    */
  var CharNoLineBreak: Boolean
  /**
    * This property contains the value of the posture of the document.
    * @see com.sun.star.awt.FontSlant
    */
  var CharPosture: FontSlant
  /**
    * This optional property contains the relief style of the characters.
    * @see com.sun.star.text.FontRelief
    */
  var CharRelief: Double
  /**
    * This property contains the right border of the object.
    * @since LibreOffice 4.2
    */
  var CharRightBorder: BorderLine2
  /**
    * This property contains the distance from the right border to the object.
    * @since LibreOffice 4.2
    */
  var CharRightBorderDistance: Double
  /**
    * This optional property determines the rotation of a character in tenths of a degree.
    *
    * Depending on the implementation only certain values may be allowed.
    */
  var CharRotation: Double
  /** This optional property determines whether the text formatting tries to fit rotated text into the surrounded line height. */
  var CharRotationIsFitToLine: Boolean
  /**
    * This optional property determines the percentage value for scaling the width of characters.
    *
    * The value refers to the original width which is denoted by 100, and it has to be greater than 0.
    */
  var CharScaleWidth: Double
  /** This optional property contains the text shading value. */
  var CharShadingValue: Double
  /**
    * Determines the type, color, and width of the shadow.
    * @since LibreOffice 4.2
    */
  var CharShadowFormat: ShadowFormat
  /** This optional property specifies if the characters are formatted and displayed with a shadow effect. */
  var CharShadowed: Boolean
  /**
    * This property determines the type of the strike out of the character.
    * @see com.sun.star.awt.FontStrikeout
    */
  var CharStrikeout: Double
  /** This optional property specifies the name of the style of the font. */
  var CharStyleName: String
  /**
    * This optional property specifies the names of the all styles applied to the font.
    *
    * It is not guaranteed that the order in the sequence reflects the order of the evaluation of the character style attributes.
    * @since OOo 1.1.2
    */
  var CharStyleNames: SafeArray[String]
  /**
    * This property contains the top border of the object.
    * @since LibreOffice 4.2
    */
  var CharTopBorder: BorderLine2
  /**
    * This property contains the distance from the top border to the object.
    * @since LibreOffice 4.2
    */
  var CharTopBorderDistance: Double
  /**
    * This property contains the value for the character underline.
    * @see com.sun.star.awt.FontUnderline
    */
  var CharUnderline: Double
  /**
    * This property contains the color of the underline for the characters.
    * @see CharUnderlineHasColor
    */
  var CharUnderlineColor: Color
  /**
    * This property specifies if the property CharUnderlineColor is used for an underline.
    * @see CharUnderlineColor
    */
  var CharUnderlineHasColor: Boolean
  /**
    * This property contains the value of the font weight.
    * @see com.sun.star.awt.FontWeight
    */
  var CharWeight: Double
  /** If this property is `TRUE` , the underline and strike-through properties are not applied to white spaces. */
  var CharWordMode: Boolean
  /** This optional property contains the name of the hyperlink. */
  var HyperLinkName: String
  /** This optional property contains the name of the target for a hyperlink. */
  var HyperLinkTarget: String
  /** This optional property contains the URL of a hyperlink. */
  var HyperLinkURL: String
  /**
    * This optional property determines the adjustment of the ruby .
    * @see com.sun.star.text.RubyAdjust
    */
  var RubyAdjust: Double
  /** This optional property contains the name of the character style that is applied to RubyText. */
  var RubyCharStyleName: String
  /** This optional property determines whether the ruby text is printed above/left or below/right of the text. */
  var RubyIsAbove: Boolean
  /** This optional property contains the text that is set as ruby. */
  var RubyText: String
  /**
    * This property stores XML attributes. They will be saved to and restored from automatic styles inside XML files.
    * @see com.sun.star.xml.AttributeContainer
    */
  var TextUserDefinedAttributes: XNameContainer
  /** This optional property contains the character style name for unvisited hyperlinks. */
  var UnvisitedCharStyleName: String
  /** This optional property contains the character style name for visited hyperlinks. */
  var VisitedCharStyleName: String
}

object CharacterProperties {
  @scala.inline
  def apply(
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
    CharFontFamily: Double,
    CharFontName: String,
    CharFontPitch: Double,
    CharFontStyleName: String,
    CharFontType: Double,
    CharHeight: Double,
    CharHidden: Boolean,
    CharHighlight: Color,
    CharInteropGrabBag: SafeArray[PropertyValue],
    CharKeepTogether: Boolean,
    CharKerning: Double,
    CharLeftBorder: BorderLine2,
    CharLeftBorderDistance: Double,
    CharLocale: Locale,
    CharNoHyphenation: Boolean,
    CharNoLineBreak: Boolean,
    CharPosture: FontSlant,
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
    CharWordMode: Boolean,
    HyperLinkName: String,
    HyperLinkTarget: String,
    HyperLinkURL: String,
    RubyAdjust: Double,
    RubyCharStyleName: String,
    RubyIsAbove: Boolean,
    RubyText: String,
    TextUserDefinedAttributes: XNameContainer,
    UnvisitedCharStyleName: String,
    VisitedCharStyleName: String
  ): CharacterProperties = {
    val __obj = js.Dynamic.literal(CharAutoKerning = CharAutoKerning.asInstanceOf[js.Any], CharBackColor = CharBackColor.asInstanceOf[js.Any], CharBackTransparent = CharBackTransparent.asInstanceOf[js.Any], CharBorderDistance = CharBorderDistance.asInstanceOf[js.Any], CharBottomBorder = CharBottomBorder.asInstanceOf[js.Any], CharBottomBorderDistance = CharBottomBorderDistance.asInstanceOf[js.Any], CharCaseMap = CharCaseMap.asInstanceOf[js.Any], CharColor = CharColor.asInstanceOf[js.Any], CharCombineIsOn = CharCombineIsOn.asInstanceOf[js.Any], CharCombinePrefix = CharCombinePrefix.asInstanceOf[js.Any], CharCombineSuffix = CharCombineSuffix.asInstanceOf[js.Any], CharContoured = CharContoured.asInstanceOf[js.Any], CharCrossedOut = CharCrossedOut.asInstanceOf[js.Any], CharEmphasis = CharEmphasis.asInstanceOf[js.Any], CharEscapement = CharEscapement.asInstanceOf[js.Any], CharEscapementHeight = CharEscapementHeight.asInstanceOf[js.Any], CharFlash = CharFlash.asInstanceOf[js.Any], CharFontCharSet = CharFontCharSet.asInstanceOf[js.Any], CharFontFamily = CharFontFamily.asInstanceOf[js.Any], CharFontName = CharFontName.asInstanceOf[js.Any], CharFontPitch = CharFontPitch.asInstanceOf[js.Any], CharFontStyleName = CharFontStyleName.asInstanceOf[js.Any], CharFontType = CharFontType.asInstanceOf[js.Any], CharHeight = CharHeight.asInstanceOf[js.Any], CharHidden = CharHidden.asInstanceOf[js.Any], CharHighlight = CharHighlight.asInstanceOf[js.Any], CharInteropGrabBag = CharInteropGrabBag.asInstanceOf[js.Any], CharKeepTogether = CharKeepTogether.asInstanceOf[js.Any], CharKerning = CharKerning.asInstanceOf[js.Any], CharLeftBorder = CharLeftBorder.asInstanceOf[js.Any], CharLeftBorderDistance = CharLeftBorderDistance.asInstanceOf[js.Any], CharLocale = CharLocale.asInstanceOf[js.Any], CharNoHyphenation = CharNoHyphenation.asInstanceOf[js.Any], CharNoLineBreak = CharNoLineBreak.asInstanceOf[js.Any], CharPosture = CharPosture.asInstanceOf[js.Any], CharRelief = CharRelief.asInstanceOf[js.Any], CharRightBorder = CharRightBorder.asInstanceOf[js.Any], CharRightBorderDistance = CharRightBorderDistance.asInstanceOf[js.Any], CharRotation = CharRotation.asInstanceOf[js.Any], CharRotationIsFitToLine = CharRotationIsFitToLine.asInstanceOf[js.Any], CharScaleWidth = CharScaleWidth.asInstanceOf[js.Any], CharShadingValue = CharShadingValue.asInstanceOf[js.Any], CharShadowFormat = CharShadowFormat.asInstanceOf[js.Any], CharShadowed = CharShadowed.asInstanceOf[js.Any], CharStrikeout = CharStrikeout.asInstanceOf[js.Any], CharStyleName = CharStyleName.asInstanceOf[js.Any], CharStyleNames = CharStyleNames.asInstanceOf[js.Any], CharTopBorder = CharTopBorder.asInstanceOf[js.Any], CharTopBorderDistance = CharTopBorderDistance.asInstanceOf[js.Any], CharUnderline = CharUnderline.asInstanceOf[js.Any], CharUnderlineColor = CharUnderlineColor.asInstanceOf[js.Any], CharUnderlineHasColor = CharUnderlineHasColor.asInstanceOf[js.Any], CharWeight = CharWeight.asInstanceOf[js.Any], CharWordMode = CharWordMode.asInstanceOf[js.Any], HyperLinkName = HyperLinkName.asInstanceOf[js.Any], HyperLinkTarget = HyperLinkTarget.asInstanceOf[js.Any], HyperLinkURL = HyperLinkURL.asInstanceOf[js.Any], RubyAdjust = RubyAdjust.asInstanceOf[js.Any], RubyCharStyleName = RubyCharStyleName.asInstanceOf[js.Any], RubyIsAbove = RubyIsAbove.asInstanceOf[js.Any], RubyText = RubyText.asInstanceOf[js.Any], TextUserDefinedAttributes = TextUserDefinedAttributes.asInstanceOf[js.Any], UnvisitedCharStyleName = UnvisitedCharStyleName.asInstanceOf[js.Any], VisitedCharStyleName = VisitedCharStyleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacterProperties]
  }
}

