package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Objects implementing this interface can be used to align {@link Shapes} .
  * @deprecated Deprecated
  */
trait XShapeAligner
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** aligns the specified {@link Shapes} . */
  def alignShapes(aShapes: js.Array[XShapes], eType: Alignment): scala.Unit
}

object XShapeAligner {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    alignShapes: js.Function2[js.Array[XShapes], Alignment, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XShapeAligner = {
    val __obj = js.Dynamic.literal(acquire = acquire, alignShapes = alignShapes, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XShapeAligner]
  }
}

