package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Point
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XConnectorShape extends XShape {
  /** connects the end of this instance. */
  def connectEnd(xShape: XConnectableShape, nPos: ConnectionType): Unit
  /** connects the start of this instance */
  def connectStart(xShape: XConnectableShape, nPos: ConnectionType): Unit
  /** disconnects the given {@link Shape} from the start of this instance. */
  def disconnectBegin(xShape: XConnectableShape): Unit
  /** disconnects the given {@link Shape} from the end of this instance. */
  def disconnectEnd(xShape: XConnectableShape): Unit
}

object XConnectorShape {
  @scala.inline
  def apply(
    Position: Point,
    ShapeType: String,
    Size: Size,
    acquire: () => Unit,
    connectEnd: (XConnectableShape, ConnectionType) => Unit,
    connectStart: (XConnectableShape, ConnectionType) => Unit,
    disconnectBegin: XConnectableShape => Unit,
    disconnectEnd: XConnectableShape => Unit,
    getPosition: () => Point,
    getShapeType: () => String,
    getSize: () => Size,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setPosition: Point => Unit,
    setSize: Size => Unit
  ): XConnectorShape = {
    val __obj = js.Dynamic.literal(Position = Position, ShapeType = ShapeType, Size = Size, acquire = js.Any.fromFunction0(acquire), connectEnd = js.Any.fromFunction2(connectEnd), connectStart = js.Any.fromFunction2(connectStart), disconnectBegin = js.Any.fromFunction1(disconnectBegin), disconnectEnd = js.Any.fromFunction1(disconnectEnd), getPosition = js.Any.fromFunction0(getPosition), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setPosition = js.Any.fromFunction1(setPosition), setSize = js.Any.fromFunction1(setSize))
  
    __obj.asInstanceOf[XConnectorShape]
  }
}

