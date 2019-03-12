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

object XShapeMirror {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    mirror: (js.Array[XShapes], MirrorAxis) => scala.Unit,
    mirrorAtAxis: (js.Array[XShapes], XShape) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XShapeMirror = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), mirror = js.Any.fromFunction2(mirror), mirrorAtAxis = js.Any.fromFunction2(mirrorAtAxis), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XShapeMirror]
  }
}

