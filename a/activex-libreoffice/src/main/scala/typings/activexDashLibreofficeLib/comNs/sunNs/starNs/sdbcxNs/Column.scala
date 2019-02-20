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

