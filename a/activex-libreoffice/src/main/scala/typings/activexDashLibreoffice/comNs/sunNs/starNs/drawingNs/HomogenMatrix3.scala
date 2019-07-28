package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a homogeneous matrix by three homogeneous lines */
trait HomogenMatrix3 extends js.Object {
  var Line1: HomogenMatrixLine3
  var Line2: HomogenMatrixLine3
  var Line3: HomogenMatrixLine3
}

object HomogenMatrix3 {
  @scala.inline
  def apply(Line1: HomogenMatrixLine3, Line2: HomogenMatrixLine3, Line3: HomogenMatrixLine3): HomogenMatrix3 = {
    val __obj = js.Dynamic.literal(Line1 = Line1, Line2 = Line2, Line3 = Line3)
  
    __obj.asInstanceOf[HomogenMatrix3]
  }
}

