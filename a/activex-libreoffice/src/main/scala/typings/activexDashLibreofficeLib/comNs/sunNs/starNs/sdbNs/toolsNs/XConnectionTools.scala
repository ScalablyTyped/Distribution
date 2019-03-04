package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.toolsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * encapsulates various useful functionality around a {@link com.sun.star.sdb.Connection}
  *
  * Most of the functionality provided here is meaningful only relative to a given database connection. For instance, for quoting table names, you need
  * the meta data instance of the connection. Thus, the entry point for obtaining a {@link XConnectionTools} instance is the {@link
  * com.sun.star.sdb.Connection} service.
  *
  * Note that nearly all functionality provided by this interface is also available by other means, it's only provided here for convenience purposes.
  * @since OOo 2.0.4
  */
trait XConnectionTools extends js.Object {
  /** provides access to the application-level data source meta data */
  val DataSourceMetaData: XDataSourceMetaData
  /**
    * returns an instance supporting the {@link XObjectNames} interface, which provides access to functionality around table and query names.
    *
    * The returned object is guaranteed to not be `NULL` .
    */
  val ObjectNames: XObjectNames
  /**
    * creates an instance supporting the {@link XTableName} interface, which can be used to manipulate table names for various purposes.
    *
    * The returned object is guaranteed to not be `NULL` .
    */
  def createTableName(): XTableName
  /**
    * get the composer initialized with a command and command type.
    * @param commandType the type of the object
    * @param command the object. This may be a table name, a query name, or an SQL statement, depending on the value of _nCommandType
    * @returns the composer filled with command and command type.
    */
  def getComposer(commandType: scala.Double, command: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.XSingleSelectQueryComposer
  /** provides access to the application-level data source meta data */
  def getDataSourceMetaData(): XDataSourceMetaData
  /**
    * get fields for a result set given by a "command descriptor"
    *
    * A command descriptor here means: a SDB-level connection ( {@link com.sun.star.sdb.Connection}a string specifying the name of an object relative to the
    * connectiona {@link com.sun.star.sdb.CommandType} value specifying the type of the object
    * @param commandType the type of the object
    * @param command the object. This may be a table name, a query name, or an SQL statement, depending on the value of _nCommandType
    * @param keepFieldsAlive If (and only if) {@link CommandType} is {@link CommandType.COMMAND} , the fields collection which is returned by this function he
    * @returns the container of the columns (aka fields) of the object
    */
  def getFieldsByCommandDescriptor(
    commandType: scala.Double,
    command: java.lang.String,
    keepFieldsAlive: js.Array[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /**
    * returns an instance supporting the {@link XObjectNames} interface, which provides access to functionality around table and query names.
    *
    * The returned object is guaranteed to not be `NULL` .
    */
  def getObjectNames(): XObjectNames
}

object XConnectionTools {
  @scala.inline
  def apply(
    DataSourceMetaData: XDataSourceMetaData,
    ObjectNames: XObjectNames,
    createTableName: js.Function0[XTableName],
    getComposer: js.Function2[
      scala.Double, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.XSingleSelectQueryComposer
    ],
    getDataSourceMetaData: js.Function0[XDataSourceMetaData],
    getFieldsByCommandDescriptor: js.Function3[
      scala.Double, 
      java.lang.String, 
      js.Array[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
    ],
    getObjectNames: js.Function0[XObjectNames]
  ): XConnectionTools = {
    val __obj = js.Dynamic.literal(DataSourceMetaData = DataSourceMetaData, ObjectNames = ObjectNames, createTableName = createTableName, getComposer = getComposer, getDataSourceMetaData = getDataSourceMetaData, getFieldsByCommandDescriptor = getFieldsByCommandDescriptor, getObjectNames = getObjectNames)
  
    __obj.asInstanceOf[XConnectionTools]
  }
}

