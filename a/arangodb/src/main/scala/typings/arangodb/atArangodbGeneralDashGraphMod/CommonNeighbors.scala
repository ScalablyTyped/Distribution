package typings.arangodb.atArangodbGeneralDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonNeighbors extends js.Object {
  var left: String
  var neighbors: js.Array[String]
  var right: String
}

object CommonNeighbors {
  @scala.inline
  def apply(left: String, neighbors: js.Array[String], right: String): CommonNeighbors = {
    val __obj = js.Dynamic.literal(left = left, neighbors = neighbors, right = right)
  
    __obj.asInstanceOf[CommonNeighbors]
  }
}

