package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typings.activexLibreoffice.com_.sun.star.sdbc.XResultSet
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * descriptor for accessing basic data access objects.
  *
  * Various components interacting with the database access world require to specify (or provide themselves) an object such as a query, a table, a result
  * set, a connection to a data source, a column within a table, and so on. ;  All of these objects are usually not specified with a single property, but
  * with a set of properties, and for various objects, various (but not always different) properties are needed. ;  The `DataAccessDescriptor` describes
  * the super set of the properties for the most common data access objects.
  *
  * Every component providing or requiring a {@link DataAccessDescriptor} for some functionality is urged to specify which properties are mandatory, and
  * which ones optional. Additionally, it's free to specify any additional requirements about the relations of properties.
  * @since OOo 1.1.2
  */
@js.native
trait DataAccessDescriptor extends js.Object {
  /**
    * is a connection to use.
    *
    * This object is guaranteed to be a {@link com.sun.star.sdbc.Connection} , but usually it will be a {@link Connection} from the module {@link
    * com.sun.star.sdb} . ;  Especially in the case where no {@link DataSourceName} is given, but {@link CommandType} is {@link CommandType.QUERY} , the
    * ActiveConnection needs to fully support the {@link Connection} service, to actually retrieve the query specified by {@link Command}
    *
    * If no ActiveConnection is given, then a {@link DataSourceName} is required.
    * @see DataSourceName
    */
  var ActiveConnection: XConnection = js.native
  /**
    * specifies how to interpret {@link Selection}
    *
    * If present, {@link BookmarkSelection} specifies the semantics of {@link Selection} . If not present, it's up to the implementing component to specify
    * this semantics.
    *
    * If `TRUE` , then the single elements of the array specified by {@link Selection} are bookmarks relative to the result set, if `FALSE` , they're record
    * numbers.
    * @see com.sun.star.sdbcx.XRowLocate
    * @see com.sun.star.sdbc.XResultSet
    * @see com.sun.star.sdb.XResultSetAccess
    */
  var BookmarkSelection: Boolean = js.native
  /**
    * specifies a column object
    *
    * For reasons of performance and saving resources, a supplier of an {@link DataAccessDescriptor} which is used to describe a column object can pass this
    * object directly, instead of specifying it only implicitly with the {@link ColumnName} property.
    *
    * The object will at least support the {@link com.sun.star.sdbcx.Column} service, but more often it will even be a {@link Column} from the {@link
    * com.sun.star.sdb} module.
    */
  var Column: XPropertySet = js.native
  /**
    * specifies a column name.
    *
    * This property is usually used together with the {@link Command} and {@link CommandType} properties.
    * @see Column
    */
  var ColumnName: String = js.native
  /**
    * specifies the command to execute to retrieve a result set.
    *
    * This property is only meaningful together with the {@link CommandType} property, thus either **both** or **none** of them are present.
    * @see CommandType
    */
  var Command: String = js.native
  /**
    * specifies the type of the command to be executed to retrieve a result set.
    *
    * {@link Command} needs to be interpreted depending on the value of this property.
    *
    * This property is only meaningful together with the {@link Command} property, thus either **both** or **none** of them are present.
    * @see com.sun.star.sdb.CommandType
    */
  var CommandType: Double = js.native
  /**
    * specifies additional info to use when creating a connection from a `ConnectionResource`
    *
    * This member is evaluated only when `ConnectionResource` is used: In this case, {@link com.sun.star.sdbc.XDriverManager.getConnectionWithInfo()} is
    * used to create a connection for the given connection resource, instead of {@link com.sun.star.sdbc.XDriverManager.getConnection()} .
    *
    * If the sequence is empty, it is ignored.
    */
  var ConnectionInfo: SafeArray[PropertyValue] = js.native
  /**
    * specifies the database URL which locates a database driver.
    *
    * This database URL is usually used to create a {@link Connection} . If no ConnectionResource is given, then an {@link ActiveConnection} is required.
    * @see com.sun.star.sdb.DatabaseContext
    * @see ActiveConnection
    */
  var ConnectionResource: String = js.native
  /**
    * specifies the name of the datasource to access.
    *
    * This data source is usually used to create a {@link Connection} . If no DataSourceName is given and the {@link DatabaseLocation} and the {@link
    * ConnectionResource} are empty, then an {@link ActiveConnection} is required.
    * @see com.sun.star.sdb.DatabaseContext
    * @see ActiveConnection
    */
  var DataSourceName: String = js.native
  /**
    * specifies the URL of the database file.
    *
    * This database location is usually used to create a {@link Connection} . If no DatabaseLocation is given and the {@link ConnectionResource} is empty,
    * then an {@link ActiveConnection} is required.
    * @see com.sun.star.sdb.DatabaseContext
    * @see ActiveConnection
    */
  var DatabaseLocation: String = js.native
  /**
    * specifies if the {@link Command} should be analyzed on the client side before sending it to the database server.
    *
    * The default value of this property is `TRUE` . By switching it to `FALSE` , you can pass backend-specific SQL statements, which are not standard SQL,
    * to your database.
    *
    * This property is usually present together with the {@link Command} and {@link CommandType} properties, and is evaluated if and only if {@link
    * CommandType} equals {@link CommandType.COMMAND} .
    */
  var EscapeProcessing: Boolean = js.native
  /**
    * specifies an additional filter to optionally use.
    *
    * The Filter string has to form a `WHERE` -clause, **without** the `WHERE` -string itself.
    *
    * If a {@link DataSourceName} , {@link Command} and {@link CommandType} are specified, a {@link RowSet} can be created with this information. If the
    * results provided by the row set are to be additionally filtered, the Filter property can be used.
    *
    * Note that the Filter property does not make sense if a {@link ResultSet} has been specified in the {@link DataAccessDescriptor} .
    * @see com.sun.star.sdb.RowSet
    * @see ResultSet
    */
  var Filter: String = js.native
  /**
    * specifies an additional `GROUP BY` clause which should be applied on top of the given {@link Command} .
    *
    * The keyword `GROUP BY` itself is not part of this property.
    */
  var GroupBy: String = js.native
  /**
    * specifies an additional `HAVING` clause which should be applied on top of the given {@link Command} .
    *
    * The keyword `HAVING` itself is not part of this property.
    */
  var HavingClause: String = js.native
  /**
    * specifies an additional `ORDER BY` clause which should be applied on top of the given {@link Command} .
    *
    * The keyword `ORDER BY` itself is not part of this property.
    */
  var Order: String = js.native
  /**
    * specifies an already existent result set to use.
    *
    * Usually, you use the properties {@link DataSourceName} (alternatively {@link ActiveConnection} ), {@link Command} and {@link CommandType} to specify
    * how to **obtain** a result set. However, in scenarios where the provider of a {@link DataAccessDescriptor} has access to an already existent result
    * set, it can pass it along for reusage. This is encouraged to increase performance.
    *
    * The object will at least support the {@link com.sun.star.sdbc.ResultSet} service.
    *
    * Note that any superservices of {@link com.sun.star.sdbc.ResultSet} are also allowed. Especially, this member can denote an instance of the {@link
    * com.sun.star.sdb.RowSet} , or an instance obtained by calling {@link com.sun.star.sdb.XResultSetAccess.createResultSet()} on such a {@link
    * com.sun.star.sdb.RowSet} . This becomes important in conjunction with the {@link Selection} property.
    * @see com.sun.star.sdb.XResultSetAccess
    */
  var ResultSet: XResultSet = js.native
  /**
    * specifies a selection to confine the records in a result set.
    *
    * When you specify a result set either implicitly ( {@link DataSourceName} , {@link Command} , {@link CommandType} ) or explicitly ( {@link ResultSet}
    * ), the set of results can be additionally refined with this property.
    *
    * The single elements of the {@link Selection} are either record numbers (see {@link com.sun.star.sdbc.XResultSet.getRow()} ), or bookmarks (see {@link
    * com.sun.star.sdbcx.XRowLocate.getBookmark()} ). ;  It is up to the component which provides or requires a {@link DataAccessDescriptor} to specify
    * which of the two alternatives it expects. If it does **not** specify this, then the property {@link BookmarkSelection} becomes mandatory.
    *
    * If the elements specify bookmarks, and a {@link ResultSet} has been specified, then this result set is required to support the {@link
    * com.sun.star.sdbcx.XRowLocate} interface.
    */
  var Selection: SafeArray[_] = js.native
}

