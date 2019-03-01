package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs

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
  var CharAutoKerning: scala.Boolean
  /**
    * optional property which contains the value of the case-mapping of the text for formatting and displaying.
    * @see CaseMap
    */
  var CharCaseMap: scala.Double
  /** specifies the text color (RGB) of the control. */
  var CharColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * determines whether text is formatted in two lines.
    *
    * It is linked to the properties CharCombinePrefix and CharCombineSuffix.
    */
  var CharCombineIsOn: scala.Boolean
  /**
    * contains the prefix (usually parenthesis) before text that is formatted in two lines.
    *
    * It is linked to the properties CharCombineIsOn and CharCombineSuffix.
    */
  var CharCombinePrefix: java.lang.String
  /**
    * contains the suffix (usually parenthesis) after text that is formatted in two lines.
    *
    * It is linked to the properties CharCombineIsOn and CharCombinePrefix.
    */
  var CharCombineSuffix: java.lang.String
  /** specifies if the characters are formatted and displayed with a contour effect. */
  var CharContoured: scala.Boolean
  /** contains the font emphasis value as {@link com.sun.star.text.FontEmphasis} . */
  var CharEmphasis: scala.Double
  /**
    * specifies the percentage by which to raise/lower superscript/subscript characters.
    *
    * Negative values denote subscripts and positive values superscripts.
    */
  var CharEscapement: scala.Double
  /**
    * This is the additional height used for subscript or superscript characters in units of percent. For subscript characters the value is negative and for
    * superscript characters positive.
    */
  var CharEscapementHeight: scala.Double
  /** If this optional property is `TRUE` , then the characters are flashing. */
  var CharFlash: scala.Boolean
  /** This attribute contains the text encoding of the font as specified in {@link com.sun.star.awt.CharSet} . */
  var CharFontCharSet: scala.Double
  /** This property contains the text encoding of the font as specified in {@link com.sun.star.awt.CharSet} . */
  var CharFontCharSetAsian: scala.Double
  /** This property contains the text encoding of the font as specified in {@link com.sun.star.awt.CharSet} . */
  var CharFontCharSetComplex: scala.Double
  /** This attribute contains font family as specified in {@link com.sun.star.awt.FontFamily} . */
  var CharFontFamily: scala.Double
  /** This property contains font family as specified in {@link com.sun.star.awt.FontFamily} . */
  var CharFontFamilyAsian: scala.Double
  /** This property contains font family as specified in {@link com.sun.star.awt.FontFamily} . */
  var CharFontFamilyComplex: scala.Double
  /**
    * This attribute specifies the name of the font style.
    *
    * It may contain more than one name separated by comma.
    */
  var CharFontName: java.lang.String
  /**
    * This property specifies the name of the font style.
    *
    * It may contain more than one name separated by comma.
    */
  var CharFontNameAsian: java.lang.String
  /**
    * This property specifies the name of the font style.
    *
    * It may contain more than one name separated by comma.
    */
  var CharFontNameComplex: java.lang.String
  /** This attribute contains the font pitch as specified in {@link com.sun.star.awt.FontPitch} . */
  var CharFontPitch: scala.Double
  /** This property contains the font pitch as specified in {@link com.sun.star.awt.FontPitch} . */
  var CharFontPitchAsian: scala.Double
  /** This property contains the font pitch as specified in {@link com.sun.star.awt.FontPitch} . */
  var CharFontPitchComplex: scala.Double
  /**
    * This attribute contains the name of the font style.
    *
    * This attribute may be empty.
    */
  var CharFontStyleName: java.lang.String
  /**
    * This property contains the name of the font style.
    *
    * This property may be empty.
    */
  var CharFontStyleNameAsian: java.lang.String
  /**
    * This property contains the name of the font style.
    *
    * This property may be empty.
    */
  var CharFontStyleNameComplex: java.lang.String
  /** This value contains the height of the characters in point. */
  var CharHeight: scala.Double
  /** This value contains the height of the characters in point. */
  var CharHeightAsian: scala.Double
  /** This value contains the height of the characters in point. */
  var CharHeightComplex: scala.Double
  /**
    * If this optional property is `TRUE` , then the characters are invisible.
    * @since OOo 2.0
    */
  var CharHidden: scala.Boolean
  /** optional property which contains the value of the kerning of the characters. */
  var CharKerning: scala.Double
  /** contains the value of the locale. */
  var CharLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /** contains the value of the locale. */
  var CharLocaleAsian: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /** contains the value of the locale. */
  var CharLocaleComplex: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /**
    * This attribute contains the value of the posture of the document.
    * @see com.sun.star.awt.FontSlant
    */
  var CharPosture: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontSlant
  /**
    * This property contains the value of the posture of the document.
    * @see com.sun.star.awt.FontSlant
    */
  var CharPostureAsian: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontSlant
  /**
    * This property contains the value of the posture of the document.
    * @see com.sun.star.awt.FontSlant
    */
  var CharPostureComplex: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontSlant
  /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
  var CharRelief: scala.Double
  /**
    * determines the rotation of a character in degree.
    *
    * Depending on the implementation only certain values may be allowed.
    */
  var CharRotation: scala.Double
  /**
    * determines the percentage value for scaling the width of characters.
    *
    * The value refers to the original width which is denoted by 100, and it has to be greater than 0.
    */
  var CharScaleWidth: scala.Double
  /** specifies if the characters are formatted and displayed with a shadow effect. */
  var CharShadowed: scala.Boolean
  /**
    * determines the type of the strike out of the character.
    * @see com.sun.star.awt.FontStrikeout
    */
  var CharStrikeout: scala.Double
  /**
    * This attribute contains the value for the character underline.
    * @see com.sun.star.awt.FontUnderline
    */
  var CharUnderline: scala.Double
  /** specifies the text line color (RGB) of the control. */
  var CharUnderlineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * This attribute contains the value of the font weight.
    * @see com.sun.star.awt.FontWeight
    */
  var CharWeight: scala.Double
  /**
    * This property contains the value of the font weight.
    * @see com.sun.star.awt.FontWeight
    */
  var CharWeightAsian: scala.Double
  /**
    * This property contains the value of the font weight.
    * @see com.sun.star.awt.FontWeight
    */
  var CharWeightComplex: scala.Double
  /** If this attribute is `TRUE` , the underline and strike-through properties are not applied to white spaces. */
  var CharWordMode: scala.Boolean
  /** specifies the background color (RGB) of the control. */
  var ControlBackground: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** determines if the back ground color is set to transparent. */
  var ControlBackgroundTransparent: scala.Boolean
  /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
  var ControlTextEmphasis: scala.Double
  /** specifies the font attributes of the text in the control. */
  var FontDescriptor: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontDescriptor
  /** specifies the font attributes of the text in the control. */
  var FontDescriptorAsian: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontDescriptor
  /** specifies the font attributes of the text in the control. */
  var FontDescriptorComplex: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontDescriptor
  /** contains the name of the hyperlink (if set). */
  var HyperLinkName: java.lang.String
  /** contains the name of the target for a hyperlink (if set). */
  var HyperLinkTarget: java.lang.String
  /** contains the URL of a hyperlink (if set). */
  var HyperLinkURL: java.lang.String
  /**
    * specifies the horizontal alignment of the text.
    * @see com.sun.star.style.ParagraphAdjust
    */
  var ParaAdjust: scala.Double
  /** contains the character style name for unvisited hyperlinks. */
  var UnvisitedCharStyleName: java.lang.String
  /**
    * specifies the vertical alignment of the text in the control.
    * @see com.sun.star.style.VerticalAlignment
    */
  var VerticalAlign: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.VerticalAlignment
  /** contains the character style name for visited hyperlinks. */
  var VisitedCharStyleName: java.lang.String
}

