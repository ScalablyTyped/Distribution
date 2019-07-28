package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a rectangular area by position and size. */
trait Rectangle extends js.Object {
  /** specifies the height. */
  var Height: Double
  /** specifies the width. */
  var Width: Double
  /** specifies the x-coordinate. */
  var X: Double
  /** specifies the y-coordinate. */
  var Y: Double
}

object Rectangle {
  @scala.inline
  def apply(Height: Double, Width: Double, X: Double, Y: Double): Rectangle = {
    val __obj = js.Dynamic.literal(Height = Height, Width = Width, X = X, Y = Y)
  
    __obj.asInstanceOf[Rectangle]
  }
}

