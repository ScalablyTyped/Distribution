package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows insertion of shapes at different positions.
  * @since LibreOffice 4.2
  */
trait XShapes2 extends js.Object {
  /**
    * Insert a new shape to the bottom of the stack.
    * @param xShape shape to be inserted.
    * @since LibreOffice 4.2
    */
  def addBottom(xShape: XShape): Unit
  /**
    * Insert a new shape to the top of the stack.
    * @param xShape shape to be inserted.
    * @since LibreOffice 4.2
    */
  def addTop(xShape: XShape): Unit
}

object XShapes2 {
  @scala.inline
  def apply(addBottom: XShape => Unit, addTop: XShape => Unit): XShapes2 = {
    val __obj = js.Dynamic.literal(addBottom = js.Any.fromFunction1(addBottom), addTop = js.Any.fromFunction1(addTop))
  
    __obj.asInstanceOf[XShapes2]
  }
}