object XReportControlFormat {
  @scala.inline
  def apply(
    CharAutoKerning: scala.Boolean,
    CharCaseMap: scala.Double,
    CharColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    CharCombineIsOn: scala.Boolean,
    CharCombinePrefix: java.lang.String,
    CharCombineSuffix: java.lang.String,
    CharContoured: scala.Boolean,
    CharEmphasis: scala.Double,
    CharEscapement: scala.Double,
    CharEscapementHeight: scala.Double,
    CharFlash: scala.Boolean,
    CharFontCharSet: scala.Double,
    CharFontCharSetAsian: scala.Double,
    CharFontCharSetComplex: scala.Double,
    CharFontFamily: scala.Double,
    CharFontFamilyAsian: scala.Double,
    CharFontFamilyComplex: scala.Double,
    CharFontName: java.lang.String,
    CharFontNameAsian: java.lang.String,
    CharFontNameComplex: java.lang.String,
    CharFontPitch: scala.Double,
    CharFontPitchAsian: scala.Double,
    CharFontPitchComplex: scala.Double,
    CharFontStyleName: java.lang.String,
    CharFontStyleNameAsian: java.lang.String,
    CharFontStyleNameComplex: java.lang.String,
    CharHeight: scala.Double,
    CharHeightAsian: scala.Double,
    CharHeightComplex: scala.Double,
    CharHidden: scala.Boolean,
    CharKerning: scala.Double,
    CharLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    CharLocaleAsian: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    CharLocaleComplex: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    CharPosture: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontSlant,
    CharPostureAsian: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontSlant,
    CharPostureComplex: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontSlant,
    CharRelief: scala.Double,
    CharRotation: scala.Double,
    CharScaleWidth: scala.Double,
    CharShadowed: scala.Boolean,
    CharStrikeout: scala.Double,
    CharUnderline: scala.Double,
    CharUnderlineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    CharWeight: scala.Double,
    CharWeightAsian: scala.Double,
    CharWeightComplex: scala.Double,
    CharWordMode: scala.Boolean,
    ControlBackground: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    ControlBackgroundTransparent: scala.Boolean,
    ControlTextEmphasis: scala.Double,
    FontDescriptor: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontDescriptor,
    FontDescriptorAsian: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontDescriptor,
    FontDescriptorComplex: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontDescriptor,
    HyperLinkName: java.lang.String,
    HyperLinkTarget: java.lang.String,
    HyperLinkURL: java.lang.String,
    ParaAdjust: scala.Double,
    UnvisitedCharStyleName: java.lang.String,
    VerticalAlign: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.VerticalAlignment,
    VisitedCharStyleName: java.lang.String
  ): XReportControlFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CharAutoKerning")(CharAutoKerning)
    __obj.updateDynamic("CharCaseMap")(CharCaseMap)
    __obj.updateDynamic("CharColor")(CharColor)
    __obj.updateDynamic("CharCombineIsOn")(CharCombineIsOn)
    __obj.updateDynamic("CharCombinePrefix")(CharCombinePrefix)
    __obj.updateDynamic("CharCombineSuffix")(CharCombineSuffix)
    __obj.updateDynamic("CharContoured")(CharContoured)
    __obj.updateDynamic("CharEmphasis")(CharEmphasis)
    __obj.updateDynamic("CharEscapement")(CharEscapement)
    __obj.updateDynamic("CharEscapementHeight")(CharEscapementHeight)
    __obj.updateDynamic("CharFlash")(CharFlash)
    __obj.updateDynamic("CharFontCharSet")(CharFontCharSet)
    __obj.updateDynamic("CharFontCharSetAsian")(CharFontCharSetAsian)
    __obj.updateDynamic("CharFontCharSetComplex")(CharFontCharSetComplex)
    __obj.updateDynamic("CharFontFamily")(CharFontFamily)
    __obj.updateDynamic("CharFontFamilyAsian")(CharFontFamilyAsian)
    __obj.updateDynamic("CharFontFamilyComplex")(CharFontFamilyComplex)
    __obj.updateDynamic("CharFontName")(CharFontName)
    __obj.updateDynamic("CharFontNameAsian")(CharFontNameAsian)
    __obj.updateDynamic("CharFontNameComplex")(CharFontNameComplex)
    __obj.updateDynamic("CharFontPitch")(CharFontPitch)
    __obj.updateDynamic("CharFontPitchAsian")(CharFontPitchAsian)
    __obj.updateDynamic("CharFontPitchComplex")(CharFontPitchComplex)
    __obj.updateDynamic("CharFontStyleName")(CharFontStyleName)
    __obj.updateDynamic("CharFontStyleNameAsian")(CharFontStyleNameAsian)
    __obj.updateDynamic("CharFontStyleNameComplex")(CharFontStyleNameComplex)
    __obj.updateDynamic("CharHeight")(CharHeight)
    __obj.updateDynamic("CharHeightAsian")(CharHeightAsian)
    __obj.updateDynamic("CharHeightComplex")(CharHeightComplex)
    __obj.updateDynamic("CharHidden")(CharHidden)
    __obj.updateDynamic("CharKerning")(CharKerning)
    __obj.updateDynamic("CharLocale")(CharLocale)
    __obj.updateDynamic("CharLocaleAsian")(CharLocaleAsian)
    __obj.updateDynamic("CharLocaleComplex")(CharLocaleComplex)
    __obj.updateDynamic("CharPosture")(CharPosture)
    __obj.updateDynamic("CharPostureAsian")(CharPostureAsian)
    __obj.updateDynamic("CharPostureComplex")(CharPostureComplex)
    __obj.updateDynamic("CharRelief")(CharRelief)
    __obj.updateDynamic("CharRotation")(CharRotation)
    __obj.updateDynamic("CharScaleWidth")(CharScaleWidth)
    __obj.updateDynamic("CharShadowed")(CharShadowed)
    __obj.updateDynamic("CharStrikeout")(CharStrikeout)
    __obj.updateDynamic("CharUnderline")(CharUnderline)
    __obj.updateDynamic("CharUnderlineColor")(CharUnderlineColor)
    __obj.updateDynamic("CharWeight")(CharWeight)
    __obj.updateDynamic("CharWeightAsian")(CharWeightAsian)
    __obj.updateDynamic("CharWeightComplex")(CharWeightComplex)
    __obj.updateDynamic("CharWordMode")(CharWordMode)
    __obj.updateDynamic("ControlBackground")(ControlBackground)
    __obj.updateDynamic("ControlBackgroundTransparent")(ControlBackgroundTransparent)
    __obj.updateDynamic("ControlTextEmphasis")(ControlTextEmphasis)
    __obj.updateDynamic("FontDescriptor")(FontDescriptor)
    __obj.updateDynamic("FontDescriptorAsian")(FontDescriptorAsian)
    __obj.updateDynamic("FontDescriptorComplex")(FontDescriptorComplex)
    __obj.updateDynamic("HyperLinkName")(HyperLinkName)
    __obj.updateDynamic("HyperLinkTarget")(HyperLinkTarget)
    __obj.updateDynamic("HyperLinkURL")(HyperLinkURL)
    __obj.updateDynamic("ParaAdjust")(ParaAdjust)
    __obj.updateDynamic("UnvisitedCharStyleName")(UnvisitedCharStyleName)
    __obj.updateDynamic("VerticalAlign")(VerticalAlign)
    __obj.updateDynamic("VisitedCharStyleName")(VisitedCharStyleName)
    __obj.asInstanceOf[XReportControlFormat]
  }
}

