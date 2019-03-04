package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

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
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed
     with XHierarchiesSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloneable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** specifies which values are used. */
  var Filter: activexDashInteropLib.SafeArray[TableFilterField]
  /**
    * contains flags that control the usage of the dimension.
    * @see com.sun.star.sheet.DimensionFlags
    */
  var Flags: scala.Double
  /** specifies how data are aggregated. */
  var Function: GeneralFunction
  /**
    * specifies how data are aggregated.
    * @since LibreOffice 5.3
    */
  var Function2: scala.Double
  /** contains `TRUE` if this is the dimension used to layout the different data dimensions. */
  var IsDataLayoutDimension: scala.Boolean
  /** specifies where the dimension is used. */
  var Orientation: DataPilotFieldOrientation
  /** returns the name of the dimension from which this dimension was cloned, or `NULL` if it was not cloned. */
  var Original: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed
  /** specifies the position of the dimension within its orientation. */
  var Position: scala.Double
  /**
    * specifies which hierarchy of the dimension is used.
    * @see com.sun.star.sheet.DataPilotSourceHierarchies
    */
  var UsedHierarchy: scala.Double
}

object DataPilotSourceDimension {
  @scala.inline
  def apply(
    Filter: activexDashInteropLib.SafeArray[TableFilterField],
    Flags: scala.Double,
    Function: GeneralFunction,
    Function2: scala.Double,
    Hierarchies: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    IsDataLayoutDimension: scala.Boolean,
    Name: java.lang.String,
    Orientation: DataPilotFieldOrientation,
    Original: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed,
    Position: scala.Double,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    UsedHierarchy: scala.Double,
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
    createClone: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloneable],
    getHierarchies: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    getName: js.Function0[java.lang.String],
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
    setName: js.Function1[java.lang.String, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): DataPilotSourceDimension = {
    val __obj = js.Dynamic.literal(Filter = Filter, Flags = Flags, Function = Function, Function2 = Function2, Hierarchies = Hierarchies, IsDataLayoutDimension = IsDataLayoutDimension, Name = Name, Orientation = Orientation, Original = Original, Position = Position, PropertySetInfo = PropertySetInfo, UsedHierarchy = UsedHierarchy, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, createClone = createClone, getHierarchies = getHierarchies, getName = getName, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setName = setName, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[DataPilotSourceDimension]
  }
}

