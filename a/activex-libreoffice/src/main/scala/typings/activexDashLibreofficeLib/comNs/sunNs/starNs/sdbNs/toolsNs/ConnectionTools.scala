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
    createTableName: js.Function0[XTableName],
    createWithConnection: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection, scala.Unit],
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
  ): ConnectionTools = {
    val __obj = js.Dynamic.literal(DataSourceMetaData = DataSourceMetaData, ObjectNames = ObjectNames, createTableName = createTableName, createWithConnection = createWithConnection, getComposer = getComposer, getDataSourceMetaData = getDataSourceMetaData, getFieldsByCommandDescriptor = getFieldsByCommandDescriptor, getObjectNames = getObjectNames)
  
    __obj.asInstanceOf[ConnectionTools]
  }
}

