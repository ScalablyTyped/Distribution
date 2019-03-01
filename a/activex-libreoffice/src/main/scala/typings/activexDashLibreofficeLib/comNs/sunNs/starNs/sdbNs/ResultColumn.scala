package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes a column of a result set. */
trait ResultColumn
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.Column
     with ColumnSettings {
  /** gets a column's table's catalog name. */
  var CatalogName: java.lang.String
  /** indicates the column's normal max width in chars. */
  var DisplaySize: scala.Double
  /** indicates that a column is case sensitive. */
  var IsCaseSensitive: scala.Boolean
  /** indicates whether a write on the column will definitely succeed. */
  var IsDefinitelyWritable: scala.Boolean
  /** indicates whether a column is definitely, not writable. */
  var IsReadOnly: scala.Boolean
  /** indicates whether the column can be used in a Where clause. */
  var IsSearchable: scala.Boolean
  /** indicates whether values in the column are signed numbers. */
  var IsSigned: scala.Boolean
  /** indicates whether it is possible for a write on the column to succeed. */
  var IsWritable: scala.Boolean
  /** gets the suggested column title for use in printouts and displays. */
  var Label: java.lang.String
  /** gets a column's schema name. */
  var SchemaName: java.lang.String
  /**
    * returns the fully-qualified name of the service whose instances are manufactured if the method {@link com.sun.star.sdbc.XRow.getObject} )= is called
    * to retrieve a value from the column.
    */
  var ServiceName: java.lang.String
  /** gets a column's table name. */
  var TableName: java.lang.String
}

object ResultColumn {
  @scala.inline
  def apply(
    Align: scala.Double,
    CatalogName: java.lang.String,
    ControlDefault: java.lang.String,
    ControlModel: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    DefaultValue: java.lang.String,
    Description: java.lang.String,
    DisplaySize: scala.Double,
    FormatKey: scala.Double,
    HelpText: java.lang.String,
    Hidden: scala.Boolean,
    IsAutoIncrement: scala.Boolean,
    IsCaseSensitive: scala.Boolean,
    IsCurrency: scala.Boolean,
    IsDefinitelyWritable: scala.Boolean,
    IsNullable: scala.Double,
    IsReadOnly: scala.Boolean,
    IsRowVersion: scala.Boolean,
    IsSearchable: scala.Boolean,
    IsSigned: scala.Boolean,
    IsWritable: scala.Boolean,
    Label: java.lang.String,
    Name: java.lang.String,
    Position: scala.Double,
    Precision: scala.Double,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    Scale: scala.Double,
    SchemaName: java.lang.String,
    ServiceName: java.lang.String,
    TableName: java.lang.String,
    Type: scala.Double,
    TypeName: java.lang.String,
    Width: scala.Double,
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
  ): ResultColumn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Align")(Align)
    __obj.updateDynamic("CatalogName")(CatalogName)
    __obj.updateDynamic("ControlDefault")(ControlDefault)
    __obj.updateDynamic("ControlModel")(ControlModel)
    __obj.updateDynamic("DefaultValue")(DefaultValue)
    __obj.updateDynamic("Description")(Description)
    __obj.updateDynamic("DisplaySize")(DisplaySize)
    __obj.updateDynamic("FormatKey")(FormatKey)
    __obj.updateDynamic("HelpText")(HelpText)
    __obj.updateDynamic("Hidden")(Hidden)
    __obj.updateDynamic("IsAutoIncrement")(IsAutoIncrement)
    __obj.updateDynamic("IsCaseSensitive")(IsCaseSensitive)
    __obj.updateDynamic("IsCurrency")(IsCurrency)
    __obj.updateDynamic("IsDefinitelyWritable")(IsDefinitelyWritable)
    __obj.updateDynamic("IsNullable")(IsNullable)
    __obj.updateDynamic("IsReadOnly")(IsReadOnly)
    __obj.updateDynamic("IsRowVersion")(IsRowVersion)
    __obj.updateDynamic("IsSearchable")(IsSearchable)
    __obj.updateDynamic("IsSigned")(IsSigned)
    __obj.updateDynamic("IsWritable")(IsWritable)
    __obj.updateDynamic("Label")(Label)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Position")(Position)
    __obj.updateDynamic("Precision")(Precision)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("Scale")(Scale)
    __obj.updateDynamic("SchemaName")(SchemaName)
    __obj.updateDynamic("ServiceName")(ServiceName)
    __obj.updateDynamic("TableName")(TableName)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("TypeName")(TypeName)
    __obj.updateDynamic("Width")(Width)
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
    __obj.asInstanceOf[ResultColumn]
  }
}

