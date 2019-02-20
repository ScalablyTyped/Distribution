package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Objects implementing this interface can be used to mirror {@link Shapes} .
  * @deprecated Deprecated
  */
trait XShapeMirror
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** mirrors the given {@link Shapes} at the given axis. */
  def mirror(aShapes: js.Array[XShapes], eAxis: MirrorAxis): scala.Unit
  /** mirrors the given {@link Shapes} at the given axis. */
  def mirrorAtAxis(aShapes: js.Array[XShapes], aLine: XShape): scala.Unit
}

