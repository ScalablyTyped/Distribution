package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.toolsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
trait ConnectionTools extends XConnectionTools {
  def createWithConnection(Connection: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection): scala.Unit
}

object ConnectionTools {
  @scala.inline
  def apply(
    DataSourceMetaData: XDataSourceMetaData,
    ObjectNames: XObjectNames,
    createTableName: () => XTableName,
    createWithConnection: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection => scala.Unit,
    getComposer: (scala.Double, java.lang.String) => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.XSingleSelectQueryComposer,
    getDataSourceMetaData: () => XDataSourceMetaData,
    getFieldsByCommandDescriptor: (scala.Double, java.lang.String, js.Array[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent]) => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    getObjectNames: () => XObjectNames
  ): ConnectionTools = {
    val __obj = js.Dynamic.literal(DataSourceMetaData = DataSourceMetaData, ObjectNames = ObjectNames, createTableName = js.Any.fromFunction0(createTableName), createWithConnection = js.Any.fromFunction1(createWithConnection), getComposer = js.Any.fromFunction2(getComposer), getDataSourceMetaData = js.Any.fromFunction0(getDataSourceMetaData), getFieldsByCommandDescriptor = js.Any.fromFunction3(getFieldsByCommandDescriptor), getObjectNames = js.Any.fromFunction0(getObjectNames))
  
    __obj.asInstanceOf[ConnectionTools]
  }
}

