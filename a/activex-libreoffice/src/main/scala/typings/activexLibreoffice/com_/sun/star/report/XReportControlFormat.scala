package typings.activexLibreoffice.com_.sun.star.report

import typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor
import typings.activexLibreoffice.com_.sun.star.awt.FontSlant
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.style.VerticalAlignment
import typings.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a format condition for a control. */
trait XReportControlFormat extends js.Object {
  /**
    * optional property to determine whether the kerning tables from the current font are used.
    *
    * Automatic **kerning** applies a spacing in between certain pairs of characters to make the text look better.
    */
  var CharAutoKerning: Boolean
  /**
    * optional property which contains the value of the case-mapping of the text for formatting and displaying.
    * @see CaseMap
    */
  var CharCaseMap: Double
  /** specifies the text color (RGB) of the control. */
  var CharColor: Color
  /**
    * determines whether text is formatted in two lines.
    *
    * It is linked to the properties CharCombinePrefix and CharCombineSuffix.
    */
  var CharCombineIsOn: Boolean
  /**
    * contains the prefix (usually parenthesis) before text that is formatted in two lines.
    *
    * It is linked to the properties CharCombineIsOn and CharCombineSuffix.
    */
  var CharCombinePrefix: String
  /**
    * contains the suffix (usually parenthesis) after text that is formatted in two lines.
    *
    * It is linked to the properties CharCombineIsOn and CharCombinePrefix.
    */
  var CharCombineSuffix: String
  /** specifies if the characters are formatted and displayed with a contour effect. */
  var CharContoured: Boolean
  /** contains the font emphasis value as {@link com.sun.star.text.FontEmphasis} . */
  var CharEmphasis: Double
  /**
    * specifies the percentage by which to raise/lower superscript/subscript characters.
    *
    * Negative values denote subscripts and positive values superscripts.
    */
  var CharEscapement: Double
  /**
    * This is the additional height used for subscript or superscript characters in units of percent. For subscript characters the value is negative and for
    * superscript characters positive.
    */
  var CharEscapementHeight: Double
  /** If this optional property is `TRUE` , then the characters are flashing. */
  var CharFlash: Boolean
  /** This attribute contains the text encoding of the font as specified in {@link com.sun.star.awt.CharSet} . */
  var CharFontCharSet: Double
  /** This property contains the text encoding of the font as specified in {@link com.sun.star.awt.CharSet} . */
  var CharFontCharSetAsian: Double
  /** This property contains the text encoding of the font as specified in {@link com.sun.star.awt.CharSet} . */
  var CharFontCharSetComplex: Double
  /** This attribute contains font family as specified in {@link com.sun.star.awt.FontFamily} . */
  var CharFontFamily: Double
  /** This property contains font family as specified in {@link com.sun.star.awt.FontFamily} . */
  var CharFontFamilyAsian: Double
  /** This property contains font family as specified in {@link com.sun.star.awt.FontFamily} . */
  var CharFontFamilyComplex: Double
  /**
    * This attribute specifies the name of the font style.
    *
    * It may contain more than one name separated by comma.
    */
  var CharFontName: String
  /**
    * This property specifies the name of the font style.
    *
    * It may contain more than one name separated by comma.
    */
  var CharFontNameAsian: String
  /**
    * This property specifies the name of the font style.
    *
    * It may contain more than one name separated by comma.
    */
  var CharFontNameComplex: String
  /** This attribute contains the font pitch as specified in {@link com.sun.star.awt.FontPitch} . */
  var CharFontPitch: Double
  /** This property contains the font pitch as specified in {@link com.sun.star.awt.FontPitch} . */
  var CharFontPitchAsian: Double
  /** This property contains the font pitch as specified in {@link com.sun.star.awt.FontPitch} . */
  var CharFontPitchComplex: Double
  /**
    * This attribute contains the name of the font style.
    *
    * This attribute may be empty.
    */
  var CharFontStyleName: String
  /**
    * This property contains the name of the font style.
    *
    * This property may be empty.
    */
  var CharFontStyleNameAsian: String
  /**
    * This property contains the name of the font style.
    *
    * This property may be empty.
    */
  var CharFontStyleNameComplex: String
  /** This value contains the height of the characters in point. */
  var CharHeight: Double
  /** This value contains the height of the characters in point. */
  var CharHeightAsian: Double
  /** This value contains the height of the characters in point. */
  var CharHeightComplex: Double
  /**
    * If this optional property is `TRUE` , then the characters are invisible.
    * @since OOo 2.0
    */
  var CharHidden: Boolean
  /** optional property which contains the value of the kerning of the characters. */
  var CharKerning: Double
  /** contains the value of the locale. */
  var CharLocale: Locale
  /** contains the value of the locale. */
  var CharLocaleAsian: Locale
  /** contains the value of the locale. */
  var CharLocaleComplex: Locale
  /**
    * This attribute contains the value of the posture of the document.
    * @see com.sun.star.awt.FontSlant
    */
  var CharPosture: FontSlant
  /**
    * This property contains the value of the posture of the document.
    * @see com.sun.star.awt.FontSlant
    */
  var CharPostureAsian: FontSlant
  /**
    * This property contains the value of the posture of the document.
    * @see com.sun.star.awt.FontSlant
    */
  var CharPostureComplex: FontSlant
  /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
  var CharRelief: Double
  /**
    * determines the rotation of a character in degree.
    *
    * Depending on the implementation only certain values may be allowed.
    */
  var CharRotation: Double
  /**
    * determines the percentage value for scaling the width of characters.
    *
    * The value refers to the original width which is denoted by 100, and it has to be greater than 0.
    */
  var CharScaleWidth: Double
  /** specifies if the characters are formatted and displayed with a shadow effect. */
  var CharShadowed: Boolean
  /**
    * determines the type of the strike out of the character.
    * @see com.sun.star.awt.FontStrikeout
    */
  var CharStrikeout: Double
  /**
    * This attribute contains the value for the character underline.
    * @see com.sun.star.awt.FontUnderline
    */
  var CharUnderline: Double
  /** specifies the text line color (RGB) of the control. */
  var CharUnderlineColor: Color
  /**
    * This attribute contains the value of the font weight.
    * @see com.sun.star.awt.FontWeight
    */
  var CharWeight: Double
  /**
    * This property contains the value of the font weight.
    * @see com.sun.star.awt.FontWeight
    */
  var CharWeightAsian: Double
  /**
    * This property contains the value of the font weight.
    * @see com.sun.star.awt.FontWeight
    */
  var CharWeightComplex: Double
  /** If this attribute is `TRUE` , the underline and strike-through properties are not applied to white spaces. */
  var CharWordMode: Boolean
  /** specifies the background color (RGB) of the control. */
  var ControlBackground: Color
  /** determines if the back ground color is set to transparent. */
  var ControlBackgroundTransparent: Boolean
  /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
  var ControlTextEmphasis: Double
  /** specifies the font attributes of the text in the control. */
  var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor
  /** specifies the font attributes of the text in the control. */
  var FontDescriptorAsian: FontDescriptor
  /** specifies the font attributes of the text in the control. */
  var FontDescriptorComplex: FontDescriptor
  /** contains the name of the hyperlink (if set). */
  var HyperLinkName: String
  /** contains the name of the target for a hyperlink (if set). */
  var HyperLinkTarget: String
  /** contains the URL of a hyperlink (if set). */
  var HyperLinkURL: String
  /**
    * specifies the horizontal alignment of the text.
    * @see com.sun.star.style.ParagraphAdjust
    */
  var ParaAdjust: Double
  /** contains the character style name for unvisited hyperlinks. */
  var UnvisitedCharStyleName: String
  /**
    * specifies the vertical alignment of the text in the control.
    * @see com.sun.star.style.VerticalAlignment
    */
  var VerticalAlign: VerticalAlignment
  /** contains the character style name for visited hyperlinks. */
  var VisitedCharStyleName: String
}

