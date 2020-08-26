package typings.arangodb.arangodbGeneralGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Distance extends js.Object {
  var distance: Double = js.native
  var startVertex: String = js.native
  var vertex: String = js.native
}

object Distance {
  @scala.inline
  def apply(distance: Double, startVertex: String, vertex: String): Distance = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], startVertex = startVertex.asInstanceOf[js.Any], vertex = vertex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distance]
  }
  @scala.inline
  implicit class DistanceOps[Self <: Distance] (val x: Self) extends AnyVal {
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
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartVertex(value: String): Self = this.set("startVertex", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertex(value: String): Self = this.set("vertex", value.asInstanceOf[js.Any])
  }
  
}

