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
    acquire: js.Function0[scala.Unit],
    mirror: js.Function2[js.Array[XShapes], MirrorAxis, scala.Unit],
    mirrorAtAxis: js.Function2[js.Array[XShapes], XShape, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XShapeMirror = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("mirror")(mirror)
    __obj.updateDynamic("mirrorAtAxis")(mirrorAtAxis)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XShapeMirror]
  }
}

