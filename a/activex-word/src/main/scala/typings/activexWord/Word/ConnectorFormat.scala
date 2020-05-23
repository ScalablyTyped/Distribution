package typings.activexWord.Word

import typings.activexOffice.Office.MsoConnectorType
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectorFormat extends js.Object {
  val Application: typings.activexWord.Word.Application
  val BeginConnected: MsoTriState
  val BeginConnectedShape: Shape
  val BeginConnectionSite: Double
  val Creator: Double
  val EndConnected: MsoTriState
  val EndConnectedShape: Shape
  val EndConnectionSite: Double
  val Parent: js.Any
  var Type: MsoConnectorType
  @JSName("Word.ConnectorFormat_typekey")
  var WordDotConnectorFormat_typekey: ConnectorFormat
  def BeginConnect(ConnectedShape: Shape, ConnectionSite: Double): Unit
  def BeginDisconnect(): Unit
  def EndConnect(ConnectedShape: Shape, ConnectionSite: Double): Unit
  def EndDisconnect(): Unit
}

object ConnectorFormat {
  @scala.inline
  def apply(
    Application: Application,
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
    Parent: js.Any,
    Type: MsoConnectorType,
    WordDotConnectorFormat_typekey: ConnectorFormat
  ): ConnectorFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BeginConnect = js.Any.fromFunction2(BeginConnect), BeginConnected = BeginConnected.asInstanceOf[js.Any], BeginConnectedShape = BeginConnectedShape.asInstanceOf[js.Any], BeginConnectionSite = BeginConnectionSite.asInstanceOf[js.Any], BeginDisconnect = js.Any.fromFunction0(BeginDisconnect), Creator = Creator.asInstanceOf[js.Any], EndConnect = js.Any.fromFunction2(EndConnect), EndConnected = EndConnected.asInstanceOf[js.Any], EndConnectedShape = EndConnectedShape.asInstanceOf[js.Any], EndConnectionSite = EndConnectionSite.asInstanceOf[js.Any], EndDisconnect = js.Any.fromFunction0(EndDisconnect), Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ConnectorFormat_typekey")(WordDotConnectorFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorFormat]
  }
}

