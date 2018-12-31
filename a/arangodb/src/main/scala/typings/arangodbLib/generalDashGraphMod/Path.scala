package typings
package arangodbLib.generalDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path[A /* <: js.Object */, B /* <: js.Object */, E /* <: js.Object */, V /* <: js.Object */] extends js.Object {
  var destination: arangodbLib.ArangoDBNs.Document[B]
  var edges: js.Array[arangodbLib.ArangoDBNs.Edge[E]]
  var source: arangodbLib.ArangoDBNs.Document[A]
  var vertice: js.Array[arangodbLib.ArangoDBNs.Document[A | B | V]]
}

