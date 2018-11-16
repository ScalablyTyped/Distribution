package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ConnectorFormat")
@js.native
class ConnectorFormat protected () extends js.Object {
  val Application: Application = js.native
  val BeginConnected: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val BeginConnectedShape: Shape = js.native
  val BeginConnectionSite: scala.Double = js.native
  val Creator: XlCreator = js.native
  val EndConnected: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val EndConnectedShape: Shape = js.native
  val EndConnectionSite: scala.Double = js.native
  var `Excel.ConnectorFormat_typekey`: ConnectorFormat = js.native
  val Parent: js.Any = js.native
  var Type: activexDashOfficeLib.OfficeNs.MsoConnectorType = js.native
  def BeginConnect(ConnectedShape: Shape, ConnectionSite: scala.Double): scala.Unit = js.native
  def BeginDisconnect(): scala.Unit = js.native
  def EndConnect(ConnectedShape: Shape, ConnectionSite: scala.Double): scala.Unit = js.native
  def EndDisconnect(): scala.Unit = js.native
}

