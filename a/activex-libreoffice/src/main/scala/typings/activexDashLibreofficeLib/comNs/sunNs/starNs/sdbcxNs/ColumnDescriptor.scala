package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

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
  var AutoIncrementCreation: java.lang.String
  /** keeps a default value for a column, is provided as string. */
  var DefaultValue: java.lang.String
  /** keeps a description of the object. */
  var Description: java.lang.String
  /**
    * indicates whether the column is automatically numbered, thus read-only.
    * @see com.sun.star.sdbc.ColumnValue
    */
  var IsAutoIncrement: scala.Boolean
  /**
    * indicates the nullability of values in the designated column.
    * @see com.sun.star.sdbc.ColumnValue
    */
  var IsNullable: scala.Double
  /** indicates that the column contains some kind of time or date stamp used to track updates. */
  var IsRowVersion: scala.Boolean
  /** gets a column's number of decimal digits. */
  var Precision: scala.Double
  /** gets a column's number of digits to right of the decimal point. */
  var Scale: scala.Double
  /** is the {@link com.sun.star.sdbc.DataType} of the column. */
  var Type: scala.Double
  /** is the type name used by the database. If the column type is a user-defined type, then a fully-qualified type name is returned. May be empty. */
  var TypeName: java.lang.String
}

object ColumnDescriptor {
  @scala.inline
  def apply(
    AutoIncrementCreation: java.lang.String,
    DefaultValue: java.lang.String,
    Description: java.lang.String,
    IsAutoIncrement: scala.Boolean,
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
  ): ColumnDescriptor = {
    val __obj = js.Dynamic.literal(AutoIncrementCreation = AutoIncrementCreation, DefaultValue = DefaultValue, Description = Description, IsAutoIncrement = IsAutoIncrement, IsNullable = IsNullable, IsRowVersion = IsRowVersion, Name = Name, Precision = Precision, PropertySetInfo = PropertySetInfo, Scale = Scale, Type = Type, TypeName = TypeName, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[ColumnDescriptor]
  }
}

