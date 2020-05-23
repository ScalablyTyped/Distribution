package typings.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a homogeneous matrix by three homogeneous lines */
trait HomogenMatrix extends js.Object {
  var Line1: HomogenMatrixLine
  var Line2: HomogenMatrixLine
  var Line3: HomogenMatrixLine
  var Line4: HomogenMatrixLine
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
}

