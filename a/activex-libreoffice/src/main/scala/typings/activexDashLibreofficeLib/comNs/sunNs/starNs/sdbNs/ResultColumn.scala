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
    val __obj = js.Dynamic.literal(Align = Align, CatalogName = CatalogName, ControlDefault = ControlDefault, ControlModel = ControlModel, DefaultValue = DefaultValue, Description = Description, DisplaySize = DisplaySize, FormatKey = FormatKey, HelpText = HelpText, Hidden = Hidden, IsAutoIncrement = IsAutoIncrement, IsCaseSensitive = IsCaseSensitive, IsCurrency = IsCurrency, IsDefinitelyWritable = IsDefinitelyWritable, IsNullable = IsNullable, IsReadOnly = IsReadOnly, IsRowVersion = IsRowVersion, IsSearchable = IsSearchable, IsSigned = IsSigned, IsWritable = IsWritable, Label = Label, Name = Name, Position = Position, Precision = Precision, PropertySetInfo = PropertySetInfo, Scale = Scale, SchemaName = SchemaName, ServiceName = ServiceName, TableName = TableName, Type = Type, TypeName = TypeName, Width = Width, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, createDataDescriptor = createDataDescriptor, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[ResultColumn]
  }
}

