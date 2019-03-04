package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Objects implementing this interface can be used to arrange {@link Shapes} .
  * @deprecated Deprecated
  */
trait XShapeArranger
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** applies the specified Arrangement to the specified collection of {@link Shapes} . */
  def arrange(xShapes: XShapes, eType: Arrangement): scala.Unit
  /** moves the specified {@link Shapes} by a specified number of objects more to the front. */
  def bringToFront(xShapes: XShapes, nSteps: scala.Double): scala.Unit
  /** reverses the order of the specified collection of {@link Shapes} . */
  def reverseOrder(xShapes: XShapes): scala.Unit
  /** moves the specified {@link Shapes}**nSteps** objects more to the back. */
  def sendToBack(xShapes: XShapes, nSteps: scala.Double): scala.Unit
  /** moves the specified collection of {@link Shapes} behind the specified single {@link Shape} . */
  def setBehindShape(xShapes: XShapes, xShape: XShape): scala.Unit
  /** moves the specified collection of {@link Shapes} in front of the specified single {@link Shape} . */
  def setInFrontOf(xShapes: XShapes, xShape: XShape): scala.Unit
}

object XShapeArranger {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    arrange: js.Function2[XShapes, Arrangement, scala.Unit],
    bringToFront: js.Function2[XShapes, scala.Double, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    reverseOrder: js.Function1[XShapes, scala.Unit],
    sendToBack: js.Function2[XShapes, scala.Double, scala.Unit],
    setBehindShape: js.Function2[XShapes, XShape, scala.Unit],
    setInFrontOf: js.Function2[XShapes, XShape, scala.Unit]
  ): XShapeArranger = {
    val __obj = js.Dynamic.literal(acquire = acquire, arrange = arrange, bringToFront = bringToFront, queryInterface = queryInterface, release = release, reverseOrder = reverseOrder, sendToBack = sendToBack, setBehindShape = setBehindShape, setInFrontOf = setInFrontOf)
  
    __obj.asInstanceOf[XShapeArranger]
  }
}

