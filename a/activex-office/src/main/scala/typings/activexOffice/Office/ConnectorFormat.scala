package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectorFormat extends js.Object {
  val Application: js.Any
  val BeginConnected: MsoTriState
  val BeginConnectedShape: Shape
  val BeginConnectionSite: Double
  val Creator: Double
  val EndConnected: MsoTriState
  val EndConnectedShape: Shape
  val EndConnectionSite: Double
  @JSName("Office.ConnectorFormat_typekey")
  var OfficeDotConnectorFormat_typekey: ConnectorFormat
  val Parent: js.Any
  var Type: MsoConnectorType
  def BeginConnect(ConnectedShape: Shape, ConnectionSite: Double): Unit
  def BeginDisconnect(): Unit
  def EndConnect(ConnectedShape: Shape, ConnectionSite: Double): Unit
  def EndDisconnect(): Unit
}

object ConnectorFormat {
  @scala.inline
  def apply(
    Application: js.Any,
    BeginConnect: (Shape, Double) => Unit,
    BeginConnected: MsoTriState,
    BeginConnectedShape: Shape,
    BeginConnectionSite: Double,
    BeginDisconnect: () => Unit,
    Creator: Double,
    EndConnect: (Shape, Double) => Unit,
    EndConnected: MsoTriState,
    EndConnectedShape: Shape,
    EndConnectionSite: Double,
    EndDisconnect: () => Unit,
    OfficeDotConnectorFormat_typekey: ConnectorFormat,
    Parent: js.Any,
    Type: MsoConnectorType
  ): ConnectorFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BeginConnect = js.Any.fromFunction2(BeginConnect), BeginConnected = BeginConnected.asInstanceOf[js.Any], BeginConnectedShape = BeginConnectedShape.asInstanceOf[js.Any], BeginConnectionSite = BeginConnectionSite.asInstanceOf[js.Any], BeginDisconnect = js.Any.fromFunction0(BeginDisconnect), Creator = Creator.asInstanceOf[js.Any], EndConnect = js.Any.fromFunction2(EndConnect), EndConnected = EndConnected.asInstanceOf[js.Any], EndConnectedShape = EndConnectedShape.asInstanceOf[js.Any], EndConnectionSite = EndConnectionSite.asInstanceOf[js.Any], EndDisconnect = js.Any.fromFunction0(EndDisconnect), Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.ConnectorFormat_typekey")(OfficeDotConnectorFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorFormat]
  }
}

