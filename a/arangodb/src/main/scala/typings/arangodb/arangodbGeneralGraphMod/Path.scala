package typings.arangodb.arangodbGeneralGraphMod

import typings.arangodb.ArangoDB.Document
import typings.arangodb.ArangoDB.Edge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path[A /* <: js.Object */, B /* <: js.Object */, E /* <: js.Object */, V /* <: js.Object */] extends js.Object {
  var destination: Document[B]
  var edges: js.Array[Edge[E]]
  var source: Document[A]
  var vertice: js.Array[Document[A | B | V]]
}

object Path {
  @scala.inline
  def apply[A /* <: js.Object */, B /* <: js.Object */, E /* <: js.Object */, V /* <: js.Object */](
    destination: Document[B],
    edges: js.Array[Edge[E]],
    source: Document[A],
    vertice: js.Array[Document[A | B | V]]
  ): Path[A, B, E, V] = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], vertice = vertice.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Path[A, B, E, V]]
  }
}

