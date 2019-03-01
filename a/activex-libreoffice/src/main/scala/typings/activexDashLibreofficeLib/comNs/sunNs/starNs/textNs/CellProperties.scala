package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * service that holds all cell properties of a text table cell in a text document.
  * @see com.sun.star.text.Cell
  */
trait CellProperties
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.UserDefinedAttributesSupplier {
  /** contains the background color. */
  var BackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** contains the name of the graphic filter of the background graphic. */
  var BackGraphicFilter: java.lang.String
  /** determines the position of the background graphic. */
  var BackGraphicLocation: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation
  /** contains the URL to the background graphic. */
  var BackGraphicURL: java.lang.String
  /** determines whether the background is transparent. */
  var BackTransparent: scala.Boolean
  /** contains the bottom border line. */
  var BottomBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine
  /** contains the distance of the bottom border. */
  var BottomBorderDistance: scala.Double
  /** contains the cell name, see SwXTextTable::getCellByName for more information */
  var CellName: java.lang.String
  /** determines whether the cell is write protected or not. */
  var IsProtected: scala.Boolean
  /** contains the left border line. */
  var LeftBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine
  /** contains the distance of the left border. */
  var LeftBorderDistance: scala.Double
  /** contains the number format. */
  var NumberFormat: scala.Double
  /** contains the right border line. */
  var RightBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine
  /** contains the distance of the right border. */
  var RightBorderDistance: scala.Double
  /** contains the text section the text table is contained in if there is any. */
  var TextSection: XTextSection
  /** contains the top border line. */
  var TopBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine
  /** contains the distance of the top border. */
  var TopBorderDistance: scala.Double
  /**
    * the vertical orientation of the text inside of the table cells in this row.
    * @see VertOrientation
    */
  var VertOrient: scala.Double
}

object CellProperties {
  @scala.inline
  def apply(
    BackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    BackGraphicFilter: java.lang.String,
    BackGraphicLocation: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation,
    BackGraphicURL: java.lang.String,
    BackTransparent: scala.Boolean,
    BottomBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    BottomBorderDistance: scala.Double,
    CellName: java.lang.String,
    IsProtected: scala.Boolean,
    LeftBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    LeftBorderDistance: scala.Double,
    NumberFormat: scala.Double,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RightBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    RightBorderDistance: scala.Double,
    TextSection: XTextSection,
    TopBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    TopBorderDistance: scala.Double,
    UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    VertOrient: scala.Double,
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
  ): CellProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BackColor")(BackColor)
    __obj.updateDynamic("BackGraphicFilter")(BackGraphicFilter)
    __obj.updateDynamic("BackGraphicLocation")(BackGraphicLocation)
    __obj.updateDynamic("BackGraphicURL")(BackGraphicURL)
    __obj.updateDynamic("BackTransparent")(BackTransparent)
    __obj.updateDynamic("BottomBorder")(BottomBorder)
    __obj.updateDynamic("BottomBorderDistance")(BottomBorderDistance)
    __obj.updateDynamic("CellName")(CellName)
    __obj.updateDynamic("IsProtected")(IsProtected)
    __obj.updateDynamic("LeftBorder")(LeftBorder)
    __obj.updateDynamic("LeftBorderDistance")(LeftBorderDistance)
    __obj.updateDynamic("NumberFormat")(NumberFormat)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("RightBorder")(RightBorder)
    __obj.updateDynamic("RightBorderDistance")(RightBorderDistance)
    __obj.updateDynamic("TextSection")(TextSection)
    __obj.updateDynamic("TopBorder")(TopBorder)
    __obj.updateDynamic("TopBorderDistance")(TopBorderDistance)
    __obj.updateDynamic("UserDefinedAttributes")(UserDefinedAttributes)
    __obj.updateDynamic("VertOrient")(VertOrient)
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
    __obj.asInstanceOf[CellProperties]
  }
}

