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
@js.native
trait CharacterProperties extends js.Object {
  /**
    * This optional property determines whether the kerning tables from the current font are used.
    *
    * Automatic **kerning** applies a spacing in between certain pairs of characters to make the text look better.
    */
  var CharAutoKerning: Boolean = js.native
  /** This optional property contains the text background color. */
  var CharBackColor: Color = js.native
  /** This property determines if the text background color is set to transparent. */
  var CharBackTransparent: Boolean = js.native
  /**
    * This property contains the distance from the border to the object.
    * @since LibreOffice 4.2
    */
  var CharBorderDistance: Double = js.native
  /**
    * This property contains the bottom border of the object.
    * @since LibreOffice 4.2
    */
  var CharBottomBorder: BorderLine2 = js.native
  /**
    * This property contains the distance from the bottom border to the object.
    * @since LibreOffice 4.2
    */
  var CharBottomBorderDistance: Double = js.native
  /**
    * This optional property contains the value of the case-mapping of the text for formatting and displaying.
    * @see CaseMap
    */
  var CharCaseMap: Double = js.native
  /** This property contains the value of the text color. */
  var CharColor: Color = js.native
  /**
    * This optional property determines whether text is formatted in two lines.
    *
    * It is linked to the properties CharCombinePrefix and CharCombineSuffix.
    */
  var CharCombineIsOn: Boolean = js.native
  /**
    * This optional property contains the prefix (usually parenthesis) before text that is formatted in two lines.
    *
    * It is linked to the properties CharCombineIsOn and CharCombineSuffix.
    */
  var CharCombinePrefix: String = js.native
  /**
    * This optional property contains the suffix (usually parenthesis) after text that is formatted in two lines.
    *
    * It is linked to the properties CharCombineIsOn and CharCombinePrefix.
    */
  var CharCombineSuffix: String = js.native
  /** This optional property specifies if the characters are formatted and displayed with a contour effect. */
  var CharContoured: Boolean = js.native
  /** This property is `TRUE` if the characters are crossed out. */
  var CharCrossedOut: Boolean = js.native
  /**
    * This optional property contains the font emphasis value.
    * @see com.sun.star.text.FontEmphasis
    */
  var CharEmphasis: Double = js.native
  /**
    * specifies the percentage by which to raise/lower superscript/subscript characters.
    *
    * Negative values denote subscripts and positive values superscripts.
    * @see CharEscapementHeight
    */
  var CharEscapement: Double = js.native
  /**
    * This is the relative height used for subscript or superscript characters in units of percent.
    *
    * The value 100 denotes the original height of the characters.
    * @see CharEscapement
    */
  var CharEscapementHeight: Double = js.native
  /** If this optional property is `TRUE` , then the characters are flashing. */
  var CharFlash: Boolean = js.native
  /**
    * This property contains the text encoding of the font.
    * @see com.sun.star.awt.CharSet
    */
  var CharFontCharSet: Double = js.native
  /**
    * This property contains font family.
    * @see com.sun.star.awt.FontFamily
    */
  var CharFontFamily: Double = js.native
  /**
    * This property specifies the name of the font style.
    *
    * It may contain more than one name separated by comma.
    */
  var CharFontName: String = js.native
  /**
    * This property contains the font pitch.
    * @see com.sun.star.awt.FontPitch
    */
  var CharFontPitch: Double = js.native
  /**
    * This property contains the name of the font style.
    *
    * This property may be empty.
    */
  var CharFontStyleName: String = js.native
  /**
    * This optional property specifies the fundamental technology of the font.
    * @see com.sun.star.awt.FontType
    */
  var CharFontType: Double = js.native
  /** This value contains the height of the characters in point. */
  var CharHeight: Double = js.native
  /**
    * If this optional property is `TRUE` , then the characters are invisible.
    * @since OOo 2.0
    */
  var CharHidden: Boolean = js.native
  /**
    * Determines the color of the highlight.
    * @since LibreOffice 4.2
    */
  var CharHighlight: Color = js.native
  /**
    * Grab bag of character properties, used as a string-any map for interim interop purposes.
    * @since LibreOffice 4.3  This property is intentionally not handled by the ODF filter. Any member that should be handled there should be first moved out
    */
  var CharInteropGrabBag: SafeArray[PropertyValue] = js.native
  /**
    * This optional property marks a range of characters to prevent it from being broken into two lines.
    *
    * A line break is applied before the range of characters if the layout makes a break necessary within the range.
    */
  var CharKeepTogether: Boolean = js.native
  /** This optional property contains the value of the kerning of the characters. */
  var CharKerning: Double = js.native
  /**
    * This property contains the left border of the object.
    * @since LibreOffice 4.2
    */
  var CharLeftBorder: BorderLine2 = js.native
  /**
    * This property contains the distance from the left border to the object.
    * @since LibreOffice 4.2
    */
  var CharLeftBorderDistance: Double = js.native
  /** This property contains the value of the locale. */
  var CharLocale: Locale = js.native
  /** This optional property determines if the word can be hyphenated at the character. */
  var CharNoHyphenation: Boolean = js.native
  /**
    * This optional property marks a range of characters to ignore a line break in this area.
    *
    * A line break is applied behind the range of characters if the layout makes a break necessary within the range. That means that the text may go through
    * the border.
    */
  var CharNoLineBreak: Boolean = js.native
  /**
    * This property contains the value of the posture of the document.
    * @see com.sun.star.awt.FontSlant
    */
  var CharPosture: FontSlant = js.native
  /**
    * This optional property contains the relief style of the characters.
    * @see com.sun.star.text.FontRelief
    */
  var CharRelief: Double = js.native
  /**
    * This property contains the right border of the object.
    * @since LibreOffice 4.2
    */
  var CharRightBorder: BorderLine2 = js.native
  /**
    * This property contains the distance from the right border to the object.
    * @since LibreOffice 4.2
    */
  var CharRightBorderDistance: Double = js.native
  /**
    * This optional property determines the rotation of a character in tenths of a degree.
    *
    * Depending on the implementation only certain values may be allowed.
    */
  var CharRotation: Double = js.native
  /** This optional property determines whether the text formatting tries to fit rotated text into the surrounded line height. */
  var CharRotationIsFitToLine: Boolean = js.native
  /**
    * This optional property determines the percentage value for scaling the width of characters.
    *
    * The value refers to the original width which is denoted by 100, and it has to be greater than 0.
    */
  var CharScaleWidth: Double = js.native
  /** This optional property contains the text shading value. */
  var CharShadingValue: Double = js.native
  /**
    * Determines the type, color, and width of the shadow.
    * @since LibreOffice 4.2
    */
  var CharShadowFormat: ShadowFormat = js.native
  /** This optional property specifies if the characters are formatted and displayed with a shadow effect. */
  var CharShadowed: Boolean = js.native
  /**
    * This property determines the type of the strike out of the character.
    * @see com.sun.star.awt.FontStrikeout
    */
  var CharStrikeout: Double = js.native
  /** This optional property specifies the name of the style of the font. */
  var CharStyleName: String = js.native
  /**
    * This optional property specifies the names of the all styles applied to the font.
    *
    * It is not guaranteed that the order in the sequence reflects the order of the evaluation of the character style attributes.
    * @since OOo 1.1.2
    */
  var CharStyleNames: SafeArray[String] = js.native
  /**
    * This property contains the top border of the object.
    * @since LibreOffice 4.2
    */
  var CharTopBorder: BorderLine2 = js.native
  /**
    * This property contains the distance from the top border to the object.
    * @since LibreOffice 4.2
    */
  var CharTopBorderDistance: Double = js.native
  /**
    * This property contains the value for the character underline.
    * @see com.sun.star.awt.FontUnderline
    */
  var CharUnderline: Double = js.native
  /**
    * This property contains the color of the underline for the characters.
    * @see CharUnderlineHasColor
    */
  var CharUnderlineColor: Color = js.native
  /**
    * This property specifies if the property CharUnderlineColor is used for an underline.
    * @see CharUnderlineColor
    */
  var CharUnderlineHasColor: Boolean = js.native
  /**
    * This property contains the value of the font weight.
    * @see com.sun.star.awt.FontWeight
    */
  var CharWeight: Double = js.native
  /** If this property is `TRUE` , the underline and strike-through properties are not applied to white spaces. */
  var CharWordMode: Boolean = js.native
  /** This optional property contains the name of the hyperlink. */
  var HyperLinkName: String = js.native
  /** This optional property contains the name of the target for a hyperlink. */
  var HyperLinkTarget: String = js.native
  /** This optional property contains the URL of a hyperlink. */
  var HyperLinkURL: String = js.native
  /**
    * This optional property determines the adjustment of the ruby .
    * @see com.sun.star.text.RubyAdjust
    */
  var RubyAdjust: Double = js.native
  /** This optional property contains the name of the character style that is applied to RubyText. */
  var RubyCharStyleName: String = js.native
  /** This optional property determines whether the ruby text is printed above/left or below/right of the text. */
  var RubyIsAbove: Boolean = js.native
  /** This optional property contains the text that is set as ruby. */
  var RubyText: String = js.native
  /**
    * This property stores XML attributes. They will be saved to and restored from automatic styles inside XML files.
    * @see com.sun.star.xml.AttributeContainer
    */
  var TextUserDefinedAttributes: XNameContainer = js.native
  /** This optional property contains the character style name for unvisited hyperlinks. */
  var UnvisitedCharStyleName: String = js.native
  /** This optional property contains the character style name for visited hyperlinks. */
  var VisitedCharStyleName: String = js.native
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
  @scala.inline
  implicit class CharacterPropertiesOps[Self <: CharacterProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCharAutoKerning(value: Boolean): Self = this.set("CharAutoKerning", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharBackColor(value: Color): Self = this.set("CharBackColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharBackTransparent(value: Boolean): Self = this.set("CharBackTransparent", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharBorderDistance(value: Double): Self = this.set("CharBorderDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharBottomBorder(value: BorderLine2): Self = this.set("CharBottomBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharBottomBorderDistance(value: Double): Self = this.set("CharBottomBorderDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharCaseMap(value: Double): Self = this.set("CharCaseMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharColor(value: Color): Self = this.set("CharColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharCombineIsOn(value: Boolean): Self = this.set("CharCombineIsOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharCombinePrefix(value: String): Self = this.set("CharCombinePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharCombineSuffix(value: String): Self = this.set("CharCombineSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharContoured(value: Boolean): Self = this.set("CharContoured", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharCrossedOut(value: Boolean): Self = this.set("CharCrossedOut", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharEmphasis(value: Double): Self = this.set("CharEmphasis", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharEscapement(value: Double): Self = this.set("CharEscapement", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharEscapementHeight(value: Double): Self = this.set("CharEscapementHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharFlash(value: Boolean): Self = this.set("CharFlash", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharFontCharSet(value: Double): Self = this.set("CharFontCharSet", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharFontFamily(value: Double): Self = this.set("CharFontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharFontName(value: String): Self = this.set("CharFontName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharFontPitch(value: Double): Self = this.set("CharFontPitch", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharFontStyleName(value: String): Self = this.set("CharFontStyleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharFontType(value: Double): Self = this.set("CharFontType", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharHeight(value: Double): Self = this.set("CharHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharHidden(value: Boolean): Self = this.set("CharHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharHighlight(value: Color): Self = this.set("CharHighlight", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharInteropGrabBag(value: SafeArray[PropertyValue]): Self = this.set("CharInteropGrabBag", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharKeepTogether(value: Boolean): Self = this.set("CharKeepTogether", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharKerning(value: Double): Self = this.set("CharKerning", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharLeftBorder(value: BorderLine2): Self = this.set("CharLeftBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharLeftBorderDistance(value: Double): Self = this.set("CharLeftBorderDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharLocale(value: Locale): Self = this.set("CharLocale", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharNoHyphenation(value: Boolean): Self = this.set("CharNoHyphenation", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharNoLineBreak(value: Boolean): Self = this.set("CharNoLineBreak", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharPosture(value: FontSlant): Self = this.set("CharPosture", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharRelief(value: Double): Self = this.set("CharRelief", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharRightBorder(value: BorderLine2): Self = this.set("CharRightBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharRightBorderDistance(value: Double): Self = this.set("CharRightBorderDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharRotation(value: Double): Self = this.set("CharRotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharRotationIsFitToLine(value: Boolean): Self = this.set("CharRotationIsFitToLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharScaleWidth(value: Double): Self = this.set("CharScaleWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharShadingValue(value: Double): Self = this.set("CharShadingValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharShadowFormat(value: ShadowFormat): Self = this.set("CharShadowFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharShadowed(value: Boolean): Self = this.set("CharShadowed", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharStrikeout(value: Double): Self = this.set("CharStrikeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharStyleName(value: String): Self = this.set("CharStyleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharStyleNames(value: SafeArray[String]): Self = this.set("CharStyleNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharTopBorder(value: BorderLine2): Self = this.set("CharTopBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharTopBorderDistance(value: Double): Self = this.set("CharTopBorderDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharUnderline(value: Double): Self = this.set("CharUnderline", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharUnderlineColor(value: Color): Self = this.set("CharUnderlineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharUnderlineHasColor(value: Boolean): Self = this.set("CharUnderlineHasColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharWeight(value: Double): Self = this.set("CharWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharWordMode(value: Boolean): Self = this.set("CharWordMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setHyperLinkName(value: String): Self = this.set("HyperLinkName", value.asInstanceOf[js.Any])
    @scala.inline
    def setHyperLinkTarget(value: String): Self = this.set("HyperLinkTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setHyperLinkURL(value: String): Self = this.set("HyperLinkURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setRubyAdjust(value: Double): Self = this.set("RubyAdjust", value.asInstanceOf[js.Any])
    @scala.inline
    def setRubyCharStyleName(value: String): Self = this.set("RubyCharStyleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRubyIsAbove(value: Boolean): Self = this.set("RubyIsAbove", value.asInstanceOf[js.Any])
    @scala.inline
    def setRubyText(value: String): Self = this.set("RubyText", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextUserDefinedAttributes(value: XNameContainer): Self = this.set("TextUserDefinedAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnvisitedCharStyleName(value: String): Self = this.set("UnvisitedCharStyleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisitedCharStyleName(value: String): Self = this.set("VisitedCharStyleName", value.asInstanceOf[js.Any])
  }
  
}

