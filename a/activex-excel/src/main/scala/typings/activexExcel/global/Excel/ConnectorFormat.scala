package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.XlCreator
import typings.activexOffice.Office.MsoConnectorType
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ConnectorFormat")
@js.native
class ConnectorFormat protected ()
  extends typings.activexExcel.Excel.ConnectorFormat {
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  /* CompleteClass */
  override val BeginConnected: MsoTriState = js.native
  /* CompleteClass */
  override val BeginConnectedShape: typings.activexExcel.Excel.Shape = js.native
  /* CompleteClass */
  override val BeginConnectionSite: Double = js.native
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  /* CompleteClass */
  override val EndConnected: MsoTriState = js.native
  /* CompleteClass */
  override val EndConnectedShape: typings.activexExcel.Excel.Shape = js.native
  /* CompleteClass */
  override val EndConnectionSite: Double = js.native
  /* CompleteClass */
  @JSName("Excel.ConnectorFormat_typekey")
  override var ExcelDotConnectorFormat_typekey: typings.activexExcel.Excel.ConnectorFormat = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var Type: MsoConnectorType = js.native
  /* CompleteClass */
  override def BeginConnect(ConnectedShape: typings.activexExcel.Excel.Shape, ConnectionSite: Double): Unit = js.native
  /* CompleteClass */
  override def BeginDisconnect(): Unit = js.native
  /* CompleteClass */
  override def EndConnect(ConnectedShape: typings.activexExcel.Excel.Shape, ConnectionSite: Double): Unit = js.native
  /* CompleteClass */
  override def EndDisconnect(): Unit = js.native
}

