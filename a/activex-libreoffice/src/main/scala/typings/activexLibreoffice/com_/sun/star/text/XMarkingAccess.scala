package typings.activexLibreoffice.com_.sun.star.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** extends a text range by method to modify its position. */
@js.native
trait XMarkingAccess extends js.Object {
  def invalidateMarkings(nType: Double): Unit = js.native
}

object XMarkingAccess {
  @scala.inline
  def apply(invalidateMarkings: Double => Unit): XMarkingAccess = {
    val __obj = js.Dynamic.literal(invalidateMarkings = js.Any.fromFunction1(invalidateMarkings))
    __obj.asInstanceOf[XMarkingAccess]
  }
  @scala.inline
  implicit class XMarkingAccessOps[Self <: XMarkingAccess] (val x: Self) extends AnyVal {
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
    def setInvalidateMarkings(value: Double => Unit): Self = this.set("invalidateMarkings", js.Any.fromFunction1(value))
  }
  
}

