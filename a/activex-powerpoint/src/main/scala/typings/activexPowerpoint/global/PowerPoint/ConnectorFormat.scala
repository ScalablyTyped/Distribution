package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoConnectorType
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.ConnectorFormat")
@js.native
class ConnectorFormat protected ()
  extends typings.activexPowerpoint.PowerPoint.ConnectorFormat {
  /* CompleteClass */
  override val Application: js.Any = js.native
  /* CompleteClass */
  override val BeginConnected: MsoTriState = js.native
  /* CompleteClass */
  override val BeginConnectedShape: typings.activexPowerpoint.PowerPoint.Shape = js.native
  /* CompleteClass */
  override val BeginConnectionSite: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val EndConnected: MsoTriState = js.native
  /* CompleteClass */
  override val EndConnectedShape: typings.activexPowerpoint.PowerPoint.Shape = js.native
  /* CompleteClass */
  override val EndConnectionSite: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.ConnectorFormat_typekey")
  override var PowerPointDotConnectorFormat_typekey: typings.activexPowerpoint.PowerPoint.ConnectorFormat = js.native
  /* CompleteClass */
  override var Type: MsoConnectorType = js.native
  /* CompleteClass */
  override def BeginConnect(ConnectedShape: typings.activexPowerpoint.PowerPoint.Shape, ConnectionSite: Double): Unit = js.native
  /* CompleteClass */
  override def BeginDisconnect(): Unit = js.native
  /* CompleteClass */
  override def EndConnect(ConnectedShape: typings.activexPowerpoint.PowerPoint.Shape, ConnectionSite: Double): Unit = js.native
  /* CompleteClass */
  override def EndDisconnect(): Unit = js.native
}

