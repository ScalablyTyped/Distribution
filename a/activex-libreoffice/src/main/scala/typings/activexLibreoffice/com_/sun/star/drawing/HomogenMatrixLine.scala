package typings.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a single line for a {@link HomogenMatrix} . */
trait HomogenMatrixLine extends js.Object {
  var Column1: Double
  var Column2: Double
  var Column3: Double
  var Column4: Double
}

object HomogenMatrixLine {
  @scala.inline
  def apply(Column1: Double, Column2: Double, Column3: Double, Column4: Double): HomogenMatrixLine = {
    val __obj = js.Dynamic.literal(Column1 = Column1.asInstanceOf[js.Any], Column2 = Column2.asInstanceOf[js.Any], Column3 = Column3.asInstanceOf[js.Any], Column4 = Column4.asInstanceOf[js.Any])
    __obj.asInstanceOf[HomogenMatrixLine]
  }
}

