package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Objects implementing this interface can be used to align {@link Shapes} .
  * @deprecated Deprecated
  */
@js.native
trait XShapeAligner extends XInterface {
  /** aligns the specified {@link Shapes} . */
  def alignShapes(aShapes: js.Array[XShapes], eType: Alignment): Unit = js.native
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
  @scala.inline
  implicit class XShapeAlignerOps[Self <: XShapeAligner] (val x: Self) extends AnyVal {
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
    def setAlignShapes(value: (js.Array[XShapes], Alignment) => Unit): Self = this.set("alignShapes", js.Any.fromFunction2(value))
  }
  
}

