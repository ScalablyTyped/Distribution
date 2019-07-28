package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes the common properties of a database column. Could be used for the creation of a database columns within a table.
  * @see com.sun.star.sdbcx.Column
  * @see com.sun.star.sdbcx.Table
  */
trait ColumnDescriptor extends Descriptor {
  /** specifies how to create an auto-increment column. */
  var AutoIncrementCreation: String
  /** keeps a default value for a column, is provided as string. */
  var DefaultValue: String
  /** keeps a description of the object. */
  var Description: String
  /**
    * indicates whether the column is automatically numbered, thus read-only.
    * @see com.sun.star.sdbc.ColumnValue
    */
  var IsAutoIncrement: Boolean
  /**
    * indicates the nullability of values in the designated column.
    * @see com.sun.star.sdbc.ColumnValue
    */
  var IsNullable: Double
  /** indicates that the column contains some kind of time or date stamp used to track updates. */
  var IsRowVersion: Boolean
  /** gets a column's number of decimal digits. */
  var Precision: Double
  /** gets a column's number of digits to right of the decimal point. */
  var Scale: Double
  /** is the {@link com.sun.star.sdbc.DataType} of the column. */
  var Type: Double
  /** is the type name used by the database. If the column type is a user-defined type, then a fully-qualified type name is returned. May be empty. */
  var TypeName: String
}

object ColumnDescriptor {
  @scala.inline
  def apply(
    AutoIncrementCreation: String,
    DefaultValue: String,
    Description: String,
    IsAutoIncrement: Boolean,
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
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): ColumnDescriptor = {
    val __obj = js.Dynamic.literal(AutoIncrementCreation = AutoIncrementCreation, DefaultValue = DefaultValue, Description = Description, IsAutoIncrement = IsAutoIncrement, IsNullable = IsNullable, IsRowVersion = IsRowVersion, Name = Name, Precision = Precision, PropertySetInfo = PropertySetInfo, Scale = Scale, Type = Type, TypeName = TypeName, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[ColumnDescriptor]
  }
}

