package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** defines a column used for a result set which contains the data definition and the data of the column of the current row of a result set. */
trait DataColumn
  extends ResultColumn
     with XColumn
     with XColumnUpdate {
  /** contains the original value of the column. */
  var OriginalValue: js.Any
  /**
    * contains the column's value. This could be a constraint property, to veto modifications, if a new value does not fit into rules defined for the
    * column.
    */
  var Value: js.Any
}

object DataColumn {
  @scala.inline
  def apply(
    Align: scala.Double,
    Array: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XArray,
    BinaryStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    Blob: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XBlob,
    Boolean: scala.Boolean,
    Byte: scala.Double,
    Bytes: stdLib.SafeArray[scala.Double],
    CatalogName: java.lang.String,
    CharacterStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    Clob: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XClob,
    ControlDefault: java.lang.String,
    ControlModel: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    Date: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date,
    DefaultValue: java.lang.String,
    Description: java.lang.String,
    DisplaySize: scala.Double,
    Double: scala.Double,
    Float: scala.Double,
    FormatKey: scala.Double,
    HelpText: java.lang.String,
    Hidden: scala.Boolean,
    Int: scala.Double,
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
    Long: scala.Double,
    Name: java.lang.String,
    OriginalValue: js.Any,
    Position: scala.Double,
    Precision: scala.Double,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    Ref: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XRef,
    Scale: scala.Double,
    SchemaName: java.lang.String,
    ServiceName: java.lang.String,
    Short: scala.Double,
    String: java.lang.String,
    TableName: java.lang.String,
    Time: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time,
    Timestamp: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime,
    Type: scala.Double,
    TypeName: java.lang.String,
    Value: js.Any,
    Width: scala.Double,
    acquire: () => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    createDataDescriptor: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getArray: () => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XArray,
    getBinaryStream: () => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    getBlob: () => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XBlob,
    getBoolean: () => scala.Boolean,
    getByte: () => scala.Double,
    getBytes: () => stdLib.SafeArray[scala.Double],
    getCharacterStream: () => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    getClob: () => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XClob,
    getDate: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date,
    getDouble: () => scala.Double,
    getFloat: () => scala.Double,
    getInt: () => scala.Double,
    getLong: () => scala.Double,
    getObject: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess => js.Any,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    getRef: () => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XRef,
    getShort: () => scala.Double,
    getString: () => java.lang.String,
    getTime: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time,
    getTimestamp: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit,
    updateBinaryStream: (activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, scala.Double) => scala.Unit,
    updateBoolean: scala.Boolean => scala.Unit,
    updateByte: scala.Double => scala.Unit,
    updateBytes: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double] => scala.Unit,
    updateCharacterStream: (activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, scala.Double) => scala.Unit,
    updateDate: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date => scala.Unit,
    updateDouble: scala.Double => scala.Unit,
    updateFloat: scala.Double => scala.Unit,
    updateInt: scala.Double => scala.Unit,
    updateLong: scala.Double => scala.Unit,
    updateNull: () => scala.Unit,
    updateNumericObject: (js.Any, scala.Double) => scala.Unit,
    updateObject: js.Any => scala.Unit,
    updateShort: scala.Double => scala.Unit,
    updateString: java.lang.String => scala.Unit,
    updateTime: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time => scala.Unit,
    updateTimestamp: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime => scala.Unit,
    wasNull: () => scala.Boolean
  ): DataColumn = {
    val __obj = js.Dynamic.literal(Align = Align, Array = Array, BinaryStream = BinaryStream, Blob = Blob, Boolean = Boolean, Byte = Byte, Bytes = Bytes, CatalogName = CatalogName, CharacterStream = CharacterStream, Clob = Clob, ControlDefault = ControlDefault, ControlModel = ControlModel, Date = Date, DefaultValue = DefaultValue, Description = Description, DisplaySize = DisplaySize, Double = Double, Float = Float, FormatKey = FormatKey, HelpText = HelpText, Hidden = Hidden, Int = Int, IsAutoIncrement = IsAutoIncrement, IsCaseSensitive = IsCaseSensitive, IsCurrency = IsCurrency, IsDefinitelyWritable = IsDefinitelyWritable, IsNullable = IsNullable, IsReadOnly = IsReadOnly, IsRowVersion = IsRowVersion, IsSearchable = IsSearchable, IsSigned = IsSigned, IsWritable = IsWritable, Label = Label, Long = Long, Name = Name, OriginalValue = OriginalValue, Position = Position, Precision = Precision, PropertySetInfo = PropertySetInfo, Ref = Ref, Scale = Scale, SchemaName = SchemaName, ServiceName = ServiceName, Short = Short, String = String, TableName = TableName, Time = Time, Timestamp = Timestamp, Type = Type, TypeName = TypeName, Value = Value, Width = Width, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createDataDescriptor = js.Any.fromFunction0(createDataDescriptor), getArray = js.Any.fromFunction0(getArray), getBinaryStream = js.Any.fromFunction0(getBinaryStream), getBlob = js.Any.fromFunction0(getBlob), getBoolean = js.Any.fromFunction0(getBoolean), getByte = js.Any.fromFunction0(getByte), getBytes = js.Any.fromFunction0(getBytes), getCharacterStream = js.Any.fromFunction0(getCharacterStream), getClob = js.Any.fromFunction0(getClob), getDate = js.Any.fromFunction0(getDate), getDouble = js.Any.fromFunction0(getDouble), getFloat = js.Any.fromFunction0(getFloat), getInt = js.Any.fromFunction0(getInt), getLong = js.Any.fromFunction0(getLong), getObject = js.Any.fromFunction1(getObject), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRef = js.Any.fromFunction0(getRef), getShort = js.Any.fromFunction0(getShort), getString = js.Any.fromFunction0(getString), getTime = js.Any.fromFunction0(getTime), getTimestamp = js.Any.fromFunction0(getTimestamp), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), updateBinaryStream = js.Any.fromFunction2(updateBinaryStream), updateBoolean = js.Any.fromFunction1(updateBoolean), updateByte = js.Any.fromFunction1(updateByte), updateBytes = js.Any.fromFunction1(updateBytes), updateCharacterStream = js.Any.fromFunction2(updateCharacterStream), updateDate = js.Any.fromFunction1(updateDate), updateDouble = js.Any.fromFunction1(updateDouble), updateFloat = js.Any.fromFunction1(updateFloat), updateInt = js.Any.fromFunction1(updateInt), updateLong = js.Any.fromFunction1(updateLong), updateNull = js.Any.fromFunction0(updateNull), updateNumericObject = js.Any.fromFunction2(updateNumericObject), updateObject = js.Any.fromFunction1(updateObject), updateShort = js.Any.fromFunction1(updateShort), updateString = js.Any.fromFunction1(updateString), updateTime = js.Any.fromFunction1(updateTime), updateTimestamp = js.Any.fromFunction1(updateTimestamp), wasNull = js.Any.fromFunction0(wasNull))
  
    __obj.asInstanceOf[DataColumn]
  }
}

