package typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure is used to specify the height of a text line.
  * @see LineSpacingMode
  */
trait LineSpacing extends js.Object {
  /** This value specifies the height in regard to **Mode** . */
  var Height: Double
  /** This value specifies the way the height is specified. */
  var Mode: Double
}

object LineSpacing {
  @scala.inline
  def apply(Height: Double, Mode: Double): LineSpacing = {
    val __obj = js.Dynamic.literal(Height = Height, Mode = Mode)
  
    __obj.asInstanceOf[LineSpacing]
  }
}

