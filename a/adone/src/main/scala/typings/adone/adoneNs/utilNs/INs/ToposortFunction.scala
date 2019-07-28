package typings.adone.adoneNs.utilNs.INs

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToposortFunction extends js.Object {
  var Sorter: Instantiable0[typings.adone.adoneNs.utilNs.INs.Sorter] = js.native
  def apply(edges: js.Array[js.Tuple2[String, String]]): js.Array[String] = js.native
  def array(nodes: js.Array[String], edges: js.Array[js.Tuple2[String, String]]): js.Array[String] = js.native
}

