package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the coordinates of a 3-dimensional poly polygon. */
trait PolyPolygonShape3D extends js.Object {
  var SequenceX: DoubleSequenceSequence
  var SequenceY: DoubleSequenceSequence
  var SequenceZ: DoubleSequenceSequence
}

object PolyPolygonShape3D {
  @scala.inline
  def apply(
    SequenceX: DoubleSequenceSequence,
    SequenceY: DoubleSequenceSequence,
    SequenceZ: DoubleSequenceSequence
  ): PolyPolygonShape3D = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("SequenceX")(SequenceX.asInstanceOf[js.Any])
    __obj.updateDynamic("SequenceY")(SequenceY.asInstanceOf[js.Any])
    __obj.updateDynamic("SequenceZ")(SequenceZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolyPolygonShape3D]
  }
}

