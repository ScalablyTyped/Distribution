package typings.ajv.ajvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UniqueItemsParams extends ErrorParameters {
  var i: Double
  var j: Double
}

object UniqueItemsParams {
  @scala.inline
  def apply(i: Double, j: Double): UniqueItemsParams = {
    val __obj = js.Dynamic.literal(i = i.asInstanceOf[js.Any], j = j.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UniqueItemsParams]
  }
}

