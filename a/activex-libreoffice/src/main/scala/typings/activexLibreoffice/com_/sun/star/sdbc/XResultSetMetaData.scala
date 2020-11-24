package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** can be used to find out about the types and properties of the columns in a {@link ResultSet} . */
@js.native
trait XResultSetMetaData extends XInterface {
  
  /**
    * returns the number of columns in this {@link ResultSet} .
    * @returns the column count
    * @throws SQLException if a database access error occurs.
    */
  val ColumnCount: Double = js.native
  
  /**
    * gets a column's table's catalog name.
    * @param column the first column is 1, the second is 2,
    * @returns the catalog name
    * @throws SQLException if a database access error occurs.
    */
  def getCatalogName(column: Double): String = js.native
  
  /**
    * returns the number of columns in this {@link ResultSet} .
    * @returns the column count
    * @throws SQLException if a database access error occurs.
    */
  def getColumnCount(): Double = js.native
  
  /**
    * indicates the column's normal max width in chars.
    * @param column the first column is 1, the second is 2,
    * @returns the normal maximum number of characters allowed as the width of the designated column
    * @throws SQLException if a database access error occurs.
    */
  def getColumnDisplaySize(column: Double): Double = js.native
  
  /**
    * gets the suggested column title for use in printouts and displays.
    * @param column the first column is 1, the second is 2,
    * @returns the suggested column title
    * @throws SQLException if a database access error occurs.
    */
  def getColumnLabel(column: Double): String = js.native
  
  /**
    * gets a column's name.
    * @param column the first column is 1, the second is 2,
    * @returns the column name
    * @throws SQLException if a database access error occurs.
    */
  def getColumnName(column: Double): String = js.native
  
  /**
    * returns the fully-qualified name of the service whose instances are manufactured if the method {@link com.sun.star.sdbc.XResultSet} ::.getObject() is
    * called to retrieve a value from the column.
    * @param column the first column is 1, the second is 2,
    * @returns the service name
    * @throws SQLException if a database access error occurs.
    */
  def getColumnServiceName(column: Double): String = js.native
  
  /**
    * retrieves a column's SQL type.
    * @param column the first column is 1, the second is 2,
    * @returns the column type
    * @throws SQLException if a database access error occurs.
    */
  def getColumnType(column: Double): Double = js.native
  
  /**
    * retrieves a column's database-specific type name.
    * @param column the first column is 1, the second is 2,
    * @returns the type name
    * @throws SQLException if a database access error occurs.
    */
  def getColumnTypeName(column: Double): String = js.native
  
  /**
    * gets a column's number of decimal digits.
    * @param column the first column is 1, the second is 2,
    * @returns precision
    * @throws SQLException if a database access error occurs.
    */
  def getPrecision(column: Double): Double = js.native
  
  /**
    * gets a column's number of digits to right of the decimal point.
    * @param column the first column is 1, the second is 2,
    * @returns scale
    * @throws SQLException if a database access error occurs.
    */
  def getScale(column: Double): Double = js.native
  
  /**
    * gets a column's table's schema.
    * @param column the first column is 1, the second is 2,
    * @returns the schema name
    * @throws SQLException if a database access error occurs.
    */
  def getSchemaName(column: Double): String = js.native
  
  /**
    * gets a column's table name.
    * @param column the first column is 1, the second is 2,
    * @returns the table name
    * @throws SQLException if a database access error occurs.
    */
  def getTableName(column: Double): String = js.native
  
  /**
    * indicates whether the column is automatically numbered, thus read-only.
    * @param column the first column is 1, the second is 2,
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def isAutoIncrement(column: Double): Boolean = js.native
  
  /**
    * indicates whether a column's case matters.
    * @param column the first column is 1, the second is 2,
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def isCaseSensitive(column: Double): Boolean = js.native
  
  /**
    * indicates whether the column is a cash value.
    * @param column the first column is 1, the second is 2,
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def isCurrency(column: Double): Boolean = js.native
  
  /**
    * indicates whether a write on the column will definitely succeed.
    * @param column the first column is 1, the second is 2,
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def isDefinitelyWritable(column: Double): Boolean = js.native
  
  /**
    * indicates the nullability of values in the designated column.
    * @param column the first column is 1, the second is 2,
    * @returns `TRUE` if so
    * @see com.sun.star.sdbc.ColumnValue
    * @throws SQLException if a database access error occurs.
    */
  def isNullable(column: Double): Double = js.native
  
