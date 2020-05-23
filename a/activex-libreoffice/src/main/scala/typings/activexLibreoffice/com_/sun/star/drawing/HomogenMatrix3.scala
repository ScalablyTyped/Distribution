package typings.activexLibreoffice.com_.sun.star.drawing

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
    val __obj = js.Dynamic.literal(Line1 = Line1.asInstanceOf[js.Any], Line2 = Line2.asInstanceOf[js.Any], Line3 = Line3.asInstanceOf[js.Any])
    __obj.asInstanceOf[HomogenMatrix3]
  }
}

