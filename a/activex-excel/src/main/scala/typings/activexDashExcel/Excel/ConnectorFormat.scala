package typings.activexDashExcel.Excel

import typings.activexDashOffice.Office.MsoConnectorType
import typings.activexDashOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ConnectorFormat")
@js.native
class ConnectorFormat protected () extends js.Object {
  val Application: typings.activexDashExcel.Excel.Application = js.native
  val BeginConnected: MsoTriState = js.native
  val BeginConnectedShape: Shape = js.native
  val BeginConnectionSite: Double = js.native
  val Creator: XlCreator = js.native
  val EndConnected: MsoTriState = js.native
  val EndConnectedShape: Shape = js.native
  val EndConnectionSite: Double = js.native
  @JSName("Excel.ConnectorFormat_typekey")
  var ExcelDotConnectorFormat_typekey: ConnectorFormat = js.native
  val Parent: js.Any = js.native
  var Type: MsoConnectorType = js.native
  def BeginConnect(ConnectedShape: Shape, ConnectionSite: Double): Unit = js.native
  def BeginDisconnect(): Unit = js.native
  def EndConnect(ConnectedShape: Shape, ConnectionSite: Double): Unit = js.native
  def EndDisconnect(): Unit = js.native
}

