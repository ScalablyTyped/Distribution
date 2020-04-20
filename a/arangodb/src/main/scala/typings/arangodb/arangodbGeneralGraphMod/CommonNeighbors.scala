package typings.arangodb.arangodbGeneralGraphMod

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
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], neighbors = neighbors.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonNeighbors]
  }
}

