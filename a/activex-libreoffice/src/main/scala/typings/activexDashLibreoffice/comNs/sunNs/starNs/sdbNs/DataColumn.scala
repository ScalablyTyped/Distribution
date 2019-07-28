package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XInputStream
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XArray
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XBlob
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XClob
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XRef
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Date
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.DateTime
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Time
import typings.std.SafeArray
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
    Align: Double,
    Array: XArray,
    BinaryStream: XInputStream,
    Blob: XBlob,
    Boolean: Boolean,
    Byte: Double,
    Bytes: SafeArray[Double],
    CatalogName: String,
    CharacterStream: XInputStream,
    Clob: XClob,
    ControlDefault: String,
    ControlModel: XPropertySet,
    Date: Date,
    DefaultValue: String,
    Description: String,
    DisplaySize: Double,
    Double: Double,
    Float: Double,
    FormatKey: Double,
    HelpText: String,
    Hidden: Boolean,
    Int: Double,
    IsAutoIncrement: Boolean,
    IsCaseSensitive: Boolean,
    IsCurrency: Boolean,
    IsDefinitelyWritable: Boolean,
    IsNullable: Double,
    IsReadOnly: Boolean,
    IsRowVersion: Boolean,
    IsSearchable: Boolean,
    IsSigned: Boolean,
    IsWritable: Boolean,
    Label: String,
    Long: Double,
    Name: String,
    OriginalValue: js.Any,
    Position: Double,
    Precision: Double,
    PropertySetInfo: XPropertySetInfo,
    Ref: XRef,
    Scale: Double,
    SchemaName: String,
    ServiceName: String,
    Short: Double,
    String: String,
    TableName: String,
    Time: Time,
    Timestamp: DateTime,
    Type: Double,
    TypeName: String,
    Value: js.Any,
    Width: Double,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createDataDescriptor: () => XPropertySet,
    getArray: () => XArray,
    getBinaryStream: () => XInputStream,
    getBlob: () => XBlob,
    getBoolean: () => Boolean,
    getByte: () => Double,
    getBytes: () => SafeArray[Double],
    getCharacterStream: () => XInputStream,
    getClob: () => XClob,
    getDate: () => Date,
    getDouble: () => Double,
    getFloat: () => Double,
    getInt: () => Double,
    getLong: () => Double,
    getObject: XNameAccess => js.Any,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getRef: () => XRef,
    getShort: () => Double,
    getString: () => String,
    getTime: () => Time,
    getTimestamp: () => DateTime,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    updateBinaryStream: (XInputStream, Double) => Unit,
    updateBoolean: Boolean => Unit,
    updateByte: Double => Unit,
    updateBytes: SeqEquiv[Double] => Unit,
    updateCharacterStream: (XInputStream, Double) => Unit,
    updateDate: Date => Unit,
    updateDouble: Double => Unit,
    updateFloat: Double => Unit,
    updateInt: Double => Unit,
    updateLong: Double => Unit,
    updateNull: () => Unit,
    updateNumericObject: (js.Any, Double) => Unit,
    updateObject: js.Any => Unit,
    updateShort: Double => Unit,
    updateString: String => Unit,
    updateTime: Time => Unit,
    updateTimestamp: DateTime => Unit,
    wasNull: () => Boolean
  ): DataColumn = {
    val __obj = js.Dynamic.literal(Align = Align, Array = Array, BinaryStream = BinaryStream, Blob = Blob, Boolean = Boolean, Byte = Byte, Bytes = Bytes, CatalogName = CatalogName, CharacterStream = CharacterStream, Clob = Clob, ControlDefault = ControlDefault, ControlModel = ControlModel, Date = Date, DefaultValue = DefaultValue, Description = Description, DisplaySize = DisplaySize, Double = Double, Float = Float, FormatKey = FormatKey, HelpText = HelpText, Hidden = Hidden, Int = Int, IsAutoIncrement = IsAutoIncrement, IsCaseSensitive = IsCaseSensitive, IsCurrency = IsCurrency, IsDefinitelyWritable = IsDefinitelyWritable, IsNullable = IsNullable, IsReadOnly = IsReadOnly, IsRowVersion = IsRowVersion, IsSearchable = IsSearchable, IsSigned = IsSigned, IsWritable = IsWritable, Label = Label, Long = Long, Name = Name, OriginalValue = OriginalValue, Position = Position, Precision = Precision, PropertySetInfo = PropertySetInfo, Ref = Ref, Scale = Scale, SchemaName = SchemaName, ServiceName = ServiceName, Short = Short, String = String, TableName = TableName, Time = Time, Timestamp = Timestamp, Type = Type, TypeName = TypeName, Value = Value, Width = Width, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createDataDescriptor = js.Any.fromFunction0(createDataDescriptor), getArray = js.Any.fromFunction0(getArray), getBinaryStream = js.Any.fromFunction0(getBinaryStream), getBlob = js.Any.fromFunction0(getBlob), getBoolean = js.Any.fromFunction0(getBoolean), getByte = js.Any.fromFunction0(getByte), getBytes = js.Any.fromFunction0(getBytes), getCharacterStream = js.Any.fromFunction0(getCharacterStream), getClob = js.Any.fromFunction0(getClob), getDate = js.Any.fromFunction0(getDate), getDouble = js.Any.fromFunction0(getDouble), getFloat = js.Any.fromFunction0(getFloat), getInt = js.Any.fromFunction0(getInt), getLong = js.Any.fromFunction0(getLong), getObject = js.Any.fromFunction1(getObject), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRef = js.Any.fromFunction0(getRef), getShort = js.Any.fromFunction0(getShort), getString = js.Any.fromFunction0(getString), getTime = js.Any.fromFunction0(getTime), getTimestamp = js.Any.fromFunction0(getTimestamp), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), updateBinaryStream = js.Any.fromFunction2(updateBinaryStream), updateBoolean = js.Any.fromFunction1(updateBoolean), updateByte = js.Any.fromFunction1(updateByte), updateBytes = js.Any.fromFunction1(updateBytes), updateCharacterStream = js.Any.fromFunction2(updateCharacterStream), updateDate = js.Any.fromFunction1(updateDate), updateDouble = js.Any.fromFunction1(updateDouble), updateFloat = js.Any.fromFunction1(updateFloat), updateInt = js.Any.fromFunction1(updateInt), updateLong = js.Any.fromFunction1(updateLong), updateNull = js.Any.fromFunction0(updateNull), updateNumericObject = js.Any.fromFunction2(updateNumericObject), updateObject = js.Any.fromFunction1(updateObject), updateShort = js.Any.fromFunction1(updateShort), updateString = js.Any.fromFunction1(updateString), updateTime = js.Any.fromFunction1(updateTime), updateTimestamp = js.Any.fromFunction1(updateTimestamp), wasNull = js.Any.fromFunction0(wasNull))
  
    __obj.asInstanceOf[DataColumn]
  }
}

