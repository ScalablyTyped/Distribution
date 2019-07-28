package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a homogeneous matrix by four homogeneous lines. */
trait HomogenMatrix4 extends js.Object {
  var Line1: HomogenMatrixLine4
  var Line2: HomogenMatrixLine4
  var Line3: HomogenMatrixLine4
  var Line4: HomogenMatrixLine4
}

object HomogenMatrix4 {
  @scala.inline
  def apply(
    Line1: HomogenMatrixLine4,
    Line2: HomogenMatrixLine4,
    Line3: HomogenMatrixLine4,
    Line4: HomogenMatrixLine4
  ): HomogenMatrix4 = {
    val __obj = js.Dynamic.literal(Line1 = Line1, Line2 = Line2, Line3 = Line3, Line4 = Line4)
  
    __obj.asInstanceOf[HomogenMatrix4]
  }
}

