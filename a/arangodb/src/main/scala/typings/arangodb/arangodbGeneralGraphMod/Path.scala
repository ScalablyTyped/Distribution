package typings.arangodb.arangodbGeneralGraphMod

import typings.arangodb.ArangoDB.Document
import typings.arangodb.ArangoDB.Edge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Path[A /* <: js.Object */, B /* <: js.Object */, E /* <: js.Object */, V /* <: js.Object */] extends js.Object {
  var destination: Document[B] = js.native
  var edges: js.Array[Edge[E]] = js.native
  var source: Document[A] = js.native
  var vertice: js.Array[Document[A | B | V]] = js.native
}

object Path {
  @scala.inline
  def apply[/* <: js.Object */ A, /* <: js.Object */ B, /* <: js.Object */ E, /* <: js.Object */ V](
    destination: Document[B],
    edges: js.Array[Edge[E]],
    source: Document[A],
    vertice: js.Array[Document[A | B | V]]
  ): Path[A, B, E, V] = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], vertice = vertice.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path[A, B, E, V]]
  }
  @scala.inline
  implicit class PathOps[Self <: Path[_, _, _, _], /* <: js.Object */ A, /* <: js.Object */ B, /* <: js.Object */ E, /* <: js.Object */ V] (val x: Self with (Path[A, B, E, V])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestination(value: Document[B]): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def setEdgesVarargs(value: Edge[E]*): Self = this.set("edges", js.Array(value :_*))
    @scala.inline
    def setEdges(value: js.Array[Edge[E]]): Self = this.set("edges", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: Document[A]): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticeVarargs(value: (Document[A | B | V])*): Self = this.set("vertice", js.Array(value :_*))
    @scala.inline
    def setVertice(value: js.Array[Document[A | B | V]]): Self = this.set("vertice", value.asInstanceOf[js.Any])
  }
  
}

