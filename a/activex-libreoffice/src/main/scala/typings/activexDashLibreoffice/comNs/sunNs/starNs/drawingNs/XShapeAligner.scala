package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Objects implementing this interface can be used to align {@link Shapes} .
  * @deprecated Deprecated
  */
trait XShapeAligner extends XInterface {
  /** aligns the specified {@link Shapes} . */
  def alignShapes(aShapes: js.Array[XShapes], eType: Alignment): Unit
}

object XShapeAligner {
  @scala.inline
  def apply(
    acquire: () => Unit,
    alignShapes: (js.Array[XShapes], Alignment) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XShapeAligner = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), alignShapes = js.Any.fromFunction2(alignShapes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XShapeAligner]
  }
}

