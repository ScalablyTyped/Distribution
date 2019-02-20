package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XConnectorShape extends XShape {
  /** connects the end of this instance. */
  def connectEnd(xShape: XConnectableShape, nPos: ConnectionType): scala.Unit
  /** connects the start of this instance */
  def connectStart(xShape: XConnectableShape, nPos: ConnectionType): scala.Unit
  /** disconnects the given {@link Shape} from the start of this instance. */
  def disconnectBegin(xShape: XConnectableShape): scala.Unit
  /** disconnects the given {@link Shape} from the end of this instance. */
  def disconnectEnd(xShape: XConnectableShape): scala.Unit
}

