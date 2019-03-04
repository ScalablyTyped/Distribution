package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the properties of a text table row.
  * @see com.sun.star.TextTable
  */
trait TextTableRow
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** specifies the color of the background. */
  var BackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** contains the name of the file filter of a background graphic. */
  var BackGraphicFilter: java.lang.String
  /**
    * determines the position of the background graphic.
    * @see GraphicLocation
    */
  var BackGraphicLocation: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation
  /** contains the URL of a background graphic. */
  var BackGraphicURL: java.lang.String
  /** If `TRUE` , the background color value in "BackColor" is not visible. */
  var BackTransparent: scala.Boolean
  /** contains the height of the table row. */
  var Height: scala.Double
  /** If the value of this property is `TRUE` , the height of the table row depends on the content of the table cells. */
  var IsAutoHeight: scala.Boolean
  /**
    * If `TRUE` , the row is allowed to be split at page or column breaks.
    * @@since OOo 2.0
    */
  var IsSplitAllowed: scala.Boolean
  /**
    * Grab bag of row properties, used as a string-any map for interop purposes.
    * @since LibreOffice 4.4  This property is intentionally not handled by the ODF filter. Any member that should be handled there should be first moved out
    */
  var RowInteropGrabBag: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /** contains the description of the columns in the table row. */
  var TableColumnSeparators: activexDashInteropLib.SafeArray[TableColumnSeparator]
}

object TextTableRow {
  @scala.inline
  def apply(
    BackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    BackGraphicFilter: java.lang.String,
    BackGraphicLocation: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation,
    BackGraphicURL: java.lang.String,
    BackTransparent: scala.Boolean,
    Height: scala.Double,
    IsAutoHeight: scala.Boolean,
    IsSplitAllowed: scala.Boolean,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RowInteropGrabBag: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    TableColumnSeparators: activexDashInteropLib.SafeArray[TableColumnSeparator],
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
  ): TextTableRow = {
    val __obj = js.Dynamic.literal(BackColor = BackColor, BackGraphicFilter = BackGraphicFilter, BackGraphicLocation = BackGraphicLocation, BackGraphicURL = BackGraphicURL, BackTransparent = BackTransparent, Height = Height, IsAutoHeight = IsAutoHeight, IsSplitAllowed = IsSplitAllowed, PropertySetInfo = PropertySetInfo, RowInteropGrabBag = RowInteropGrabBag, TableColumnSeparators = TableColumnSeparators, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[TextTableRow]
  }
}

