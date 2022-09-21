package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.XlCreator
import typings.activexOffice.Office.MsoConnectorType
import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.ConnectorFormat")
@js.native
/* private */ open class ConnectorFormat ()
  extends StObject
     with typings.activexExcel.Excel.ConnectorFormat {
  
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override def BeginConnect(ConnectedShape: typings.activexExcel.Excel.Shape, ConnectionSite: Double): Unit = js.native
  
  /* CompleteClass */
  override val BeginConnected: MsoTriState = js.native
  
  /* CompleteClass */
  override val BeginConnectedShape: typings.activexExcel.Excel.Shape = js.native
  
  /* CompleteClass */
  override val BeginConnectionSite: Double = js.native
  
  /* CompleteClass */
  override def BeginDisconnect(): Unit = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  override def EndConnect(ConnectedShape: typings.activexExcel.Excel.Shape, ConnectionSite: Double): Unit = js.native
  
  /* CompleteClass */
  override val EndConnected: MsoTriState = js.native
  
  /* CompleteClass */
  override val EndConnectedShape: typings.activexExcel.Excel.Shape = js.native
  
  /* CompleteClass */
  override val EndConnectionSite: Double = js.native
  
  /* CompleteClass */
  override def EndDisconnect(): Unit = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.ConnectorFormat_typekey")
  var ExcelDotConnectorFormat_typekey: typings.activexExcel.Excel.ConnectorFormat = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var Type: MsoConnectorType = js.native
}
