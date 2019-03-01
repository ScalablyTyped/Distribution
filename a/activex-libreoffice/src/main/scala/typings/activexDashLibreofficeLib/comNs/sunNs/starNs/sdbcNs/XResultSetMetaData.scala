package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** can be used to find out about the types and properties of the columns in a {@link ResultSet} . */
trait XResultSetMetaData
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the number of columns in this {@link ResultSet} .
    * @returns the column count
    * @throws SQLException if a database access error occurs.
    */
  val ColumnCount: scala.Double
  /**
    * gets a column's table's catalog name.
    * @param column the first column is 1, the second is 2,
    * @returns the catalog name
    * @throws SQLException if a database access error occurs.
    */
  def getCatalogName(column: scala.Double): java.lang.String
  /**
    * returns the number of columns in this {@link ResultSet} .
    * @returns the column count
    * @throws SQLException if a database access error occurs.
    */
  def getColumnCount(): scala.Double
  /**
    * indicates the column's normal max width in chars.
    * @param column the first column is 1, the second is 2,
    * @returns the normal maximum number of characters allowed as the width of the designated column
    * @throws SQLException if a database access error occurs.
    */
  def getColumnDisplaySize(column: scala.Double): scala.Double
  /**
    * gets the suggested column title for use in printouts and displays.
    * @param column the first column is 1, the second is 2,
    * @returns the suggested column title
    * @throws SQLException if a database access error occurs.
    */
  def getColumnLabel(column: scala.Double): java.lang.String
  /**
    * gets a column's name.
    * @param column the first column is 1, the second is 2,
    * @returns the column name
    * @throws SQLException if a database access error occurs.
    */
  def getColumnName(column: scala.Double): java.lang.String
  /**
    * returns the fully-qualified name of the service whose instances are manufactured if the method {@link com.sun.star.sdbc.XResultSet} ::.getObject() is
    * called to retrieve a value from the column.
    * @param column the first column is 1, the second is 2,
    * @returns the service name
    * @throws SQLException if a database access error occurs.
    */
  def getColumnServiceName(column: scala.Double): java.lang.String
  /**
    * retrieves a column's SQL type.
    * @param column the first column is 1, the second is 2,
    * @returns the column type
    * @throws SQLException if a database access error occurs.
    */
  def getColumnType(column: scala.Double): scala.Double
  /**
    * retrieves a column's database-specific type name.
    * @param column the first column is 1, the second is 2,
    * @returns the type name
    * @throws SQLException if a database access error occurs.
    */
  def getColumnTypeName(column: scala.Double): java.lang.String
  /**
    * gets a column's number of decimal digits.
    * @param column the first column is 1, the second is 2,
    * @returns precision
    * @throws SQLException if a database access error occurs.
    */
  def getPrecision(column: scala.Double): scala.Double
  /**
    * gets a column's number of digits to right of the decimal point.
    * @param column the first column is 1, the second is 2,
    * @returns scale
    * @throws SQLException if a database access error occurs.
    */
  def getScale(column: scala.Double): scala.Double
  /**
    * gets a column's table's schema.
    * @param column the first column is 1, the second is 2,
    * @returns the schema name
    * @throws SQLException if a database access error occurs.
    */
  def getSchemaName(column: scala.Double): java.lang.String
  /**
    * gets a column's table name.
    * @param column the first column is 1, the second is 2,
    * @returns the table name
    * @throws SQLException if a database access error occurs.
    */
  def getTableName(column: scala.Double): java.lang.String
  /**
    * indicates whether the column is automatically numbered, thus read-only.
    * @param column the first column is 1, the second is 2,
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def isAutoIncrement(column: scala.Double): scala.Boolean
  /**
    * indicates whether a column's case matters.
    * @param column the first column is 1, the second is 2,
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def isCaseSensitive(column: scala.Double): scala.Boolean
  /**
    * indicates whether the column is a cash value.
    * @param column the first column is 1, the second is 2,
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def isCurrency(column: scala.Double): scala.Boolean
  /**
    * indicates whether a write on the column will definitely succeed.
    * @param column the first column is 1, the second is 2,
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def isDefinitelyWritable(column: scala.Double): scala.Boolean
  /**
    * indicates the nullability of values in the designated column.
    * @param column the first column is 1, the second is 2,
    * @returns `TRUE` if so
    * @see com.sun.star.sdbc.ColumnValue
    * @throws SQLException if a database access error occurs.
    */
  def isNullable(column: scala.Double): scala.Double
  /**
    * indicates whether a column is definitely not writable.
    * @param column the first column is 1, the second is 2,
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def isReadOnly(column: scala.Double): scala.Boolean
  /**
    * indicates whether the column can be used in a where clause.
    * @param column the first column is 1, the second is 2,
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def isSearchable(column: scala.Double): scala.Boolean
  /**
    * indicates whether values in the column are signed numbers.
    * @param column the first column is 1, the second is 2,
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def isSigned(column: scala.Double): scala.Boolean
  /**
    * indicates whether it is possible for a write on the column to succeed.
    * @param column the first column is 1, the second is 2,
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def isWritable(column: scala.Double): scala.Boolean
}

object XResultSetMetaData {
  @scala.inline
  def apply(
    ColumnCount: scala.Double,
    acquire: js.Function0[scala.Unit],
    getCatalogName: js.Function1[scala.Double, java.lang.String],
    getColumnCount: js.Function0[scala.Double],
    getColumnDisplaySize: js.Function1[scala.Double, scala.Double],
    getColumnLabel: js.Function1[scala.Double, java.lang.String],
    getColumnName: js.Function1[scala.Double, java.lang.String],
    getColumnServiceName: js.Function1[scala.Double, java.lang.String],
    getColumnType: js.Function1[scala.Double, scala.Double],
    getColumnTypeName: js.Function1[scala.Double, java.lang.String],
    getPrecision: js.Function1[scala.Double, scala.Double],
    getScale: js.Function1[scala.Double, scala.Double],
    getSchemaName: js.Function1[scala.Double, java.lang.String],
    getTableName: js.Function1[scala.Double, java.lang.String],
    isAutoIncrement: js.Function1[scala.Double, scala.Boolean],
    isCaseSensitive: js.Function1[scala.Double, scala.Boolean],
    isCurrency: js.Function1[scala.Double, scala.Boolean],
    isDefinitelyWritable: js.Function1[scala.Double, scala.Boolean],
    isNullable: js.Function1[scala.Double, scala.Double],
    isReadOnly: js.Function1[scala.Double, scala.Boolean],
    isSearchable: js.Function1[scala.Double, scala.Boolean],
    isSigned: js.Function1[scala.Double, scala.Boolean],
    isWritable: js.Function1[scala.Double, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XResultSetMetaData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ColumnCount")(ColumnCount)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getCatalogName")(getCatalogName)
    __obj.updateDynamic("getColumnCount")(getColumnCount)
    __obj.updateDynamic("getColumnDisplaySize")(getColumnDisplaySize)
    __obj.updateDynamic("getColumnLabel")(getColumnLabel)
    __obj.updateDynamic("getColumnName")(getColumnName)
    __obj.updateDynamic("getColumnServiceName")(getColumnServiceName)
    __obj.updateDynamic("getColumnType")(getColumnType)
    __obj.updateDynamic("getColumnTypeName")(getColumnTypeName)
    __obj.updateDynamic("getPrecision")(getPrecision)
    __obj.updateDynamic("getScale")(getScale)
    __obj.updateDynamic("getSchemaName")(getSchemaName)
    __obj.updateDynamic("getTableName")(getTableName)
    __obj.updateDynamic("isAutoIncrement")(isAutoIncrement)
    __obj.updateDynamic("isCaseSensitive")(isCaseSensitive)
    __obj.updateDynamic("isCurrency")(isCurrency)
    __obj.updateDynamic("isDefinitelyWritable")(isDefinitelyWritable)
    __obj.updateDynamic("isNullable")(isNullable)
    __obj.updateDynamic("isReadOnly")(isReadOnly)
    __obj.updateDynamic("isSearchable")(isSearchable)
    __obj.updateDynamic("isSigned")(isSigned)
    __obj.updateDynamic("isWritable")(isWritable)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XResultSetMetaData]
  }
}

