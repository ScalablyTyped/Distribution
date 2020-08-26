package typings.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the coordinates of a 3-dimensional poly polygon. */
@js.native
trait PolyPolygonShape3D extends js.Object {
  var SequenceX: DoubleSequenceSequence = js.native
  var SequenceY: DoubleSequenceSequence = js.native
  var SequenceZ: DoubleSequenceSequence = js.native
}

object PolyPolygonShape3D {
  @scala.inline
  def apply(
    SequenceX: DoubleSequenceSequence,
    SequenceY: DoubleSequenceSequence,
    SequenceZ: DoubleSequenceSequence
  ): PolyPolygonShape3D = {
    val __obj = js.Dynamic.literal(SequenceX = SequenceX.asInstanceOf[js.Any], SequenceY = SequenceY.asInstanceOf[js.Any], SequenceZ = SequenceZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolyPolygonShape3D]
  }
  @scala.inline
  implicit class PolyPolygonShape3DOps[Self <: PolyPolygonShape3D] (val x: Self) extends AnyVal {
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
    def setSequenceXVarargs(value: DoubleSequence*): Self = this.set("SequenceX", js.Array(value :_*))
    @scala.inline
    def setSequenceX(value: DoubleSequenceSequence): Self = this.set("SequenceX", value.asInstanceOf[js.Any])
    @scala.inline
    def setSequenceYVarargs(value: DoubleSequence*): Self = this.set("SequenceY", js.Array(value :_*))
    @scala.inline
    def setSequenceY(value: DoubleSequenceSequence): Self = this.set("SequenceY", value.asInstanceOf[js.Any])
    @scala.inline
    def setSequenceZVarargs(value: DoubleSequence*): Self = this.set("SequenceZ", js.Array(value :_*))
    @scala.inline
    def setSequenceZ(value: DoubleSequenceSequence): Self = this.set("SequenceZ", value.asInstanceOf[js.Any])
  }
  
}