  /**
    * indicates whether a column is definitely not writable.
    * @param column the first column is 1, the second is 2,
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def isReadOnly(column: Double): Boolean = js.native
  
  /**
    * indicates whether the column can be used in a where clause.
    * @param column the first column is 1, the second is 2,
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def isSearchable(column: Double): Boolean = js.native
  
  /**
    * indicates whether values in the column are signed numbers.
    * @param column the first column is 1, the second is 2,
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def isSigned(column: Double): Boolean = js.native
  
  /**
    * indicates whether it is possible for a write on the column to succeed.
    * @param column the first column is 1, the second is 2,
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def isWritable(column: Double): Boolean = js.native
}
object XResultSetMetaData {
  
  @scala.inline
  def apply(
    ColumnCount: Double,
    acquire: () => Unit,
    getCatalogName: Double => String,
    getColumnCount: () => Double,
    getColumnDisplaySize: Double => Double,
    getColumnLabel: Double => String,
    getColumnName: Double => String,
    getColumnServiceName: Double => String,
    getColumnType: Double => Double,
    getColumnTypeName: Double => String,
    getPrecision: Double => Double,
    getScale: Double => Double,
    getSchemaName: Double => String,
    getTableName: Double => String,
    isAutoIncrement: Double => Boolean,
    isCaseSensitive: Double => Boolean,
    isCurrency: Double => Boolean,
    isDefinitelyWritable: Double => Boolean,
    isNullable: Double => Double,
    isReadOnly: Double => Boolean,
    isSearchable: Double => Boolean,
    isSigned: Double => Boolean,
    isWritable: Double => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XResultSetMetaData = {
    val __obj = js.Dynamic.literal(ColumnCount = ColumnCount.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getCatalogName = js.Any.fromFunction1(getCatalogName), getColumnCount = js.Any.fromFunction0(getColumnCount), getColumnDisplaySize = js.Any.fromFunction1(getColumnDisplaySize), getColumnLabel = js.Any.fromFunction1(getColumnLabel), getColumnName = js.Any.fromFunction1(getColumnName), getColumnServiceName = js.Any.fromFunction1(getColumnServiceName), getColumnType = js.Any.fromFunction1(getColumnType), getColumnTypeName = js.Any.fromFunction1(getColumnTypeName), getPrecision = js.Any.fromFunction1(getPrecision), getScale = js.Any.fromFunction1(getScale), getSchemaName = js.Any.fromFunction1(getSchemaName), getTableName = js.Any.fromFunction1(getTableName), isAutoIncrement = js.Any.fromFunction1(isAutoIncrement), isCaseSensitive = js.Any.fromFunction1(isCaseSensitive), isCurrency = js.Any.fromFunction1(isCurrency), isDefinitelyWritable = js.Any.fromFunction1(isDefinitelyWritable), isNullable = js.Any.fromFunction1(isNullable), isReadOnly = js.Any.fromFunction1(isReadOnly), isSearchable = js.Any.fromFunction1(isSearchable), isSigned = js.Any.fromFunction1(isSigned), isWritable = js.Any.fromFunction1(isWritable), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XResultSetMetaData]
  }
  
  @scala.inline
  implicit class XResultSetMetaDataOps[Self <: XResultSetMetaData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColumnCount(value: Double): Self = this.set("ColumnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCatalogName(value: Double => String): Self = this.set("getCatalogName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetColumnCount(value: () => Double): Self = this.set("getColumnCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetColumnDisplaySize(value: Double => Double): Self = this.set("getColumnDisplaySize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetColumnLabel(value: Double => String): Self = this.set("getColumnLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetColumnName(value: Double => String): Self = this.set("getColumnName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetColumnServiceName(value: Double => String): Self = this.set("getColumnServiceName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetColumnType(value: Double => Double): Self = this.set("getColumnType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetColumnTypeName(value: Double => String): Self = this.set("getColumnTypeName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPrecision(value: Double => Double): Self = this.set("getPrecision", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetScale(value: Double => Double): Self = this.set("getScale", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSchemaName(value: Double => String): Self = this.set("getSchemaName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTableName(value: Double => String): Self = this.set("getTableName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsAutoIncrement(value: Double => Boolean): Self = this.set("isAutoIncrement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsCaseSensitive(value: Double => Boolean): Self = this.set("isCaseSensitive", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsCurrency(value: Double => Boolean): Self = this.set("isCurrency", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsDefinitelyWritable(value: Double => Boolean): Self = this.set("isDefinitelyWritable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsNullable(value: Double => Double): Self = this.set("isNullable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsReadOnly(value: Double => Boolean): Self = this.set("isReadOnly", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsSearchable(value: Double => Boolean): Self = this.set("isSearchable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsSigned(value: Double => Boolean): Self = this.set("isSigned", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsWritable(value: Double => Boolean): Self = this.set("isWritable", js.Any.fromFunction1(value))
  }
}
