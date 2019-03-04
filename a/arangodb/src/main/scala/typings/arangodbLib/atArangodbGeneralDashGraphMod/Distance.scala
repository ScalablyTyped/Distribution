package typings
package arangodbLib.atArangodbGeneralDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Distance extends js.Object {
  var distance: scala.Double
  var startVertex: java.lang.String
  var vertex: java.lang.String
}

object Distance {
  @scala.inline
  def apply(distance: scala.Double, startVertex: java.lang.String, vertex: java.lang.String): Distance = {
    val __obj = js.Dynamic.literal(distance = distance, startVertex = startVertex, vertex = vertex)
  
    __obj.asInstanceOf[Distance]
  }
}

