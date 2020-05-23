package typings.activexLibreoffice.com_.sun.star.geometry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure contains data representing a two-dimensional size.
  *
  * The data is stored integer-valued.
  * @since OOo 2.0
  */
trait IntegerSize2D extends js.Object {
  var Height: Double
  var Width: Double
}

object IntegerSize2D {
  @scala.inline
  def apply(Height: Double, Width: Double): IntegerSize2D = {
    val __obj = js.Dynamic.literal(Height = Height.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerSize2D]
  }
}

