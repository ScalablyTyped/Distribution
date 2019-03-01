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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Align")(Align)
    __obj.updateDynamic("Array")(Array)
    __obj.updateDynamic("BinaryStream")(BinaryStream)
    __obj.updateDynamic("Blob")(Blob)
    __obj.updateDynamic("Boolean")(Boolean)
    __obj.updateDynamic("Byte")(Byte)
    __obj.updateDynamic("Bytes")(Bytes)
    __obj.updateDynamic("CatalogName")(CatalogName)
    __obj.updateDynamic("CharacterStream")(CharacterStream)
    __obj.updateDynamic("Clob")(Clob)
    __obj.updateDynamic("ControlDefault")(ControlDefault)
    __obj.updateDynamic("ControlModel")(ControlModel)
    __obj.updateDynamic("Date")(Date)
    __obj.updateDynamic("DefaultValue")(DefaultValue)
    __obj.updateDynamic("Description")(Description)
    __obj.updateDynamic("DisplaySize")(DisplaySize)
    __obj.updateDynamic("Double")(Double)
    __obj.updateDynamic("Float")(Float)
    __obj.updateDynamic("FormatKey")(FormatKey)
    __obj.updateDynamic("HelpText")(HelpText)
    __obj.updateDynamic("Hidden")(Hidden)
    __obj.updateDynamic("Int")(Int)
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
    __obj.updateDynamic("Long")(Long)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("OriginalValue")(OriginalValue)
    __obj.updateDynamic("Position")(Position)
    __obj.updateDynamic("Precision")(Precision)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("Ref")(Ref)
    __obj.updateDynamic("Scale")(Scale)
    __obj.updateDynamic("SchemaName")(SchemaName)
    __obj.updateDynamic("ServiceName")(ServiceName)
    __obj.updateDynamic("Short")(Short)
    __obj.updateDynamic("String")(String)
    __obj.updateDynamic("TableName")(TableName)
    __obj.updateDynamic("Time")(Time)
    __obj.updateDynamic("Timestamp")(Timestamp)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("TypeName")(TypeName)
    __obj.updateDynamic("Value")(Value)
    __obj.updateDynamic("Width")(Width)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("createDataDescriptor")(createDataDescriptor)
    __obj.updateDynamic("getArray")(getArray)
    __obj.updateDynamic("getBinaryStream")(getBinaryStream)
    __obj.updateDynamic("getBlob")(getBlob)
    __obj.updateDynamic("getBoolean")(getBoolean)
    __obj.updateDynamic("getByte")(getByte)
    __obj.updateDynamic("getBytes")(getBytes)
    __obj.updateDynamic("getCharacterStream")(getCharacterStream)
    __obj.updateDynamic("getClob")(getClob)
    __obj.updateDynamic("getDate")(getDate)
    __obj.updateDynamic("getDouble")(getDouble)
    __obj.updateDynamic("getFloat")(getFloat)
    __obj.updateDynamic("getInt")(getInt)
    __obj.updateDynamic("getLong")(getLong)
    __obj.updateDynamic("getObject")(getObject)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getRef")(getRef)
    __obj.updateDynamic("getShort")(getShort)
    __obj.updateDynamic("getString")(getString)
    __obj.updateDynamic("getTime")(getTime)
    __obj.updateDynamic("getTimestamp")(getTimestamp)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("updateBinaryStream")(updateBinaryStream)
    __obj.updateDynamic("updateBoolean")(updateBoolean)
    __obj.updateDynamic("updateByte")(updateByte)
    __obj.updateDynamic("updateBytes")(updateBytes)
    __obj.updateDynamic("updateCharacterStream")(updateCharacterStream)
    __obj.updateDynamic("updateDate")(updateDate)
    __obj.updateDynamic("updateDouble")(updateDouble)
    __obj.updateDynamic("updateFloat")(updateFloat)
    __obj.updateDynamic("updateInt")(updateInt)
    __obj.updateDynamic("updateLong")(updateLong)
    __obj.updateDynamic("updateNull")(updateNull)
    __obj.updateDynamic("updateNumericObject")(updateNumericObject)
    __obj.updateDynamic("updateObject")(updateObject)
    __obj.updateDynamic("updateShort")(updateShort)
    __obj.updateDynamic("updateString")(updateString)
    __obj.updateDynamic("updateTime")(updateTime)
    __obj.updateDynamic("updateTimestamp")(updateTimestamp)
    __obj.updateDynamic("wasNull")(wasNull)
    __obj.asInstanceOf[DataColumn]
  }
}

