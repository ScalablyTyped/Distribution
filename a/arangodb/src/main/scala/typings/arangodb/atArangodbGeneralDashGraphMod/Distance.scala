package typings.arangodb.atArangodbGeneralDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Distance extends js.Object {
  var distance: Double
  var startVertex: String
  var vertex: String
}

object Distance {
  @scala.inline
  def apply(distance: Double, startVertex: String, vertex: String): Distance = {
    val __obj = js.Dynamic.literal(distance = distance, startVertex = startVertex, vertex = vertex)
  
    __obj.asInstanceOf[Distance]
  }
}