object DataAccessDescriptor {
  @scala.inline
  def apply(
    ActiveConnection: XConnection,
    BookmarkSelection: Boolean,
    Column: XPropertySet,
    ColumnName: String,
    Command: String,
    CommandType: Double,
    ConnectionInfo: SafeArray[PropertyValue],
    ConnectionResource: String,
    DataSourceName: String,
    DatabaseLocation: String,
    EscapeProcessing: Boolean,
    Filter: String,
    GroupBy: String,
    HavingClause: String,
    Order: String,
    ResultSet: XResultSet,
    Selection: SafeArray[_]
  ): DataAccessDescriptor = {
    val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection.asInstanceOf[js.Any], BookmarkSelection = BookmarkSelection.asInstanceOf[js.Any], Column = Column.asInstanceOf[js.Any], ColumnName = ColumnName.asInstanceOf[js.Any], Command = Command.asInstanceOf[js.Any], CommandType = CommandType.asInstanceOf[js.Any], ConnectionInfo = ConnectionInfo.asInstanceOf[js.Any], ConnectionResource = ConnectionResource.asInstanceOf[js.Any], DataSourceName = DataSourceName.asInstanceOf[js.Any], DatabaseLocation = DatabaseLocation.asInstanceOf[js.Any], EscapeProcessing = EscapeProcessing.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], GroupBy = GroupBy.asInstanceOf[js.Any], HavingClause = HavingClause.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any], ResultSet = ResultSet.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataAccessDescriptor]
  }
  @scala.inline
  implicit class DataAccessDescriptorOps[Self <: DataAccessDescriptor] (val x: Self) extends AnyVal {
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
    def setActiveConnection(value: XConnection): Self = this.set("ActiveConnection", value.asInstanceOf[js.Any])
    @scala.inline
    def setBookmarkSelection(value: Boolean): Self = this.set("BookmarkSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumn(value: XPropertySet): Self = this.set("Column", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnName(value: String): Self = this.set("ColumnName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommand(value: String): Self = this.set("Command", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommandType(value: Double): Self = this.set("CommandType", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionInfo(value: SafeArray[PropertyValue]): Self = this.set("ConnectionInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionResource(value: String): Self = this.set("ConnectionResource", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataSourceName(value: String): Self = this.set("DataSourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatabaseLocation(value: String): Self = this.set("DatabaseLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setEscapeProcessing(value: Boolean): Self = this.set("EscapeProcessing", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilter(value: String): Self = this.set("Filter", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupBy(value: String): Self = this.set("GroupBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setHavingClause(value: String): Self = this.set("HavingClause", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrder(value: String): Self = this.set("Order", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultSet(value: XResultSet): Self = this.set("ResultSet", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelection(value: SafeArray[_]): Self = this.set("Selection", value.asInstanceOf[js.Any])
  }
  
}

