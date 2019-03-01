package typings
package ajvLib.ajvMod.ajvNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UniqueItemsParams extends ErrorParameters {
  var i: scala.Double
  var j: scala.Double
}

object UniqueItemsParams {
  @scala.inline
  def apply(i: scala.Double, j: scala.Double): UniqueItemsParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("i")(i)
    __obj.updateDynamic("j")(j)
    __obj.asInstanceOf[UniqueItemsParams]
  }
}

