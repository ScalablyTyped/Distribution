package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.FontSlant
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellHoriJustify
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellOrientation
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.ShadowFormat
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.TableBorder
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.TableBorder2
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a field in an AutoFormat. A field contains all cell properties for a specific position in an AutoFormat. */
trait TableAutoFormatField extends XPropertySet {
  /** contains the cell background color. */
  var CellBackColor: Color
  /** contains the value of the text color. */
  var CharColor: Color
  /** is `TRUE` if the characters are contoured. */
  var CharContoured: Boolean
  /** is `TRUE` if the characters are crossed out. */
  var CharCrossedOut: Boolean
  /** contains the value of the character set of the western font. */
  var CharFontCharSet: String
  /** contains the value of the character set of the Asian font. */
  var CharFontCharSetAsian: String
  /** contains the value of the character set of the complex font. */
  var CharFontCharSetComplex: String
  /** contains the value of the western font family. */
  var CharFontFamily: String
  /** contains the value of the Asian font family. */
  var CharFontFamilyAsian: String
  /** contains the value of the complex font family. */
  var CharFontFamilyComplex: String
  /** specifies the name of the western font. */
  var CharFontName: String
  /** specifies the name of the Asian font. */
  var CharFontNameAsian: String
  /** specifies the name of the complex font. */
  var CharFontNameComplex: String
  /** contains the value of the pitch of the western font. */
  var CharFontPitch: String
  /** contains the value of the pitch of the Asian font. */
  var CharFontPitchAsian: String
  /** contains the value of the pitch of the complex font. */
  var CharFontPitchComplex: String
  /** specifies the name of the western font style. */
  var CharFontStyleName: String
  /** specifies the name of the Asian font style. */
  var CharFontStyleNameAsian: String
  /** specifies the name of the complex font style. */
  var CharFontStyleNameComplex: String
  /** contains the height of characters of the western font in point. */
  var CharHeight: Double
  /** contains the height of characters of the Asian font in point. */
  var CharHeightAsian: Double
  /** contains the height of characters of the complex font in point. */
  var CharHeightComplex: Double
  /** contains the value of the posture of characters of the western font. */
  var CharPosture: FontSlant
  /** contains the value of the posture of characters of the Asian font. */
  var CharPostureAsian: FontSlant
  /** contains the value of the posture of characters of the complex font. */
  var CharPostureComplex: FontSlant
  /** is `TRUE` if the characters are shadowed. */
  var CharShadowed: Boolean
  /** contains the value for the character underline. */
  var CharUnderline: Double
  /** contains the value for the weight of characters of the western font. */
  var CharWeight: Double
  /** contains the value for the weight of characters of the Asian font. */
  var CharWeightAsian: Double
  /** contains the value for the weight of characters of the complex font. */
  var CharWeightComplex: Double
  /** specifies the horizontal alignment of the cell contents. */
  var HoriJustify: CellHoriJustify
  /**
    * is `TRUE` if the cell background is transparent.
    *
    * In this case the {@link TableAutoFormatField.CellBackColor} value is not used.
    */
  var IsCellBackgroundTransparent: Boolean
  /** is `TRUE` if text breaks automatically at cell borders. */
  var IsTextWrapped: Boolean
  /** contains the orientation of the cell contents (i.e. top-to-bottom or stacked). */
  var Orientation: CellOrientation
  /** contains the margin between cell contents and bottom border (in 1/100 mm). */
  var ParaBottomMargin: Double
  /** contains the margin between cell contents and left border (in 1/100 mm). */
  var ParaLeftMargin: Double
  /** contains the margin between cell contents and right border (in 1/100 mm). */
  var ParaRightMargin: Double
  /** contains the margin between cell contents and top border (in 1/100 mm). */
  var ParaTopMargin: Double
  /** contains the rotation angle of the cell contents. */
  var RotateAngle: Double
  /**
    * contains the reference edge of the cell rotation.
    *
    * changed from {@link com.sun.star.table.CellVertJustify} to long in LibO 3.5
    * @see com.sun.star.table.CellVertJustify2
    */
  var RotateReference: Double
  /** contains a description of the shadow. */
  var ShadowFormat: typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.ShadowFormat
  /**
    * property containing a description of the cell border.
    * @since OOo 1.1.2
    */
  var TableBorder: typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.TableBorder
  /**
    * property containing a description of the cell border. Preferred over {@link com.sun.star.table.TableBorder}{@link TableBorder} .
    * @since LibreOffice 3.6
    */
  var TableBorder2: typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.TableBorder2
  /**
    * specifies the vertical alignment of the cell contents.
    *
    * changed from {@link com.sun.star.table.CellVertJustify} to long in LibO 3.5
    * @see com.sun.star.table.CellVertJustify2
    */
  var VertJustify: Double
}

