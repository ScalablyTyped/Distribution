package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs.toolsNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs.XSingleSelectQueryComposer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
trait ConnectionTools extends XConnectionTools {
  def createWithConnection(Connection: XConnection): Unit
}

object ConnectionTools {
  @scala.inline
  def apply(
    DataSourceMetaData: XDataSourceMetaData,
    ObjectNames: XObjectNames,
    createTableName: () => XTableName,
    createWithConnection: XConnection => Unit,
    getComposer: (Double, String) => XSingleSelectQueryComposer,
    getDataSourceMetaData: () => XDataSourceMetaData,
    getFieldsByCommandDescriptor: (Double, String, js.Array[XComponent]) => XNameAccess,
    getObjectNames: () => XObjectNames
  ): ConnectionTools = {
    val __obj = js.Dynamic.literal(DataSourceMetaData = DataSourceMetaData, ObjectNames = ObjectNames, createTableName = js.Any.fromFunction0(createTableName), createWithConnection = js.Any.fromFunction1(createWithConnection), getComposer = js.Any.fromFunction2(getComposer), getDataSourceMetaData = js.Any.fromFunction0(getDataSourceMetaData), getFieldsByCommandDescriptor = js.Any.fromFunction3(getFieldsByCommandDescriptor), getObjectNames = js.Any.fromFunction0(getObjectNames))
  
    __obj.asInstanceOf[ConnectionTools]
  }
}

