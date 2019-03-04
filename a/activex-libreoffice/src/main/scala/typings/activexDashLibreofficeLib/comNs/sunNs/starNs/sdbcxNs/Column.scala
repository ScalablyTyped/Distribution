package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes the common properties of a database column. */
trait Column
  extends XDataDescriptorFactory
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** keeps a default value for a column, is provided as string. */
  var DefaultValue: java.lang.String
  /** keeps a description of the object. */
  var Description: java.lang.String
  /**
    * indicates whether the column is automatically numbered, thus read-only.
    * @see com.sun.star.sdbc.ColumnValue
    */
  var IsAutoIncrement: scala.Boolean
  /** indicates whether the column is a cash value. */
  var IsCurrency: scala.Boolean
  /**
    * indicates the nullability of values in the designated column.
    * @see com.sun.star.sdbc.ColumnValue
    */
  var IsNullable: scala.Double
  /** indicates that the column contains some kind of time or date stamp used to track updates. */
  var IsRowVersion: scala.Boolean
  /** is the name of the column. */
  var Name: java.lang.String
  /** gets a column's number of decimal digits. */
  var Precision: scala.Double
  /** gets a column's number of digits to right of the decimal point. */
  var Scale: scala.Double
  /** is the {@link com.sun.star.sdbc.DataType} of the column. */
  var Type: scala.Double
  /**
    * is the type name used by the database. If the column type is a user-defined type, then a fully-qualified type name is returned. ** Note: ** May be
    * empty.
    */
  var TypeName: java.lang.String
}

object Column {
  @scala.inline
  def apply(
    DefaultValue: java.lang.String,
    Description: java.lang.String,
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
  ): Column = {
    val __obj = js.Dynamic.literal(DefaultValue = DefaultValue, Description = Description, IsAutoIncrement = IsAutoIncrement, IsCurrency = IsCurrency, IsNullable = IsNullable, IsRowVersion = IsRowVersion, Name = Name, Precision = Precision, PropertySetInfo = PropertySetInfo, Scale = Scale, Type = Type, TypeName = TypeName, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, createDataDescriptor = createDataDescriptor, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[Column]
  }
}

