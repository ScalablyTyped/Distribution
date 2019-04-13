package typings
package ajvLib.ajvMod

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
    val __obj = js.Dynamic.literal(i = i, j = j)
  
    __obj.asInstanceOf[UniqueItemsParams]
  }
}

