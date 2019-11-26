package typings.arangodb.atArangodbGeneralDashGraphMod

import typings.arangodb.ArangoDB.Edge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortestPath[T /* <: js.Object */] extends js.Object {
  var distance: Double
  var edges: js.Array[Edge[T]]
  var vertices: js.Array[String]
}

object ShortestPath {
  @scala.inline
  def apply[T /* <: js.Object */](distance: Double, edges: js.Array[Edge[T]], vertices: js.Array[String]): ShortestPath[T] = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ShortestPath[T]]
  }
}

