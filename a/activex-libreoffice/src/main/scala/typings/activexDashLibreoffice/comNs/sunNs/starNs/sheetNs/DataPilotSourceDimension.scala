package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNamed
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XCloneable
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a dimension in a data pilot source.
  *
  * A dimension is equivalent to a column of a cell range in a spreadsheet used for a data pilot field.
  *
  * In more complex data sources, a dimension may contain several hierarchies, which consolidate items of a complex data type, called levels.
  *
  * Example: In a database, a column contains date values. This column will be a dimension of the data pilot source. One hierarchy may contain the 3
  * levels year, month, day. Another hierarchy may contain the 2 levels year and week number.
  * @see com.sun.star.sheet.DataPilotSource
  * @see com.sun.star.sheet.DataPilotTable
  */
trait DataPilotSourceDimension
  extends XNamed
     with XHierarchiesSupplier
     with XCloneable
     with XPropertySet {
  /** specifies which values are used. */
  var Filter: SafeArray[TableFilterField]
  /**
    * contains flags that control the usage of the dimension.
    * @see com.sun.star.sheet.DimensionFlags
    */
  var Flags: Double
  /** specifies how data are aggregated. */
  var Function: GeneralFunction
  /**
    * specifies how data are aggregated.
    * @since LibreOffice 5.3
    */
  var Function2: Double
  /** contains `TRUE` if this is the dimension used to layout the different data dimensions. */
  var IsDataLayoutDimension: Boolean
  /** specifies where the dimension is used. */
  var Orientation: DataPilotFieldOrientation
  /** returns the name of the dimension from which this dimension was cloned, or `NULL` if it was not cloned. */
  var Original: XNamed
  /** specifies the position of the dimension within its orientation. */
  var Position: Double
  /**
    * specifies which hierarchy of the dimension is used.
    * @see com.sun.star.sheet.DataPilotSourceHierarchies
    */
  var UsedHierarchy: Double
}

object DataPilotSourceDimension {
  @scala.inline
  def apply(
    Filter: SafeArray[TableFilterField],
    Flags: Double,
    Function: GeneralFunction,
    Function2: Double,
    Hierarchies: XNameAccess,
    IsDataLayoutDimension: Boolean,
    Name: String,
    Orientation: DataPilotFieldOrientation,
    Original: XNamed,
    Position: Double,
    PropertySetInfo: XPropertySetInfo,
    UsedHierarchy: Double,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createClone: () => XCloneable,
    getHierarchies: () => XNameAccess,
    getName: () => String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setName: String => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): DataPilotSourceDimension = {
    val __obj = js.Dynamic.literal(Filter = Filter, Flags = Flags, Function = Function, Function2 = Function2, Hierarchies = Hierarchies, IsDataLayoutDimension = IsDataLayoutDimension, Name = Name, Orientation = Orientation, Original = Original, Position = Position, PropertySetInfo = PropertySetInfo, UsedHierarchy = UsedHierarchy, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createClone = js.Any.fromFunction0(createClone), getHierarchies = js.Any.fromFunction0(getHierarchies), getName = js.Any.fromFunction0(getName), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setName = js.Any.fromFunction1(setName), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[DataPilotSourceDimension]
  }
}

