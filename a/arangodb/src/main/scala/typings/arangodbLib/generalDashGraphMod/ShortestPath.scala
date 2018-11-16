package typings
package arangodbLib.generalDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ShortestPath[T /* <: js.Object */] extends js.Object {
  var distance: scala.Double
  var edges: js.Array[arangodbLib.ArangoDBNs.Edge[T]]
  var vertices: js.Array[java.lang.String]
}

