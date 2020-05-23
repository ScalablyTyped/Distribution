package typings.activexLibreoffice.com_.sun.star.geometry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure defines a two-dimensional point
  *
  * This structure contains x and y real-valued coordinates of a two-dimensional point.
  * @since OOo 2.0
  */
trait RealPoint2D extends js.Object {
  var X: Double
  var Y: Double
}

object RealPoint2D {
  @scala.inline
  def apply(X: Double, Y: Double): RealPoint2D = {
    val __obj = js.Dynamic.literal(X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealPoint2D]
  }
}

