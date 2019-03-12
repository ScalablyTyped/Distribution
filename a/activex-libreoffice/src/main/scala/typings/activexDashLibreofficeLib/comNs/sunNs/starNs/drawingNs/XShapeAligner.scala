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
    acquire: () => scala.Unit,
    alignShapes: (js.Array[XShapes], Alignment) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XShapeAligner = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), alignShapes = js.Any.fromFunction2(alignShapes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XShapeAligner]
  }
}

