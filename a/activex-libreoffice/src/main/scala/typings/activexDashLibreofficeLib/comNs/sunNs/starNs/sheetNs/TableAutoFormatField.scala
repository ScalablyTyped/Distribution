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
    acquire: js.Function0[scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): TableAutoFormatField = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CellBackColor")(CellBackColor)
    __obj.updateDynamic("CharColor")(CharColor)
    __obj.updateDynamic("CharContoured")(CharContoured)
    __obj.updateDynamic("CharCrossedOut")(CharCrossedOut)
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
    __obj.updateDynamic("CharPosture")(CharPosture)
    __obj.updateDynamic("CharPostureAsian")(CharPostureAsian)
    __obj.updateDynamic("CharPostureComplex")(CharPostureComplex)
    __obj.updateDynamic("CharShadowed")(CharShadowed)
    __obj.updateDynamic("CharUnderline")(CharUnderline)
    __obj.updateDynamic("CharWeight")(CharWeight)
    __obj.updateDynamic("CharWeightAsian")(CharWeightAsian)
    __obj.updateDynamic("CharWeightComplex")(CharWeightComplex)
    __obj.updateDynamic("HoriJustify")(HoriJustify)
    __obj.updateDynamic("IsCellBackgroundTransparent")(IsCellBackgroundTransparent)
    __obj.updateDynamic("IsTextWrapped")(IsTextWrapped)
    __obj.updateDynamic("Orientation")(Orientation)
    __obj.updateDynamic("ParaBottomMargin")(ParaBottomMargin)
    __obj.updateDynamic("ParaLeftMargin")(ParaLeftMargin)
    __obj.updateDynamic("ParaRightMargin")(ParaRightMargin)
    __obj.updateDynamic("ParaTopMargin")(ParaTopMargin)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("RotateAngle")(RotateAngle)
    __obj.updateDynamic("RotateReference")(RotateReference)
    __obj.updateDynamic("ShadowFormat")(ShadowFormat)
    __obj.updateDynamic("TableBorder")(TableBorder)
    __obj.updateDynamic("TableBorder2")(TableBorder2)
    __obj.updateDynamic("VertJustify")(VertJustify)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.asInstanceOf[TableAutoFormatField]
  }
}

