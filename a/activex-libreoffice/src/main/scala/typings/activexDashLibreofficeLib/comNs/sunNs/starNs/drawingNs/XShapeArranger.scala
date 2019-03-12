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
    acquire: () => scala.Unit,
    arrange: (XShapes, Arrangement) => scala.Unit,
    bringToFront: (XShapes, scala.Double) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    reverseOrder: XShapes => scala.Unit,
    sendToBack: (XShapes, scala.Double) => scala.Unit,
    setBehindShape: (XShapes, XShape) => scala.Unit,
    setInFrontOf: (XShapes, XShape) => scala.Unit
  ): XShapeArranger = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), arrange = js.Any.fromFunction2(arrange), bringToFront = js.Any.fromFunction2(bringToFront), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reverseOrder = js.Any.fromFunction1(reverseOrder), sendToBack = js.Any.fromFunction2(sendToBack), setBehindShape = js.Any.fromFunction2(setBehindShape), setInFrontOf = js.Any.fromFunction2(setInFrontOf))
  
    __obj.asInstanceOf[XShapeArranger]
  }
}

