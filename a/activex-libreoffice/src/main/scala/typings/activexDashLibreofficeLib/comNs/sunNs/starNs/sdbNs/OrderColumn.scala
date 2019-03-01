package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a column which is part of the ORDER clause.
  * @see com.sun.star.sdb.XSingleSelectQueryComposer
  */
trait OrderColumn
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.Column {
  /** describes which sort order this column has. The default is `TRUE` . */
  var IsAscending: scala.Boolean
}

object OrderColumn {
  @scala.inline
  def apply(
    DefaultValue: java.lang.String,
    Description: java.lang.String,
    IsAscending: scala.Boolean,
    IsAutoIncrement: scala.Boolean,
    IsCurrency: scala.Boolean,
    IsNullable: scala.Double,
    IsRowVersion: scala.Boolean,
    Name: java.lang.String,
    Precision: scala.Double,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    Scale: scala.Double,
    Type: scala.Double,
    TypeName: java.lang.String,
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
    createDataDescriptor: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
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
  ): OrderColumn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DefaultValue")(DefaultValue)
    __obj.updateDynamic("Description")(Description)
    __obj.updateDynamic("IsAscending")(IsAscending)
    __obj.updateDynamic("IsAutoIncrement")(IsAutoIncrement)
    __obj.updateDynamic("IsCurrency")(IsCurrency)
    __obj.updateDynamic("IsNullable")(IsNullable)
    __obj.updateDynamic("IsRowVersion")(IsRowVersion)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Precision")(Precision)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("Scale")(Scale)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("TypeName")(TypeName)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("createDataDescriptor")(createDataDescriptor)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.asInstanceOf[OrderColumn]
  }
}

