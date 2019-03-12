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

object TableAutoFormatField {
  @scala.inline
  def apply(
    CellBackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    CharColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    CharContoured: scala.Boolean,
    CharCrossedOut: scala.Boolean,
    CharFontCharSet: java.lang.String,
    CharFontCharSetAsian: java.lang.String,
    CharFontCharSetComplex: java.lang.String,
    CharFontFamily: java.lang.String,
    CharFontFamilyAsian: java.lang.String,
    CharFontFamilyComplex: java.lang.String,
    CharFontName: java.lang.String,
    CharFontNameAsian: java.lang.String,
    CharFontNameComplex: java.lang.String,
    CharFontPitch: java.lang.String,
    CharFontPitchAsian: java.lang.String,
    CharFontPitchComplex: java.lang.String,
    CharFontStyleName: java.lang.String,
    CharFontStyleNameAsian: java.lang.String,
    CharFontStyleNameComplex: java.lang.String,
    CharHeight: scala.Double,
    CharHeightAsian: scala.Double,
    CharHeightComplex: scala.Double,
    CharPosture: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontSlant,
    CharPostureAsian: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontSlant,
    CharPostureComplex: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontSlant,
    CharShadowed: scala.Boolean,
    CharUnderline: scala.Double,
    CharWeight: scala.Double,
    CharWeightAsian: scala.Double,
    CharWeightComplex: scala.Double,
    HoriJustify: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellHoriJustify,
    IsCellBackgroundTransparent: scala.Boolean,
    IsTextWrapped: scala.Boolean,
    Orientation: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellOrientation,
    ParaBottomMargin: scala.Double,
    ParaLeftMargin: scala.Double,
    ParaRightMargin: scala.Double,
    ParaTopMargin: scala.Double,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RotateAngle: scala.Double,
    RotateReference: scala.Double,
    ShadowFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ShadowFormat,
    TableBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableBorder,
    TableBorder2: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableBorder2,
    VertJustify: scala.Double,
    acquire: () => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit
  ): TableAutoFormatField = {
    val __obj = js.Dynamic.literal(CellBackColor = CellBackColor, CharColor = CharColor, CharContoured = CharContoured, CharCrossedOut = CharCrossedOut, CharFontCharSet = CharFontCharSet, CharFontCharSetAsian = CharFontCharSetAsian, CharFontCharSetComplex = CharFontCharSetComplex, CharFontFamily = CharFontFamily, CharFontFamilyAsian = CharFontFamilyAsian, CharFontFamilyComplex = CharFontFamilyComplex, CharFontName = CharFontName, CharFontNameAsian = CharFontNameAsian, CharFontNameComplex = CharFontNameComplex, CharFontPitch = CharFontPitch, CharFontPitchAsian = CharFontPitchAsian, CharFontPitchComplex = CharFontPitchComplex, CharFontStyleName = CharFontStyleName, CharFontStyleNameAsian = CharFontStyleNameAsian, CharFontStyleNameComplex = CharFontStyleNameComplex, CharHeight = CharHeight, CharHeightAsian = CharHeightAsian, CharHeightComplex = CharHeightComplex, CharPosture = CharPosture, CharPostureAsian = CharPostureAsian, CharPostureComplex = CharPostureComplex, CharShadowed = CharShadowed, CharUnderline = CharUnderline, CharWeight = CharWeight, CharWeightAsian = CharWeightAsian, CharWeightComplex = CharWeightComplex, HoriJustify = HoriJustify, IsCellBackgroundTransparent = IsCellBackgroundTransparent, IsTextWrapped = IsTextWrapped, Orientation = Orientation, ParaBottomMargin = ParaBottomMargin, ParaLeftMargin = ParaLeftMargin, ParaRightMargin = ParaRightMargin, ParaTopMargin = ParaTopMargin, PropertySetInfo = PropertySetInfo, RotateAngle = RotateAngle, RotateReference = RotateReference, ShadowFormat = ShadowFormat, TableBorder = TableBorder, TableBorder2 = TableBorder2, VertJustify = VertJustify, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[TableAutoFormatField]
  }
}

