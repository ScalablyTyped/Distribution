package typings.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a homogeneous matrix by three homogeneous lines */
@js.native
trait HomogenMatrix extends js.Object {
  var Line1: HomogenMatrixLine = js.native
  var Line2: HomogenMatrixLine = js.native
  var Line3: HomogenMatrixLine = js.native
  var Line4: HomogenMatrixLine = js.native
}

object HomogenMatrix {
  @scala.inline
  def apply(
    Line1: HomogenMatrixLine,
    Line2: HomogenMatrixLine,
    Line3: HomogenMatrixLine,
    Line4: HomogenMatrixLine
  ): HomogenMatrix = {
    val __obj = js.Dynamic.literal(Line1 = Line1.asInstanceOf[js.Any], Line2 = Line2.asInstanceOf[js.Any], Line3 = Line3.asInstanceOf[js.Any], Line4 = Line4.asInstanceOf[js.Any])
    __obj.asInstanceOf[HomogenMatrix]
  }
  @scala.inline
  implicit class HomogenMatrixOps[Self <: HomogenMatrix] (val x: Self) extends AnyVal {
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
    def setLine1(value: HomogenMatrixLine): Self = this.set("Line1", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine2(value: HomogenMatrixLine): Self = this.set("Line2", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine3(value: HomogenMatrixLine): Self = this.set("Line3", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine4(value: HomogenMatrixLine): Self = this.set("Line4", value.asInstanceOf[js.Any])
  }
  
}

