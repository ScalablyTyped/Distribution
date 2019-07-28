package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes the common properties of a database column. */
trait Column
  extends XDataDescriptorFactory
     with XPropertySet {
  /** keeps a default value for a column, is provided as string. */
  var DefaultValue: String
  /** keeps a description of the object. */
  var Description: String
  /**
    * indicates whether the column is automatically numbered, thus read-only.
    * @see com.sun.star.sdbc.ColumnValue
    */
  var IsAutoIncrement: Boolean
  /** indicates whether the column is a cash value. */
  var IsCurrency: Boolean
  /**
    * indicates the nullability of values in the designated column.
    * @see com.sun.star.sdbc.ColumnValue
    */
  var IsNullable: Double
  /** indicates that the column contains some kind of time or date stamp used to track updates. */
  var IsRowVersion: Boolean
  /** is the name of the column. */
  var Name: String
  /** gets a column's number of decimal digits. */
  var Precision: Double
  /** gets a column's number of digits to right of the decimal point. */
  var Scale: Double
  /** is the {@link com.sun.star.sdbc.DataType} of the column. */
  var Type: Double
  /**
    * is the type name used by the database. If the column type is a user-defined type, then a fully-qualified type name is returned. ** Note: ** May be
    * empty.
    */
  var TypeName: String
}

object Column {
  @scala.inline
  def apply(
    DefaultValue: String,
    Description: String,
    IsAutoIncrement: Boolean,
    IsCurrency: Boolean,
    IsNullable: Double,
    IsRowVersion: Boolean,
    Name: String,
    Precision: Double,
    PropertySetInfo: XPropertySetInfo,
    Scale: Double,
    Type: Double,
    TypeName: String,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createDataDescriptor: () => XPropertySet,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): Column = {
    val __obj = js.Dynamic.literal(DefaultValue = DefaultValue, Description = Description, IsAutoIncrement = IsAutoIncrement, IsCurrency = IsCurrency, IsNullable = IsNullable, IsRowVersion = IsRowVersion, Name = Name, Precision = Precision, PropertySetInfo = PropertySetInfo, Scale = Scale, Type = Type, TypeName = TypeName, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createDataDescriptor = js.Any.fromFunction0(createDataDescriptor), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[Column]
  }
}

