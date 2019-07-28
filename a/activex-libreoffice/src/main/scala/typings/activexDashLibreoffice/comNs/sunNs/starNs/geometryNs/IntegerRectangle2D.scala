package typings.activexDashLibreoffice.comNs.sunNs.starNs.geometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure contains the necessary information for a two-dimensional rectangle.
  * @since OOo 2.0
  */
trait IntegerRectangle2D extends js.Object {
  var X1: Double
  /**
    * X coordinate of lower right corner.
    *
    * Must be greater than X1 for non-empty rectangles.
    */
  var X2: Double
  var Y1: Double
  /**
    * Y coordinate of lower right corner.
    *
    * Must be greater than y1 for non-empty rectangles.
    */
  var Y2: Double
}

object IntegerRectangle2D {
  @scala.inline
  def apply(X1: Double, X2: Double, Y1: Double, Y2: Double): IntegerRectangle2D = {
    val __obj = js.Dynamic.literal(X1 = X1, X2 = X2, Y1 = Y1, Y2 = Y2)
  
    __obj.asInstanceOf[IntegerRectangle2D]
  }
}

