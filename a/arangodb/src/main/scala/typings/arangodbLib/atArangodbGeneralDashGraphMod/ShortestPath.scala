package typings
package arangodbLib.atArangodbGeneralDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortestPath[T /* <: js.Object */] extends js.Object {
  var distance: scala.Double
  var edges: js.Array[arangodbLib.ArangoDBNs.Edge[T]]
  var vertices: js.Array[java.lang.String]
}

object ShortestPath {
  @scala.inline
  def apply[T /* <: js.Object */](
    distance: scala.Double,
    edges: js.Array[arangodbLib.ArangoDBNs.Edge[T]],
    vertices: js.Array[java.lang.String]
  ): ShortestPath[T] = {
    val __obj = js.Dynamic.literal(distance = distance, edges = edges, vertices = vertices)
  
    __obj.asInstanceOf[ShortestPath[T]]
  }
}

