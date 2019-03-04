package typings
package arangodbLib.atArangodbGeneralDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonNeighbors extends js.Object {
  var left: java.lang.String
  var neighbors: js.Array[java.lang.String]
  var right: java.lang.String
}

object CommonNeighbors {
  @scala.inline
  def apply(left: java.lang.String, neighbors: js.Array[java.lang.String], right: java.lang.String): CommonNeighbors = {
    val __obj = js.Dynamic.literal(left = left, neighbors = neighbors, right = right)
  
    __obj.asInstanceOf[CommonNeighbors]
  }
}

