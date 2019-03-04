package typings
package arangodbLib.atArangodbGeneralDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path[A /* <: js.Object */, B /* <: js.Object */, E /* <: js.Object */, V /* <: js.Object */] extends js.Object {
  var destination: arangodbLib.ArangoDBNs.Document[B]
  var edges: js.Array[arangodbLib.ArangoDBNs.Edge[E]]
  var source: arangodbLib.ArangoDBNs.Document[A]
  var vertice: js.Array[arangodbLib.ArangoDBNs.Document[A | B | V]]
}

object Path {
  @scala.inline
  def apply[A /* <: js.Object */, B /* <: js.Object */, E /* <: js.Object */, V /* <: js.Object */](
    destination: arangodbLib.ArangoDBNs.Document[B],
    edges: js.Array[arangodbLib.ArangoDBNs.Edge[E]],
    source: arangodbLib.ArangoDBNs.Document[A],
    vertice: js.Array[arangodbLib.ArangoDBNs.Document[A | B | V]]
  ): Path[A, B, E, V] = {
    val __obj = js.Dynamic.literal(destination = destination, edges = edges, source = source, vertice = vertice)
  
    __obj.asInstanceOf[Path[A, B, E, V]]
  }
}

