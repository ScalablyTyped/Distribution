package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a field in an AutoFormat. A field contains all cell properties for a specific position in an AutoFormat. */
trait TableAutoFormatField
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** contains the cell background color. */
  var CellBackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** contains the value of the text color. */
  var CharColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** is `TRUE` if the characters are contoured. */
  var CharContoured: scala.Boolean
  /** is `TRUE` if the characters are crossed out. */
  var CharCrossedOut: scala.Boolean
  /** contains the value of the character set of the western font. */
  var CharFontCharSet: java.lang.String
  /** contains the value of the character set of the Asian font. */
  var CharFontCharSetAsian: java.lang.String
  /** contains the value of the character set of the complex font. */
  var CharFontCharSetComplex: java.lang.String
  /** contains the value of the western font family. */
  var CharFontFamily: java.lang.String
  /** contains the value of the Asian font family. */
  var CharFontFamilyAsian: java.lang.String
  /** contains the value of the complex font family. */
  var CharFontFamilyComplex: java.lang.String
  /** specifies the name of the western font. */
  var CharFontName: java.lang.String
  /** specifies the name of the Asian font. */
  var CharFontNameAsian: java.lang.String
  /** specifies the name of the complex font. */
  var CharFontNameComplex: java.lang.String
  /** contains the value of the pitch of the western font. */
  var CharFontPitch: java.lang.String
  /** contains the value of the pitch of the Asian font. */
  var CharFontPitchAsian: java.lang.String
  /** contains the value of the pitch of the complex font. */
  var CharFontPitchComplex: java.lang.String
  /** specifies the name of the western font style. */
  var CharFontStyleName: java.lang.String
  /** specifies the name of the Asian font style. */
  var CharFontStyleNameAsian: java.lang.String
  /** specifies the name of the complex font style. */
  var CharFontStyleNameComplex: java.lang.String
  /** contains the height of characters of the western font in point. */
  var CharHeight: scala.Double
  /** contains the height of characters of the Asian font in point. */
  var CharHeightAsian: scala.Double
  /** contains the height of characters of the complex font in point. */
  var CharHeightComplex: scala.Double
  /** contains the value of the posture of characters of the western font. */
  var CharPosture: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontSlant
  /** contains the value of the posture of characters of the Asian font. */
  var CharPostureAsian: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontSlant
  /** contains the value of the posture of characters of the complex font. */
  var CharPostureComplex: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontSlant
  /** is `TRUE` if the characters are shadowed. */
  var CharShadowed: scala.Boolean
  /** contains the value for the character underline. */
  var CharUnderline: scala.Double
  /** contains the value for the weight of characters of the western font. */
  var CharWeight: scala.Double
  /** contains the value for the weight of characters of the Asian font. */
  var CharWeightAsian: scala.Double
  /** contains the value for the weight of characters of the complex font. */
  var CharWeightComplex: scala.Double
  /** specifies the horizontal alignment of the cell contents. */
  var HoriJustify: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellHoriJustify
  /**
    * is `TRUE` if the cell background is transparent.
    *
    * In this case the {@link TableAutoFormatField.CellBackColor} value is not used.
    */
  var IsCellBackgroundTransparent: scala.Boolean
  /** is `TRUE` if text breaks automatically at cell borders. */
  var IsTextWrapped: scala.Boolean
  /** contains the orientation of the cell contents (i.e. top-to-bottom or stacked). */
  var Orientation: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellOrientation
  /** contains the margin between cell contents and bottom border (in 1/100 mm). */
  var ParaBottomMargin: scala.Double
  /** contains the margin between cell contents and left border (in 1/100 mm). */
  var ParaLeftMargin: scala.Double
  /** contains the margin between cell contents and right border (in 1/100 mm). */
  var ParaRightMargin: scala.Double
  /** contains the margin between cell contents and top border (in 1/100 mm). */
  var ParaTopMargin: scala.Double
  /** contains the rotation angle of the cell contents. */
  var RotateAngle: scala.Double
  /**
    * contains the reference edge of the cell rotation.
    *
    * changed from {@link com.sun.star.table.CellVertJustify} to long in LibO 3.5
    * @see com.sun.star.table.CellVertJustify2
    */
  var RotateReference: scala.Double
  /** contains a description of the shadow. */
  var ShadowFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ShadowFormat
  /**
    * property containing a description of the cell border.
    * @since OOo 1.1.2
    */
  var TableBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableBorder
  /**
    * property containing a description of the cell border. Preferred over {@link com.sun.star.table.TableBorder}{@link TableBorder} .
    * @since LibreOffice 3.6
    */
  var TableBorder2: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableBorder2
  /**
    * specifies the vertical alignment of the cell contents.
    *
    * changed from {@link com.sun.star.table.CellVertJustify} to long in LibO 3.5
    * @see com.sun.star.table.CellVertJustify2
    */
  var VertJustify: scala.Double
}