object TableAutoFormatField {
  @scala.inline
  def apply(
    CellBackColor: Color,
    CharColor: Color,
    CharContoured: Boolean,
    CharCrossedOut: Boolean,
    CharFontCharSet: String,
    CharFontCharSetAsian: String,
    CharFontCharSetComplex: String,
    CharFontFamily: String,
    CharFontFamilyAsian: String,
    CharFontFamilyComplex: String,
    CharFontName: String,
    CharFontNameAsian: String,
    CharFontNameComplex: String,
    CharFontPitch: String,
    CharFontPitchAsian: String,
    CharFontPitchComplex: String,
    CharFontStyleName: String,
    CharFontStyleNameAsian: String,
    CharFontStyleNameComplex: String,
    CharHeight: Double,
    CharHeightAsian: Double,
    CharHeightComplex: Double,
    CharPosture: FontSlant,
    CharPostureAsian: FontSlant,
    CharPostureComplex: FontSlant,
    CharShadowed: Boolean,
    CharUnderline: Double,
    CharWeight: Double,
    CharWeightAsian: Double,
    CharWeightComplex: Double,
    HoriJustify: CellHoriJustify,
    IsCellBackgroundTransparent: Boolean,
    IsTextWrapped: Boolean,
    Orientation: CellOrientation,
    ParaBottomMargin: Double,
    ParaLeftMargin: Double,
    ParaRightMargin: Double,
    ParaTopMargin: Double,
    PropertySetInfo: XPropertySetInfo,
    RotateAngle: Double,
    RotateReference: Double,
    ShadowFormat: ShadowFormat,
    TableBorder: TableBorder,
    TableBorder2: TableBorder2,
    VertJustify: Double,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): TableAutoFormatField = {
    val __obj = js.Dynamic.literal(CellBackColor = CellBackColor, CharColor = CharColor, CharContoured = CharContoured, CharCrossedOut = CharCrossedOut, CharFontCharSet = CharFontCharSet, CharFontCharSetAsian = CharFontCharSetAsian, CharFontCharSetComplex = CharFontCharSetComplex, CharFontFamily = CharFontFamily, CharFontFamilyAsian = CharFontFamilyAsian, CharFontFamilyComplex = CharFontFamilyComplex, CharFontName = CharFontName, CharFontNameAsian = CharFontNameAsian, CharFontNameComplex = CharFontNameComplex, CharFontPitch = CharFontPitch, CharFontPitchAsian = CharFontPitchAsian, CharFontPitchComplex = CharFontPitchComplex, CharFontStyleName = CharFontStyleName, CharFontStyleNameAsian = CharFontStyleNameAsian, CharFontStyleNameComplex = CharFontStyleNameComplex, CharHeight = CharHeight, CharHeightAsian = CharHeightAsian, CharHeightComplex = CharHeightComplex, CharPosture = CharPosture, CharPostureAsian = CharPostureAsian, CharPostureComplex = CharPostureComplex, CharShadowed = CharShadowed, CharUnderline = CharUnderline, CharWeight = CharWeight, CharWeightAsian = CharWeightAsian, CharWeightComplex = CharWeightComplex, HoriJustify = HoriJustify, IsCellBackgroundTransparent = IsCellBackgroundTransparent, IsTextWrapped = IsTextWrapped, Orientation = Orientation, ParaBottomMargin = ParaBottomMargin, ParaLeftMargin = ParaLeftMargin, ParaRightMargin = ParaRightMargin, ParaTopMargin = ParaTopMargin, PropertySetInfo = PropertySetInfo, RotateAngle = RotateAngle, RotateReference = RotateReference, ShadowFormat = ShadowFormat, TableBorder = TableBorder, TableBorder2 = TableBorder2, VertJustify = VertJustify, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[TableAutoFormatField]
  }
}

