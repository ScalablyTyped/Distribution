package typings.activexLibreoffice.com_.sun.star.drawing

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
    val __obj = js.Dynamic.literal(Line1 = Line1.asInstanceOf[js.Any], Line2 = Line2.asInstanceOf[js.Any], Line3 = Line3.asInstanceOf[js.Any], Line4 = Line4.asInstanceOf[js.Any])
    __obj.asInstanceOf[HomogenMatrix4]
  }
}

