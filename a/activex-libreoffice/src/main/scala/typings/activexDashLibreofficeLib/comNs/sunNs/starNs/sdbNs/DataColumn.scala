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
    Bytes: activexDashInteropLib.SafeArray[scala.Double],
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
    getArray: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XArray],
    getBinaryStream: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream],
    getBlob: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XBlob],
    getBoolean: js.Function0[scala.Boolean],
    getByte: js.Function0[scala.Double],
    getBytes: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    getCharacterStream: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream],
    getClob: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XClob],
    getDate: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date],
    getDouble: js.Function0[scala.Double],
    getFloat: js.Function0[scala.Double],
    getInt: js.Function0[scala.Double],
    getLong: js.Function0[scala.Double],
    getObject: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess, js.Any],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getRef: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XRef],
    getShort: js.Function0[scala.Double],
    getString: js.Function0[java.lang.String],
    getTime: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time],
    getTimestamp: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime],
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
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    updateBinaryStream: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, 
      scala.Double, 
      scala.Unit
    ],
    updateBoolean: js.Function1[scala.Boolean, scala.Unit],
    updateByte: js.Function1[scala.Double, scala.Unit],
    updateBytes: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Unit],
    updateCharacterStream: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, 
      scala.Double, 
      scala.Unit
    ],
    updateDate: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date, scala.Unit],
    updateDouble: js.Function1[scala.Double, scala.Unit],
    updateFloat: js.Function1[scala.Double, scala.Unit],
    updateInt: js.Function1[scala.Double, scala.Unit],
    updateLong: js.Function1[scala.Double, scala.Unit],
    updateNull: js.Function0[scala.Unit],
    updateNumericObject: js.Function2[js.Any, scala.Double, scala.Unit],
    updateObject: js.Function1[js.Any, scala.Unit],
    updateShort: js.Function1[scala.Double, scala.Unit],
    updateString: js.Function1[java.lang.String, scala.Unit],
    updateTime: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time, scala.Unit],
    updateTimestamp: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime, scala.Unit],
    wasNull: js.Function0[scala.Boolean]
  ): DataColumn = {
    val __obj = js.Dynamic.literal(Align = Align, Array = Array, BinaryStream = BinaryStream, Blob = Blob, Boolean = Boolean, Byte = Byte, Bytes = Bytes, CatalogName = CatalogName, CharacterStream = CharacterStream, Clob = Clob, ControlDefault = ControlDefault, ControlModel = ControlModel, Date = Date, DefaultValue = DefaultValue, Description = Description, DisplaySize = DisplaySize, Double = Double, Float = Float, FormatKey = FormatKey, HelpText = HelpText, Hidden = Hidden, Int = Int, IsAutoIncrement = IsAutoIncrement, IsCaseSensitive = IsCaseSensitive, IsCurrency = IsCurrency, IsDefinitelyWritable = IsDefinitelyWritable, IsNullable = IsNullable, IsReadOnly = IsReadOnly, IsRowVersion = IsRowVersion, IsSearchable = IsSearchable, IsSigned = IsSigned, IsWritable = IsWritable, Label = Label, Long = Long, Name = Name, OriginalValue = OriginalValue, Position = Position, Precision = Precision, PropertySetInfo = PropertySetInfo, Ref = Ref, Scale = Scale, SchemaName = SchemaName, ServiceName = ServiceName, Short = Short, String = String, TableName = TableName, Time = Time, Timestamp = Timestamp, Type = Type, TypeName = TypeName, Value = Value, Width = Width, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, createDataDescriptor = createDataDescriptor, getArray = getArray, getBinaryStream = getBinaryStream, getBlob = getBlob, getBoolean = getBoolean, getByte = getByte, getBytes = getBytes, getCharacterStream = getCharacterStream, getClob = getClob, getDate = getDate, getDouble = getDouble, getFloat = getFloat, getInt = getInt, getLong = getLong, getObject = getObject, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getRef = getRef, getShort = getShort, getString = getString, getTime = getTime, getTimestamp = getTimestamp, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue, updateBinaryStream = updateBinaryStream, updateBoolean = updateBoolean, updateByte = updateByte, updateBytes = updateBytes, updateCharacterStream = updateCharacterStream, updateDate = updateDate, updateDouble = updateDouble, updateFloat = updateFloat, updateInt = updateInt, updateLong = updateLong, updateNull = updateNull, updateNumericObject = updateNumericObject, updateObject = updateObject, updateShort = updateShort, updateString = updateString, updateTime = updateTime, updateTimestamp = updateTimestamp, wasNull = wasNull)
  
    __obj.asInstanceOf[DataColumn]
  }
}

