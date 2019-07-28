package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.GraphicLocation
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.BorderLine
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.UserDefinedAttributesSupplier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * service that holds all cell properties of a text table cell in a text document.
  * @see com.sun.star.text.Cell
  */
trait CellProperties
  extends XPropertySet
     with UserDefinedAttributesSupplier {
  /** contains the background color. */
  var BackColor: Color
  /** contains the name of the graphic filter of the background graphic. */
  var BackGraphicFilter: String
  /** determines the position of the background graphic. */
  var BackGraphicLocation: GraphicLocation
  /** contains the URL to the background graphic. */
  var BackGraphicURL: String
  /** determines whether the background is transparent. */
  var BackTransparent: Boolean
  /** contains the bottom border line. */
  var BottomBorder: BorderLine
  /** contains the distance of the bottom border. */
  var BottomBorderDistance: Double
  /** contains the cell name, see SwXTextTable::getCellByName for more information */
  var CellName: String
  /** determines whether the cell is write protected or not. */
  var IsProtected: Boolean
  /** contains the left border line. */
  var LeftBorder: BorderLine
  /** contains the distance of the left border. */
  var LeftBorderDistance: Double
  /** contains the number format. */
  var NumberFormat: Double
  /** contains the right border line. */
  var RightBorder: BorderLine
  /** contains the distance of the right border. */
  var RightBorderDistance: Double
  /** contains the text section the text table is contained in if there is any. */
  var TextSection: XTextSection
  /** contains the top border line. */
  var TopBorder: BorderLine
  /** contains the distance of the top border. */
  var TopBorderDistance: Double
  /**
    * the vertical orientation of the text inside of the table cells in this row.
    * @see VertOrientation
    */
  var VertOrient: Double
}

object CellProperties {
  @scala.inline
  def apply(
    BackColor: Color,
    BackGraphicFilter: String,
    BackGraphicLocation: GraphicLocation,
    BackGraphicURL: String,
    BackTransparent: Boolean,
    BottomBorder: BorderLine,
    BottomBorderDistance: Double,
    CellName: String,
    IsProtected: Boolean,
    LeftBorder: BorderLine,
    LeftBorderDistance: Double,
    NumberFormat: Double,
    PropertySetInfo: XPropertySetInfo,
    RightBorder: BorderLine,
    RightBorderDistance: Double,
    TextSection: XTextSection,
    TopBorder: BorderLine,
    TopBorderDistance: Double,
    UserDefinedAttributes: XNameContainer,
    VertOrient: Double,
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
  ): CellProperties = {
    val __obj = js.Dynamic.literal(BackColor = BackColor, BackGraphicFilter = BackGraphicFilter, BackGraphicLocation = BackGraphicLocation, BackGraphicURL = BackGraphicURL, BackTransparent = BackTransparent, BottomBorder = BottomBorder, BottomBorderDistance = BottomBorderDistance, CellName = CellName, IsProtected = IsProtected, LeftBorder = LeftBorder, LeftBorderDistance = LeftBorderDistance, NumberFormat = NumberFormat, PropertySetInfo = PropertySetInfo, RightBorder = RightBorder, RightBorderDistance = RightBorderDistance, TextSection = TextSection, TopBorder = TopBorder, TopBorderDistance = TopBorderDistance, UserDefinedAttributes = UserDefinedAttributes, VertOrient = VertOrient, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[CellProperties]
  }
}

