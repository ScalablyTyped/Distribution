package typings.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows insertion of shapes at different positions.
  * @since LibreOffice 4.2
  */
@js.native
trait XShapes2 extends js.Object {
  /**
    * Insert a new shape to the bottom of the stack.
    * @param xShape shape to be inserted.
    * @since LibreOffice 4.2
    */
  def addBottom(xShape: XShape): Unit = js.native
  /**
    * Insert a new shape to the top of the stack.
    * @param xShape shape to be inserted.
    * @since LibreOffice 4.2
    */
  def addTop(xShape: XShape): Unit = js.native
}

object XShapes2 {
  @scala.inline
  def apply(addBottom: XShape => Unit, addTop: XShape => Unit): XShapes2 = {
    val __obj = js.Dynamic.literal(addBottom = js.Any.fromFunction1(addBottom), addTop = js.Any.fromFunction1(addTop))
    __obj.asInstanceOf[XShapes2]
  }
  @scala.inline
  implicit class XShapes2Ops[Self <: XShapes2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddBottom(value: XShape => Unit): Self = this.set("addBottom", js.Any.fromFunction1(value))
    @scala.inline
    def setAddTop(value: XShape => Unit): Self = this.set("addTop", js.Any.fromFunction1(value))
  }
  
}

