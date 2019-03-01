package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a rectangular area by position and size. */
trait Rectangle extends js.Object {
  /** specifies the height. */
  var Height: scala.Double
  /** specifies the width. */
  var Width: scala.Double
  /** specifies the x-coordinate. */
  var X: scala.Double
  /** specifies the y-coordinate. */
  var Y: scala.Double
}

object Rectangle {
  @scala.inline
  def apply(Height: scala.Double, Width: scala.Double, X: scala.Double, Y: scala.Double): Rectangle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Height")(Height)
    __obj.updateDynamic("Width")(Width)
    __obj.updateDynamic("X")(X)
    __obj.updateDynamic("Y")(Y)
    __obj.asInstanceOf[Rectangle]
  }
}

