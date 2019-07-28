package typings.androiduix.androidNs.widgetNs.RelativeLayoutNs.DependencyGraphNs

import typings.androiduix.androidNs.utilNs.ArrayMap
import typings.androiduix.androidNs.utilNs.SparseMap
import typings.androiduix.androidNs.viewNs.View
import typings.androiduix.androidNs.widgetNs.RelativeLayoutNs.DependencyGraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.RelativeLayout.DependencyGraph.Node")
@js.native
class Node () extends js.Object {
  var dependencies: SparseMap[String, Node] = js.native
  var dependents: ArrayMap[Node, DependencyGraph] = js.native
  var view: View = js.native
  def release(): Unit = js.native
}

/* static members */
@JSGlobal("android.widget.RelativeLayout.DependencyGraph.Node")
@js.native
object Node extends js.Object {
  var POOL_LIMIT: js.Any = js.native
  var sPool: js.Any = js.native
  def acquire(view: View): Node = js.native
}