object XReportControlFormat {
  @scala.inline
  def apply(
    CharAutoKerning: Boolean,
    CharCaseMap: Double,
    CharColor: Color,
    CharCombineIsOn: Boolean,
    CharCombinePrefix: String,
    CharCombineSuffix: String,
    CharContoured: Boolean,
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
    CharHeight: Double,
    CharHeightAsian: Double,
    CharHeightComplex: Double,
    CharHidden: Boolean,
    CharKerning: Double,
    CharLocale: Locale,
    CharLocaleAsian: Locale,
    CharLocaleComplex: Locale,
    CharPosture: FontSlant,
    CharPostureAsian: FontSlant,
    CharPostureComplex: FontSlant,
    CharRelief: Double,
    CharRotation: Double,
    CharScaleWidth: Double,
    CharShadowed: Boolean,
    CharStrikeout: Double,
    CharUnderline: Double,
    CharUnderlineColor: Color,
    CharWeight: Double,
    CharWeightAsian: Double,
    CharWeightComplex: Double,
    CharWordMode: Boolean,
    ControlBackground: Color,
    ControlBackgroundTransparent: Boolean,
    ControlTextEmphasis: Double,
    FontDescriptor: FontDescriptor,
    FontDescriptorAsian: FontDescriptor,
    FontDescriptorComplex: FontDescriptor,
    HyperLinkName: String,
    HyperLinkTarget: String,
    HyperLinkURL: String,
    ParaAdjust: Double,
    UnvisitedCharStyleName: String,
    VerticalAlign: VerticalAlignment,
    VisitedCharStyleName: String
  ): XReportControlFormat = {
    val __obj = js.Dynamic.literal(CharAutoKerning = CharAutoKerning.asInstanceOf[js.Any], CharCaseMap = CharCaseMap.asInstanceOf[js.Any], CharColor = CharColor.asInstanceOf[js.Any], CharCombineIsOn = CharCombineIsOn.asInstanceOf[js.Any], CharCombinePrefix = CharCombinePrefix.asInstanceOf[js.Any], CharCombineSuffix = CharCombineSuffix.asInstanceOf[js.Any], CharContoured = CharContoured.asInstanceOf[js.Any], CharEmphasis = CharEmphasis.asInstanceOf[js.Any], CharEscapement = CharEscapement.asInstanceOf[js.Any], CharEscapementHeight = CharEscapementHeight.asInstanceOf[js.Any], CharFlash = CharFlash.asInstanceOf[js.Any], CharFontCharSet = CharFontCharSet.asInstanceOf[js.Any], CharFontCharSetAsian = CharFontCharSetAsian.asInstanceOf[js.Any], CharFontCharSetComplex = CharFontCharSetComplex.asInstanceOf[js.Any], CharFontFamily = CharFontFamily.asInstanceOf[js.Any], CharFontFamilyAsian = CharFontFamilyAsian.asInstanceOf[js.Any], CharFontFamilyComplex = CharFontFamilyComplex.asInstanceOf[js.Any], CharFontName = CharFontName.asInstanceOf[js.Any], CharFontNameAsian = CharFontNameAsian.asInstanceOf[js.Any], CharFontNameComplex = CharFontNameComplex.asInstanceOf[js.Any], CharFontPitch = CharFontPitch.asInstanceOf[js.Any], CharFontPitchAsian = CharFontPitchAsian.asInstanceOf[js.Any], CharFontPitchComplex = CharFontPitchComplex.asInstanceOf[js.Any], CharFontStyleName = CharFontStyleName.asInstanceOf[js.Any], CharFontStyleNameAsian = CharFontStyleNameAsian.asInstanceOf[js.Any], CharFontStyleNameComplex = CharFontStyleNameComplex.asInstanceOf[js.Any], CharHeight = CharHeight.asInstanceOf[js.Any], CharHeightAsian = CharHeightAsian.asInstanceOf[js.Any], CharHeightComplex = CharHeightComplex.asInstanceOf[js.Any], CharHidden = CharHidden.asInstanceOf[js.Any], CharKerning = CharKerning.asInstanceOf[js.Any], CharLocale = CharLocale.asInstanceOf[js.Any], CharLocaleAsian = CharLocaleAsian.asInstanceOf[js.Any], CharLocaleComplex = CharLocaleComplex.asInstanceOf[js.Any], CharPosture = CharPosture.asInstanceOf[js.Any], CharPostureAsian = CharPostureAsian.asInstanceOf[js.Any], CharPostureComplex = CharPostureComplex.asInstanceOf[js.Any], CharRelief = CharRelief.asInstanceOf[js.Any], CharRotation = CharRotation.asInstanceOf[js.Any], CharScaleWidth = CharScaleWidth.asInstanceOf[js.Any], CharShadowed = CharShadowed.asInstanceOf[js.Any], CharStrikeout = CharStrikeout.asInstanceOf[js.Any], CharUnderline = CharUnderline.asInstanceOf[js.Any], CharUnderlineColor = CharUnderlineColor.asInstanceOf[js.Any], CharWeight = CharWeight.asInstanceOf[js.Any], CharWeightAsian = CharWeightAsian.asInstanceOf[js.Any], CharWeightComplex = CharWeightComplex.asInstanceOf[js.Any], CharWordMode = CharWordMode.asInstanceOf[js.Any], ControlBackground = ControlBackground.asInstanceOf[js.Any], ControlBackgroundTransparent = ControlBackgroundTransparent.asInstanceOf[js.Any], ControlTextEmphasis = ControlTextEmphasis.asInstanceOf[js.Any], FontDescriptor = FontDescriptor.asInstanceOf[js.Any], FontDescriptorAsian = FontDescriptorAsian.asInstanceOf[js.Any], FontDescriptorComplex = FontDescriptorComplex.asInstanceOf[js.Any], HyperLinkName = HyperLinkName.asInstanceOf[js.Any], HyperLinkTarget = HyperLinkTarget.asInstanceOf[js.Any], HyperLinkURL = HyperLinkURL.asInstanceOf[js.Any], ParaAdjust = ParaAdjust.asInstanceOf[js.Any], UnvisitedCharStyleName = UnvisitedCharStyleName.asInstanceOf[js.Any], VerticalAlign = VerticalAlign.asInstanceOf[js.Any], VisitedCharStyleName = VisitedCharStyleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[XReportControlFormat]
  }
}

